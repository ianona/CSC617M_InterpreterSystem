package sample;

import java.util.regex.Pattern;

public class Constants {
    public static final String APP_NAME = "WiM Editor";
    public static final String WATCH_NAME = "Debugging Environment";
    public static final String EZB_EXTENSION = ".ezb";

    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;

    public static int SCREEN_WIDTH_2;
    public static int SCREEN_HEIGHT_2;

    public static final String MODE_LIGHT = "Light";
    public static final String MODE_DARK = "Dark";
    public static final String[] IDE_MODES = {MODE_LIGHT,MODE_DARK};

    public static final String END_FUNC = "EndFunc";

    public static final String DTYPE_STRING = "string";
    public static final String DTYPE_INT = "num";
    public static final String DTYPE_FLOAT = "sdec";
    public static final String DTYPE_DOUBLE = "ddec";
    public static final String DTYPE_BOOL = "bool";
    public static final String DTYPE_VOID = "emp";

    public static final String TYPE_VAR = "var";
    public static final String TYPE_PROC = "proc";

    public static final String KTYPE_LOOP = "loop";
    public static final String KTYPE_LABEL = "label";
    public static final String KTYPE_FUNC = "method";
    public static final String KTYPE_ERROR = "error";

    public static final String MAIN = "main";

    public static final String DECL_CONSTANT = "abs";
    public static final String DECL_NORMAL = "normal";

    public static final String PARAM_FUNC = "func";
    public static final String PARAM_PRINT = "print";

    public static final String[] KEYWORDS = new String[] {
            "null",
            "outline",
            "bool",
            "stop",
            "sample",
//            "handle",
            "letter",
//            "blueprint",
            "perm",
            "do",
            "ddec",
            "other",
//            "catalog",
//            "childof",
            "abs",
//            "lastly",
            "sdec",
            "loop",
            "given",
//            "has",
//            "include",
//            "is",
            "num",
//            "mod",
            "orig",
//            "bundle",
//            "closed",
//            "secured",
//            "open",
            "out",
//            "same",
//            "parent",
            "choose",
            "self",
//            "shoot",
//            "shoots",
//            "attempt",
            "emp",
            "during",
            "scan",
            "print",
            "string",
    };

    public static final String[] OPERATORS = new String[] {
            "\\=", "!", "\\=\\=", "<=",
            ">=", "!=", "&&", "\\|\\|", "\\+\\+", "--", "\\+", "-",
            "\\*", "/", "%", "\\+=", "-=", "\\*="
    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String OPERATOR_PATTERN = "\\b(" + String.join("|", OPERATORS) + ")\\b";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "#[^\n]*" + "|" + "<!>(.|\\R)*?<!>";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
                    + "|(?<OPERATOR>" + OPERATOR_PATTERN + ")"
    );
}
