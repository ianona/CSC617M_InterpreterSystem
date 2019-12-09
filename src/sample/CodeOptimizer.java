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
        String shortened = "";
        String[] lines = wholecode.split(System.getProperty("line.separator"));
        StringBuffer sb = new StringBuffer();
        String[][] assignment = new String[99][4];

        for (int x = 0; x < lines.length; x++) {
            System.out.println("@@@@@@@@@@@@@@@@@@@");
            System.out.println(lines[x]);
            System.out.println("@@@@@@@@@@@@@@@@@@@");

            lines[x] = lines[x].replaceAll("\\s", "");

            if (lines[x].matches("[a-zA-Z]*[=][0-9]*[;]")) {
                if (lines[x].contains(numerical[0]) || lines[x].contains(numerical[1]) || lines[x].contains(numerical[2])) {
                    if (lines[x].contains(numerical[0])) {
                        assignment[x][0] = numerical[0];
                        lines[x] = lines[x].replaceAll(numerical[0], "");
                        lines[x] = lines[x].replaceAll(";", "");
                        assignment[x][1] = lines[x].substring(0, lines[x].indexOf("="));
                        assignment[x][2] = lines[x].substring(lines[x].indexOf("=")+1);
                        assignment[x][3] = Integer.toString(x+1);
                    } else if (lines[x].contains(numerical[1])) {
                        assignment[x][0] = numerical[1];
                        lines[x] = lines[x].replaceAll(numerical[1], "");
                        lines[x] = lines[x].replaceAll(";", "");
                        assignment[x][1] = lines[x].substring(0, lines[x].indexOf("="));
                        assignment[x][2] = lines[x].substring(lines[x].indexOf("=")+1);
                        assignment[x][3] = Integer.toString(x+1);
                    } else if (lines[x].contains(numerical[2])) {
                        assignment[x][0] = numerical[2];
                        lines[x] = lines[x].replaceAll(numerical[2], "");
                        lines[x] = lines[x].replaceAll(";", "");
                        assignment[x][1] = lines[x].substring(0, lines[x].indexOf("="));
                        assignment[x][2] = lines[x].substring(lines[x].indexOf("=")+1);
                        assignment[x][3] = Integer.toString(x+1);
                    }
                }
            }
            System.out.println("---------------------------");
            System.out.println(assignment[x][0]);
            System.out.println(assignment[x][1]);
            System.out.println(assignment[x][2]);
            System.out.println(assignment[x][3]);
            System.out.println("---------------------------");
        }


        for (int i = 0; i < lines.length; i++) {
            sb.append(lines[i]);
            sb.append("\n");
        }

        shortened = sb.toString();
        return shortened;
    }

    @Override
    public void exitBlockStatement(EzBrewParser.BlockStatementContext ctx) {
//        if(ctx.getText().charAt(ctx.getText().length()-1) != ';'){
//            System.out.println("Error at line " + ctx.start.getLine() +  ": No semi colon");
//        }
    }
}
