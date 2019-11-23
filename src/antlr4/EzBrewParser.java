// Generated from /Users/ianona/Desktop/CSC617M/InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EzBrewParser extends Parser {
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
		DIV_ASSIGN=68, WS=69, COMMENT=70, LINE_COMMENT=71, IDENTIFIER=72, ERROR=73, 
		PUBLIC=74, FINAL=75, STATIC=76, THROWS=77, EXTENDS=78, SUPER=79, CHAR_LITERAL=80, 
		DEFAULT=81;
	public static final int
		RULE_start = 0, RULE_modifier = 1, RULE_classOrInterfaceModifier = 2, 
		RULE_variableModifier = 3, RULE_classBodyDeclaration = 4, RULE_memberDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_methodBody = 7, RULE_typeTypeOrVoid = 8, 
		RULE_constructorDeclaration = 9, RULE_constDeclaration = 10, RULE_constantDeclarator = 11, 
		RULE_interfaceMethodModifier = 12, RULE_variableDeclarators = 13, RULE_variableDeclarator = 14, 
		RULE_variableDeclaratorId = 15, RULE_variableInitializer = 16, RULE_arrayInitializer = 17, 
		RULE_classOrInterfaceType = 18, RULE_typeArgument = 19, RULE_qualifiedNameList = 20, 
		RULE_formalParameters = 21, RULE_formalParameterList = 22, RULE_formalParameter = 23, 
		RULE_lastFormalParameter = 24, RULE_qualifiedName = 25, RULE_literal = 26, 
		RULE_integerLiteral = 27, RULE_floatLiteral = 28, RULE_annotation = 29, 
		RULE_elementValuePairs = 30, RULE_elementValuePair = 31, RULE_elementValue = 32, 
		RULE_elementValueArrayInitializer = 33, RULE_block = 34, RULE_blockStatement = 35, 
		RULE_localVariableDeclaration = 36, RULE_statement = 37, RULE_resourceSpecification = 38, 
		RULE_resources = 39, RULE_resource = 40, RULE_switchBlockStatementGroup = 41, 
		RULE_switchLabel = 42, RULE_forControl = 43, RULE_forInit = 44, RULE_parExpression = 45, 
		RULE_expressionList = 46, RULE_methodCall = 47, RULE_expression = 48, 
		RULE_primary = 49, RULE_arrayCreatorRest = 50, RULE_typeType = 51, RULE_primitiveType = 52, 
		RULE_typeArguments = 53, RULE_superSuffix = 54, RULE_explicitGenericInvocationSuffix = 55, 
		RULE_arguments = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "modifier", "classOrInterfaceModifier", "variableModifier", 
			"classBodyDeclaration", "memberDeclaration", "methodDeclaration", "methodBody", 
			"typeTypeOrVoid", "constructorDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodModifier", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "qualifiedName", "literal", 
			"integerLiteral", "floatLiteral", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "block", 
			"blockStatement", "localVariableDeclaration", "statement", "resourceSpecification", 
			"resources", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "parExpression", "expressionList", "methodCall", 
			"expression", "primary", "arrayCreatorRest", "typeType", "primitiveType", 
			"typeArguments", "superSuffix", "explicitGenericInvocationSuffix", "arguments"
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
			"ERROR", "PUBLIC", "FINAL", "STATIC", "THROWS", "EXTENDS", "SUPER", "CHAR_LITERAL", 
			"DEFAULT"
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

	@Override
	public String getGrammarFileName() { return "EzBrew.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EzBrewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EzBrewParser.EOF, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << STRING) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (IDENTIFIER - 72)) | (1L << (PUBLIC - 72)) | (1L << (STATIC - 72)))) != 0)) {
				{
				{
				setState(114);
				classBodyDeclaration();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			classOrInterfaceModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(EzBrewParser.PUBLIC, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classOrInterfaceModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PUBLIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(EzBrewParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(EzBrewParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(SEMI);
				}
				break;
			case LBRACE:
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(129);
					match(STATIC);
					}
				}

				setState(132);
				block();
				}
				break;
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case VOID:
			case STRING:
			case IDENTIFIER:
			case PUBLIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUBLIC) {
					{
					{
					setState(133);
					modifier();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(EzBrewParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(EzBrewParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(EzBrewParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(EzBrewParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(EzBrewParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			typeTypeOrVoid();
			setState(147);
			match(IDENTIFIER);
			setState(148);
			formalParameters();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(149);
				match(LBRACK);
				setState(150);
				match(RBRACK);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(156);
				match(THROWS);
				setState(157);
				qualifiedNameList();
				}
			}

			setState(160);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodBody);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(EzBrewParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeTypeOrVoid);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(EzBrewParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IDENTIFIER);
			setState(171);
			formalParameters();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(172);
				match(THROWS);
				setState(173);
				qualifiedNameList();
				}
			}

			setState(176);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			typeType();
			setState(179);
			constantDeclarator();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				constantDeclarator();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(EzBrewParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(EzBrewParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(EzBrewParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(EzBrewParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IDENTIFIER);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(190);
				match(LBRACK);
				setState(191);
				match(RBRACK);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(ASSIGN);
			setState(198);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(EzBrewParser.PUBLIC, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceMethodModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PUBLIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			variableDeclarator();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				variableDeclarator();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	 
		public VariableDeclaratorContext() { }
		public void copyFrom(VariableDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends VariableDeclaratorContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VarAssignmentContext(VariableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			variableDeclaratorId();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(211);
				match(ASSIGN);
				setState(212);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	 
		public VariableDeclaratorIdContext() { }
		public void copyFrom(VariableDeclaratorIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclaratorContext extends VariableDeclaratorIdContext {
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(EzBrewParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(EzBrewParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(EzBrewParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(EzBrewParser.RBRACK, i);
		}
		public VarDeclaratorContext(VariableDeclaratorIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterVarDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitVarDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitVarDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaratorId);
		int _la;
		try {
			_localctx = new VarDeclaratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(216);
				match(LBRACK);
				setState(217);
				match(RBRACK);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	 
		public VariableInitializerContext() { }
		public void copyFrom(VariableInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprInitContext extends VariableInitializerContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprInitContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterExprInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitExprInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitExprInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrInitContext extends VariableInitializerContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrInitContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterArrInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitArrInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitArrInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new ArrInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				arrayInitializer();
				}
				break;
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case CHAR_LITERAL:
				_localctx = new ExprInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EzBrewParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EzBrewParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LBRACE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (LBRACE - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
				{
				setState(228);
				variableInitializer();
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						match(COMMA);
						setState(230);
						variableInitializer();
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(236);
					match(COMMA);
					}
				}

				}
			}

			setState(241);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EzBrewParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EzBrewParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(EzBrewParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EzBrewParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IDENTIFIER);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(244);
				typeArguments();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(247);
				match(DOT);
				setState(248);
				match(IDENTIFIER);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(249);
					typeArguments();
					}
				}

				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(EzBrewParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(EzBrewParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgument);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				typeType();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__0);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(259);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(260);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			qualifiedName();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				qualifiedName();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAREN);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0) || _la==IDENTIFIER || _la==FINAL) {
				{
				setState(274);
				formalParameterList();
				}
			}

			setState(277);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				formalParameter();
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						match(COMMA);
						setState(281);
						formalParameter();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(287);
					match(COMMA);
					setState(288);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(294);
				variableModifier();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			typeType();
			setState(301);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(303);
				variableModifier();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			typeType();
			setState(310);
			match(T__1);
			setState(311);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EzBrewParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EzBrewParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(EzBrewParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EzBrewParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IDENTIFIER);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(314);
				match(DOT);
				setState(315);
				match(IDENTIFIER);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(EzBrewParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(EzBrewParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(EzBrewParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(EzBrewParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	 
		public IntegerLiteralContext() { }
		public void copyFrom(IntegerLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLitContext extends IntegerLiteralContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(EzBrewParser.DECIMAL_LITERAL, 0); }
		public IntLitContext(IntegerLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integerLiteral);
		try {
			_localctx = new IntLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(EzBrewParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__2);
			setState(334);
			qualifiedName();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(335);
				match(LPAREN);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(336);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(337);
					elementValue();
					}
					break;
				}
				setState(340);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			elementValuePair();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				elementValuePair();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IDENTIFIER);
			setState(352);
			match(ASSIGN);
			setState(353);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elementValue);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EzBrewParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EzBrewParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LBRACE);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (LBRACE - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
				{
				setState(360);
				elementValue();
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						match(COMMA);
						setState(362);
						elementValue();
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(370);
				match(COMMA);
				}
			}

			setState(373);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EzBrewParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EzBrewParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(LBRACE);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (IDENTIFIER - 72)) | (1L << (FINAL - 72)) | (1L << (CHAR_LITERAL - 72)))) != 0)) {
				{
				{
				setState(376);
				blockStatement();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockStatement);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				localVariableDeclaration();
				setState(385);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(390);
				variableModifier();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			typeType();
			setState(397);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmt2Context extends StatementContext {
		public Token bop;
		public TerminalNode IF() { return getToken(EzBrewParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(EzBrewParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(EzBrewParser.NOTEQUAL, 0); }
		public TerminalNode ELSE() { return getToken(EzBrewParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmt2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterIfStmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitIfStmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitIfStmt2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStmtContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(EzBrewParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(EzBrewParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EzBrewParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(EzBrewParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(EzBrewParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStmtContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(EzBrewParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(EzBrewParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(EzBrewParser.ADD, i);
		}
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext statementExpression;
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(EzBrewParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(EzBrewParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStmtContext extends StatementContext {
		public TerminalNode DO() { return getToken(EzBrewParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(EzBrewParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public DoWhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(EzBrewParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStmtContext extends StatementContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EzBrewParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EzBrewParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public TerminalNode SCAN() { return getToken(EzBrewParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(EzBrewParser.STRING_LITERAL, 0); }
		public List<TerminalNode> ADD() { return getTokens(EzBrewParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(EzBrewParser.ADD, i);
		}
		public InputStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				((BlockStmtContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(IF);
				setState(401);
				parExpression();
				setState(402);
				statement();
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(403);
					match(ELSE);
					setState(404);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new IfStmt2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(IF);
				setState(408);
				match(LPAREN);
				setState(409);
				expression(0);
				setState(410);
				((IfStmt2Context)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
					((IfStmt2Context)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				expression(0);
				setState(412);
				match(RPAREN);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(413);
					match(ELSE);
					setState(414);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(FOR);
				setState(418);
				match(LPAREN);
				setState(419);
				forControl();
				setState(420);
				match(RPAREN);
				setState(421);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(WHILE);
				setState(424);
				parExpression();
				setState(425);
				statement();
				}
				break;
			case 6:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				match(DO);
				setState(428);
				statement();
				setState(429);
				match(WHILE);
				setState(430);
				parExpression();
				setState(431);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				match(SWITCH);
				setState(434);
				parExpression();
				setState(435);
				match(LBRACE);
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(442);
					switchLabel();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				match(RETURN);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
					{
					setState(451);
					expression(0);
					}
				}

				setState(454);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(455);
				((ExprStmtContext)_localctx).statementExpression = expression(0);
				setState(456);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new InputStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(458);
				match(IDENTIFIER);
				setState(459);
				match(ASSIGN);
				setState(460);
				match(SCAN);
				setState(461);
				match(LPAREN);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					setState(462);
					match(STRING_LITERAL);
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ADD) {
						{
						{
						setState(463);
						match(ADD);
						setState(464);
						match(IDENTIFIER);
						}
						}
						setState(469);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(472);
				match(RPAREN);
				}
				break;
			case 11:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(473);
				match(PRINT);
				setState(474);
				match(LPAREN);
				setState(475);
				primary();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(476);
					match(ADD);
					setState(477);
					primary();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(EzBrewParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(LPAREN);
			setState(488);
			resources();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(489);
				match(SEMI);
				}
			}

			setState(492);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EzBrewParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EzBrewParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			resource();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(SEMI);
					setState(496);
					resource();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(502);
				variableModifier();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			classOrInterfaceType();
			setState(509);
			variableDeclaratorId();
			setState(510);
			match(ASSIGN);
			setState(511);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				switchLabel();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(518);
				blockStatement();
				}
				}
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (IDENTIFIER - 72)) | (1L << (FINAL - 72)) | (1L << (CHAR_LITERAL - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(EzBrewParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(EzBrewParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchLabel);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(CASE);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(524);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(525);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(528);
				match(T__4);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(DEFAULT);
				setState(530);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(EzBrewParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EzBrewParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			forInit();
			setState(534);
			match(SEMI);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
				{
				setState(535);
				expression(0);
				}
			}

			setState(538);
			match(SEMI);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
				{
				setState(539);
				((ForControlContext)_localctx).forUpdate = expressionList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forInit);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL) {
					{
					{
					setState(542);
					variableModifier();
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				typeType();
				setState(549);
				variableDeclaratorId();
				setState(550);
				match(ASSIGN);
				setState(551);
				variableInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	 
		public ParExpressionContext() { }
		public void copyFrom(ParExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExpContext extends ParExpressionContext {
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public ParExpContext(ParExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parExpression);
		try {
			_localctx = new ParExpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(LPAREN);
			setState(557);
			expression(0);
			setState(558);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			expression(0);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				expression(0);
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(EzBrewParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(EzBrewParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodCall);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(IDENTIFIER);
				setState(569);
				match(LPAREN);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
					{
					setState(570);
					expressionList();
					}
				}

				setState(573);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(THIS);
				setState(575);
				match(LPAREN);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
					{
					setState(576);
					expressionList();
					}
				}

				setState(579);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(SUPER);
				setState(581);
				match(LPAREN);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
					{
					setState(582);
					expressionList();
					}
				}

				setState(585);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(EzBrewParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(EzBrewParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(EzBrewParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(EzBrewParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(EzBrewParser.DIV_ASSIGN, 0); }
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends ExpressionContext {
		public TerminalNode SCAN() { return getToken(EzBrewParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(EzBrewParser.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public InputContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(EzBrewParser.OR, 0); }
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EzBrewParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(EzBrewParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(EzBrewParser.MOD, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(EzBrewParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(EzBrewParser.SUB, 0); }
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PriContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitPri(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Compare1Context extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(EzBrewParser.LE, 0); }
		public TerminalNode GE() { return getToken(EzBrewParser.GE, 0); }
		public TerminalNode GT() { return getToken(EzBrewParser.GT, 0); }
		public TerminalNode LT() { return getToken(EzBrewParser.LT, 0); }
		public Compare1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterCompare1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitCompare1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitCompare1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(EzBrewParser.AND, 0); }
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Compare2Context extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(EzBrewParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(EzBrewParser.NOTEQUAL, 0); }
		public Compare2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterCompare2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitCompare2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitCompare2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case CHAR_LITERAL:
				{
				_localctx = new PriContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(589);
				primary();
				}
				break;
			case SCAN:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(590);
				match(SCAN);
				setState(591);
				match(LPAREN);
				setState(592);
				match(STRING_LITERAL);
				setState(593);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(597);
						((MulDivContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MUL - 62)) | (1L << (DIV - 62)) | (1L << (MOD - 62)))) != 0)) ) {
							((MulDivContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(598);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(600);
						((AddSubContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(601);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new Compare1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(603);
						((Compare1Context)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((Compare1Context)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(604);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new Compare2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(606);
						((Compare2Context)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((Compare2Context)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(607);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(608);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(609);
						((AndContext)_localctx).bop = match(AND);
						setState(610);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(612);
						((OrContext)_localctx).bop = match(OR);
						setState(613);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(615);
						((AssignmentContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (T__7 - 6)) | (1L << (T__8 - 6)) | (1L << (T__9 - 6)) | (1L << (T__10 - 6)) | (1L << (T__11 - 6)) | (1L << (ASSIGN - 6)) | (1L << (ADD_ASSIGN - 6)) | (1L << (SUB_ASSIGN - 6)) | (1L << (MUL_ASSIGN - 6)) | (1L << (DIV_ASSIGN - 6)))) != 0)) ) {
							((AssignmentContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(616);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public IdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LitContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParEpsContext extends PrimaryContext {
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public ParEpsContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterParEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitParEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitParEps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primary);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParEpsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(LPAREN);
				setState(623);
				expression(0);
				setState(624);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case CHAR_LITERAL:
				_localctx = new LitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(EzBrewParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(EzBrewParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(EzBrewParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(EzBrewParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(LBRACK);
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(631);
				match(RBRACK);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(632);
					match(LBRACK);
					setState(633);
					match(RBRACK);
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(639);
				arrayInitializer();
				}
				break;
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case CHAR_LITERAL:
				{
				setState(640);
				expression(0);
				setState(641);
				match(RBRACK);
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642);
						match(LBRACK);
						setState(643);
						expression(0);
						setState(644);
						match(RBRACK);
						}
						} 
					}
					setState(650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(651);
					match(LBRACK);
					setState(652);
					match(RBRACK);
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(EzBrewParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(EzBrewParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(EzBrewParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(EzBrewParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(660);
				annotation();
				}
			}

			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(663);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				{
				setState(664);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(667);
				match(LBRACK);
				setState(668);
				match(RBRACK);
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(EzBrewParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(EzBrewParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(EzBrewParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EzBrewParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(EzBrewParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(EzBrewParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(EzBrewParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(EzBrewParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EzBrewParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzBrewParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(LT);
			setState(677);
			typeArgument();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(678);
				match(COMMA);
				setState(679);
				typeArgument();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EzBrewParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_superSuffix);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(DOT);
				setState(689);
				match(IDENTIFIER);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(690);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(EzBrewParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_explicitGenericInvocationSuffix);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(SUPER);
				setState(696);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(IDENTIFIER);
				setState(698);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EzBrewParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LPAREN);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SCAN - 31)) | (1L << (DECIMAL_LITERAL - 31)) | (1L << (FLOAT_LITERAL - 31)) | (1L << (BOOL_LITERAL - 31)) | (1L << (STRING_LITERAL - 31)) | (1L << (NULL_LITERAL - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENTIFIER - 31)) | (1L << (CHAR_LITERAL - 31)))) != 0)) {
				{
				setState(702);
				expressionList();
				}
			}

			setState(705);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u02c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\u0085\n\6\3\6\3\6"+
		"\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\5\6\u008f\n\6\3\7\3\7\5\7\u0093"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\3\b\5\b"+
		"\u00a1\n\b\3\b\3\b\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\5\n\u00ab\n\n\3\13\3"+
		"\13\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00b9\n\f"+
		"\f\f\16\f\u00bc\13\f\3\f\3\f\3\r\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6"+
		"\13\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u00d0\n\17\f\17\16\17"+
		"\u00d3\13\17\3\20\3\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\21\7\21\u00dd"+
		"\n\21\f\21\16\21\u00e0\13\21\3\22\3\22\5\22\u00e4\n\22\3\23\3\23\3\23"+
		"\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23\3\23\5\23\u00f0\n\23\5\23"+
		"\u00f2\n\23\3\23\3\23\3\24\3\24\5\24\u00f8\n\24\3\24\3\24\3\24\5\24\u00fd"+
		"\n\24\7\24\u00ff\n\24\f\24\16\24\u0102\13\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0108\n\25\5\25\u010a\n\25\3\26\3\26\3\26\7\26\u010f\n\26\f\26\16\26"+
		"\u0112\13\26\3\27\3\27\5\27\u0116\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u011d"+
		"\n\30\f\30\16\30\u0120\13\30\3\30\3\30\5\30\u0124\n\30\3\30\5\30\u0127"+
		"\n\30\3\31\7\31\u012a\n\31\f\31\16\31\u012d\13\31\3\31\3\31\3\31\3\32"+
		"\7\32\u0133\n\32\f\32\16\32\u0136\13\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\7\33\u013f\n\33\f\33\16\33\u0142\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u014a\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0155\n\37\3\37\5\37\u0158\n\37\3 \3 \3 \7 \u015d\n \f \16 \u0160\13"+
		" \3!\3!\3!\3!\3\"\3\"\5\"\u0168\n\"\3#\3#\3#\3#\7#\u016e\n#\f#\16#\u0171"+
		"\13#\5#\u0173\n#\3#\5#\u0176\n#\3#\3#\3$\3$\7$\u017c\n$\f$\16$\u017f\13"+
		"$\3$\3$\3%\3%\3%\3%\5%\u0187\n%\3&\7&\u018a\n&\f&\16&\u018d\13&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0198\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01a2\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01b8\n\'\f\'\16\'\u01bb\13\'\3\'\7\'"+
		"\u01be\n\'\f\'\16\'\u01c1\13\'\3\'\3\'\3\'\3\'\5\'\u01c7\n\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01d4\n\'\f\'\16\'\u01d7\13\'\5"+
		"\'\u01d9\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01e1\n\'\f\'\16\'\u01e4\13\'"+
		"\3\'\3\'\5\'\u01e8\n\'\3(\3(\3(\5(\u01ed\n(\3(\3(\3)\3)\3)\7)\u01f4\n"+
		")\f)\16)\u01f7\13)\3*\7*\u01fa\n*\f*\16*\u01fd\13*\3*\3*\3*\3*\3*\3+\6"+
		"+\u0205\n+\r+\16+\u0206\3+\6+\u020a\n+\r+\16+\u020b\3,\3,\3,\5,\u0211"+
		"\n,\3,\3,\3,\5,\u0216\n,\3-\3-\3-\5-\u021b\n-\3-\3-\5-\u021f\n-\3.\7."+
		"\u0222\n.\f.\16.\u0225\13.\3.\3.\3.\3.\3.\3.\5.\u022d\n.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\7\60\u0236\n\60\f\60\16\60\u0239\13\60\3\61\3\61\3\61\5"+
		"\61\u023e\n\61\3\61\3\61\3\61\3\61\5\61\u0244\n\61\3\61\3\61\3\61\3\61"+
		"\5\61\u024a\n\61\3\61\5\61\u024d\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5"+
		"\62\u0255\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u026c\n\62\f\62"+
		"\16\62\u026f\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0277\n\63\3\64"+
		"\3\64\3\64\3\64\7\64\u027d\n\64\f\64\16\64\u0280\13\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u0289\n\64\f\64\16\64\u028c\13\64\3\64\3\64"+
		"\7\64\u0290\n\64\f\64\16\64\u0293\13\64\5\64\u0295\n\64\3\65\5\65\u0298"+
		"\n\65\3\65\3\65\5\65\u029c\n\65\3\65\3\65\7\65\u02a0\n\65\f\65\16\65\u02a3"+
		"\13\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u02ab\n\67\f\67\16\67\u02ae"+
		"\13\67\3\67\3\67\38\38\38\38\58\u02b6\n8\58\u02b8\n8\39\39\39\39\59\u02be"+
		"\n9\3:\3:\5:\u02c2\n:\3:\3:\3:\2\3b;\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\t\3\2PQ\4"+
		"\2\66\6699\3\2@B\3\2>?\4\2\63\64\678\5\2\b\16\62\62CF\b\2\20\20\23\23"+
		"\26\26\30\30\33\33##\2\u02f6\2w\3\2\2\2\4|\3\2\2\2\6~\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u008e\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u00a6\3\2"+
		"\2\2\22\u00aa\3\2\2\2\24\u00ac\3\2\2\2\26\u00b4\3\2\2\2\30\u00bf\3\2\2"+
		"\2\32\u00ca\3\2\2\2\34\u00cc\3\2\2\2\36\u00d4\3\2\2\2 \u00d9\3\2\2\2\""+
		"\u00e3\3\2\2\2$\u00e5\3\2\2\2&\u00f5\3\2\2\2(\u0109\3\2\2\2*\u010b\3\2"+
		"\2\2,\u0113\3\2\2\2.\u0126\3\2\2\2\60\u012b\3\2\2\2\62\u0134\3\2\2\2\64"+
		"\u013b\3\2\2\2\66\u0149\3\2\2\28\u014b\3\2\2\2:\u014d\3\2\2\2<\u014f\3"+
		"\2\2\2>\u0159\3\2\2\2@\u0161\3\2\2\2B\u0167\3\2\2\2D\u0169\3\2\2\2F\u0179"+
		"\3\2\2\2H\u0186\3\2\2\2J\u018b\3\2\2\2L\u01e7\3\2\2\2N\u01e9\3\2\2\2P"+
		"\u01f0\3\2\2\2R\u01fb\3\2\2\2T\u0204\3\2\2\2V\u0215\3\2\2\2X\u0217\3\2"+
		"\2\2Z\u022c\3\2\2\2\\\u022e\3\2\2\2^\u0232\3\2\2\2`\u024c\3\2\2\2b\u0254"+
		"\3\2\2\2d\u0276\3\2\2\2f\u0278\3\2\2\2h\u0297\3\2\2\2j\u02a4\3\2\2\2l"+
		"\u02a6\3\2\2\2n\u02b7\3\2\2\2p\u02bd\3\2\2\2r\u02bf\3\2\2\2tv\5\n\6\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\2\2\3"+
		"{\3\3\2\2\2|}\5\6\4\2}\5\3\2\2\2~\177\7L\2\2\177\7\3\2\2\2\u0080\u0081"+
		"\7M\2\2\u0081\t\3\2\2\2\u0082\u008f\7/\2\2\u0083\u0085\7N\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\5F$\2\u0087"+
		"\u0089\5\4\3\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\5\f\7\2\u008e\u0082\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u008a\3\2"+
		"\2\2\u008f\13\3\2\2\2\u0090\u0093\5\16\b\2\u0091\u0093\5\24\13\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\r\3\2\2\2\u0094\u0095\5\22\n"+
		"\2\u0095\u0096\7J\2\2\u0096\u009b\5,\27\2\u0097\u0098\7-\2\2\u0098\u009a"+
		"\7.\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7O"+
		"\2\2\u009f\u00a1\5*\26\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\5\20\t\2\u00a3\17\3\2\2\2\u00a4\u00a7\5F$\2"+
		"\u00a5\u00a7\7/\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\21\3"+
		"\2\2\2\u00a8\u00ab\5h\65\2\u00a9\u00ab\7\37\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\7J\2\2\u00ad\u00b0\5,\27\2"+
		"\u00ae\u00af\7O\2\2\u00af\u00b1\5*\26\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5F$\2\u00b3\25\3\2\2\2\u00b4"+
		"\u00b5\5h\65\2\u00b5\u00ba\5\30\r\2\u00b6\u00b7\7\60\2\2\u00b7\u00b9\5"+
		"\30\r\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7/"+
		"\2\2\u00be\27\3\2\2\2\u00bf\u00c4\7J\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c3"+
		"\7.\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\62"+
		"\2\2\u00c8\u00c9\5\"\22\2\u00c9\31\3\2\2\2\u00ca\u00cb\7L\2\2\u00cb\33"+
		"\3\2\2\2\u00cc\u00d1\5\36\20\2\u00cd\u00ce\7\60\2\2\u00ce\u00d0\5\36\20"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\5 \21\2\u00d5"+
		"\u00d6\7\62\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\37\3\2\2\2\u00d9\u00de\7J\2\2\u00da\u00db\7-\2\2\u00db\u00dd"+
		"\7.\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\5$\23\2"+
		"\u00e2\u00e4\5b\62\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4#\3"+
		"\2\2\2\u00e5\u00f1\7+\2\2\u00e6\u00eb\5\"\22\2\u00e7\u00e8\7\60\2\2\u00e8"+
		"\u00ea\5\"\22\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\60\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7,\2\2\u00f4%\3\2\2\2\u00f5\u00f7\7J\2\2\u00f6\u00f8\5l\67\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\7\61"+
		"\2\2\u00fa\u00fc\7J\2\2\u00fb\u00fd\5l\67\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\'\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u010a\5h\65\2\u0104\u0107\7\3\2\2\u0105\u0106\t\2\2\2\u0106"+
		"\u0108\5h\65\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2\2\2\u010a)\3\2\2\2\u010b\u0110"+
		"\5\64\33\2\u010c\u010d\7\60\2\2\u010d\u010f\5\64\33\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"+\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7)\2\2\u0114\u0116\5.\30\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7*"+
		"\2\2\u0118-\3\2\2\2\u0119\u011e\5\60\31\2\u011a\u011b\7\60\2\2\u011b\u011d"+
		"\5\60\31\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\7\60\2\2\u0122\u0124\5\62\32\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2"+
		"\2\u0124\u0127\3\2\2\2\u0125\u0127\5\62\32\2\u0126\u0119\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127/\3\2\2\2\u0128\u012a\5\b\5\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5h\65\2\u012f\u0130\5 \21\2\u0130"+
		"\61\3\2\2\2\u0131\u0133\5\b\5\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2"+
		"\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0138\5h\65\2\u0138\u0139\7\4\2\2\u0139\u013a\5 \21\2\u013a"+
		"\63\3\2\2\2\u013b\u0140\7J\2\2\u013c\u013d\7\61\2\2\u013d\u013f\7J\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\65\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u014a\58\35\2\u0144"+
		"\u014a\5:\36\2\u0145\u014a\7R\2\2\u0146\u014a\7\'\2\2\u0147\u014a\7&\2"+
		"\2\u0148\u014a\7(\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145"+
		"\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\67\3\2\2\2\u014b\u014c\7$\2\2\u014c9\3\2\2\2\u014d\u014e\7%\2\2\u014e"+
		";\3\2\2\2\u014f\u0150\7\5\2\2\u0150\u0157\5\64\33\2\u0151\u0154\7)\2\2"+
		"\u0152\u0155\5> \2\u0153\u0155\5B\"\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\7*\2\2\u0157"+
		"\u0151\3\2\2\2\u0157\u0158\3\2\2\2\u0158=\3\2\2\2\u0159\u015e\5@!\2\u015a"+
		"\u015b\7\60\2\2\u015b\u015d\5@!\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f?\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0162\7J\2\2\u0162\u0163\7\62\2\2\u0163\u0164\5B\"\2\u0164"+
		"A\3\2\2\2\u0165\u0168\5b\62\2\u0166\u0168\5D#\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168C\3\2\2\2\u0169\u0172\7+\2\2\u016a\u016f\5B\"\2\u016b"+
		"\u016c\7\60\2\2\u016c\u016e\5B\"\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0176\7\60\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\7,\2\2\u0178E\3\2\2\2\u0179\u017d\7+\2\2\u017a"+
		"\u017c\5H%\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181"+
		"\7,\2\2\u0181G\3\2\2\2\u0182\u0183\5J&\2\u0183\u0184\7/\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0187\5L\'\2\u0186\u0182\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"I\3\2\2\2\u0188\u018a\5\b\5\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e\u018f\5h\65\2\u018f\u0190\5\34\17\2\u0190K\3\2\2\2\u0191"+
		"\u01e8\5F$\2\u0192\u0193\7\32\2\2\u0193\u0194\5\\/\2\u0194\u0197\5L\'"+
		"\2\u0195\u0196\7\27\2\2\u0196\u0198\5L\'\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u01e8\3\2\2\2\u0199\u019a\7\32\2\2\u019a\u019b\7)\2\2\u019b"+
		"\u019c\5b\62\2\u019c\u019d\t\3\2\2\u019d\u019e\5b\62\2\u019e\u01a1\7*"+
		"\2\2\u019f\u01a0\7\27\2\2\u01a0\u01a2\5L\'\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01e8\3\2\2\2\u01a3\u01a4\7\31\2\2\u01a4\u01a5\7"+
		")\2\2\u01a5\u01a6\5X-\2\u01a6\u01a7\7*\2\2\u01a7\u01a8\5L\'\2\u01a8\u01e8"+
		"\3\2\2\2\u01a9\u01aa\7 \2\2\u01aa\u01ab\5\\/\2\u01ab\u01ac\5L\'\2\u01ac"+
		"\u01e8\3\2\2\2\u01ad\u01ae\7\25\2\2\u01ae\u01af\5L\'\2\u01af\u01b0\7 "+
		"\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2\7/\2\2\u01b2\u01e8\3\2\2\2\u01b3\u01b4"+
		"\7\35\2\2\u01b4\u01b5\5\\/\2\u01b5\u01b9\7+\2\2\u01b6\u01b8\5T+\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bf\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\5V,\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7,\2\2\u01c3\u01e8\3\2"+
		"\2\2\u01c4\u01c6\7\34\2\2\u01c5\u01c7\5b\62\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01e8\7/\2\2\u01c9\u01ca\5b\62"+
		"\2\u01ca\u01cb\7/\2\2\u01cb\u01e8\3\2\2\2\u01cc\u01cd\7J\2\2\u01cd\u01ce"+
		"\7\62\2\2\u01ce\u01cf\7!\2\2\u01cf\u01d8\7)\2\2\u01d0\u01d5\7\'\2\2\u01d1"+
		"\u01d2\7>\2\2\u01d2\u01d4\7J\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2"+
		"\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01e8\7*\2\2\u01db\u01dc\7\"\2\2\u01dc\u01dd\7)\2\2\u01dd\u01e2\5d\63"+
		"\2\u01de\u01df\7>\2\2\u01df\u01e1\5d\63\2\u01e0\u01de\3\2\2\2\u01e1\u01e4"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e6\7\6\2\2\u01e6\u01e8\3\2\2\2\u01e7\u0191\3\2"+
		"\2\2\u01e7\u0192\3\2\2\2\u01e7\u0199\3\2\2\2\u01e7\u01a3\3\2\2\2\u01e7"+
		"\u01a9\3\2\2\2\u01e7\u01ad\3\2\2\2\u01e7\u01b3\3\2\2\2\u01e7\u01c4\3\2"+
		"\2\2\u01e7\u01c9\3\2\2\2\u01e7\u01cc\3\2\2\2\u01e7\u01db\3\2\2\2\u01e8"+
		"M\3\2\2\2\u01e9\u01ea\7)\2\2\u01ea\u01ec\5P)\2\u01eb\u01ed\7/\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7*"+
		"\2\2\u01efO\3\2\2\2\u01f0\u01f5\5R*\2\u01f1\u01f2\7/\2\2\u01f2\u01f4\5"+
		"R*\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6Q\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\5\b\5\2"+
		"\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5&\24\2\u01ff"+
		"\u0200\5 \21\2\u0200\u0201\7\62\2\2\u0201\u0202\5b\62\2\u0202S\3\2\2\2"+
		"\u0203\u0205\5V,\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\5H%\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020cU\3\2\2\2\u020d\u0210\7\22\2\2\u020e\u0211\5b\62\2\u020f\u0211"+
		"\7J\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0216\7\7\2\2\u0213\u0214\7S\2\2\u0214\u0216\7\7\2\2\u0215\u020d\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216W\3\2\2\2\u0217\u0218\5Z.\2\u0218\u021a"+
		"\7/\2\2\u0219\u021b\5b\62\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\7/\2\2\u021d\u021f\5^\60\2\u021e\u021d\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021fY\3\2\2\2\u0220\u0222\5\b\5\2\u0221\u0220"+
		"\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\5h\65\2\u0227\u0228\5 "+
		"\21\2\u0228\u0229\7\62\2\2\u0229\u022a\5\"\22\2\u022a\u022d\3\2\2\2\u022b"+
		"\u022d\5^\60\2\u022c\u0223\3\2\2\2\u022c\u022b\3\2\2\2\u022d[\3\2\2\2"+
		"\u022e\u022f\7)\2\2\u022f\u0230\5b\62\2\u0230\u0231\7*\2\2\u0231]\3\2"+
		"\2\2\u0232\u0237\5b\62\2\u0233\u0234\7\60\2\2\u0234\u0236\5b\62\2\u0235"+
		"\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238_\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7J\2\2\u023b\u023d"+
		"\7)\2\2\u023c\u023e\5^\60\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u024d\7*\2\2\u0240\u0241\7\36\2\2\u0241\u0243\7)"+
		"\2\2\u0242\u0244\5^\60\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u024d\7*\2\2\u0246\u0247\7Q\2\2\u0247\u0249\7)\2"+
		"\2\u0248\u024a\5^\60\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024d\7*\2\2\u024c\u023a\3\2\2\2\u024c\u0240\3\2\2\2\u024c"+
		"\u0246\3\2\2\2\u024da\3\2\2\2\u024e\u024f\b\62\1\2\u024f\u0255\5d\63\2"+
		"\u0250\u0251\7!\2\2\u0251\u0252\7)\2\2\u0252\u0253\7\'\2\2\u0253\u0255"+
		"\7*\2\2\u0254\u024e\3\2\2\2\u0254\u0250\3\2\2\2\u0255\u026d\3\2\2\2\u0256"+
		"\u0257\f\n\2\2\u0257\u0258\t\4\2\2\u0258\u026c\5b\62\13\u0259\u025a\f"+
		"\t\2\2\u025a\u025b\t\5\2\2\u025b\u026c\5b\62\n\u025c\u025d\f\b\2\2\u025d"+
		"\u025e\t\6\2\2\u025e\u026c\5b\62\t\u025f\u0260\f\7\2\2\u0260\u0261\t\3"+
		"\2\2\u0261\u026c\5b\62\b\u0262\u0263\f\6\2\2\u0263\u0264\7:\2\2\u0264"+
		"\u026c\5b\62\7\u0265\u0266\f\5\2\2\u0266\u0267\7;\2\2\u0267\u026c\5b\62"+
		"\6\u0268\u0269\f\4\2\2\u0269\u026a\t\7\2\2\u026a\u026c\5b\62\4\u026b\u0256"+
		"\3\2\2\2\u026b\u0259\3\2\2\2\u026b\u025c\3\2\2\2\u026b\u025f\3\2\2\2\u026b"+
		"\u0262\3\2\2\2\u026b\u0265\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026f\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026ec\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0271\7)\2\2\u0271\u0272\5b\62\2\u0272\u0273\7*\2\2\u0273"+
		"\u0277\3\2\2\2\u0274\u0277\5\66\34\2\u0275\u0277\7J\2\2\u0276\u0270\3"+
		"\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277e\3\2\2\2\u0278\u0294"+
		"\7-\2\2\u0279\u027e\7.\2\2\u027a\u027b\7-\2\2\u027b\u027d\7.\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0295\5$\23\2\u0282"+
		"\u0283\5b\62\2\u0283\u028a\7.\2\2\u0284\u0285\7-\2\2\u0285\u0286\5b\62"+
		"\2\u0286\u0287\7.\2\2\u0287\u0289\3\2\2\2\u0288\u0284\3\2\2\2\u0289\u028c"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0291\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u028e\7-\2\2\u028e\u0290\7.\2\2\u028f\u028d\3\2\2"+
		"\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0279\3\2\2\2\u0294\u0282\3\2\2\2\u0295"+
		"g\3\2\2\2\u0296\u0298\5<\37\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2"+
		"\u0298\u029b\3\2\2\2\u0299\u029c\5&\24\2\u029a\u029c\5j\66\2\u029b\u0299"+
		"\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u02a1\3\2\2\2\u029d\u029e\7-\2\2\u029e"+
		"\u02a0\7.\2\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2i\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5"+
		"\t\b\2\2\u02a5k\3\2\2\2\u02a6\u02a7\7\64\2\2\u02a7\u02ac\5(\25\2\u02a8"+
		"\u02a9\7\60\2\2\u02a9\u02ab\5(\25\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae\3"+
		"\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\7\63\2\2\u02b0m\3\2\2\2\u02b1\u02b8\5r:\2\u02b2"+
		"\u02b3\7\61\2\2\u02b3\u02b5\7J\2\2\u02b4\u02b6\5r:\2\u02b5\u02b4\3\2\2"+
		"\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b7\u02b2"+
		"\3\2\2\2\u02b8o\3\2\2\2\u02b9\u02ba\7Q\2\2\u02ba\u02be\5n8\2\u02bb\u02bc"+
		"\7J\2\2\u02bc\u02be\5r:\2\u02bd\u02b9\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be"+
		"q\3\2\2\2\u02bf\u02c1\7)\2\2\u02c0\u02c2\5^\60\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7*\2\2\u02c4s\3\2\2\2V"+
		"w\u0084\u008a\u008e\u0092\u009b\u00a0\u00a6\u00aa\u00b0\u00ba\u00c4\u00d1"+
		"\u00d7\u00de\u00e3\u00eb\u00ef\u00f1\u00f7\u00fc\u0100\u0107\u0109\u0110"+
		"\u0115\u011e\u0123\u0126\u012b\u0134\u0140\u0149\u0154\u0157\u015e\u0167"+
		"\u016f\u0172\u0175\u017d\u0186\u018b\u0197\u01a1\u01b9\u01bf\u01c6\u01d5"+
		"\u01d8\u01e2\u01e7\u01ec\u01f5\u01fb\u0206\u020b\u0210\u0215\u021a\u021e"+
		"\u0223\u022c\u0237\u023d\u0243\u0249\u024c\u0254\u026b\u026d\u0276\u027e"+
		"\u028a\u0291\u0294\u0297\u029b\u02a1\u02ac\u02b5\u02b7\u02bd\u02c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}