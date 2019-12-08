package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.util.Pair;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;
import java.util.stream.Collectors;

public class Interpreter {
    private Map<Key,String> TAC;
    private Stack<String> printStack = new Stack();
    private Stack<String> paramStack = new Stack();
    private TextArea consoleArea;

    private List<Symbol> symbolTable = new ArrayList<>();
    private List<Symbol> tempTable = new ArrayList<>();

    private boolean terminate = false;
    private String currentFunc = null;
    private Stack<String> loopStack = new Stack<>();
    String goTo = null;
    boolean startFunc = true;

    int stepCount;
    boolean stepMode = false;
    String stepFunc = null;
    Stack<String> stepStack = new Stack<>();
    List<String> scopeLink = new ArrayList<>();
    boolean firstPass = true;
    Stack<String> returnStack = new Stack<>();
    Stack<String> stepReturnStack = new Stack<>();

    public Interpreter(Map<Key, String> TAC, TextArea console) {
        this.TAC = TAC;
        this.consoleArea = console;
    }

    // Log to the console area
    private void consoleLog(String log){
        consoleArea.appendText(log);
        consoleArea.appendText("\n");
    }

    // Add/remove link functions add and remove scope names to their respective parent
    public void addLink(String func, String scope){
        for (int i=0;i<scopeLink.size();i++){
            if (scopeLink.get(i).contains(func)) scopeLink.set(i,scopeLink.get(i) + "@" + scope);
        }
    }

    public void removeLink(String func, String scope){
        for (int i=0;i<scopeLink.size();i++){
            if (scopeLink.get(i).contains(func)) scopeLink.set(i,scopeLink.get(i).replace("@"+scope,""));
        }
    }

    // Logs to the Watch Stage console
    public void watchLog(String log){
        if (stepMode)
            Watchstage.getInstance().consoleLog(log);
        System.out.println(log);
    }

    // Clears Watch Stage console
    public void clearWatchLog(){
        Watchstage.getInstance().clearConsole();
    }

    // Updates the line being displayed on the Watch Stage
    public void updateLine(Key key, String val){
        String line = null;
        if (val != null) {
            if (key.getName().charAt(0)=='@') {
                line = key.getName() + " " + (key.getInfo() != null ? key.getInfo() : "") + " " + val;
            }
            else if (val.isEmpty()){
                line = key.getName();
            }
            else {
                line = key.getName() + " = " + val;
            }

            if (key.getName() == Constants.END_FUNC) {
                line = "";
            }
        } else {
            line = key.getName() + ":";
        }
        Watchstage.getInstance().updateLineLbl(line);
    }

    // Function call statement for step by step running
    // Accepts current function name and index of intermediate code line to run
    public Pair<String,Integer> functionCall (String functionName, int index){
        clearWatchLog();
        stepMode = true;
        stepFunc = functionName;
        stepCount = index;
        List<Key> keyList = new ArrayList<>(TAC.keySet());
        if (!terminate && index < keyList.size()) {
            System.out.println("----------");
            System.out.println(scopeLink);
            Key curKey = keyList.get(index);
            String curVal = TAC.get(keyList.get(index));

            updateLine(curKey,curVal);

            // if you need to go to a label in the intermediate code
            if (goTo != null) {
                stepCount = findLabel(keyList, goTo);
                watchLog("[Goto Label] Jumping to index " + stepCount + " ("+goTo+")");
                goTo = null;
                return new Pair<String, Integer>(stepFunc, stepCount);
            }

            // curVal is null usually when line pertains to a label, so skip
            if (curVal == null) {
                if (curKey.getInfo().equals(Constants.KTYPE_FUNC)) {
                    currentFunc = curKey.getName();
                    watchLog("[Function] Found function: " + currentFunc);
                    if (firstPass) {
                        if (!symbolTable.stream().filter(symbol ->   symbol.getName().equals(currentFunc)
                                && symbol.getType().equals(Constants.TYPE_PROC))
                                .collect(Collectors.toList()).isEmpty())
                            flagError("Function " + currentFunc + " is already taken!");
                        symbolTable.add(new Symbol(curKey.getName(),Constants.TYPE_PROC,curKey.getInfo2()[0],Constants.MAIN));
                    }
                }
                else if (!startFunc && curKey.getInfo().equals(Constants.KTYPE_LOOP)) {
                    String loopScope = "Loop" + (loopStack.size() + 1);
                    loopStack.push(loopScope);
                    addLink(currentFunc,loopScope);
                    watchLog("[Loop] Entered Loop");
                }
                else if (!startFunc && !loopStack.empty()){
                    String loopExit = loopStack.pop();
                    watchLog("[Loop] Exiting loop, removing scope from symbol table: " + loopExit);
                    removeFromSymbolTable(loopExit);
                    removeLink(currentFunc,loopExit);
                    printTable(symbolTable);
                }
            }

            // if you are trying to start a function and found it, you can start the code
            if (startFunc && currentFunc.equals(functionName)) {
                watchLog("[Function] Entering function: " + currentFunc);
                if (firstPass && currentFunc.equals(Constants.MAIN)) firstPass = false;
                startFunc = false;
                scopeLink.add(functionName);

                // retrieve pushed parameters
                if (curKey.getInfo2() != null && !curKey.getInfo2()[1].isEmpty()) {
                    Stack<String> paramStack2 = new Stack<>();
                    for (String param : curKey.getInfo2()[1].split("@")) {
                        paramStack2.push(param);
                    }
                    while (!paramStack2.empty()) {
                        String param = paramStack2.pop();
                        String dtype = param.split(",")[0];
                        String name = param.split(",")[1];
                        if (paramStack.empty()) flagError("Incorrect number of parameters!");
                        String popped_param = paramStack.pop();
                        if (dtype.equals(find(popped_param).getData_type())) {
                            addParam(name, dtype, getScope(), find(popped_param).getValue());
                        } else flagError("Incorrect parameter data type!");
                    }
                }
                if (!paramStack.empty()) flagError("Incorrect number of parameters!");

                return new Pair<String, Integer>(stepFunc, stepCount+1);
            }
            // otherwise, just skip the code
            else if (startFunc || curVal == null){
                watchLog("Skipping...");
                return functionCall(stepFunc, stepCount+1);
            }

            // if fuction has ended, return to caller
            if (curKey.getName().equals("@EndFunc")) {
                watchLog("[Function] Ending method call for " + currentFunc);

                // if you should return something but you aren't
                if (!find(currentFunc).getData_type().equals(Constants.DTYPE_VOID) && returnStack.empty())
                    flagError("Missing return statement!");
                // assign thing you returned because step is funky
                else if (!find(currentFunc).getData_type().equals(Constants.DTYPE_VOID)){
//                    find(returnStack.peek()).setScope(Constants.MAIN);
                    Object result = valLookup(returnStack.pop(),false);
                    tempTable.add(new Symbol(stepReturnStack.pop(), Constants.TYPE_VAR, find(currentFunc).getData_type(), stepStack.peek().split("@")[0], result));
                }
                if (stepFunc.equals(Constants.MAIN)) {
                    Watchstage.getInstance().updateStatus("Program finished!");
                    consoleLog("-----END OF MAIN FUNCTION-----");
                    return null;
                }
                removeFromSymbolTable(functionName);
                String stepBack = stepStack.pop();
                currentFunc = stepBack.split("@")[0];


                return new Pair<String, Integer>(stepBack.split("@")[0], Integer.valueOf(stepBack.split("@")[1])+1);
            }

            System.out.println(curKey.getName() + " = "+curVal);

            // if function has not ended, interpret the line
            interpretLine(curKey,curVal);
            watchLog("Interpret done, returning: " + stepFunc + " , " + (stepCount+1));
            return new Pair<String, Integer>(stepFunc, stepCount+1);
        }

        return null;
    }

    // Function call statement for continuous running
    public void functionCall (String functionName){
        List<Key> keyList = new ArrayList<>(TAC.keySet());
        for (int i = 0; i < keyList.size() && !terminate; i++){
            System.out.println("-------");
            Key curKey = keyList.get(i);
            String curVal = TAC.get(keyList.get(i));
            System.out.println(curKey.getName() + " = "+curVal);
            System.out.println(scopeLink);

            // if you need to go to a label in the intermediate code
            if (goTo != null) {
                i = findLabel(keyList, goTo) - 1;
                System.out.println("JUMPING TO INDEX " + i + " ("+goTo+")");
                goTo = null;
                continue;
            }

            // curVal is null usually when line pertains to a label, so skip
            if (curVal == null) {
                if (curKey.getInfo().equals(Constants.KTYPE_FUNC)) {
                    currentFunc = curKey.getName();
                    System.out.println("ENTERED FUNCTION " + currentFunc);
                    if (firstPass) {
                        if (!symbolTable.stream().filter(symbol ->   symbol.getName().equals(currentFunc)
                                && symbol.getType().equals(Constants.TYPE_PROC))
                                .collect(Collectors.toList()).isEmpty())
                            flagError("Function " + currentFunc + " is already taken!");
                        symbolTable.add(new Symbol(curKey.getName(),Constants.TYPE_PROC,curKey.getInfo2()[0],Constants.MAIN));
                    }
                }
                else if (!startFunc && curKey.getInfo().equals(Constants.KTYPE_LOOP)) {
                    String loopScope = "Loop" + (loopStack.size() + 1);
                    loopStack.push(loopScope);
                    addLink(currentFunc,loopScope);
                    System.out.println("ENTERED LOOP");
                }
                else if (!startFunc && !loopStack.empty()){
                    String loopExit = loopStack.pop();
                    System.out.println("EXITING LOOP, REMOVING FROM SYMBOL TABLE " + loopExit);
                    removeFromSymbolTable(loopExit);
                    removeLink(currentFunc,loopExit);
                    printTable(symbolTable);
                }
//                continue;
            }

            // if you are trying to start a function and found it, you can start the code
            if (startFunc && currentFunc.equals(functionName)) {
                System.out.println("Starting function " + functionName);
                if (firstPass && currentFunc.equals(Constants.MAIN)) firstPass = false;
                startFunc = false;
                scopeLink.add(functionName);
                // retrieve pushed parameters
                if (curKey.getInfo2() != null && !curKey.getInfo2()[1].isEmpty()) {
                    Stack<String> paramStack2 = new Stack<>();
                    for (String param : curKey.getInfo2()[1].split("@")) {
                        paramStack2.push(param);
                    }
                    while (!paramStack2.empty()) {
                        String param = paramStack2.pop();
                        String dtype = param.split(",")[0];
                        String name = param.split(",")[1];
                        if (paramStack.empty()) flagError("Incorrect number of parameters!");
                        String popped_param = paramStack.pop();
                        if (dtype.equals(find(popped_param).getData_type())) {
                            addParam(name, dtype, getScope(), find(popped_param).getValue());
                        } else flagError("Incorrect parameter data type!");
                    }
                }
                if (!paramStack.empty()) flagError("Incorrect number of parameters!");
                continue;
            }
            // otherwise, just skip the code
            else if (startFunc){
                System.out.println("SKIPPING...");
                continue;
            }

            // if fuction has ended, return to caller
            if (curKey.getName().equals("@EndFunc")) {
                System.out.println("Ending method call for " + currentFunc);
                // if you end a function without returning something when you should
                if (!find(currentFunc).getData_type().equals(Constants.DTYPE_VOID) && returnStack.empty())
                    flagError("Missing return statement!");
                else if (!find(currentFunc).getData_type().equals(Constants.DTYPE_VOID)){
                    find(returnStack.peek()).setScope(Constants.MAIN);
                }

                if (currentFunc.equals(Constants.MAIN)) consoleLog("-----END OF MAIN FUNCTION-----");
                else removeFromSymbolTable(currentFunc);
                return;
            }

            // to skip labels
            if (curVal==null) continue;

            // if function has not ended, interpret the line
            interpretLine(curKey,curVal);
        }
    }

    // where the magic happens
    public void interpretLine(Key curKey, String curVal){
        // for when intermediate code key is a special function call (@)
        switch (curKey.getName()) {
            case "@Declare":
                // @Declare : dtype varname
                // Variable declaration
                String name = curVal.split(" ")[1];
                String dtype = curVal.split(" ")[0];

                // check first if variable has already been declared
                if (find(name) == null) {
                    // normal variable declaration
                    if (curKey.getInfo().equals(Constants.DECL_NORMAL)) {
                        symbolTable.add(new Symbol(name,Constants.TYPE_VAR,dtype, getScope()));
                    }
                    // declaration of constant
                    else {
                        Symbol toAdd = new Symbol(name,Constants.TYPE_VAR,dtype, getScope());
                        toAdd.setConst(true);
                        symbolTable.add(toAdd);
                    }
                    printTable(symbolTable);
                } else {
                    flagError("Variable name " + name + " already taken!");
                }
                break;
            case "@LCall":
                // @LCall : functioname

                // Print to console
                // @LCall : _Print numberOfParams
                if (curVal.contains("_Print")) {
                    int params = Integer.valueOf(curVal.split(" ")[1]);
                    String toPrint = "";
                    for (int i =0;i<params;i++){
                        String pop = printStack.pop();
                        if (inScope(findInScope(pop))) {
                            toPrint += String.valueOf(valLookup(pop,true));
                        } else {
                            flagError(pop + " is out of scope!");
                        }
                    }
                    consoleLog(toPrint);
                }
                break;
            case "@PushParam":
                // @PushParam variableOrLiteralName
                if (curKey.getInfo().equals(Constants.PARAM_PRINT)) {
                    printStack.push(curVal);
                    watchLog("Pushing parameter for print/scan function");
                } else if (curKey.getInfo().equals(Constants.PARAM_FUNC)) {
                    if (findInScope(curVal) == null) flagError("Variable " + curVal + " does not exist!");
                    paramStack.push(curVal);
                    watchLog("Pushing parameter for function");
                }
                break;
            case "@If":
                boolean jump = Boolean.valueOf(String.valueOf(valLookup(curKey.getInfo(),true)));
                watchLog("If statement evaluates to " + jump);
                if (jump) {
                    String label = curVal.split(" ")[1];
                    watchLog("Jumping to " + label);
                    goTo = label;
                }
                break;
            case "@Goto":
                goTo = curVal;
                break;
            case "@Return":
                // if you return something in a void function
                if (find(currentFunc).getData_type().equals(Constants.DTYPE_VOID)) flagError("Invalid return statement!");

                // if you return something of different data type of function
                if (!findInScope(curVal).getData_type().equals(find(currentFunc).getData_type())) flagError("Return is invalid data type!");
                returnStack.push(curVal);
                break;
            default:
                break;
        }

        if (curKey.getName().contains("_t")) {
            // _t = @LCall _functionName
            if (curVal.contains("@LCall")){
                String func = curVal.split(" ")[1];
                switch (func){
                    case "_Scan":
                        // Input function
                        int params = Integer.valueOf(curVal.split(" ")[2]);
                        String inputMsg = "";
                        for (int i =0;i<params;i++){
                            String pop = printStack.pop();
                            inputMsg += String.valueOf(valLookup(pop,true));
                        }
                        String input = getInput(inputMsg);
                        tempTable.add(new Symbol(curKey.getName(),Constants.TYPE_VAR,Constants.DTYPE_STRING,getScope(),input));
                        break;
                    default:
                        String funcName = func.substring(1);
                        // Custom function
                        if (symbolTable.stream().filter(symbol ->   symbol.getName().equals(func.substring(1))
                                && symbol.getType().equals(Constants.TYPE_PROC))
                                .collect(Collectors.toList()).isEmpty())
                            flagError("Function " + funcName + " has not been declared!");

                        if (!stepMode) {
                            startFunc = true;
                            String oldFunc = currentFunc;
                            functionCall(funcName);

                            Symbol temp = findInScope(curKey.getName());
                            String dtype = find(currentFunc).getData_type();
                            currentFunc = oldFunc;

                            if (!returnStack.empty()) {
                                printTable(tempTable);
                                Object result = valLookup(returnStack.pop(),false);
                                if (temp == null) {
                                    watchLog("[FuncAssign] Making new temp variable...");
                                    tempTable.add(new Symbol(curKey.getName(), Constants.TYPE_VAR, dtype, getScope(), result));
                                    printTable(tempTable);
                                } else {
                                    watchLog("[FuncAssign] Updating old temp variable...");
                                    temp.setValue(result);
                                }
                            }
                            // after function call has returned, return to old function
                            break;
                        }
                        else {
                            stepStack.push(stepFunc+"@"+stepCount);
                            stepCount = findLabel(funcName);
                            stepFunc = funcName;
                            currentFunc = funcName;
                            startFunc = true;
                            stepReturnStack.push(curKey.getName());
                            break;
                        }
                }
            }
            // _t = _t op _t
            else if (curVal.contains("+") || curVal.contains("-") || curVal.contains("*") || curVal.contains("/")) {
                String op = curVal.split(" ")[1];
                Object leftVal = valLookup(curVal.split(" ")[0], true);
                Object rightVal = valLookup(curVal.split(" ")[2], true);

                Symbol temp = find(curKey.getName());
                Object result = null;
                String result_type = null;

                System.out.println(leftVal instanceof Integer);
                System.out.println(rightVal instanceof Integer);
                System.out.println(leftVal instanceof Float);
                System.out.println(rightVal instanceof Float);

                if (leftVal instanceof Integer && rightVal instanceof Integer) {
                    int left = Integer.valueOf(String.valueOf(leftVal));
                    int right = Integer.valueOf(String.valueOf(rightVal));
                    switch (op) {
                        case "-":
                            result = Integer.valueOf(left - right);
                            break;
                        case "+":
                            result = Integer.valueOf(left + right);
                            break;
                        case "*":
                            result = Integer.valueOf(left * right);
                            break;
                        case "/":
                            result = Integer.valueOf(left / right);
                            break;
                    }
                    result_type = Constants.DTYPE_INT;
                }

                else if ((leftVal instanceof Float || leftVal instanceof Double) && rightVal instanceof Integer) {
                    float left = Float.valueOf(String.valueOf(leftVal));
                    int right = Integer.valueOf(String.valueOf(rightVal));
                    switch (op) {
                        case "-":
                            result = Float.valueOf(left - right);
                            break;
                        case "+":
                            result = Float.valueOf(left + right);
                            break;
                        case "*":
                            result = Float.valueOf(left * right);
                            break;
                        case "/":
                            result = Float.valueOf(left / right);
                            break;
                    }
                    result_type = Constants.DTYPE_FLOAT;
                }

                else if (leftVal instanceof Integer && (rightVal instanceof Float || rightVal instanceof Double)) {
                    int left = Integer.valueOf(String.valueOf(leftVal));
                    float right = Float.valueOf(String.valueOf(rightVal));
                    switch (op) {
                        case "-":
                            result = Float.valueOf(left - right);
                            break;
                        case "+":
                            result = Float.valueOf(left + right);
                            break;
                        case "*":
                            result = Float.valueOf(left * right);
                            break;
                        case "/":
                            result = Float.valueOf(left / right);
                            break;
                    }
                    result_type = Constants.DTYPE_FLOAT;
                }

                else if ((leftVal instanceof Float || leftVal instanceof Double) && (rightVal instanceof Float || rightVal instanceof Double)) {
                    float left = Float.valueOf(String.valueOf(leftVal));
                    float right = Float.valueOf(String.valueOf(rightVal));
                    switch (op) {
                        case "-":
                            result = Float.valueOf(left - right);
                            break;
                        case "+":
                            result = Float.valueOf(left + right);
                            break;
                        case "*":
                            result = Float.valueOf(left * right);
                            break;
                        case "/":
                            result = Float.valueOf(left / right);
                            break;
                    }
                    result_type = Constants.DTYPE_FLOAT;
                }

                watchLog("[Arithmetic] Result is " + result);
                if (temp == null) {
                    watchLog("[Arithmetic] Making new temp variable...");
                    tempTable.add(new Symbol(curKey.getName(),Constants.TYPE_VAR,result_type,getScope(),result));
                    printTable(tempTable);
                }
                else {
                    watchLog("[Arithmetic] Updating old temp variable...");
                    temp.setValue(curVal);
                }
            }
            // _t = _t conditional_op _t
            else if (curVal.contains("<") || curVal.contains(">") || curVal.contains(">=") || curVal.contains("<=")
                    || curVal.contains("==") || curVal.contains("!=")) {
                Symbol temp = findInScope(curKey.getName());
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String op = curVal.split(" ")[1];
                Object leftVal = valLookup(curVal.split(" ")[0], true);
                Object rightVal = valLookup(curVal.split(" ")[2], true);

                watchLog("[LogicOp] Evaluating: "+leftVal + op + rightVal);
                String toEvaluate  = leftVal + op + rightVal;
                try {
                    boolean result = Boolean.valueOf(String.valueOf(engine.eval(toEvaluate)));
                    watchLog("[LogicOp] Result is " + result);
                    if (temp == null) {
                        watchLog("[LogicOp] Making new temp variable...");
                        tempTable.add(new Symbol(curKey.getName(), Constants.TYPE_VAR, Constants.DTYPE_BOOL, getScope(), result));
                        printTable(tempTable);
                    }
                    else {
                        watchLog("[LogicOp] Updating old temp variable...");
                        temp.setValue(result);
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
            // _t = @[datatype]Array _t(size)
            else if (curVal.contains("@numArray")){
                String dataType = curVal.split("A")[0].replace("@","");
                int size = Integer.valueOf(valLookup(curVal.split(" ")[1],true).toString());
                Object[] defaultValue = null;
                switch (dataType){
                    case Constants.DTYPE_INT:
                        defaultValue = new Integer[size];
                        break;
                    case Constants.DTYPE_CHAR:
                        defaultValue = new Character[size];
                        break;
                    case Constants.DTYPE_FLOAT:
                        defaultValue = new Float[size];
                        break;
                    case Constants.DTYPE_DOUBLE:
                        defaultValue = new Double[size];
                        break;
                    case Constants.DTYPE_STRING:
                        defaultValue = new String[size];
                        break;
                    case Constants.DTYPE_BOOL:
                        defaultValue = new Boolean[size];
                        break;
                }
                tempTable.add(new Symbol(curKey.getName(),
                        Constants.TYPE_VAR,
                        dataType,
                        getScope(),
                        defaultValue));
            }
            // _t = arrName[index]
            else if (curVal.contains("[") && curVal.contains("]")){
                String arrName = curVal.split("\\[")[0];
                int index = Integer.valueOf(curVal.split("\\[")[1].replace("]",""));
                Symbol array = findInScope(arrName);
                Object val = array.getArrayValue(index);
                tempTable.add(new Symbol(curKey.getName(),
                        Constants.TYPE_VAR,
                        array.getData_type(),
                        getScope(),
                        val));
            }
            // _t = literal
            else {
                Symbol temp = find(curKey.getName());
                // if _t does not exist yet, make a new one
                if (temp == null) {
                    watchLog("[TempAssign] Making new temp variable...");
                    tempTable.add(new Symbol(curKey.getName(),
                            Constants.TYPE_VAR,
                            getDType(curVal),
                            getScope(),
                            cast(curVal)));
                }
                else {
                    // else, just assign it a new value
                    watchLog("[TempAssign] Updating old temp variable");
                    temp.setValue(cast(curVal));
                }
                printTable(tempTable);
            }
        } else if (curKey.getName().contains("[") && curKey.getName().contains("]")){ // arrName[index] = _t
            String arrName = curKey.getName().split("\\[")[0];
            Symbol curSymbol = findInScope(arrName);
            Symbol curTemp = findInScope(curVal);
            int index = Integer.valueOf(
                    curKey.getName().split("\\[")[1].replace("]","")
            );
            if (curSymbol == null) {
                flagError(curKey.getName() + " has not been declared.");
            }
            else if (curSymbol.getConst().booleanValue()) {
                flagError("Cannot reassign value of a constant!");
            }
            else if (!curSymbol.getData_type().contains(curTemp.getData_type())){
                flagError("Data type mismatch (array assignment)!");
            }
            Object value = valLookup(curVal,true);
            curSymbol.setArrayValue(value,index);
        } else if (!curKey.getName().contains("@")) { // left side is an (non-array) identifier if it doesnt have @ or _t or []
            Symbol curSymbol = findInScope(curKey.getName());
            // check first if variable has already been declared
            if (curSymbol == null) {
                flagError(curKey.getName() + " has not been declared.");
            }

            if (curSymbol.getConst().booleanValue()) {
                flagError("Cannot reassign value of a constant!");
            }

            System.out.println("CURVAL IS " +curVal);
            System.out.println("CURSYMBOL IS " + curSymbol.getName());

            // identifier = identifier op literal
            if (curVal.replace(" ","").matches("[A-Za-z_][A-Za-z0-9_]*[+-/*][\\d]+")) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String left = String.valueOf(valLookup(curVal.split(" ")[0], true));
                String right = curVal.split(" ")[2];
                String op = curVal.split(" ")[1];
                try {
                    String result = String.valueOf(engine.eval(left + op + right));
                    curSymbol.setValue(cast(result));
                } catch (ScriptException e){
                    e.printStackTrace();
                }
            }
            // identifier = _t (array)
            else if (curSymbol.getData_type().contains("[") &&
                    curSymbol.getData_type().contains("]")){
                curSymbol.setValue(valLookup(curVal,true));
                watchLog("[Assignment] "+curSymbol.getName() + " is now = " + curSymbol.getValue());
            }
            // identifier = _t
            else {
                String realVal = String.valueOf(valLookup(curVal,true));
                // proper data type checking
                // data type of identifier must match the data type of the value being assigned to it
                // there are some exceptions like float to int & vice versa
                System.out.println("------");
                System.out.println(realVal);
                System.out.println(getDType(realVal));
                System.out.println(curSymbol.getData_type());
                System.out.println("------");

                if (curSymbol.getData_type().equals(getDType(realVal))) {
                    curSymbol.setValue(cast(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_INT) &&
                        (getDType(realVal).equals(Constants.DTYPE_FLOAT) || getDType(realVal).equals(Constants.DTYPE_DOUBLE))) {
                    curSymbol.setValue(Double.valueOf(realVal).intValue());
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_FLOAT) &&
                        getDType(realVal).equals(Constants.DTYPE_INT)) {
                    curSymbol.setValue(Float.valueOf(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_DOUBLE) &&
                        getDType(realVal).equals(Constants.DTYPE_INT)) {
                    curSymbol.setValue(Double.valueOf(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_CHAR) &&
                        getDType(realVal).equals(Constants.DTYPE_STRING) &&
                        realVal.length() == 1){
                    curSymbol.setValue(Character.valueOf(realVal.charAt(0)));
                }
                else {
                    flagError("Data type mismatch, expecting " + curSymbol.getData_type() + ".");
                }
            }

            watchLog("[Assignment] "+curSymbol.getName() + " is now = " + curSymbol.getValue());
            printTable(symbolTable);
        }
    }

    // adds new symbols to symbol table for parameters (same value, different scope)
    public void addParam(String name, String datatype, String newscope, Object value){
        watchLog("Adding parameter " + name + " to symbol table...");
        symbolTable.add(new Symbol(name,Constants.TYPE_VAR,datatype,newscope,value));
    }

    // function used to find the index of a label in the intermediate code
    public int findLabel(List<Key> keyList, String label){
        for (int i = 0; i<keyList.size();i++){
            if (keyList.get(i).getName().equals(label))
                return i;
        }
        return -1;
    }

    // step count function variation, since it may not have access to key list
    public int findLabel(String label){
        List<Key> keyList = new ArrayList<>(TAC.keySet());
        for (int i = 0; i<keyList.size();i++){
            if (keyList.get(i).getName().equals(label)) {
                watchLog("RETURNING TO INDEX " + (i-1));
                return i-1;
            }
        }
        return -1;
    }

    // returns the current scope of the program (loop or current function)
    public String getScope(){
        if (loopStack.empty()) return currentFunc;
        else return loopStack.peek();
    }

    // removes all entries in both symbol tables with a specified scope
    public void removeFromSymbolTable(String scope){
        symbolTable.removeIf(symbol -> symbol.getScope().equals(scope));
        tempTable.removeIf(symbol -> symbol.getScope().equals(scope));
    }

    // gets data type of string value depending on content of string
    public String getDType(String value){
        if (value.contains("\""))
            return Constants.DTYPE_STRING;
        else if (value.contains("\'"))
            return Constants.DTYPE_CHAR;
        else if (value.equals(Constants.BOOL_FALSE) || value.equals(Constants.BOOL_TRUE))
            return Constants.DTYPE_BOOL;
        else if (value.matches("-?\\d+"))
            return Constants.DTYPE_INT;
        else if (value.matches("[-+]?[0-9]*\\.?[0-9]+"))
            return Constants.DTYPE_FLOAT;
        else
            return Constants.DTYPE_STRING;
    }

    // Casts a string to a certain data type
    public Object cast (String value){
        switch (getDType(value)){
            case Constants.DTYPE_STRING:
                return String.valueOf(value);
            case Constants.DTYPE_INT:
                return Integer.valueOf(value);
            case Constants.DTYPE_FLOAT:
                return Float.valueOf(value);
            case Constants.DTYPE_BOOL:
                return Boolean.valueOf(value);
            case Constants.DTYPE_CHAR:
                return value.charAt(1);
            case Constants.DTYPE_DOUBLE:
                return Double.valueOf(value);
                default:
                    return null;
        }
    }

    // flags error and terminates program
    public void flagError(String error){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Semantic/runtime error detected");
        alert.setContentText(error + " Program terminating...");
        printTable(symbolTable);
        alert.showAndWait();
        consoleLog("-----Program Terminating-----");
        terminate = true;

        if (stepMode) Watchstage.getInstance().updateStatus("Program terminated...");
    }

    // finds for symbol on both tables based on identifier
    public Symbol find(String identifier){
        for (Symbol symbol : symbolTable){
            if (symbol.getName().equals(identifier))
                return symbol;
        }

        for (Symbol symbol : tempTable){
            if (symbol.getName().equals(identifier))
                return symbol;
        }
        return null;
    }

    // finds for symbol on both tables based on identifier and current scope
    public Symbol findInScope(String identifier){
        for (Symbol symbol : symbolTable){
            if (symbol.getName().equals(identifier) && inScope(symbol))
                return symbol;
        }

        for (Symbol symbol : tempTable){
            if (symbol.getName().equals(identifier) && inScope(symbol))
                return symbol;
        }
        return null;
    }

    // checks if symbol is in current scope of the program
    public boolean inScope(Symbol symbol){
        if (symbol.getScope().equals(getScope())) return true;
        for (String scope:scopeLink){
            if (scope.contains(getScope()) && scope.contains(symbol.getScope())) return true;
        }
        return false;
    }

    // retrieves input from user and returns it as a string
    public String getInput(String inputMsg){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Scan Dialog");
        dialog.setHeaderText(inputMsg);
        dialog.setContentText("Please enter your input:");

        Optional<String> result = dialog.showAndWait();
        String input = null;
        if (result.isPresent()){
            input = result.get();
        }
        return input;
    }

    // responsible for getting the actual value of variables stored in the symbol/temp table
    public Object valLookup(String symbolName, boolean inScope){
        Symbol symbol = null;
        if (inScope) {
            watchLog("Finding for " + symbolName + " in scope " + getScope());
            symbol = findInScope(symbolName);
        } else {
            watchLog("Finding for " + symbolName);
            symbol = find(symbolName);
        }

        if (symbol == null) {
            watchLog("Nothing found :((");
            flagError("Variable " + symbolName + " does not exist!");
        }

        // if retrieved value is a string, remove the quotation marks
        if (symbol.getData_type().equals(Constants.DTYPE_STRING)) {
            String val = String.valueOf(symbol.getValue());
            return val.replace("\"","");
        }
        return symbol.getValue();
    }

    // prints out table for debugging
    public void printTable (List<Symbol> table){
        System.out.println("SymbolName \t SymbolType \t Value \t Data type \t Scope");
        for (Symbol symbol:table){
            System.out.println(symbol.getName() +
                    " \t\t " + symbol.getType() +
                    " \t\t " + symbol.getValue() +
                    " \t\t " + symbol.getData_type() +
                    " \t\t " + symbol.getScope()
            );
        }
    }

    public Stack<String> getPrintStack() {
        return printStack;
    }

    public List<Symbol> getSymbolTable() {
        return symbolTable;
    }

    public List<Symbol> getTempTable() {
        return tempTable;
    }
}
