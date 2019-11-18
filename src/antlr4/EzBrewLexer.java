// Generated from /Users/ianona/Desktop/CSC617M/InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ABSTRACT=6, BOOLEAN=7, BREAK=8, 
		CASE=9, CHAR=10, CONST=11, DO=12, DOUBLE=13, ELSE=14, FLOAT=15, FOR=16, 
		IF=17, INT=18, RETURN=19, SWITCH=20, THIS=21, VOID=22, WHILE=23, SCAN=24, 
		PRINT=25, STRING=26, DECIMAL_LITERAL=27, FLOAT_LITERAL=28, BOOL_LITERAL=29, 
		STRING_LITERAL=30, NULL_LITERAL=31, LPAREN=32, RPAREN=33, LBRACE=34, RBRACE=35, 
		LBRACK=36, RBRACK=37, SEMI=38, COMMA=39, DOT=40, ASSIGN=41, GT=42, LT=43, 
		BANG=44, EQUAL=45, LE=46, GE=47, NOTEQUAL=48, AND=49, OR=50, INC=51, DEC=52, 
		ADD=53, SUB=54, MUL=55, DIV=56, MOD=57, ADD_ASSIGN=58, SUB_ASSIGN=59, 
		MUL_ASSIGN=60, DIV_ASSIGN=61, WS=62, COMMENT=63, LINE_COMMENT=64, IDENTIFIER=65, 
		ERROR=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ABSTRACT", "BOOLEAN", "BREAK", 
			"CASE", "CHAR", "CONST", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", 
			"INT", "RETURN", "SWITCH", "THIS", "VOID", "WHILE", "SCAN", "PRINT", 
			"STRING", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "ERROR", "ExponentPart", "EscapeSequence", 
			"Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "'...'", "'@'", "');'", "':'", "'outline'", "'bool'", "'stop'", 
			"'sample'", "'letter'", "'perm'", "'do'", "'ddec'", "'other'", "'sdec'", 
			"'loop'", "'given'", "'num'", "'out'", "'choose'", "'self'", "'emp'", 
			"'during'", "'scan'", "'print'", "'string'", null, null, null, null, 
			"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", 
			"'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ABSTRACT", "BOOLEAN", "BREAK", "CASE", 
			"CHAR", "CONST", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", 
			"RETURN", "SWITCH", "THIS", "VOID", "WHILE", "SCAN", "PRINT", "STRING", 
			"DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u0203\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0116\n\34\3\34"+
		"\6\34\u0119\n\34\r\34\16\34\u011a\3\34\5\34\u011e\n\34\5\34\u0120\n\34"+
		"\3\34\5\34\u0123\n\34\3\35\3\35\3\35\5\35\u0128\n\35\3\35\3\35\5\35\u012c"+
		"\n\35\3\35\5\35\u012f\n\35\3\35\5\35\u0132\n\35\3\35\3\35\3\35\5\35\u0137"+
		"\n\35\3\35\5\35\u013a\n\35\5\35\u013c\n\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0147\n\36\3\37\3\37\3\37\7\37\u014c\n\37\f\37"+
		"\16\37\u014f\13\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\6?\u01a1\n?\r?\16?\u01a2\3?\3?\3@\3"+
		"@\3@\3@\3@\7@\u01ac\n@\f@\16@\u01af\13@\3@\3@\3@\3@\3@\3@\3A\3A\7A\u01b9"+
		"\nA\fA\16A\u01bc\13A\3A\3A\3B\3B\7B\u01c2\nB\fB\16B\u01c5\13B\3C\3C\7"+
		"C\u01c9\nC\fC\16C\u01cc\13C\3C\3C\3C\5C\u01d1\nC\3C\3C\6C\u01d5\nC\rC"+
		"\16C\u01d6\3C\3C\3C\5C\u01dc\nC\3D\3D\5D\u01e0\nD\3D\3D\3E\3E\3E\3E\5"+
		"E\u01e8\nE\3E\5E\u01eb\nE\3E\5E\u01ee\nE\3F\3F\7F\u01f2\nF\fF\16F\u01f5"+
		"\13F\3F\5F\u01f8\nF\3G\3G\5G\u01fc\nG\3H\3H\3H\3H\5H\u0202\nH\3\u01ad"+
		"\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\3\2\24\3\2\63;\4\2NNnn\6\2FFHHffhh\6\2\f\f\17\17$$^^\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\6\2\f\f\17\17))^^\4\2GGgg\4\2--//\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u021f\2\3\3\2\2\2\2\5\3"+
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
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0091"+
		"\3\2\2\2\5\u0093\3\2\2\2\7\u0097\3\2\2\2\t\u0099\3\2\2\2\13\u009c\3\2"+
		"\2\2\r\u009e\3\2\2\2\17\u00a6\3\2\2\2\21\u00ab\3\2\2\2\23\u00b0\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00be\3\2\2\2\31\u00c3\3\2\2\2\33\u00c6\3\2\2\2"+
		"\35\u00cb\3\2\2\2\37\u00d1\3\2\2\2!\u00d6\3\2\2\2#\u00db\3\2\2\2%\u00e1"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00e9\3\2\2\2+\u00f0\3\2\2\2-\u00f5\3\2\2\2"+
		"/\u00f9\3\2\2\2\61\u0100\3\2\2\2\63\u0105\3\2\2\2\65\u010b\3\2\2\2\67"+
		"\u011f\3\2\2\29\u013b\3\2\2\2;\u0146\3\2\2\2=\u0148\3\2\2\2?\u0152\3\2"+
		"\2\2A\u0157\3\2\2\2C\u0159\3\2\2\2E\u015b\3\2\2\2G\u015d\3\2\2\2I\u015f"+
		"\3\2\2\2K\u0161\3\2\2\2M\u0163\3\2\2\2O\u0165\3\2\2\2Q\u0167\3\2\2\2S"+
		"\u0169\3\2\2\2U\u016b\3\2\2\2W\u016d\3\2\2\2Y\u016f\3\2\2\2[\u0171\3\2"+
		"\2\2]\u0174\3\2\2\2_\u0177\3\2\2\2a\u017a\3\2\2\2c\u017d\3\2\2\2e\u0180"+
		"\3\2\2\2g\u0183\3\2\2\2i\u0186\3\2\2\2k\u0189\3\2\2\2m\u018b\3\2\2\2o"+
		"\u018d\3\2\2\2q\u018f\3\2\2\2s\u0191\3\2\2\2u\u0193\3\2\2\2w\u0196\3\2"+
		"\2\2y\u0199\3\2\2\2{\u019c\3\2\2\2}\u01a0\3\2\2\2\177\u01a6\3\2\2\2\u0081"+
		"\u01b6\3\2\2\2\u0083\u01bf\3\2\2\2\u0085\u01db\3\2\2\2\u0087\u01dd\3\2"+
		"\2\2\u0089\u01ed\3\2\2\2\u008b\u01ef\3\2\2\2\u008d\u01fb\3\2\2\2\u008f"+
		"\u0201\3\2\2\2\u0091\u0092\7A\2\2\u0092\4\3\2\2\2\u0093\u0094\7\60\2\2"+
		"\u0094\u0095\7\60\2\2\u0095\u0096\7\60\2\2\u0096\6\3\2\2\2\u0097\u0098"+
		"\7B\2\2\u0098\b\3\2\2\2\u0099\u009a\7+\2\2\u009a\u009b\7=\2\2\u009b\n"+
		"\3\2\2\2\u009c\u009d\7<\2\2\u009d\f\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0"+
		"\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7g\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7n\2\2\u00aa\20\3\2\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7r\2\2"+
		"\u00af\22\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7"+
		"o\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\24"+
		"\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\26\3\2\2\2\u00be"+
		"\u00bf\7r\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7o\2\2"+
		"\u00c2\30\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5\32\3\2\2"+
		"\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7e\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7j\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0\36\3\2\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7e\2\2\u00d5"+
		" \3\2\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7r\2\2\u00da\"\3\2\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7x\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0$\3\2\2\2\u00e1"+
		"\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7o\2\2\u00e4&\3\2\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7v\2\2\u00e8(\3\2\2\2\u00e9"+
		"\u00ea\7e\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7q\2\2"+
		"\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7u\2"+
		"\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7h\2\2\u00f4,\3\2"+
		"\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7r\2\2\u00f8.\3"+
		"\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7i\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0101\7u\2\2\u0101\u0102\7e\2\2\u0102\u0103\7c\2\2\u0103\u0104\7p\2\2"+
		"\u0104\62\3\2\2\2\u0105\u0106\7r\2\2\u0106\u0107\7t\2\2\u0107\u0108\7"+
		"k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\64\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7i\2\2\u0111\66\3\2\2\2\u0112\u0120\7\62\2\2"+
		"\u0113\u011d\t\2\2\2\u0114\u0116\5\u008bF\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u011e\3\2\2\2\u0117\u0119\7a\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\5\u008bF\2\u011d\u0115\3\2\2\2\u011d\u0118"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0112\3\2\2\2\u011f\u0113\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u01238\3\2\2\2\u0124\u0125\5\u008bF\2\u0125\u0127\7\60\2\2\u0126"+
		"\u0128\5\u008bF\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c"+
		"\3\2\2\2\u0129\u012a\7\60\2\2\u012a\u012c\5\u008bF\2\u012b\u0124\3\2\2"+
		"\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\5\u0087D\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\t\4"+
		"\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013c\3\2\2\2\u0133"+
		"\u0139\5\u008bF\2\u0134\u0136\5\u0087D\2\u0135\u0137\t\4\2\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u013a\t\4\2\2\u0139"+
		"\u0134\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u012b\3\2"+
		"\2\2\u013b\u0133\3\2\2\2\u013c:\3\2\2\2\u013d\u013e\7v\2\2\u013e\u013f"+
		"\7t\2\2\u013f\u0140\7w\2\2\u0140\u0147\7g\2\2\u0141\u0142\7h\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7u\2\2\u0145\u0147\7g\2\2"+
		"\u0146\u013d\3\2\2\2\u0146\u0141\3\2\2\2\u0147<\3\2\2\2\u0148\u014d\7"+
		"$\2\2\u0149\u014c\n\5\2\2\u014a\u014c\5\u0089E\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$\2\2\u0151"+
		">\3\2\2\2\u0152\u0153\7p\2\2\u0153\u0154\7w\2\2\u0154\u0155\7n\2\2\u0155"+
		"\u0156\7n\2\2\u0156@\3\2\2\2\u0157\u0158\7*\2\2\u0158B\3\2\2\2\u0159\u015a"+
		"\7+\2\2\u015aD\3\2\2\2\u015b\u015c\7}\2\2\u015cF\3\2\2\2\u015d\u015e\7"+
		"\177\2\2\u015eH\3\2\2\2\u015f\u0160\7]\2\2\u0160J\3\2\2\2\u0161\u0162"+
		"\7_\2\2\u0162L\3\2\2\2\u0163\u0164\7=\2\2\u0164N\3\2\2\2\u0165\u0166\7"+
		".\2\2\u0166P\3\2\2\2\u0167\u0168\7\60\2\2\u0168R\3\2\2\2\u0169\u016a\7"+
		"?\2\2\u016aT\3\2\2\2\u016b\u016c\7@\2\2\u016cV\3\2\2\2\u016d\u016e\7>"+
		"\2\2\u016eX\3\2\2\2\u016f\u0170\7#\2\2\u0170Z\3\2\2\2\u0171\u0172\7?\2"+
		"\2\u0172\u0173\7?\2\2\u0173\\\3\2\2\2\u0174\u0175\7>\2\2\u0175\u0176\7"+
		"?\2\2\u0176^\3\2\2\2\u0177\u0178\7@\2\2\u0178\u0179\7?\2\2\u0179`\3\2"+
		"\2\2\u017a\u017b\7#\2\2\u017b\u017c\7?\2\2\u017cb\3\2\2\2\u017d\u017e"+
		"\7(\2\2\u017e\u017f\7(\2\2\u017fd\3\2\2\2\u0180\u0181\7~\2\2\u0181\u0182"+
		"\7~\2\2\u0182f\3\2\2\2\u0183\u0184\7-\2\2\u0184\u0185\7-\2\2\u0185h\3"+
		"\2\2\2\u0186\u0187\7/\2\2\u0187\u0188\7/\2\2\u0188j\3\2\2\2\u0189\u018a"+
		"\7-\2\2\u018al\3\2\2\2\u018b\u018c\7/\2\2\u018cn\3\2\2\2\u018d\u018e\7"+
		",\2\2\u018ep\3\2\2\2\u018f\u0190\7\61\2\2\u0190r\3\2\2\2\u0191\u0192\7"+
		"\'\2\2\u0192t\3\2\2\2\u0193\u0194\7-\2\2\u0194\u0195\7?\2\2\u0195v\3\2"+
		"\2\2\u0196\u0197\7/\2\2\u0197\u0198\7?\2\2\u0198x\3\2\2\2\u0199\u019a"+
		"\7,\2\2\u019a\u019b\7?\2\2\u019bz\3\2\2\2\u019c\u019d\7\61\2\2\u019d\u019e"+
		"\7?\2\2\u019e|\3\2\2\2\u019f\u01a1\t\6\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\b?\2\2\u01a5~\3\2\2\2\u01a6\u01a7\7>\2\2\u01a7\u01a8\7#\2\2\u01a8"+
		"\u01a9\7@\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ac\13\2\2\2\u01ab\u01aa\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2\7#\2"+
		"\2\u01b2\u01b3\7@\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\b@\2\2\u01b5\u0080"+
		"\3\2\2\2\u01b6\u01ba\7%\2\2\u01b7\u01b9\n\7\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\bA\2\2\u01be\u0082\3\2\2\2\u01bf"+
		"\u01c3\5\u008fH\2\u01c0\u01c2\5\u008dG\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u0084\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01ca\t\b\2\2\u01c7\u01c9\5\u008dG\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01dc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\7)\2\2\u01ce\u01d1\n\t"+
		"\2\2\u01cf\u01d1\5\u0089E\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d5\n\t\2\2\u01d3\u01d5\5\u0089E\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\7)\2\2\u01d9\u01da\7)\2"+
		"\2\u01da\u01dc\7)\2\2\u01db\u01c6\3\2\2\2\u01db\u01cd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u0086\3\2\2\2\u01dd\u01df\t\n\2\2\u01de\u01e0\t\13\2\2"+
		"\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2"+
		"\5\u008bF\2\u01e2\u0088\3\2\2\2\u01e3\u01e4\7^\2\2\u01e4\u01ee\t\f\2\2"+
		"\u01e5\u01ea\7^\2\2\u01e6\u01e8\t\r\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\t\16\2\2\u01ea\u01e7\3\2\2\2"+
		"\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\t\16\2\2\u01ed\u01e3"+
		"\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ee\u008a\3\2\2\2\u01ef\u01f7\t\b\2\2\u01f0"+
		"\u01f2\t\17\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3"+
		"\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01f8\t\b\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u008c\3\2"+
		"\2\2\u01f9\u01fc\5\u008fH\2\u01fa\u01fc\t\b\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u008e\3\2\2\2\u01fd\u0202\t\20\2\2\u01fe\u0202\n"+
		"\21\2\2\u01ff\u0200\t\22\2\2\u0200\u0202\t\23\2\2\u0201\u01fd\3\2\2\2"+
		"\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0090\3\2\2\2#\2\u0115"+
		"\u011a\u011d\u011f\u0122\u0127\u012b\u012e\u0131\u0136\u0139\u013b\u0146"+
		"\u014b\u014d\u01a2\u01ad\u01ba\u01c3\u01ca\u01d0\u01d4\u01d6\u01db\u01df"+
		"\u01e7\u01ea\u01ed\u01f3\u01f7\u01fb\u0201\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}