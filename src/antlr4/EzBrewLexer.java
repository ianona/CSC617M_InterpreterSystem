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
			"CONST", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "NEW", 
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
			"'letter'", "'perm'", "'do'", "'ddec'", "'other'", "'sdec'", "'loop'", 
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
			null, "ABSTRACT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "DO", 
			"DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "NEW", "RETURN", "SWITCH", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0231\b\1\4\2\t"+
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
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\5$\u0144\n$\3$\6$\u0147\n$\r$\16$\u0148\3$\5$\u014c\n$\5$\u014e\n"+
		"$\3$\5$\u0151\n$\3%\3%\3%\5%\u0156\n%\3%\3%\5%\u015a\n%\3%\5%\u015d\n"+
		"%\3%\5%\u0160\n%\3%\3%\3%\5%\u0165\n%\3%\5%\u0168\n%\5%\u016a\n%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u0175\n&\3\'\3\'\3\'\7\'\u017a\n\'\f\'\16\'"+
		"\u017d\13\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3G\6G\u01cf\nG\rG\16G\u01d0\3G\3G\3H\3H\3H\3H\3H\7H\u01da\n"+
		"H\fH\16H\u01dd\13H\3H\3H\3H\3H\3H\3H\3I\3I\7I\u01e7\nI\fI\16I\u01ea\13"+
		"I\3I\3I\3J\3J\7J\u01f0\nJ\fJ\16J\u01f3\13J\3K\3K\7K\u01f7\nK\fK\16K\u01fa"+
		"\13K\3K\3K\3K\5K\u01ff\nK\3K\3K\6K\u0203\nK\rK\16K\u0204\3K\3K\3K\5K\u020a"+
		"\nK\3L\3L\5L\u020e\nL\3L\3L\3M\3M\3M\3M\5M\u0216\nM\3M\5M\u0219\nM\3M"+
		"\5M\u021c\nM\3N\3N\7N\u0220\nN\fN\16N\u0223\13N\3N\5N\u0226\nN\3O\3O\5"+
		"O\u022a\nO\3P\3P\3P\3P\5P\u0230\nP\3\u01db\2Q\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2\24\3\2\63;\4\2NNnn\6\2F"+
		"FHHffhh\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\6\2"+
		"\f\f\17\17))^^\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4"+
		"\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\2\u024d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
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
		"\3\2\2\2%\u00e7\3\2\2\2\'\u00ec\3\2\2\2)\u00ef\3\2\2\2+\u00f4\3\2\2\2"+
		"-\u00fa\3\2\2\2/\u00ff\3\2\2\2\61\u0104\3\2\2\2\63\u010a\3\2\2\2\65\u010e"+
		"\3\2\2\2\67\u0113\3\2\2\29\u0117\3\2\2\2;\u011e\3\2\2\2=\u0123\3\2\2\2"+
		"?\u0127\3\2\2\2A\u012e\3\2\2\2C\u0133\3\2\2\2E\u0139\3\2\2\2G\u014d\3"+
		"\2\2\2I\u0169\3\2\2\2K\u0174\3\2\2\2M\u0176\3\2\2\2O\u0180\3\2\2\2Q\u0185"+
		"\3\2\2\2S\u0187\3\2\2\2U\u0189\3\2\2\2W\u018b\3\2\2\2Y\u018d\3\2\2\2["+
		"\u018f\3\2\2\2]\u0191\3\2\2\2_\u0193\3\2\2\2a\u0195\3\2\2\2c\u0197\3\2"+
		"\2\2e\u0199\3\2\2\2g\u019b\3\2\2\2i\u019d\3\2\2\2k\u019f\3\2\2\2m\u01a2"+
		"\3\2\2\2o\u01a5\3\2\2\2q\u01a8\3\2\2\2s\u01ab\3\2\2\2u\u01ae\3\2\2\2w"+
		"\u01b1\3\2\2\2y\u01b4\3\2\2\2{\u01b7\3\2\2\2}\u01b9\3\2\2\2\177\u01bb"+
		"\3\2\2\2\u0081\u01bd\3\2\2\2\u0083\u01bf\3\2\2\2\u0085\u01c1\3\2\2\2\u0087"+
		"\u01c4\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01ca\3\2\2\2\u008d\u01ce\3\2"+
		"\2\2\u008f\u01d4\3\2\2\2\u0091\u01e4\3\2\2\2\u0093\u01ed\3\2\2\2\u0095"+
		"\u0209\3\2\2\2\u0097\u020b\3\2\2\2\u0099\u021b\3\2\2\2\u009b\u021d\3\2"+
		"\2\2\u009d\u0229\3\2\2\2\u009f\u022f\3\2\2\2\u00a1\u00a2\7A\2\2\u00a2"+
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
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7r\2"+
		"\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7o\2\2\u00eb&\3\2"+
		"\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7q\2\2\u00ee(\3\2\2\2\u00ef\u00f0"+
		"\7f\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"*\3\2\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7j\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9,\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb"+
		"\u00fc\7f\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7e\2\2\u00fe.\3\2\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101\u0102\7q\2\2\u0102\u0103\7r\2\2"+
		"\u0103\60\3\2\2\2\u0104\u0105\7i\2\2\u0105\u0106\7k\2\2\u0106\u0107\7"+
		"x\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\62\3\2\2\2\u010a\u010b"+
		"\7p\2\2\u010b\u010c\7w\2\2\u010c\u010d\7o\2\2\u010d\64\3\2\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7t\2\2\u0110\u0111\7k\2\2\u0111\u0112\7i\2\2\u0112"+
		"\66\3\2\2\2\u0113\u0114\7q\2\2\u0114\u0115\7w\2\2\u0115\u0116\7v\2\2\u0116"+
		"8\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7j\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7u\2\2\u011c\u011d\7g\2\2\u011d:\3\2\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120\u0121\7n\2\2\u0121\u0122\7h\2\2"+
		"\u0122<\3\2\2\2\u0123\u0124\7g\2\2\u0124\u0125\7o\2\2\u0125\u0126\7r\2"+
		"\2\u0126>\3\2\2\2\u0127\u0128\7f\2\2\u0128\u0129\7w\2\2\u0129\u012a\7"+
		"t\2\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7i\2\2\u012d@"+
		"\3\2\2\2\u012e\u012f\7u\2\2\u012f\u0130\7e\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7p\2\2\u0132B\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7t\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138D\3\2\2\2\u0139"+
		"\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d\7k\2\2"+
		"\u013d\u013e\7p\2\2\u013e\u013f\7i\2\2\u013fF\3\2\2\2\u0140\u014e\7\62"+
		"\2\2\u0141\u014b\t\2\2\2\u0142\u0144\5\u009bN\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u014c\3\2\2\2\u0145\u0147\7a\2\2\u0146\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\5\u009bN\2\u014b\u0143\3\2\2\2\u014b\u0146"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0140\3\2\2\2\u014d\u0141\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\t\3\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151H\3\2\2\2\u0152\u0153\5\u009bN\2\u0153\u0155\7\60\2\2\u0154"+
		"\u0156\5\u009bN\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015a"+
		"\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u015a\5\u009bN\2\u0159\u0152\3\2\2"+
		"\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\5\u0097L\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\t\4"+
		"\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u016a\3\2\2\2\u0161"+
		"\u0167\5\u009bN\2\u0162\u0164\5\u0097L\2\u0163\u0165\t\4\2\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0168\t\4\2\2\u0167"+
		"\u0162\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0159\3\2"+
		"\2\2\u0169\u0161\3\2\2\2\u016aJ\3\2\2\2\u016b\u016c\7v\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7w\2\2\u016e\u0175\7g\2\2\u016f\u0170\7h\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7n\2\2\u0172\u0173\7u\2\2\u0173\u0175\7g\2\2"+
		"\u0174\u016b\3\2\2\2\u0174\u016f\3\2\2\2\u0175L\3\2\2\2\u0176\u017b\7"+
		"$\2\2\u0177\u017a\n\5\2\2\u0178\u017a\5\u0099M\2\u0179\u0177\3\2\2\2\u0179"+
		"\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7$\2\2\u017f"+
		"N\3\2\2\2\u0180\u0181\7p\2\2\u0181\u0182\7w\2\2\u0182\u0183\7n\2\2\u0183"+
		"\u0184\7n\2\2\u0184P\3\2\2\2\u0185\u0186\7*\2\2\u0186R\3\2\2\2\u0187\u0188"+
		"\7+\2\2\u0188T\3\2\2\2\u0189\u018a\7}\2\2\u018aV\3\2\2\2\u018b\u018c\7"+
		"\177\2\2\u018cX\3\2\2\2\u018d\u018e\7]\2\2\u018eZ\3\2\2\2\u018f\u0190"+
		"\7_\2\2\u0190\\\3\2\2\2\u0191\u0192\7=\2\2\u0192^\3\2\2\2\u0193\u0194"+
		"\7.\2\2\u0194`\3\2\2\2\u0195\u0196\7\60\2\2\u0196b\3\2\2\2\u0197\u0198"+
		"\7?\2\2\u0198d\3\2\2\2\u0199\u019a\7@\2\2\u019af\3\2\2\2\u019b\u019c\7"+
		">\2\2\u019ch\3\2\2\2\u019d\u019e\7#\2\2\u019ej\3\2\2\2\u019f\u01a0\7?"+
		"\2\2\u01a0\u01a1\7?\2\2\u01a1l\3\2\2\2\u01a2\u01a3\7>\2\2\u01a3\u01a4"+
		"\7?\2\2\u01a4n\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6\u01a7\7?\2\2\u01a7p\3"+
		"\2\2\2\u01a8\u01a9\7#\2\2\u01a9\u01aa\7?\2\2\u01aar\3\2\2\2\u01ab\u01ac"+
		"\7(\2\2\u01ac\u01ad\7(\2\2\u01adt\3\2\2\2\u01ae\u01af\7~\2\2\u01af\u01b0"+
		"\7~\2\2\u01b0v\3\2\2\2\u01b1\u01b2\7-\2\2\u01b2\u01b3\7-\2\2\u01b3x\3"+
		"\2\2\2\u01b4\u01b5\7/\2\2\u01b5\u01b6\7/\2\2\u01b6z\3\2\2\2\u01b7\u01b8"+
		"\7-\2\2\u01b8|\3\2\2\2\u01b9\u01ba\7/\2\2\u01ba~\3\2\2\2\u01bb\u01bc\7"+
		",\2\2\u01bc\u0080\3\2\2\2\u01bd\u01be\7\61\2\2\u01be\u0082\3\2\2\2\u01bf"+
		"\u01c0\7\'\2\2\u01c0\u0084\3\2\2\2\u01c1\u01c2\7-\2\2\u01c2\u01c3\7?\2"+
		"\2\u01c3\u0086\3\2\2\2\u01c4\u01c5\7/\2\2\u01c5\u01c6\7?\2\2\u01c6\u0088"+
		"\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8\u01c9\7?\2\2\u01c9\u008a\3\2\2\2\u01ca"+
		"\u01cb\7\61\2\2\u01cb\u01cc\7?\2\2\u01cc\u008c\3\2\2\2\u01cd\u01cf\t\6"+
		"\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\bG\2\2\u01d3\u008e\3\2"+
		"\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6\7#\2\2\u01d6\u01d7\7@\2\2\u01d7\u01db"+
		"\3\2\2\2\u01d8\u01da\13\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01df\7>\2\2\u01df\u01e0\7#\2\2\u01e0\u01e1\7@\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\bH\2\2\u01e3\u0090\3\2\2\2\u01e4\u01e8\7%\2"+
		"\2\u01e5\u01e7\n\7\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\bI\2\2\u01ec\u0092\3\2\2\2\u01ed\u01f1\5\u009fP\2\u01ee\u01f0\5"+
		"\u009dO\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2"+
		"\u01f1\u01f2\3\2\2\2\u01f2\u0094\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f8"+
		"\t\b\2\2\u01f5\u01f7\5\u009dO\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2"+
		"\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u020a\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fb\u01fe\7)\2\2\u01fc\u01ff\n\t\2\2\u01fd\u01ff\5\u0099M\2"+
		"\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u0203"+
		"\n\t\2\2\u0201\u0203\5\u0099M\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2"+
		"\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u020a\7)\2\2\u0207\u0208\7)\2\2\u0208\u020a\7)\2\2\u0209"+
		"\u01f4\3\2\2\2\u0209\u01fb\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u0096\3\2"+
		"\2\2\u020b\u020d\t\n\2\2\u020c\u020e\t\13\2\2\u020d\u020c\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\5\u009bN\2\u0210\u0098"+
		"\3\2\2\2\u0211\u0212\7^\2\2\u0212\u021c\t\f\2\2\u0213\u0218\7^\2\2\u0214"+
		"\u0216\t\r\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0219\t\16\2\2\u0218\u0215\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\t\16\2\2\u021b\u0211\3\2\2\2\u021b\u0213\3"+
		"\2\2\2\u021c\u009a\3\2\2\2\u021d\u0225\t\b\2\2\u021e\u0220\t\17\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0226\t\b\2\2\u0225"+
		"\u0221\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u009c\3\2\2\2\u0227\u022a\5\u009f"+
		"P\2\u0228\u022a\t\b\2\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a"+
		"\u009e\3\2\2\2\u022b\u0230\t\20\2\2\u022c\u0230\n\21\2\2\u022d\u022e\t"+
		"\22\2\2\u022e\u0230\t\23\2\2\u022f\u022b\3\2\2\2\u022f\u022c\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u00a0\3\2\2\2#\2\u0143\u0148\u014b\u014d\u0150\u0155"+
		"\u0159\u015c\u015f\u0164\u0167\u0169\u0174\u0179\u017b\u01d0\u01db\u01e8"+
		"\u01f1\u01f8\u01fe\u0202\u0204\u0209\u020d\u0215\u0218\u021b\u0221\u0225"+
		"\u0229\u022f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}