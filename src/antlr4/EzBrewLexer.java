// Generated from /Users/wonsukcho/Documents/GitHub/CSC617M_InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EzBrewLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ABSTRACT=13, BOOLEAN=14, BREAK=15, CASE=16, 
		CHAR=17, CONST=18, DO=19, DOUBLE=20, ELSE=21, FLOAT=22, FOR=23, IF=24, 
		INT=25, RETURN=26, SWITCH=27, THIS=28, VOID=29, WHILE=30, SCAN=31, PRINT=32, 
		STRING=33, DECIMAL_LITERAL=34, FLOAT_LITERAL=35, BOOL_LITERAL=36, STRING_LITERAL=37, 
		NULL_LITERAL=38, LPAREN=39, RPAREN=40, LBRACE=41, RBRACE=42, LBRACK=43, 
		RBRACK=44, SEMI=45, COMMA=46, DOT=47, ASSIGN=48, GT=49, LT=50, BANG=51, 
		EQUAL=52, LE=53, GE=54, NOTEQUAL=55, AND=56, OR=57, INC=58, DEC=59, ADD=60, 
		SUB=61, MUL=62, DIV=63, MOD=64, ADD_ASSIGN=65, SUB_ASSIGN=66, MUL_ASSIGN=67, 
		DIV_ASSIGN=68, WS=69, COMMENT=70, LINE_COMMENT=71, IDENTIFIER=72, ERROR=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CHAR", 
			"CONST", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "RETURN", 
			"SWITCH", "THIS", "VOID", "WHILE", "SCAN", "PRINT", "STRING", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", 
			"IDENTIFIER", "ERROR", "ExponentPart", "EscapeSequence", "Digits", "LetterOrDigit", 
			"Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "'...'", "'@'", "');'", "':'", "'&='", "'|='", "'^='", "'>>='", 
			"'>>>='", "'<<='", "'%='", "'outline'", "'bool'", "'stop'", "'sample'", 
			"'letter'", "'perm'", "'do'", "'ddec'", "'other'", "'sdec'", "'loop'", 
			"'given'", "'num'", "'out'", "'choose'", "'self'", "'emp'", "'during'", 
			"'scan'", "'print'", "'string'", null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "DO", 
			"DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "RETURN", "SWITCH", "THIS", 
			"VOID", "WHILE", "SCAN", "PRINT", "STRING", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public EzBrewLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EzBrew.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u022a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u013d\n"+
		"#\3#\6#\u0140\n#\r#\16#\u0141\3#\5#\u0145\n#\5#\u0147\n#\3#\5#\u014a\n"+
		"#\3$\3$\3$\5$\u014f\n$\3$\3$\5$\u0153\n$\3$\5$\u0156\n$\3$\5$\u0159\n"+
		"$\3$\3$\3$\5$\u015e\n$\3$\5$\u0161\n$\5$\u0163\n$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u016e\n%\3&\3&\3&\7&\u0173\n&\f&\16&\u0176\13&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\6F\u01c8"+
		"\nF\rF\16F\u01c9\3F\3F\3G\3G\3G\3G\3G\7G\u01d3\nG\fG\16G\u01d6\13G\3G"+
		"\3G\3G\3G\3G\3G\3H\3H\7H\u01e0\nH\fH\16H\u01e3\13H\3H\3H\3I\3I\7I\u01e9"+
		"\nI\fI\16I\u01ec\13I\3J\3J\7J\u01f0\nJ\fJ\16J\u01f3\13J\3J\3J\3J\5J\u01f8"+
		"\nJ\3J\3J\6J\u01fc\nJ\rJ\16J\u01fd\3J\3J\3J\5J\u0203\nJ\3K\3K\5K\u0207"+
		"\nK\3K\3K\3L\3L\3L\3L\5L\u020f\nL\3L\5L\u0212\nL\3L\5L\u0215\nL\3M\3M"+
		"\7M\u0219\nM\fM\16M\u021c\13M\3M\5M\u021f\nM\3N\3N\5N\u0223\nN\3O\3O\3"+
		"O\3O\5O\u0229\nO\3\u01d4\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\3\2\24\3\2\63;\4\2NNnn\6\2FFHHffhh\6\2\f\f\17\17$$^^\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\6\2\f\f\17\17))^^\4\2GGgg\4\2--//\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u0246\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u009f\3\2\2\2\5\u00a1\3\2\2\2\7\u00a5"+
		"\3\2\2\2\t\u00a7\3\2\2\2\13\u00aa\3\2\2\2\r\u00ac\3\2\2\2\17\u00af\3\2"+
		"\2\2\21\u00b2\3\2\2\2\23\u00b5\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2"+
		"\2\31\u00c2\3\2\2\2\33\u00c5\3\2\2\2\35\u00cd\3\2\2\2\37\u00d2\3\2\2\2"+
		"!\u00d7\3\2\2\2#\u00de\3\2\2\2%\u00e5\3\2\2\2\'\u00ea\3\2\2\2)\u00ed\3"+
		"\2\2\2+\u00f2\3\2\2\2-\u00f8\3\2\2\2/\u00fd\3\2\2\2\61\u0102\3\2\2\2\63"+
		"\u0108\3\2\2\2\65\u010c\3\2\2\2\67\u0110\3\2\2\29\u0117\3\2\2\2;\u011c"+
		"\3\2\2\2=\u0120\3\2\2\2?\u0127\3\2\2\2A\u012c\3\2\2\2C\u0132\3\2\2\2E"+
		"\u0146\3\2\2\2G\u0162\3\2\2\2I\u016d\3\2\2\2K\u016f\3\2\2\2M\u0179\3\2"+
		"\2\2O\u017e\3\2\2\2Q\u0180\3\2\2\2S\u0182\3\2\2\2U\u0184\3\2\2\2W\u0186"+
		"\3\2\2\2Y\u0188\3\2\2\2[\u018a\3\2\2\2]\u018c\3\2\2\2_\u018e\3\2\2\2a"+
		"\u0190\3\2\2\2c\u0192\3\2\2\2e\u0194\3\2\2\2g\u0196\3\2\2\2i\u0198\3\2"+
		"\2\2k\u019b\3\2\2\2m\u019e\3\2\2\2o\u01a1\3\2\2\2q\u01a4\3\2\2\2s\u01a7"+
		"\3\2\2\2u\u01aa\3\2\2\2w\u01ad\3\2\2\2y\u01b0\3\2\2\2{\u01b2\3\2\2\2}"+
		"\u01b4\3\2\2\2\177\u01b6\3\2\2\2\u0081\u01b8\3\2\2\2\u0083\u01ba\3\2\2"+
		"\2\u0085\u01bd\3\2\2\2\u0087\u01c0\3\2\2\2\u0089\u01c3\3\2\2\2\u008b\u01c7"+
		"\3\2\2\2\u008d\u01cd\3\2\2\2\u008f\u01dd\3\2\2\2\u0091\u01e6\3\2\2\2\u0093"+
		"\u0202\3\2\2\2\u0095\u0204\3\2\2\2\u0097\u0214\3\2\2\2\u0099\u0216\3\2"+
		"\2\2\u009b\u0222\3\2\2\2\u009d\u0228\3\2\2\2\u009f\u00a0\7A\2\2\u00a0"+
		"\4\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7\60"+
		"\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7B\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7"+
		"+\2\2\u00a8\u00a9\7=\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\f\3"+
		"\2\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7?\2\2\u00ae\16\3\2\2\2\u00af\u00b0"+
		"\7~\2\2\u00b0\u00b1\7?\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7`\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc"+
		"\7@\2\2\u00bc\u00bd\7?\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0\u00c1\7?\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"\u00c4\7?\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7"+
		"q\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2\u00d1\36\3\2\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7r\2\2\u00d6"+
		" \3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7o\2\2\u00da"+
		"\u00db\7r\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd\"\3\2\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7r\2"+
		"\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7o\2\2\u00e9&\3\2"+
		"\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7q\2\2\u00ec(\3\2\2\2\u00ed\u00ee"+
		"\7f\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"*\3\2\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7u\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7e\2\2\u00fc.\3\2\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7r\2\2"+
		"\u0101\60\3\2\2\2\u0102\u0103\7i\2\2\u0103\u0104\7k\2\2\u0104\u0105\7"+
		"x\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\62\3\2\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7w\2\2\u010a\u010b\7o\2\2\u010b\64\3\2\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7w\2\2\u010e\u010f\7v\2\2\u010f\66\3\2\2\2\u0110\u0111"+
		"\7e\2\2\u0111\u0112\7j\2\2\u0112\u0113\7q\2\2\u0113\u0114\7q\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7g\2\2\u01168\3\2\2\2\u0117\u0118\7u\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7n\2\2\u011a\u011b\7h\2\2\u011b:\3\2\2\2\u011c"+
		"\u011d\7g\2\2\u011d\u011e\7o\2\2\u011e\u011f\7r\2\2\u011f<\3\2\2\2\u0120"+
		"\u0121\7f\2\2\u0121\u0122\7w\2\2\u0122\u0123\7t\2\2\u0123\u0124\7k\2\2"+
		"\u0124\u0125\7p\2\2\u0125\u0126\7i\2\2\u0126>\3\2\2\2\u0127\u0128\7u\2"+
		"\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b@\3\2"+
		"\2\2\u012c\u012d\7r\2\2\u012d\u012e\7t\2\2\u012e\u012f\7k\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7v\2\2\u0131B\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7i\2\2\u0138D\3\2\2\2\u0139\u0147\7\62\2\2\u013a\u0144\t\2\2\2"+
		"\u013b\u013d\5\u0099M\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0145\3\2\2\2\u013e\u0140\7a\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\5\u0099M\2\u0144\u013c\3\2\2\2\u0144\u013f\3\2\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0139\3\2\2\2\u0146\u013a\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u014a\t\3\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014aF\3\2\2\2"+
		"\u014b\u014c\5\u0099M\2\u014c\u014e\7\60\2\2\u014d\u014f\5\u0099M\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0153\3\2\2\2\u0150\u0151\7\60"+
		"\2\2\u0151\u0153\5\u0099M\2\u0152\u014b\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0156\5\u0095K\2\u0155\u0154\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\t\4\2\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0163\3\2\2\2\u015a\u0160\5\u0099M\2\u015b\u015d"+
		"\5\u0095K\2\u015c\u015e\t\4\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2"+
		"\2\u015e\u0161\3\2\2\2\u015f\u0161\t\4\2\2\u0160\u015b\3\2\2\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0152\3\2\2\2\u0162\u015a\3\2\2\2\u0163"+
		"H\3\2\2\2\u0164\u0165\7v\2\2\u0165\u0166\7t\2\2\u0166\u0167\7w\2\2\u0167"+
		"\u016e\7g\2\2\u0168\u0169\7h\2\2\u0169\u016a\7c\2\2\u016a\u016b\7n\2\2"+
		"\u016b\u016c\7u\2\2\u016c\u016e\7g\2\2\u016d\u0164\3\2\2\2\u016d\u0168"+
		"\3\2\2\2\u016eJ\3\2\2\2\u016f\u0174\7$\2\2\u0170\u0173\n\5\2\2\u0171\u0173"+
		"\5\u0097L\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2"+
		"\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\7$\2\2\u0178L\3\2\2\2\u0179\u017a\7p\2\2\u017a\u017b"+
		"\7w\2\2\u017b\u017c\7n\2\2\u017c\u017d\7n\2\2\u017dN\3\2\2\2\u017e\u017f"+
		"\7*\2\2\u017fP\3\2\2\2\u0180\u0181\7+\2\2\u0181R\3\2\2\2\u0182\u0183\7"+
		"}\2\2\u0183T\3\2\2\2\u0184\u0185\7\177\2\2\u0185V\3\2\2\2\u0186\u0187"+
		"\7]\2\2\u0187X\3\2\2\2\u0188\u0189\7_\2\2\u0189Z\3\2\2\2\u018a\u018b\7"+
		"=\2\2\u018b\\\3\2\2\2\u018c\u018d\7.\2\2\u018d^\3\2\2\2\u018e\u018f\7"+
		"\60\2\2\u018f`\3\2\2\2\u0190\u0191\7?\2\2\u0191b\3\2\2\2\u0192\u0193\7"+
		"@\2\2\u0193d\3\2\2\2\u0194\u0195\7>\2\2\u0195f\3\2\2\2\u0196\u0197\7#"+
		"\2\2\u0197h\3\2\2\2\u0198\u0199\7?\2\2\u0199\u019a\7?\2\2\u019aj\3\2\2"+
		"\2\u019b\u019c\7>\2\2\u019c\u019d\7?\2\2\u019dl\3\2\2\2\u019e\u019f\7"+
		"@\2\2\u019f\u01a0\7?\2\2\u01a0n\3\2\2\2\u01a1\u01a2\7#\2\2\u01a2\u01a3"+
		"\7?\2\2\u01a3p\3\2\2\2\u01a4\u01a5\7(\2\2\u01a5\u01a6\7(\2\2\u01a6r\3"+
		"\2\2\2\u01a7\u01a8\7~\2\2\u01a8\u01a9\7~\2\2\u01a9t\3\2\2\2\u01aa\u01ab"+
		"\7-\2\2\u01ab\u01ac\7-\2\2\u01acv\3\2\2\2\u01ad\u01ae\7/\2\2\u01ae\u01af"+
		"\7/\2\2\u01afx\3\2\2\2\u01b0\u01b1\7-\2\2\u01b1z\3\2\2\2\u01b2\u01b3\7"+
		"/\2\2\u01b3|\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7\61"+
		"\2\2\u01b7\u0080\3\2\2\2\u01b8\u01b9\7\'\2\2\u01b9\u0082\3\2\2\2\u01ba"+
		"\u01bb\7-\2\2\u01bb\u01bc\7?\2\2\u01bc\u0084\3\2\2\2\u01bd\u01be\7/\2"+
		"\2\u01be\u01bf\7?\2\2\u01bf\u0086\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2"+
		"\7?\2\2\u01c2\u0088\3\2\2\2\u01c3\u01c4\7\61\2\2\u01c4\u01c5\7?\2\2\u01c5"+
		"\u008a\3\2\2\2\u01c6\u01c8\t\6\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\bF\2\2\u01cc\u008c\3\2\2\2\u01cd\u01ce\7>\2\2\u01ce\u01cf\7#\2"+
		"\2\u01cf\u01d0\7@\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01d3\13\2\2\2\u01d2\u01d1"+
		"\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7>\2\2\u01d8\u01d9\7#\2"+
		"\2\u01d9\u01da\7@\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\bG\2\2\u01dc\u008e"+
		"\3\2\2\2\u01dd\u01e1\7%\2\2\u01de\u01e0\n\7\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\bH\2\2\u01e5\u0090\3\2\2\2\u01e6"+
		"\u01ea\5\u009dO\2\u01e7\u01e9\5\u009bN\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u0092\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f1\t\b\2\2\u01ee\u01f0\5\u009bN\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u0203\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\7)\2\2\u01f5\u01f8\n\t"+
		"\2\2\u01f6\u01f8\5\u0097L\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01fc\n\t\2\2\u01fa\u01fc\5\u0097L\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0203\7)\2\2\u0200\u0201\7)\2"+
		"\2\u0201\u0203\7)\2\2\u0202\u01ed\3\2\2\2\u0202\u01f4\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0094\3\2\2\2\u0204\u0206\t\n\2\2\u0205\u0207\t\13\2\2"+
		"\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209"+
		"\5\u0099M\2\u0209\u0096\3\2\2\2\u020a\u020b\7^\2\2\u020b\u0215\t\f\2\2"+
		"\u020c\u0211\7^\2\2\u020d\u020f\t\r\2\2\u020e\u020d\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\t\16\2\2\u0211\u020e\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\t\16\2\2\u0214\u020a"+
		"\3\2\2\2\u0214\u020c\3\2\2\2\u0215\u0098\3\2\2\2\u0216\u021e\t\b\2\2\u0217"+
		"\u0219\t\17\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021f\t\b\2\2\u021e\u021a\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u009a\3\2"+
		"\2\2\u0220\u0223\5\u009dO\2\u0221\u0223\t\b\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0221\3\2\2\2\u0223\u009c\3\2\2\2\u0224\u0229\t\20\2\2\u0225\u0229\n"+
		"\21\2\2\u0226\u0227\t\22\2\2\u0227\u0229\t\23\2\2\u0228\u0224\3\2\2\2"+
		"\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u009e\3\2\2\2#\2\u013c"+
		"\u0141\u0144\u0146\u0149\u014e\u0152\u0155\u0158\u015d\u0160\u0162\u016d"+
		"\u0172\u0174\u01c9\u01d4\u01e1\u01ea\u01f1\u01f7\u01fb\u01fd\u0202\u0206"+
		"\u020e\u0211\u0214\u021a\u021e\u0222\u0228\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}