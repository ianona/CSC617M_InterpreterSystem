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
		CATCH=17, CHAR=18, DO=19, DOUBLE=20, ELSE=21, FINAL=22, FINALLY=23, FLOAT=24, 
		FOR=25, IF=26, INT=27, NEW=28, RETURN=29, SWITCH=30, THIS=31, TRY=32, 
		VOID=33, WHILE=34, SCAN=35, PRINT=36, STRING=37, DECIMAL_LITERAL=38, FLOAT_LITERAL=39, 
		BOOL_LITERAL=40, CHAR_LITERAL=41, STRING_LITERAL=42, NULL_LITERAL=43, 
		LPAREN=44, RPAREN=45, LBRACE=46, RBRACE=47, LBRACK=48, RBRACK=49, SEMI=50, 
		COMMA=51, DOT=52, ASSIGN=53, GT=54, LT=55, BANG=56, EQUAL=57, LE=58, GE=59, 
		NOTEQUAL=60, AND=61, OR=62, INC=63, DEC=64, ADD=65, SUB=66, MUL=67, DIV=68, 
		MOD=69, ADD_ASSIGN=70, SUB_ASSIGN=71, MUL_ASSIGN=72, DIV_ASSIGN=73, WS=74, 
		COMMENT=75, LINE_COMMENT=76, IDENTIFIER=77, ERROR=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CATCH", 
			"CHAR", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"INT", "NEW", "RETURN", "SWITCH", "THIS", "TRY", "VOID", "WHILE", "SCAN", 
			"PRINT", "STRING", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
			"CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"ERROR", "ExponentPart", "EscapeSequence", "Digits", "LetterOrDigit", 
			"Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "'...'", "'@'", "'|'", "':'", "'&='", "'|='", "'^='", "'>>='", 
			"'>>>='", "'<<='", "'%='", "'outline'", "'bool'", "'stop'", "'sample'", 
			"'handle'", "'letter'", "'do'", "'ddec'", "'other'", "'abs'", "'lastly'", 
			"'sdec'", "'loop'", "'given'", "'num'", "'orig'", "'out'", "'choose'", 
			"'self'", "'attempt'", "'emp'", "'during'", "'scan'", "'print'", "'string'", 
			null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", 
			"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CATCH", "CHAR", "DO", 
			"DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "INT", "NEW", 
			"RETURN", "SWITCH", "THIS", "TRY", "VOID", "WHILE", "SCAN", "PRINT", 
			"STRING", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u025f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\5\'\u015e\n\'\3\'\3\'\3\'\5\'\u0163\n\'\3\'\6\'\u0166"+
		"\n\'\r\'\16\'\u0167\3\'\5\'\u016b\n\'\5\'\u016d\n\'\3\'\5\'\u0170\n\'"+
		"\3(\5(\u0173\n(\3(\3(\3(\5(\u0178\n(\3(\3(\5(\u017c\n(\3(\5(\u017f\n("+
		"\3(\5(\u0182\n(\3(\5(\u0185\n(\3(\3(\3(\5(\u018a\n(\3(\5(\u018d\n(\5("+
		"\u018f\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u019a\n)\3*\3*\3*\5*\u019f\n*"+
		"\3*\3*\3+\3+\3+\7+\u01a6\n+\f+\16+\u01a9\13+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\6K\u01fb\nK\rK\16K\u01fc\3K\3K\3"+
		"L\3L\3L\3L\3L\7L\u0206\nL\fL\16L\u0209\13L\3L\3L\3L\3L\3L\3L\3M\3M\7M"+
		"\u0213\nM\fM\16M\u0216\13M\3M\3M\3N\3N\7N\u021c\nN\fN\16N\u021f\13N\3"+
		"O\3O\7O\u0223\nO\fO\16O\u0226\13O\3O\3O\3O\5O\u022b\nO\3O\3O\6O\u022f"+
		"\nO\rO\16O\u0230\3O\3O\3O\5O\u0236\nO\3P\3P\5P\u023a\nP\3P\3P\3Q\3Q\3"+
		"Q\3Q\5Q\u0242\nQ\3Q\5Q\u0245\nQ\3Q\5Q\u0248\nQ\3R\3R\7R\u024c\nR\fR\16"+
		"R\u024f\13R\3R\5R\u0252\nR\3S\3S\5S\u0256\nS\3T\3T\3T\3T\3T\3T\5T\u025e"+
		"\nT\3\u0207\2U\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\3\2\24\3\2\63;\4\2NNnn\6\2F"+
		"FHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f"+
		"\17\17\3\2\62;\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4"+
		"\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\2\u0280\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
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
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2\2\7\u00af\3\2\2\2\t\u00b1\3\2\2\2\13"+
		"\u00b3\3\2\2\2\r\u00b5\3\2\2\2\17\u00b8\3\2\2\2\21\u00bb\3\2\2\2\23\u00be"+
		"\3\2\2\2\25\u00c2\3\2\2\2\27\u00c7\3\2\2\2\31\u00cb\3\2\2\2\33\u00ce\3"+
		"\2\2\2\35\u00d6\3\2\2\2\37\u00db\3\2\2\2!\u00e0\3\2\2\2#\u00e7\3\2\2\2"+
		"%\u00ee\3\2\2\2\'\u00f5\3\2\2\2)\u00f8\3\2\2\2+\u00fd\3\2\2\2-\u0103\3"+
		"\2\2\2/\u0107\3\2\2\2\61\u010e\3\2\2\2\63\u0113\3\2\2\2\65\u0118\3\2\2"+
		"\2\67\u011e\3\2\2\29\u0122\3\2\2\2;\u0127\3\2\2\2=\u012b\3\2\2\2?\u0132"+
		"\3\2\2\2A\u0137\3\2\2\2C\u013f\3\2\2\2E\u0143\3\2\2\2G\u014a\3\2\2\2I"+
		"\u014f\3\2\2\2K\u0155\3\2\2\2M\u015d\3\2\2\2O\u018e\3\2\2\2Q\u0199\3\2"+
		"\2\2S\u019b\3\2\2\2U\u01a2\3\2\2\2W\u01ac\3\2\2\2Y\u01b1\3\2\2\2[\u01b3"+
		"\3\2\2\2]\u01b5\3\2\2\2_\u01b7\3\2\2\2a\u01b9\3\2\2\2c\u01bb\3\2\2\2e"+
		"\u01bd\3\2\2\2g\u01bf\3\2\2\2i\u01c1\3\2\2\2k\u01c3\3\2\2\2m\u01c5\3\2"+
		"\2\2o\u01c7\3\2\2\2q\u01c9\3\2\2\2s\u01cb\3\2\2\2u\u01ce\3\2\2\2w\u01d1"+
		"\3\2\2\2y\u01d4\3\2\2\2{\u01d7\3\2\2\2}\u01da\3\2\2\2\177\u01dd\3\2\2"+
		"\2\u0081\u01e0\3\2\2\2\u0083\u01e3\3\2\2\2\u0085\u01e5\3\2\2\2\u0087\u01e7"+
		"\3\2\2\2\u0089\u01e9\3\2\2\2\u008b\u01eb\3\2\2\2\u008d\u01ed\3\2\2\2\u008f"+
		"\u01f0\3\2\2\2\u0091\u01f3\3\2\2\2\u0093\u01f6\3\2\2\2\u0095\u01fa\3\2"+
		"\2\2\u0097\u0200\3\2\2\2\u0099\u0210\3\2\2\2\u009b\u0219\3\2\2\2\u009d"+
		"\u0235\3\2\2\2\u009f\u0237\3\2\2\2\u00a1\u0247\3\2\2\2\u00a3\u0249\3\2"+
		"\2\2\u00a5\u0255\3\2\2\2\u00a7\u025d\3\2\2\2\u00a9\u00aa\7A\2\2\u00aa"+
		"\4\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae\7\60"+
		"\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7B\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7"+
		"~\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7"+
		"(\2\2\u00b6\u00b7\7?\2\2\u00b7\16\3\2\2\2\u00b8\u00b9\7~\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7`\2\2\u00bc\u00bd\7?\2\2\u00bd\22"+
		"\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1"+
		"\24\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7@\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6\26\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7>\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\7?\2\2"+
		"\u00cd\32\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7"+
		"v\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7n\2\2\u00da\36\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7r\2\2\u00df \3\2\2\2\u00e0\u00e1"+
		"\7u\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7r\2\2\u00e4"+
		"\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2"+
		"\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7q\2\2\u00f7(\3"+
		"\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7j\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102,\3\2\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7d\2\2\u0105\u0106\7u\2\2\u0106.\3\2\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2"+
		"\u010b\u010c\7n\2\2\u010c\u010d\7{\2\2\u010d\60\3\2\2\2\u010e\u010f\7"+
		"u\2\2\u010f\u0110\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7e\2\2\u0112\62"+
		"\3\2\2\2\u0113\u0114\7n\2\2\u0114\u0115\7q\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0117\7r\2\2\u0117\64\3\2\2\2\u0118\u0119\7i\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7x\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\66\3\2\2\2\u011e"+
		"\u011f\7p\2\2\u011f\u0120\7w\2\2\u0120\u0121\7o\2\2\u01218\3\2\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124\u0125\7k\2\2\u0125\u0126\7i\2\2"+
		"\u0126:\3\2\2\2\u0127\u0128\7q\2\2\u0128\u0129\7w\2\2\u0129\u012a\7v\2"+
		"\2\u012a<\3\2\2\2\u012b\u012c\7e\2\2\u012c\u012d\7j\2\2\u012d\u012e\7"+
		"q\2\2\u012e\u012f\7q\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131>"+
		"\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135"+
		"\u0136\7h\2\2\u0136@\3\2\2\2\u0137\u0138\7c\2\2\u0138\u0139\7v\2\2\u0139"+
		"\u013a\7v\2\2\u013a\u013b\7g\2\2\u013b\u013c\7o\2\2\u013c\u013d\7r\2\2"+
		"\u013d\u013e\7v\2\2\u013eB\3\2\2\2\u013f\u0140\7g\2\2\u0140\u0141\7o\2"+
		"\2\u0141\u0142\7r\2\2\u0142D\3\2\2\2\u0143\u0144\7f\2\2\u0144\u0145\7"+
		"w\2\2\u0145\u0146\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149"+
		"\7i\2\2\u0149F\3\2\2\2\u014a\u014b\7u\2\2\u014b\u014c\7e\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7p\2\2\u014eH\3\2\2\2\u014f\u0150\7r\2\2\u0150\u0151"+
		"\7t\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153\u0154\7v\2\2\u0154"+
		"J\3\2\2\2\u0155\u0156\7u\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158"+
		"\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\u015b\7i\2\2\u015bL\3\2\2\2\u015c"+
		"\u015e\7/\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u016c\3\2"+
		"\2\2\u015f\u016d\7\62\2\2\u0160\u016a\t\2\2\2\u0161\u0163\5\u00a3R\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0166\7a"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5\u00a3R\2\u016a\u0162"+
		"\3\2\2\2\u016a\u0165\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u015f\3\2\2\2\u016c"+
		"\u0160\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\t\3\2\2\u016f\u016e\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170N\3\2\2\2\u0171\u0173\7/\2\2\u0172\u0171"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017b\3\2\2\2\u0174\u0175\5\u00a3R"+
		"\2\u0175\u0177\7\60\2\2\u0176\u0178\5\u00a3R\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017c\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017c\5"+
		"\u00a3R\2\u017b\u0174\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2\2\2"+
		"\u017d\u017f\5\u009fP\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u0182\t\4\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u018f\3\2\2\2\u0183\u0185\7/\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u018c\5\u00a3R\2\u0187\u0189"+
		"\5\u009fP\2\u0188\u018a\t\4\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2"+
		"\2\u018a\u018d\3\2\2\2\u018b\u018d\t\4\2\2\u018c\u0187\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0172\3\2\2\2\u018e\u0184\3\2\2\2\u018f"+
		"P\3\2\2\2\u0190\u0191\7v\2\2\u0191\u0192\7t\2\2\u0192\u0193\7w\2\2\u0193"+
		"\u019a\7g\2\2\u0194\u0195\7h\2\2\u0195\u0196\7c\2\2\u0196\u0197\7n\2\2"+
		"\u0197\u0198\7u\2\2\u0198\u019a\7g\2\2\u0199\u0190\3\2\2\2\u0199\u0194"+
		"\3\2\2\2\u019aR\3\2\2\2\u019b\u019e\7)\2\2\u019c\u019f\n\5\2\2\u019d\u019f"+
		"\5\u00a1Q\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2"+
		"\2\u01a0\u01a1\7)\2\2\u01a1T\3\2\2\2\u01a2\u01a7\7$\2\2\u01a3\u01a6\n"+
		"\6\2\2\u01a4\u01a6\5\u00a1Q\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2"+
		"\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7$\2\2\u01abV\3\2\2\2\u01ac\u01ad"+
		"\7p\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7n\2\2\u01af\u01b0\7n\2\2\u01b0"+
		"X\3\2\2\2\u01b1\u01b2\7*\2\2\u01b2Z\3\2\2\2\u01b3\u01b4\7+\2\2\u01b4\\"+
		"\3\2\2\2\u01b5\u01b6\7}\2\2\u01b6^\3\2\2\2\u01b7\u01b8\7\177\2\2\u01b8"+
		"`\3\2\2\2\u01b9\u01ba\7]\2\2\u01bab\3\2\2\2\u01bb\u01bc\7_\2\2\u01bcd"+
		"\3\2\2\2\u01bd\u01be\7=\2\2\u01bef\3\2\2\2\u01bf\u01c0\7.\2\2\u01c0h\3"+
		"\2\2\2\u01c1\u01c2\7\60\2\2\u01c2j\3\2\2\2\u01c3\u01c4\7?\2\2\u01c4l\3"+
		"\2\2\2\u01c5\u01c6\7@\2\2\u01c6n\3\2\2\2\u01c7\u01c8\7>\2\2\u01c8p\3\2"+
		"\2\2\u01c9\u01ca\7#\2\2\u01car\3\2\2\2\u01cb\u01cc\7?\2\2\u01cc\u01cd"+
		"\7?\2\2\u01cdt\3\2\2\2\u01ce\u01cf\7>\2\2\u01cf\u01d0\7?\2\2\u01d0v\3"+
		"\2\2\2\u01d1\u01d2\7@\2\2\u01d2\u01d3\7?\2\2\u01d3x\3\2\2\2\u01d4\u01d5"+
		"\7#\2\2\u01d5\u01d6\7?\2\2\u01d6z\3\2\2\2\u01d7\u01d8\7(\2\2\u01d8\u01d9"+
		"\7(\2\2\u01d9|\3\2\2\2\u01da\u01db\7~\2\2\u01db\u01dc\7~\2\2\u01dc~\3"+
		"\2\2\2\u01dd\u01de\7-\2\2\u01de\u01df\7-\2\2\u01df\u0080\3\2\2\2\u01e0"+
		"\u01e1\7/\2\2\u01e1\u01e2\7/\2\2\u01e2\u0082\3\2\2\2\u01e3\u01e4\7-\2"+
		"\2\u01e4\u0084\3\2\2\2\u01e5\u01e6\7/\2\2\u01e6\u0086\3\2\2\2\u01e7\u01e8"+
		"\7,\2\2\u01e8\u0088\3\2\2\2\u01e9\u01ea\7\61\2\2\u01ea\u008a\3\2\2\2\u01eb"+
		"\u01ec\7\'\2\2\u01ec\u008c\3\2\2\2\u01ed\u01ee\7-\2\2\u01ee\u01ef\7?\2"+
		"\2\u01ef\u008e\3\2\2\2\u01f0\u01f1\7/\2\2\u01f1\u01f2\7?\2\2\u01f2\u0090"+
		"\3\2\2\2\u01f3\u01f4\7,\2\2\u01f4\u01f5\7?\2\2\u01f5\u0092\3\2\2\2\u01f6"+
		"\u01f7\7\61\2\2\u01f7\u01f8\7?\2\2\u01f8\u0094\3\2\2\2\u01f9\u01fb\t\7"+
		"\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bK\2\2\u01ff\u0096\3\2"+
		"\2\2\u0200\u0201\7>\2\2\u0201\u0202\7#\2\2\u0202\u0203\7@\2\2\u0203\u0207"+
		"\3\2\2\2\u0204\u0206\13\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2"+
		"\u0207\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u020a\u020b\7>\2\2\u020b\u020c\7#\2\2\u020c\u020d\7@\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\bL\2\2\u020f\u0098\3\2\2\2\u0210\u0214\7%\2"+
		"\2\u0211\u0213\n\b\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\bM\2\2\u0218\u009a\3\2\2\2\u0219\u021d\5\u00a7T\2\u021a\u021c\5"+
		"\u00a5S\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2"+
		"\u021d\u021e\3\2\2\2\u021e\u009c\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0224"+
		"\t\t\2\2\u0221\u0223\5\u00a5S\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2"+
		"\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0236\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u022a\7)\2\2\u0228\u022b\n\5\2\2\u0229\u022b\5\u00a1Q\2"+
		"\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022f"+
		"\n\5\2\2\u022d\u022f\5\u00a1Q\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2"+
		"\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0236\7)\2\2\u0233\u0234\7)\2\2\u0234\u0236\7)\2\2\u0235"+
		"\u0220\3\2\2\2\u0235\u0227\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u009e\3\2"+
		"\2\2\u0237\u0239\t\n\2\2\u0238\u023a\t\13\2\2\u0239\u0238\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5\u00a3R\2\u023c\u00a0"+
		"\3\2\2\2\u023d\u023e\7^\2\2\u023e\u0248\t\f\2\2\u023f\u0244\7^\2\2\u0240"+
		"\u0242\t\r\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0245\t\16\2\2\u0244\u0241\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\t\16\2\2\u0247\u023d\3\2\2\2\u0247\u023f\3"+
		"\2\2\2\u0248\u00a2\3\2\2\2\u0249\u0251\t\t\2\2\u024a\u024c\t\17\2\2\u024b"+
		"\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\t\t\2\2\u0251"+
		"\u024d\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u00a4\3\2\2\2\u0253\u0256\5\u00a7"+
		"T\2\u0254\u0256\t\t\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256"+
		"\u00a6\3\2\2\2\u0257\u025e\t\20\2\2\u0258\u025e\n\21\2\2\u0259\u025a\t"+
		"\22\2\2\u025a\u025e\t\23\2\2\u025b\u025c\t\22\2\2\u025c\u025e\t\23\2\2"+
		"\u025d\u0257\3\2\2\2\u025d\u0258\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025b"+
		"\3\2\2\2\u025e\u00a8\3\2\2\2\'\2\u015d\u0162\u0167\u016a\u016c\u016f\u0172"+
		"\u0177\u017b\u017e\u0181\u0184\u0189\u018c\u018e\u0199\u019e\u01a5\u01a7"+
		"\u01fc\u0207\u0214\u021d\u0224\u022a\u022e\u0230\u0235\u0239\u0241\u0244"+
		"\u0247\u024d\u0251\u0255\u025d\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}