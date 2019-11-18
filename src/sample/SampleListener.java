package sample;

import antlr4.EzBrewBaseListener;
import antlr4.EzBrewParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SampleListener extends EzBrewBaseListener {
    private Map<String,String> TAC = new HashMap<>();
    int count = 0;

    private Stack<String> operationStack = new Stack<>();
    private Stack<String> parStack = new Stack<>();
    private Stack<String> exprStack = new Stack<>();

    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule exited: " + ctx.getText());      //code that executes per rule
    }

    @Override public void exitMulDiv(EzBrewParser.MulDivContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;
        TAC.put(left,right);
        parStack.push(right);
        exprStack.push(right);
    }

    @Override public void exitAddSub(EzBrewParser.AddSubContext ctx) {
        String left = "_t"+count;
        count++;

        String right_op = operationStack.pop();
        String left_op = operationStack.pop();
        String right = left_op + " " + ctx.bop.getText() + " " + right_op;
        TAC.put(left,right);
        parStack.push(right);
        exprStack.push(right);
    }

    @Override public void exitIntLit(EzBrewParser.IntLitContext ctx) {
        String left = "_t"+count;
        count++;

        String right = ctx.DECIMAL_LITERAL().getText();
        TAC.put(left,right);
        operationStack.push(left);
    }

    @Override public void exitIdentifier(EzBrewParser.IdentifierContext ctx) {
        operationStack.push(ctx.IDENTIFIER().toString());
    }

    @Override public void exitParEps(EzBrewParser.ParEpsContext ctx) {
        String left = "_t"+count;
        count++;
        String right = parStack.pop();
        TAC.put(left,right);
        operationStack.push(left);
    }

    @Override public void exitVarDeclarator(EzBrewParser.VarDeclaratorContext ctx) {

    }

    @Override public void exitExprInit(EzBrewParser.ExprInitContext ctx) {

    }

    public Map<String,String> getTAC(){
        return TAC;
    }
}
