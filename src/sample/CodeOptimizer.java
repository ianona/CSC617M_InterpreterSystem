package sample;

import antlr4.EzBrewBaseListener;
import antlr4.EzBrewParser;

public class CodeOptimizer extends EzBrewBaseListener {
    String[] keywords = {"outline", "stop", "sample", "handle", "blueprint", "perm", "do", "other", "catalog", "childof", "abs", "lastly", "loop", "given", "has", "is", "mod", "orig", "closed", "secured", "open", "out", "same", "parent", "choose", "self", "shoot", "shoots", "attempt", "emp", "during", "bundle", "include"};
    String[] numerical = {"ddec", "sdec", "num"};

    public String getCode(String wholecode) {
        return fixcode(wholecode);
    }

    private String fixcode(String wholecode) {
        String optimizedcode = "";

        //constant propagation
        optimizedcode = consprop(wholecode);

        return optimizedcode;
    }

    private String consprop(String wholecode) {
        return wholecode;
    }

    @Override public void exitBlockStatement(EzBrewParser.BlockStatementContext ctx) {
//        if(ctx.getText().charAt(ctx.getText().length()-1) != ';'){
//            System.out.println("Error at line " + ctx.start.getLine() +  ": No semi colon");
//        }
    }
}
