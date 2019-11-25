package sample;

import antlr4.EzBrewBaseListener;
import antlr4.EzBrewParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends EzBrewBaseListener {
    List<String> errors = new ArrayList<>();

    String[] keywords = {"outline", "stop", "sample", "handle", "blueprint", "perm", "do", "other", "catalog", "childof", "abs", "lastly", "loop", "given", "has", "is", "mod", "orig", "closed", "secured", "open", "out", "same", "parent", "choose", "self", "shoot", "shoots", "attempt", "emp", "during", "bundle", "include"};
    String[] assign = {"bool", "letter", "ddec", "sdec", "num"};

    public List<String> getErrors() {
        return errors;
    }

    @Override public void exitBlockStatement(EzBrewParser.BlockStatementContext ctx) {
//        if(ctx.getText().charAt(ctx.getText().length()-1) != ';'){
//            System.out.println("Error at line " + ctx.start.getLine() +  ": No semi colon");
//        }

//        System.out.println("A: " + ctx.getChildCount());
        for(int x = 0; x < ctx.getChildCount(); x++) {
//            System.out.println("B: " + ctx.getChild(x).getText());
            if(ctx.getChild(x).getText().equals("++")) {
                ParseTree tempCtx = ctx.getChild(x-1);
//                System.out.println("C: " + tempCtx.getText());
                int temp = tempCtx.getText().length() - 1;
                boolean checker = false;
                while(((tempCtx.getText().charAt(temp) != '=') && (tempCtx.getText().charAt(temp) != '+') && (tempCtx.getText().charAt(temp) != '-') && (tempCtx.getText().charAt(temp) != '*') && (tempCtx.getText().charAt(temp) != '/') && (tempCtx.getText().charAt(temp) != '%')) && temp > 0) {
//                    System.out.println(tempCtx.getText().charAt(temp));
                    if(Character.isAlphabetic(tempCtx.getText().charAt(temp))) {
                        checker = true;
                        break;
                    }
                    temp--;
                }
                if(checker == false)
                    errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getChild(1).getText() + "'. Consider removing extra '+'.");
            }
        }

    }

    @Override public void exitReturnStmt(EzBrewParser.ReturnStmtContext ctx) {
        String[] keywords = {"outline", "bool", "stop", "sample", "letter", "perm", "do", "ddec", "other", "sdec", "loop", "given", "num", "out", "choose", "self", "emp", "during", "scan", "print", "string"};

        for(int i = 0; i < keywords.length; i++) {
            if(ctx.getChild(1).getText().equals(keywords[i])) {
                errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getChild(1).getText() + "'. Reserved keyword cannot be passed as a return value.");
            }
        }
    }

    @Override public void enterForInit(EzBrewParser.ForInitContext ctx) {
        String temp = ctx.getText();
//        System.out.println("@@@@-TEST-@@@@");
//        System.out.println(temp);

        for(int i=0; i < assign.length; i++) {
         if (temp.contains(assign[i])) {
           temp = temp.replaceAll(assign[i], "");
           i = assign.length;
         }
        }

        if(!(temp.contains("="))){
         errors.add("Error at line " + ctx.start.getLine() + ": '" + ctx.getChild(1).getText() + "' does not have any assignment to the variable");
        }
//        temp = ctx.getParent().getParent().getText();
//        System.out.println("@@@@-SIZE-@@@@");
//        System.out.println(temp);
//
//        temp = ctx.getParent().getText();
//        System.out.println("@@@@-SIZE-@@@@");
//        System.out.println(temp);
//
//        int num = ctx.children.size();
//        for(int i=0; i <= num; i++) {
//            temp = ctx.getParent().getParent().getText();
//            System.out.println("@@@@-SIZE-@@@@");
//            System.out.println(temp);
//        }
//
//        if(ctx.getText().charAt(ctx.getText().length()-1) != ';'){
//            System.out.println("Error at line " + ctx.start.getLine() +  ": No semi colon");
//        }
    }

    @Override public void exitPrintStmt(EzBrewParser.PrintStmtContext ctx) {
        String temp = ctx.getText();
//        System.out.println("@@@@-TEST-@@@@");
//        System.out.println(temp);

        int size = 0;

        for(int i=temp.length()-1; i>-1; i--) {
            if(')' == temp.charAt(i)){
                size = i;
                i=-1;
            }
        }

        if('+' == temp.charAt(size - 1)){
            errors.add("Error at line " + ctx.start.getLine() + ": '" + ctx.getText() + "' has extra operator/s");
        }
    }

    @Override public void exitBlock(EzBrewParser.BlockContext ctx) {
        String temp = ctx.getText();

        temp = temp.replaceAll("\\s", "");
        temp = temp.replaceAll("'}'", "");

        int size = temp.length(), ctropen=0, ctrclose=0;
        for(int i=0; i < size; i++) {
            if(temp.charAt(i) == '{')
                ctropen++;
            if(temp.charAt(i) == '}')
                ctrclose++;
        }

        System.out.println("@@@@-TEST-@@@@");
        System.out.println(temp);

        if(ctropen > ctrclose)
            errors.add("Error at line " + ctx.start.getLine() + ": '{" + "' does not have corresponding '}'");
    }

}
