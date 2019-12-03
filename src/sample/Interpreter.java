package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;

public class Interpreter {
    private Map<Key,String> TAC;
    private Stack<String> printStack = new Stack();
    private TextArea consoleArea;

    private List<Symbol> symbolTable = new ArrayList<>();
    private List<Symbol> tempTable = new ArrayList<>();

    private boolean terminate = false;
    private String currentFunc = null;
    boolean startFunc = true;
    String goTo = null;

    private void consoleLog(String log){
        consoleArea.appendText(log);
        consoleArea.appendText("\n");
    }

    public Interpreter(Map<Key, String> TAC, TextArea console) {
        this.TAC = TAC;
        this.consoleArea = console;
    }

    public void functionCall (String functionName){
        List<Key> keyList = new ArrayList<>(TAC.keySet());

        for (int i = 0; i < keyList.size() && !terminate; i++){
            Key curKey = keyList.get(i);
            String curVal = TAC.get(keyList.get(i));

            // if you need to go to a label in the intermediate code
            if (goTo != null) {
                i = findLabel(keyList, goTo);
                System.out.println("JUMPING TO INDEX " + i + " ("+goTo+")");
                goTo = null;
                continue;
            }

            // curVal is null usually when line pertains to a label, so skip
            if (curVal == null) {
                if (curKey.getInfo().equals(Constants.KTYPE_FUNC))
                    currentFunc = curKey.getName();
                continue;
            }

            // if you are trying to start a function and found it, you can start the code
            if (startFunc && currentFunc.equals(functionName)) {
                startFunc = false;
            }
            // otherwise, just skip the code
            else if (startFunc){
                System.out.println("SKIPPING...");
                continue;
            }

            // if fuction has ended, return to caller
            if (curKey.getName().equals("@EndFunc")) {
                System.out.println("Ending method call for " + currentFunc);
                if (currentFunc.equals(Constants.MAIN)) consoleLog("-----END OF MAIN FUNCTION-----");
                return;
            }

            System.out.println("-------");
            System.out.println(curKey.getName() + " = "+curVal);
            // if function has not ended, interpret the line
            interpretLine(curKey,curVal);
        }
    }

    // function used to find the index of a label in the intermediate code
    public int findLabel(List<Key> keyList, String label){
        for (int i = 0; i<keyList.size();i++){
            if (keyList.get(i).getName().equals(label))
                return i;
        }
        return -1;
    }

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
                    symbolTable.add(new Symbol(name,Constants.TYPE_VAR,dtype));
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
                        toPrint += String.valueOf(valLookup(pop));
                    }
                    consoleLog(toPrint);
                }
                break;
            case "@PushParam":
                // @PushParam variableOrLiteralName
                printStack.push(curVal);
                break;
            case "@If":
                System.out.println("IF PORK: " + curKey.getName());
                System.out.println("IF PORK: " + curKey.getInfo());
                System.out.println("IF PORK: " + valLookup(curKey.getInfo()));
                boolean jump = Boolean.valueOf(String.valueOf(valLookup(curKey.getInfo())));
                System.out.println("IF STATEMENT EVALUATES TO " + jump);
                if (jump) {
                    String label = curVal.split(" ")[1];
                    System.out.println("JUMPING TO " + label);
                    goTo = label;
                }
                break;
            case "@Goto":
                goTo = curVal;
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
                            inputMsg += String.valueOf(valLookup(pop));
                        }
                        String input = getInput(inputMsg);
                        tempTable.add(new Symbol(curKey.getName(),Constants.TYPE_VAR,Constants.DTYPE_STRING,input));
                        break;
                    default:
                        // Custom function
//                        it = TAC.entrySet().iterator();
                        startFunc = true;
                        String oldFunc = currentFunc;
                        functionCall(func.substring(1));
                        currentFunc = oldFunc;
                        // after function call has returned, return to old function
                        break;
                }
            }
            // _t = _t op _t
            else if (curVal.contains("+") || curVal.contains("-") || curVal.contains("*") || curVal.contains("/")) {
                String op = curVal.split(" ")[1];
                Object leftVal = valLookup(curVal.split(" ")[0]);
                Object rightVal = valLookup(curVal.split(" ")[2]);

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

                System.out.println("RESULT IS " + result);
                if (temp == null)
                    tempTable.add(new Symbol(curKey.getName(),Constants.TYPE_VAR,result_type,result));
                else {
                    temp.setValue(curVal);
                }
            }
            // _t = _t conditional_op _t
            else if (curVal.contains("<") || curVal.contains(">") || curVal.contains(">=") || curVal.contains("<=")
                    || curVal.contains("==") || curVal.contains("!=")) {
                Symbol temp = find(curKey.getName());
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String op = curVal.split(" ")[1];
                Object leftVal = valLookup(curVal.split(" ")[0]);
                Object rightVal = valLookup(curVal.split(" ")[2]);

                System.out.println("EVALUATING: "+leftVal + op + rightVal);
                String toEvaluate  = leftVal + op + rightVal;
                try {
                    boolean result = Boolean.valueOf(String.valueOf(engine.eval(toEvaluate)));
                    System.out.println("RESULT IS " + result);
                    if (temp == null) {
                        System.out.println("MAKING NEW TEMP VARIABLE");
                        tempTable.add(new Symbol(curKey.getName(), Constants.TYPE_VAR, Constants.DTYPE_BOOL, result));
                    }
                    else {
                        System.out.println("UPDATING OLD TEMP VARIABLE");
                        temp.setValue(result);
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
            // _t = literal
            else {
                Symbol temp = find(curKey.getName());
                // if _t does not exist yet, make a new one
                if (temp == null) {
                    tempTable.add(new Symbol(curKey.getName(),
                            Constants.TYPE_VAR,
                            getDType(curVal),
                            cast(curVal)));
                }
                else {
                    // else, just assign it a new value
                    temp.setValue(cast(curVal));
                }
            }
        } else if (!curKey.getName().contains("@")) { // left side is an identifier if it doesnt have @ or _t
            Symbol curSymbol = find(curKey.getName());
            // check first if variable has already been declared
            if (curSymbol == null) {
                flagError(curKey.getName() + " has not been declared.");
            }

            System.out.println("CURVAL IS " +curVal);
            System.out.println("CURSYMBOL IS " + curSymbol.getName());

            // identifier = identifier op literal
            if (curVal.replace(" ","").matches("[A-Za-z_][A-Za-z0-9_]*[+-/*][\\d]+")) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String left = String.valueOf(valLookup(curVal.split(" ")[0]));
                String right = curVal.split(" ")[2];
                String op = curVal.split(" ")[1];
                try {
                    String result = String.valueOf(engine.eval(left + op + right));
                    curSymbol.setValue(cast(result));
                } catch (ScriptException e){
                    e.printStackTrace();
                }
            }
            // identifier = _t
            else {
                String realVal = String.valueOf(valLookup(curVal));
                // proper data type checking
                // data type of identifier must match the data type of the value being assigned to it
                // there are some exceptions like float to int & vice versa
                if (curSymbol.getData_type().equals(getDType(realVal))) {
                    curSymbol.setValue(cast(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_INT) &&
                        (getDType(realVal).equals(Constants.DTYPE_FLOAT) || getDType(realVal).equals(Constants.DTYPE_DOUBLE))) {
                    curSymbol.setValue(Integer.valueOf(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_FLOAT) &&
                        getDType(realVal).equals(Constants.DTYPE_INT)) {
                    curSymbol.setValue(Float.valueOf(realVal));
                } else if (curSymbol.getData_type().equals(Constants.DTYPE_DOUBLE) &&
                        getDType(realVal).equals(Constants.DTYPE_INT)) {
                    curSymbol.setValue(Double.valueOf(realVal));
                } else {
                    flagError("Data type mismatch, expecting " + curSymbol.getData_type() + ".");
                }
            }

            System.out.println("OVER HERE----" + curSymbol.getName() + " IS NOW " + curSymbol.getValue());
        }
    }

    public String getDType(String value){
        if (value.contains("\""))
            return Constants.DTYPE_STRING;
        else if (value.matches("-?\\d+"))
            return Constants.DTYPE_INT;
        else if (value.matches("[-+]?[0-9]*\\.?[0-9]+"))
            return Constants.DTYPE_FLOAT;
        else
            return Constants.DTYPE_STRING;
    }

    public Object cast (String value){
        switch (getDType(value)){
            case Constants.DTYPE_STRING:
                return String.valueOf(value);
            case Constants.DTYPE_INT:
                return Integer.valueOf(value);
            case Constants.DTYPE_FLOAT:
                return Float.valueOf(value);
                default:
                    return null;
        }
    }

    public void flagError(String error){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Semantic/runtime error detected");
        alert.setContentText(error + " Program terminating...");
        printTable(symbolTable);
        alert.showAndWait();
        consoleLog("-----Program Terminating-----");
        terminate = true;
    }

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
    public Object valLookup(String symbolName){
        Symbol symbol = find(symbolName);
        if (symbol == null) return null;
        else {
            // if retrieved value is a string, remove the quotation marks
            if (symbol.getData_type().equals(Constants.DTYPE_STRING)) {
                String val = String.valueOf(symbol.getValue());
                return val.replace("\"","");
            }
            return symbol.getValue();
        }
    }

    public void printTable (List<Symbol> table){
        System.out.println("SymbolName \t SymbolType");
        for (Symbol symbol:table){
            System.out.println(symbol.getName() + " \t " + symbol.getType());
        }
    }
}
