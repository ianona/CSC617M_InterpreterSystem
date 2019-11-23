package sample;

import antlr4.EzBrewBaseListener;
import antlr4.EzBrewParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class SampleListener extends EzBrewBaseListener {
    private Map<Key,String> TAC = new LinkedHashMap<>();
    private int count = 0;
    private int label_count = 0;
    private boolean if_flag = false;

    private Stack<String> operationStack = new Stack<>();
    private Stack<String> assignmentStack = new Stack<>();
//    private Stack<String> parStack = new Stack<>();
//    private Stack<String> exprStack = new Stack<>();
//    private Stack<String> literalStack = new Stack<>();

    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule exited: " + ctx.getText());      //code that executes per rule
    }

    @Override public void exitIfStmt(EzBrewParser.IfStmtContext ctx) {
        if_flag = true;
    }

    @Override public void exitParExp(EzBrewParser.ParExpContext ctx) {
        if (ctx.getParent() instanceof EzBrewParser.IfStmtContext) {
            System.out.println("CAMOTEEEEEE " + operationStack.pop());
        }
    }

    public String addLabel_IfStmt(){
        if (if_flag){
            System.out.println("IM THE CODE AFTER THE IF SHIT FACE");
            String label = "_L"+label_count;
            label_count++;
            if_flag = false;
            return label;
        }
        return null;
    }

    @Override public void exitMulDiv(EzBrewParser.MulDivContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
//        parStack.push(right);
//        exprStack.push(right);
        operationStack.push(left);
        assignmentStack.push(left);

    }
//
    @Override public void exitAddSub(EzBrewParser.AddSubContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left, label),right);
//        parStack.push(right);
//        exprStack.push(right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitCompare1(EzBrewParser.Compare1Context ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitCompare2(EzBrewParser.Compare2Context ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitAnd(EzBrewParser.AndContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

    @Override public void exitOr(EzBrewParser.OrContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
        operationStack.push(left);
        assignmentStack.push(left);
    }

//    @Override public void exitIntLit(EzBrewParser.IntLitContext ctx) {
//        String left = "_t"+count;
//        count++;
//
//        String right = ctx.DECIMAL_LITERAL().getText();
//        TAC.put(left,right);
//        operationStack.push(left);
//        assignmentStack.push(left);
//    }

    @Override public void exitAssignment(EzBrewParser.AssignmentContext ctx) {
        if (!assignmentStack.empty()){
            String left = ((EzBrewParser.IdentifierContext) ctx.getChild(0).getChild(0)).IDENTIFIER().getText();

            String right = assignmentStack.pop();

            String label = addLabel_IfStmt();
            TAC.put(new Key(left,label),right);
            operationStack.pop();
//            literalStack.pop();
        }
    }
//
    @Override public void exitIdentifier(EzBrewParser.IdentifierContext ctx) {
        operationStack.push(ctx.IDENTIFIER().toString());
    }

    @Override public void exitLit(EzBrewParser.LitContext ctx) {
        String left = "_t"+count;
        count++;

        String right = ctx.getChild(0).getChild(0).getText();

        String label = addLabel_IfStmt();
        TAC.put(new Key(left,label),right);
        operationStack.push(left);
        assignmentStack.push(left);
//        literalStack.push(left);
    }

    @Override public void exitPrintStmt(EzBrewParser.PrintStmtContext ctx) {
        String right = operationStack.pop();

        String label = addLabel_IfStmt();
        TAC.put(new Key("@PushParam",label),right);
        TAC.put(new Key("@LCall"),"_Print");
    }

    @Override public void exitVarAssignment(EzBrewParser.VarAssignmentContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = ctx.getChild(0).getChild(0).getText();

            String right = assignmentStack.pop();

            String label = addLabel_IfStmt();
            TAC.put(new Key(left,label),right);
            operationStack.pop();
        }
    }

//    @Override public void exitParEps(EzBrewParser.ParEpsContext ctx) {
//        String left = "_t"+count;
//        count++;
//        String right = parStack.pop();
//        TAC.put(left,right);
//        operationStack.push(left);
//    }


//    @Override public void exitExprInit(EzBrewParser.ExprInitContext ctx) {
//
//    }

    public Map<Key,String> getTAC(){
        return TAC;
    }
}
