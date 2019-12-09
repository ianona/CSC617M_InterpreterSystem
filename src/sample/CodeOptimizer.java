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
        String codeline = "";

        for (int x = 0; x < lines.length; x++) {
            System.out.println("@@@@@@@@@@@@@@@@@@@");
            System.out.println(lines[x]);
            System.out.println("@@@@@@@@@@@@@@@@@@@");

            codeline = lines[x].replaceAll("\\s", "");

            if (codeline.matches("[a-zA-Z]*[=][0-9]*[;]")) {
                if (codeline.contains(numerical[0]) || codeline.contains(numerical[1]) || codeline.contains(numerical[2])) {
                    if (codeline.contains(numerical[0])) {
                        assignment[x][0] = numerical[0];
                        codeline = codeline.replaceAll(numerical[0], "");
                        codeline = codeline.replaceAll(";", "");
                        assignment[x][1] = codeline.substring(0, codeline.indexOf("="));
                        assignment[x][2] = codeline.substring(codeline.indexOf("=") + 1);
                        assignment[x][3] = Integer.toString(x);
                    } else if (codeline.contains(numerical[1])) {
                        assignment[x][0] = numerical[1];
                        codeline = codeline.replaceAll(numerical[1], "");
                        codeline = codeline.replaceAll(";", "");
                        assignment[x][1] = codeline.substring(0, codeline.indexOf("="));
                        assignment[x][2] = codeline.substring(codeline.indexOf("=") + 1);
                        assignment[x][3] = Integer.toString(x);
                    } else if (codeline.contains(numerical[2])) {
                        assignment[x][0] = numerical[2];
                        codeline = codeline.replaceAll(numerical[2], "");
                        codeline = codeline.replaceAll(";", "");
                        assignment[x][1] = codeline.substring(0, codeline.indexOf("="));
                        assignment[x][2] = codeline.substring(codeline.indexOf("=") + 1);
                        assignment[x][3] = Integer.toString(x);
                    }
                }
            } else {
                if (codeline.contains("out")) {
                    assignment[x][0] = "out";
                    assignment[x][1] = Integer.toString(x);
                }
            }
            System.out.println("---------------------------");
            System.out.println(assignment[x][0]);
            System.out.println(assignment[x][1]);
            System.out.println(assignment[x][2]);
            System.out.println(assignment[x][3]);
            System.out.println("---------------------------");
        }

        for (int x = 0; x < lines.length; x++) {

            for (int y = 0; y < lines.length; y++) {

                if (assignment[y][0] != null) {

                    if (lines[x].contains(assignment[y][1])) {
                        lines[x] = lines[x].replaceAll(assignment[y][1], assignment[y][2]);
                        lines[Integer.parseInt(assignment[y][3].trim())] = "";
                    }
                }
            }
        }

        int x = 0;
        while (!(lines[x].contains("out")) && x<lines.length) {
            x++;
        }

        for (int y = x; y < lines.length; y++) {
            System.out.println("@@@@---TESTING---@@@@");
            System.out.println(lines[y]);
            if (!(lines[y].contains("{") || lines[y].contains("}") || lines[y].contains("out"))) {
                lines[y] = "";
            }
        }


        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != "") {
                sb.append(lines[i]);
                sb.append("\n");
            }
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
