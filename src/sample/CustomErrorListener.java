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
    }


    @Override public void exitExprStmt(EzBrewParser.ExprStmtContext ctx) {

        System.out.println(ctx.getText());
        System.out.println(ctx.getChildCount());
        System.out.println(ctx.getChild(0));
        System.out.println(ctx.getChild(1));

        int openCheck = 0;
        int closeCheck = 0;

        if(!(ctx.getChild(ctx.getChildCount()-1).getText().equals("<missing ';'>"))) {
            for(int x = 0; x < ctx.getText().length(); x++) {
//            System.out.println("Test: " + ctx.getChild(x).getText());
                if(ctx.getText().charAt(x) == '(')
                    openCheck++;
                else if(ctx.getText().charAt(x) == ')')
                    closeCheck++;
            }

            if(openCheck != closeCheck)
                errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getText() + "'. Consider adding or removing parentheses.");
        }

        for(int x = 0; x < ctx.getChildCount(); x++) {
//            System.out.println("B: " + ctx.getChild(x).getText());
            if(ctx.getChild(x).getText().equals("++") || ctx.getChild(x).getText().equals("--")) {
                errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getChild(1).getText() + "'. Consider removing extra operator.");
                break;
            }
        }

//        for(int x = 0; x < ctx.getChildCount(); x++) {
//            System.out.println("B: " + ctx.getChild(x).getText());
//            if(ctx.getChild(x).getText().equals("++")) {
//                ParseTree tempCtx = ctx.getChild(x-1);
//                System.out.println("C: " + tempCtx.getText());
//                int temp = tempCtx.getText().length() - 1;
//                boolean checker = false;
//                while(((tempCtx.getText().charAt(temp) != '=') && (tempCtx.getText().charAt(temp) != '+') && (tempCtx.getText().charAt(temp) != '-') && (tempCtx.getText().charAt(temp) != '*') && (tempCtx.getText().charAt(temp) != '/') && (tempCtx.getText().charAt(temp) != '%')) && temp > 0) {
//                    System.out.println(tempCtx.getText().charAt(temp));
//                    if(Character.isAlphabetic(tempCtx.getText().charAt(temp))) {
//                        checker = true;
//                        break;
//                    }
//                    temp--;
//                }
//                if(checker == false)
//                    errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getChild(1).getText() + "'. Consider removing extra '+'.");
//            }
//        }

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
         errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getChild(1).getText() + "'. Variable is lacking assignment.");
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

//    System.out.println("here's temp: " +            temp);
        System.out.println(ctx.getChild(ctx.getChildCount() - 1).getText());

    if(!(ctx.getChild(ctx.getChildCount() - 1).getText().equals(");"))) {
        errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getText() + "'. String expression does not appear to be properly enclosed.");
    }
    else {
        int size = 0;

        for(int i=temp.length()-1; i>-1; i--) {
            if(')' == temp.charAt(i)){
                size = i;
                i=-1;
            }
        }

        System.out.println(size);

        if('+' == temp.charAt(size - 1)){
            errors.add("Error at line " + ctx.start.getLine() + ": See expression '" + ctx.getText() + "'. Excess operators detected.");
        }
    }

    }

    @Override public void exitBlock(EzBrewParser.BlockContext ctx) {
        System.out.println(ctx.getText());
        System.out.println(ctx.getChildCount());

        for(int x = 0; x < ctx.getChildCount(); x++) {
            System.out.println("B: " + ctx.getChild(x).getText());
            if(ctx.getChild(x).getText().contains("(") && ctx.getChild(x).getText().contains(")")) {
                ParseTree tempCtx = ctx.getChild(x-1);
                String tempCtxString = tempCtx.getText();
                if(tempCtxString.contains("<"))
                    tempCtxString = tempCtxString.split("<")[0];

                System.out.println("C: " + tempCtxString);
                int temp = tempCtxString.length() - 1;
                boolean checker = false;
                boolean notMathOperation = false;
                while(((tempCtxString.charAt(temp) != '+') && (tempCtxString.charAt(temp) != '-') && (tempCtxString.charAt(temp) != '*') && (tempCtxString.charAt(temp) != '/') && (tempCtxString.charAt(temp) != '%')) && temp > 0) {
                    System.out.println(tempCtxString.charAt(temp));
                    notMathOperation = true;
                    if(Character.isAlphabetic(tempCtxString.charAt(temp))) {
                        checker = true;
                        break;
                    }
                    temp--;
                }

                if(checker == false && notMathOperation == true)
//                    System.out.println("false detection");
                    errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getText().replace("<missing ';'>","") + "'. Consider removing parentheses after terminal number.");
            }
        }

        String temp = ctx.getText();
        temp = ctx.getText();

        temp = temp.replaceAll("\\s", "");
        temp = temp.replaceAll("'}'", "");

        int size = temp.length(), ctropen=0, ctrclose=0;
        for(int i=0; i < size; i++) {
            if(temp.charAt(i) == '{')
                ctropen++;
            if(temp.charAt(i) == '}')
                ctrclose++;
        }

//        System.out.println("@@@@-TEST-@@@@");
//        System.out.println(temp);

        if(ctropen > ctrclose)
            errors.add("Error at line " + ctx.start.getLine() + ": '{" + "' does not have corresponding '}'");
    }

    @Override public void exitParExp(EzBrewParser.ParExpContext ctx) {
        String temp = ctx.getParent().getChild(0).getText();
        int size = 0;
        int checkInequality = 0;
        int checkEquals = 0;
        int check = 0;
        temp = temp.replaceAll("\\s", "");

        System.out.println("Given   " + temp);
        if(temp.equals("given")) {
            temp = ctx.getParent().getChild(1).getText();
            System.out.println("Given   " + temp);
            if(temp.contains("=")) {
                for(int i = 0; i < temp.length(); i++) {
                    if(temp.charAt(i) == '=' || temp.charAt(i) == '<' || temp.charAt(i) == '>' || temp.charAt(i) == '!') {
                        if(checkInequality == 1 && temp.charAt(i) != '=') {
                            checkInequality = 0;
                            errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getParent().getChild(0).getText() + ctx.getParent().getChild(1).getText() + "'. '=' appears to be missing.");
                        }

                        if(temp.charAt(i) == '<' || temp.charAt(i) == '>' || temp.charAt(i) == '!') {
                            checkInequality = 1;
                            check++;
                        }
                        else if(temp.charAt(i) == '=') {
                            checkEquals = 1;
                            check++;
                        }

//                        size++;
                    }
                    else {
//                        if(checkInequality == 1 && check % 2 != 0) {
//                            checkInequality = 0;
//                            errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getParent().getChild(0).getText() + ctx.getParent().getChild(1).getText() + "'. '=' appears to be missing.");
//                        }
                        if(checkEquals == 1 && check % 2 != 0) {
                            checkEquals = 0;
                            errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getParent().getChild(0).getText() + ctx.getParent().getChild(1).getText() + "'. Assignment operator appears to be missing.");
                        }

                        checkInequality = 0;
                        checkEquals = 0;
                        check = 0;
                    }
                }
//                if(size % 2 != 0) {
//                    System.out.println("@@@@-TEST-@@@@");
//                    System.out.println("Error at line " + ctx.start.getLine() + ": In the statement " + ctx.getParent().getChild(0).getText() + ctx.getParent().getChild(1).getText() + " lacking '='");
//                    errors.add("Error at line " + ctx.start.getLine() + ": In the statement " + ctx.getParent().getChild(0).getText() + ctx.getParent().getChild(1).getText() + " lacking '='");
//                }
            }
        }
    }

    @Override public void exitMethodCall(EzBrewParser.MethodCallContext ctx) {

        System.out.println("que?");
        for(int x = 0; x < ctx.getChildCount(); x++) {
            System.out.println(ctx.getChild(x));
            if(ctx.getChild(x).getText().equals("++")) {
                ParseTree tempCtx = ctx.getChild(x-1);
                String tempCtxString = tempCtx.getText();
                System.out.println("tempctx string" + tempCtxString);

                int temp = tempCtxString.length() - 1;
                boolean checker = false;
                while(temp > 0) {
                    if(!(Character.isDigit(tempCtxString.charAt(temp)))) {
                        checker = true;
                        break;
                    }
                    temp--;
                }

                if(checker == false)
                    errors.add("Error at line " + ctx.start.getLine() + ". See expression '" + ctx.getText() + "'. Terminal number cannot be incremented.");
            }
        }
    }

}
