package sample;

import antlr4.EzBrewBaseListener;
import antlr4.EzBrewParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SampleListener extends EzBrewBaseListener {
    private Map<Key,String> TAC = new LinkedHashMap<>();
    private int count = 0;
    private int label_count = 0;

    private Stack<String> operationStack = new Stack<>();
    private Stack<String> assignmentStack = new Stack<>();
    private Stack<String> labelStack = new Stack<>();
    private Stack<String> skipStack = new Stack<>();
    private Stack<LoopStackEntry> loopStack = new Stack<>();
//    private LinkedList<String> labelQ = new LinkedList<>();
//    private Stack<String> parStack = new Stack<>();
//    private Stack<String> exprStack = new Stack<>();
//    private Stack<String> literalStack = new Stack<>();

    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule exited: " + ctx.getText());      //code that executes per rule
    }

    @Override public void enterForStmt(EzBrewParser.ForStmtContext ctx) {
        String conditionLbl = "_L"+label_count;
        label_count++;
        String bodyLbl = "_L"+label_count;
        label_count++;
        String endLbl = "_L"+label_count;
        label_count++;
        String updateLbl = "_L"+label_count;
        label_count++;
        loopStack.push(new LoopStackEntry(conditionLbl,bodyLbl,endLbl,updateLbl));
    }

    @Override public void exitForStmt(EzBrewParser.ForStmtContext ctx) {
        String endLbl = loopStack.peek().getEndLbl();
        TAC.put(new Key(endLbl, Constants.KTYPE_LABEL),null);
        loopStack.pop();
    }

    @Override public void enterCompare1(EzBrewParser.Compare1Context ctx){
        if (ctx.getParent() instanceof EzBrewParser.ForControlContext){
            String conditionalLbl = loopStack.peek().getConditionLbl();
            TAC.put(new Key(conditionalLbl, Constants.KTYPE_LABEL),null);
        }
    }

    @Override public void enterCompare2(EzBrewParser.Compare2Context ctx){
        if (ctx.getParent() instanceof EzBrewParser.ForControlContext){
            String conditionalLbl = loopStack.peek().getConditionLbl();
            TAC.put(new Key(conditionalLbl, Constants.KTYPE_LABEL),null);
        }
    }

    @Override public void enterBlockStmt(EzBrewParser.BlockStmtContext ctx) {
        if (ctx.getParent() instanceof EzBrewParser.IfStmtContext) {
            String label = labelStack.pop();
            TAC.put(new Key(label, Constants.KTYPE_LABEL),null);
        }

        if (ctx.getParent() instanceof EzBrewParser.ForStmtContext) {
            String bodyLabel = loopStack.peek().getBodyLbl();
            TAC.put(new Key(bodyLabel, Constants.KTYPE_LABEL),null);
        }
    }

    @Override public void exitIfStmt(EzBrewParser.IfStmtContext ctx) {
        String label = skipStack.pop();
        TAC.put(new Key(label, Constants.KTYPE_LABEL),null);
    }

    @Override public void exitIfStmt2(EzBrewParser.IfStmt2Context ctx) {
        String label = skipStack.pop();
        TAC.put(new Key(label, Constants.KTYPE_LABEL),null);
    }


    @Override public void exitBlockStmt(EzBrewParser.BlockStmtContext ctx) {
        if (ctx.getParent() instanceof EzBrewParser.IfStmtContext) {
            String exitIfLbl = "_L"+label_count;
            label_count++;

            TAC.put(new Key("@Goto"),exitIfLbl);

            String label = skipStack.pop();
            TAC.put(new Key(label, Constants.KTYPE_LABEL),null);

            skipStack.push(exitIfLbl);
        }

        if (ctx.getParent() instanceof EzBrewParser.ForStmtContext) {
            TAC.put(new Key("@Goto"),loopStack.peek().getUpdateLbl());
        }
    }


    @Override public void exitParExp(EzBrewParser.ParExpContext ctx) {
        if (ctx.getParent() instanceof EzBrewParser.IfStmtContext) {
            String label = "_L"+label_count;
            label_count++;
            labelStack.push(label);

//            String left = "@If " + operationStack.pop();
            String left = "@If";
            String right = "Goto " + label;

            TAC.put(new Key(left, operationStack.pop()),right);

            String skip = "_L"+label_count;
            label_count++;
            skipStack.push(skip);
            TAC.put(new Key("@Goto"),skip);

            // idk bout this fam
//            String skipElse = "_L"+label_count;
//            label_count++;
//            skipStack.push(skipElse);

        }
    }

    @Override public void exitMulDiv(EzBrewParser.MulDivContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);

    }

    @Override public void exitAddSub(EzBrewParser.AddSubContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitCompare1(EzBrewParser.Compare1Context ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);

        if (ctx.getParent() instanceof EzBrewParser.ForControlContext){
            String left2 = "@If";
            assignmentStack.pop();
            String right2 = "Goto " + loopStack.peek().getBodyLbl();

            TAC.put(new Key(left2, operationStack.pop()),right2);
            TAC.put(new Key("@Goto"),loopStack.peek().getEndLbl());
        }
    }

    @Override public void exitCompare2(EzBrewParser.Compare2Context ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitAnd(EzBrewParser.AndContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitOr(EzBrewParser.OrContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void enterIncDec(EzBrewParser.IncDecContext ctx) {
        if (ctx.getParent().getParent() instanceof EzBrewParser.ForControlContext){
            String updateLbl = loopStack.peek().getUpdateLbl();
            TAC.put(new Key(updateLbl, Constants.KTYPE_LABEL),null);
        }
    }

    @Override public void exitIncDec(EzBrewParser.IncDecContext ctx) {
        String op = ctx.postfix.getText();
        String identifier = ctx.IDENTIFIER().getText();
        String left = identifier;
        System.out.println("OVER HERE:"+identifier + ":"+op);
        switch(op){
            case "++":
                TAC.put(new Key(left),identifier + " + 1");
                break;
            case "--":
                TAC.put(new Key(left),identifier + " - 1");
                break;
            default:
                TAC.put(new Key("ERROR", Constants.KTYPE_ERROR),null);
        }

        if (ctx.getParent().getParent() instanceof EzBrewParser.ForControlContext){
            TAC.put(new Key("@Goto"),loopStack.peek().getConditionLbl());
        }
    }

    @Override public void exitMthdCall(EzBrewParser.MthdCallContext ctx) {
        String left = "_t"+count;
        count++;
        String right = "@LCall _" + ctx.getChild(0).getChild(0).getText();

        TAC.put(new Key(left),right);

        int paramCount = ctx.getChild(0).getChildCount()-3;
        if (paramCount > 0){
            System.out.println("I HAVE PARAMETERS ---- " + paramCount);
        }
        assignmentStack.push(left);
        operationStack.push(left);
    }

    @Override public void exitAssignment(EzBrewParser.AssignmentContext ctx) {
        if (!assignmentStack.empty()){
            // if left side of assignment statement is an array access
            if (ctx.getChild(0) instanceof EzBrewParser.ArrayAccessContext) {
                String left = ctx.getChild(0).getText();
                String right = assignmentStack.pop();

                TAC.put(new Key(left),right);
                operationStack.pop();
            }
            // left side is not array access (normal)
            else {
                String left = ((EzBrewParser.IdentifierContext) ctx.getChild(0).getChild(0)).IDENTIFIER().getText();
                String right = assignmentStack.pop();
                System.out.println("FAM! IM ASSIGNING " + left + " AND " + right);

                TAC.put(new Key(left),right);
                operationStack.pop();
            }
        }
    }

    @Override public void exitIdentifier(EzBrewParser.IdentifierContext ctx) {
        operationStack.push(ctx.IDENTIFIER().toString());
        assignmentStack.push(ctx.IDENTIFIER().toString());

        if (ctx.getParent().getParent().getParent().getParent() instanceof EzBrewParser.MthdCallContext) {
            TAC.put(new Key("@PushParam"),operationStack.pop());
            assignmentStack.pop();
        }
    }

    @Override public void exitLit(EzBrewParser.LitContext ctx) {
        String left = "_t"+count;
        count++;

        String right = ctx.getChild(0).getChild(0).getText();

        TAC.put(new Key(left),right);
        operationStack.push(left);
        assignmentStack.push(left);

        if (ctx.getParent().getParent().getParent().getParent() instanceof EzBrewParser.MthdCallContext) {
            TAC.put(new Key("@PushParam"),operationStack.pop());
            assignmentStack.pop();
        }
    }

    @Override public void exitPrintStmt(EzBrewParser.PrintStmtContext ctx) {
        int paramaters = ctx.getChildCount() / 2 - 1;
        for (int i=0;i<paramaters;i++) {
            String right = operationStack.pop();
            TAC.put(new Key("@PushParam"), right);
        }

        TAC.put(new Key("@LCall"), "_Print " + paramaters);
    }

    @Override public void exitInput(EzBrewParser.InputContext ctx) {
        int paramaters = ctx.getChildCount() / 2 - 1;
        for (int i=0;i<paramaters;i++) {
            String right = operationStack.pop();
            TAC.put(new Key("@PushParam"), right);
        }

        String left = "_t"+count;
        count++;
        TAC.put(new Key(left),"@LCall _Scan " + paramaters);
        assignmentStack.push(left);
        operationStack.push(left);
    }

    @Override public void exitVarAssignment(EzBrewParser.VarAssignmentContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = ctx.getChild(0).getChild(0).getText();

            String right = assignmentStack.pop();

            TAC.put(new Key(left),right);
            operationStack.pop();
        }
    }

    @Override public void enterLocalVariableDeclaration(EzBrewParser.LocalVariableDeclarationContext ctx) {
        String type = ctx.getChild(0).getText();
        String varName = ctx.getChild(1).getChild(0).getChild(0).getText();
        TAC.put(new Key("@Declare"),type + " " + varName);
    }


    @Override public void enterForInit(EzBrewParser.ForInitContext ctx) {
        if (ctx.getChildCount() > 1){
            String type = ctx.getChild(0).getChild(0).getChild(0).getText();
            String varName = ctx.getChild(1).getChild(0).getText();
            TAC.put(new Key("@Declare"),type + " " + varName);
        }
    }

    @Override public void exitForInit(EzBrewParser.ForInitContext ctx) {
        if (!assignmentStack.empty() && ctx.getChildCount() > 1){
            String left = ctx.getChild(1).getChild(0).getText();
            String right = assignmentStack.pop();
            System.out.println("FAM! IM ASSIGNING " + left + " AND " + right);

            TAC.put(new Key(left),right);
            operationStack.pop();
        }
    }

    @Override public void exitCreator(EzBrewParser.CreatorContext ctx) {
        String left = "_t"+count;
        count++;

        String right = "@" + ctx.getChild(0).getChild(0).getText() + "Array " + operationStack.pop();
        TAC.put(new Key(left),right);

        assignmentStack.push(left);
        operationStack.push(left);
    }

    @Override public void exitArrayAccess(EzBrewParser.ArrayAccessContext ctx) {
        if (ctx.getParent() instanceof EzBrewParser.AssignmentContext) return;
        String left = "_t"+count;
        count++;

        String right = ctx.getText();
//        String right = operationStack.pop();
        String arrName = ctx.getChild(0).getChild(0).getText();
//        String right = arrName + " + " + operationStack.pop();
        assignmentStack.pop();
        TAC.put(new Key(left),right);

        assignmentStack.push(left);
        operationStack.push(left);

        if (ctx.getParent().getParent().getParent() instanceof EzBrewParser.MthdCallContext) {
            TAC.put(new Key("@PushParam"),operationStack.pop());
            assignmentStack.pop();
        }
    }

//    @Override public void exitParEps(EzBrewParser.ParEpsContext ctx) {
//        String left = "_t"+count;
//        count++;
//        String right = parStack.pop();
//        TAC.put(left,right);
//        operationStack.push(left);
//    }


    @Override public void enterMethodDeclaration(EzBrewParser.MethodDeclarationContext ctx) {
        String methodName = ctx.getChild(1).getText();
        TAC.put(new Key(methodName, Constants.KTYPE_FUNC),null);
    }

    @Override public void exitMethodDeclaration(EzBrewParser.MethodDeclarationContext ctx) {
        TAC.put(new Key("@EndFunc"),"");
    }

    public Map<Key,String> getTAC(){
        return TAC;
    }

    public void statusUpdate(){
        System.out.println("-------STATUS UPDATE-------");
        System.out.println("Label Count: " + label_count);
        System.out.println("Operation stack: " + operationStack);
        System.out.println("Assignment stack: " + assignmentStack);
    }
}
