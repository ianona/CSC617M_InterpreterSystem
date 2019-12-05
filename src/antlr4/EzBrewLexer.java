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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ABSTRACT=13, BOOLEAN=14, BREAK=15, CASE=16, 
		CHAR=17, DO=18, DOUBLE=19, ELSE=20, FINAL=21, FLOAT=22, FOR=23, IF=24, 
		INT=25, NEW=26, RETURN=27, SWITCH=28, THIS=29, VOID=30, WHILE=31, SCAN=32, 
		PRINT=33, STRING=34, DECIMAL_LITERAL=35, FLOAT_LITERAL=36, BOOL_LITERAL=37, 
		STRING_LITERAL=38, NULL_LITERAL=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, 
		LBRACK=44, RBRACK=45, SEMI=46, COMMA=47, DOT=48, ASSIGN=49, GT=50, LT=51, 
		BANG=52, EQUAL=53, LE=54, GE=55, NOTEQUAL=56, AND=57, OR=58, INC=59, DEC=60, 
		ADD=61, SUB=62, MUL=63, DIV=64, MOD=65, ADD_ASSIGN=66, SUB_ASSIGN=67, 
		MUL_ASSIGN=68, DIV_ASSIGN=69, WS=70, COMMENT=71, LINE_COMMENT=72, IDENTIFIER=73, 
		ERROR=74;
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
			"DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "NEW", 
			"RETURN", "SWITCH", "THIS", "VOID", "WHILE", "SCAN", "PRINT", "STRING", 
			"DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
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
			null, "'?'", "'...'", "'@'", "');'", "':'", "'&='", "'|='", "'^='", "'>>='", 
			"'>>>='", "'<<='", "'%='", "'outline'", "'bool'", "'stop'", "'sample'", 
			"'letter'", "'do'", "'ddec'", "'other'", "'abs'", "'sdec'", "'loop'", 
			"'given'", "'num'", "'orig'", "'out'", "'choose'", "'self'", "'emp'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CHAR", "DO", "DOUBLE", 
			"ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "NEW", "RETURN", "SWITCH", 
			"THIS", "VOID", "WHILE", "SCAN", "PRINT", "STRING", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", 
			"IDENTIFIER", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0230\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\5$\u0143\n$\3$\6$\u0146\n$\r$\16$\u0147\3$\5$\u014b\n$\5$\u014d\n$\3"+
		"$\5$\u0150\n$\3%\3%\3%\5%\u0155\n%\3%\3%\5%\u0159\n%\3%\5%\u015c\n%\3"+
		"%\5%\u015f\n%\3%\3%\3%\5%\u0164\n%\3%\5%\u0167\n%\5%\u0169\n%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u0174\n&\3\'\3\'\3\'\7\'\u0179\n\'\f\'\16\'\u017c"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3"+
		"F\3G\6G\u01ce\nG\rG\16G\u01cf\3G\3G\3H\3H\3H\3H\3H\7H\u01d9\nH\fH\16H"+
		"\u01dc\13H\3H\3H\3H\3H\3H\3H\3I\3I\7I\u01e6\nI\fI\16I\u01e9\13I\3I\3I"+
		"\3J\3J\7J\u01ef\nJ\fJ\16J\u01f2\13J\3K\3K\7K\u01f6\nK\fK\16K\u01f9\13"+
		"K\3K\3K\3K\5K\u01fe\nK\3K\3K\6K\u0202\nK\rK\16K\u0203\3K\3K\3K\5K\u0209"+
		"\nK\3L\3L\5L\u020d\nL\3L\3L\3M\3M\3M\3M\5M\u0215\nM\3M\5M\u0218\nM\3M"+
		"\5M\u021b\nM\3N\3N\7N\u021f\nN\fN\16N\u0222\13N\3N\5N\u0225\nN\3O\3O\5"+
		"O\u0229\nO\3P\3P\3P\3P\5P\u022f\nP\3\u01da\2Q\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2\24\3\2\63;\4\2NNnn\6\2F"+
		"FHHffhh\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\6\2"+
		"\f\f\17\17))^^\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4"+
		"\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\2\u024c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2\2\7\u00a7\3\2\2\2\t\u00a9\3\2\2"+
		"\2\13\u00ac\3\2\2\2\r\u00ae\3\2\2\2\17\u00b1\3\2\2\2\21\u00b4\3\2\2\2"+
		"\23\u00b7\3\2\2\2\25\u00bb\3\2\2\2\27\u00c0\3\2\2\2\31\u00c4\3\2\2\2\33"+
		"\u00c7\3\2\2\2\35\u00cf\3\2\2\2\37\u00d4\3\2\2\2!\u00d9\3\2\2\2#\u00e0"+
		"\3\2\2\2%\u00e7\3\2\2\2\'\u00ea\3\2\2\2)\u00ef\3\2\2\2+\u00f5\3\2\2\2"+
		"-\u00f9\3\2\2\2/\u00fe\3\2\2\2\61\u0103\3\2\2\2\63\u0109\3\2\2\2\65\u010d"+
		"\3\2\2\2\67\u0112\3\2\2\29\u0116\3\2\2\2;\u011d\3\2\2\2=\u0122\3\2\2\2"+
		"?\u0126\3\2\2\2A\u012d\3\2\2\2C\u0132\3\2\2\2E\u0138\3\2\2\2G\u014c\3"+
		"\2\2\2I\u0168\3\2\2\2K\u0173\3\2\2\2M\u0175\3\2\2\2O\u017f\3\2\2\2Q\u0184"+
		"\3\2\2\2S\u0186\3\2\2\2U\u0188\3\2\2\2W\u018a\3\2\2\2Y\u018c\3\2\2\2["+
		"\u018e\3\2\2\2]\u0190\3\2\2\2_\u0192\3\2\2\2a\u0194\3\2\2\2c\u0196\3\2"+
		"\2\2e\u0198\3\2\2\2g\u019a\3\2\2\2i\u019c\3\2\2\2k\u019e\3\2\2\2m\u01a1"+
		"\3\2\2\2o\u01a4\3\2\2\2q\u01a7\3\2\2\2s\u01aa\3\2\2\2u\u01ad\3\2\2\2w"+
		"\u01b0\3\2\2\2y\u01b3\3\2\2\2{\u01b6\3\2\2\2}\u01b8\3\2\2\2\177\u01ba"+
		"\3\2\2\2\u0081\u01bc\3\2\2\2\u0083\u01be\3\2\2\2\u0085\u01c0\3\2\2\2\u0087"+
		"\u01c3\3\2\2\2\u0089\u01c6\3\2\2\2\u008b\u01c9\3\2\2\2\u008d\u01cd\3\2"+
		"\2\2\u008f\u01d3\3\2\2\2\u0091\u01e3\3\2\2\2\u0093\u01ec\3\2\2\2\u0095"+
		"\u0208\3\2\2\2\u0097\u020a\3\2\2\2\u0099\u021a\3\2\2\2\u009b\u021c\3\2"+
		"\2\2\u009d\u0228\3\2\2\2\u009f\u022e\3\2\2\2\u00a1\u00a2\7A\2\2\u00a2"+
		"\4\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4\u00a5\7\60\2\2\u00a5\u00a6\7\60"+
		"\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7B\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7"+
		"+\2\2\u00aa\u00ab\7=\2\2\u00ab\n\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad\f\3"+
		"\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7?\2\2\u00b0\16\3\2\2\2\u00b1\u00b2"+
		"\7~\2\2\u00b2\u00b3\7?\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7`\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be"+
		"\7@\2\2\u00be\u00bf\7?\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2"+
		"\7>\2\2\u00c2\u00c3\7?\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7\'\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7w\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\34\3\2\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7"+
		"q\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7n\2\2\u00d3\36\3\2\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		" \3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7o\2\2\u00dc"+
		"\u00dd\7r\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\"\3\2\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7f\2"+
		"\2\u00e8\u00e9\7q\2\2\u00e9&\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7"+
		"f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7e\2\2\u00ee(\3\2\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7d\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7f\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7e\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7n\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7q\2\2\u0101\u0102\7r\2\2\u0102\60\3\2\2\2\u0103"+
		"\u0104\7i\2\2\u0104\u0105\7k\2\2\u0105\u0106\7x\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7p\2\2\u0108\62\3\2\2\2\u0109\u010a\7p\2\2\u010a\u010b\7"+
		"w\2\2\u010b\u010c\7o\2\2\u010c\64\3\2\2\2\u010d\u010e\7q\2\2\u010e\u010f"+
		"\7t\2\2\u010f\u0110\7k\2\2\u0110\u0111\7i\2\2\u0111\66\3\2\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7w\2\2\u0114\u0115\7v\2\2\u01158\3\2\2\2\u0116\u0117"+
		"\7e\2\2\u0117\u0118\7j\2\2\u0118\u0119\7q\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7g\2\2\u011c:\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7n\2\2\u0120\u0121\7h\2\2\u0121<\3\2\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7o\2\2\u0124\u0125\7r\2\2\u0125>\3\2\2\2\u0126"+
		"\u0127\7f\2\2\u0127\u0128\7w\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7p\2\2\u012b\u012c\7i\2\2\u012c@\3\2\2\2\u012d\u012e\7u\2"+
		"\2\u012e\u012f\7e\2\2\u012f\u0130\7c\2\2\u0130\u0131\7p\2\2\u0131B\3\2"+
		"\2\2\u0132\u0133\7r\2\2\u0133\u0134\7t\2\2\u0134\u0135\7k\2\2\u0135\u0136"+
		"\7p\2\2\u0136\u0137\7v\2\2\u0137D\3\2\2\2\u0138\u0139\7u\2\2\u0139\u013a"+
		"\7v\2\2\u013a\u013b\7t\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d"+
		"\u013e\7i\2\2\u013eF\3\2\2\2\u013f\u014d\7\62\2\2\u0140\u014a\t\2\2\2"+
		"\u0141\u0143\5\u009bN\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u014b\3\2\2\2\u0144\u0146\7a\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\5\u009bN\2\u014a\u0142\3\2\2\2\u014a\u0145\3\2\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0140\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u0150\t\3\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150H\3\2\2\2"+
		"\u0151\u0152\5\u009bN\2\u0152\u0154\7\60\2\2\u0153\u0155\5\u009bN\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\3\2\2\2\u0156\u0157\7\60"+
		"\2\2\u0157\u0159\5\u009bN\2\u0158\u0151\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u015c\5\u0097L\2\u015b\u015a\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0169\3\2\2\2\u0160\u0166\5\u009bN\2\u0161\u0163"+
		"\5\u0097L\2\u0162\u0164\t\4\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0167\t\4\2\2\u0166\u0161\3\2\2\2\u0166\u0165"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0158\3\2\2\2\u0168\u0160\3\2\2\2\u0169"+
		"J\3\2\2\2\u016a\u016b\7v\2\2\u016b\u016c\7t\2\2\u016c\u016d\7w\2\2\u016d"+
		"\u0174\7g\2\2\u016e\u016f\7h\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2"+
		"\u0171\u0172\7u\2\2\u0172\u0174\7g\2\2\u0173\u016a\3\2\2\2\u0173\u016e"+
		"\3\2\2\2\u0174L\3\2\2\2\u0175\u017a\7$\2\2\u0176\u0179\n\5\2\2\u0177\u0179"+
		"\5\u0099M\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2"+
		"\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u017e\7$\2\2\u017eN\3\2\2\2\u017f\u0180\7p\2\2\u0180\u0181"+
		"\7w\2\2\u0181\u0182\7n\2\2\u0182\u0183\7n\2\2\u0183P\3\2\2\2\u0184\u0185"+
		"\7*\2\2\u0185R\3\2\2\2\u0186\u0187\7+\2\2\u0187T\3\2\2\2\u0188\u0189\7"+
		"}\2\2\u0189V\3\2\2\2\u018a\u018b\7\177\2\2\u018bX\3\2\2\2\u018c\u018d"+
		"\7]\2\2\u018dZ\3\2\2\2\u018e\u018f\7_\2\2\u018f\\\3\2\2\2\u0190\u0191"+
		"\7=\2\2\u0191^\3\2\2\2\u0192\u0193\7.\2\2\u0193`\3\2\2\2\u0194\u0195\7"+
		"\60\2\2\u0195b\3\2\2\2\u0196\u0197\7?\2\2\u0197d\3\2\2\2\u0198\u0199\7"+
		"@\2\2\u0199f\3\2\2\2\u019a\u019b\7>\2\2\u019bh\3\2\2\2\u019c\u019d\7#"+
		"\2\2\u019dj\3\2\2\2\u019e\u019f\7?\2\2\u019f\u01a0\7?\2\2\u01a0l\3\2\2"+
		"\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7?\2\2\u01a3n\3\2\2\2\u01a4\u01a5\7"+
		"@\2\2\u01a5\u01a6\7?\2\2\u01a6p\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9r\3\2\2\2\u01aa\u01ab\7(\2\2\u01ab\u01ac\7(\2\2\u01act\3"+
		"\2\2\2\u01ad\u01ae\7~\2\2\u01ae\u01af\7~\2\2\u01afv\3\2\2\2\u01b0\u01b1"+
		"\7-\2\2\u01b1\u01b2\7-\2\2\u01b2x\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4\u01b5"+
		"\7/\2\2\u01b5z\3\2\2\2\u01b6\u01b7\7-\2\2\u01b7|\3\2\2\2\u01b8\u01b9\7"+
		"/\2\2\u01b9~\3\2\2\2\u01ba\u01bb\7,\2\2\u01bb\u0080\3\2\2\2\u01bc\u01bd"+
		"\7\61\2\2\u01bd\u0082\3\2\2\2\u01be\u01bf\7\'\2\2\u01bf\u0084\3\2\2\2"+
		"\u01c0\u01c1\7-\2\2\u01c1\u01c2\7?\2\2\u01c2\u0086\3\2\2\2\u01c3\u01c4"+
		"\7/\2\2\u01c4\u01c5\7?\2\2\u01c5\u0088\3\2\2\2\u01c6\u01c7\7,\2\2\u01c7"+
		"\u01c8\7?\2\2\u01c8\u008a\3\2\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\7?"+
		"\2\2\u01cb\u008c\3\2\2\2\u01cc\u01ce\t\6\2\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\bG\2\2\u01d2\u008e\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4\u01d5"+
		"\7#\2\2\u01d5\u01d6\7@\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d9\13\2\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01db\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7>\2\2\u01de"+
		"\u01df\7#\2\2\u01df\u01e0\7@\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\bH\2"+
		"\2\u01e2\u0090\3\2\2\2\u01e3\u01e7\7%\2\2\u01e4\u01e6\n\7\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\bI\2\2\u01eb\u0092\3\2"+
		"\2\2\u01ec\u01f0\5\u009fP\2\u01ed\u01ef\5\u009dO\2\u01ee\u01ed\3\2\2\2"+
		"\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u0094"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f7\t\b\2\2\u01f4\u01f6\5\u009dO"+
		"\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u0209\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\7)\2\2\u01fb"+
		"\u01fe\n\t\2\2\u01fc\u01fe\5\u0099M\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u0202\n\t\2\2\u0200\u0202\5\u0099M"+
		"\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0209\7)\2\2\u0206"+
		"\u0207\7)\2\2\u0207\u0209\7)\2\2\u0208\u01f3\3\2\2\2\u0208\u01fa\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0209\u0096\3\2\2\2\u020a\u020c\t\n\2\2\u020b\u020d"+
		"\t\13\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2"+
		"\u020e\u020f\5\u009bN\2\u020f\u0098\3\2\2\2\u0210\u0211\7^\2\2\u0211\u021b"+
		"\t\f\2\2\u0212\u0217\7^\2\2\u0213\u0215\t\r\2\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\t\16\2\2\u0217\u0214\3"+
		"\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\t\16\2\2\u021a"+
		"\u0210\3\2\2\2\u021a\u0212\3\2\2\2\u021b\u009a\3\2\2\2\u021c\u0224\t\b"+
		"\2\2\u021d\u021f\t\17\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0223\u0225\t\b\2\2\u0224\u0220\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u009c\3\2\2\2\u0226\u0229\5\u009fP\2\u0227\u0229\t\b\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u009e\3\2\2\2\u022a\u022f\t\20\2\2"+
		"\u022b\u022f\n\21\2\2\u022c\u022d\t\22\2\2\u022d\u022f\t\23\2\2\u022e"+
		"\u022a\3\2\2\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u00a0\3\2"+
		"\2\2#\2\u0142\u0147\u014a\u014c\u014f\u0154\u0158\u015b\u015e\u0163\u0166"+
		"\u0168\u0173\u0178\u017a\u01cf\u01da\u01e7\u01f0\u01f7\u01fd\u0201\u0203"+
		"\u0208\u020c\u0214\u0217\u021a\u0220\u0224\u0228\u022e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}