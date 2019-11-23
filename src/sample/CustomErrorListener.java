package sample;

import antlr4.EzBrewBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends EzBrewBaseListener {
    List<String> errors = new ArrayList<>();

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        errors.add("SAMPLE, rule exited+ " + ctx.toString());
    }

    public List<String> getErrors() {
        return errors;
    }
}
