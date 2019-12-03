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
		INT=25, NEW=26, RETURN=27, SWITCH=28, THIS=29, VOID=30, WHILE=31, SCAN=32, 
		PRINT=33, STRING=34, DECIMAL_LITERAL=35, FLOAT_LITERAL=36, BOOL_LITERAL=37, 
		STRING_LITERAL=38, NULL_LITERAL=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, 
		LBRACK=44, RBRACK=45, SEMI=46, COMMA=47, DOT=48, ASSIGN=49, GT=50, LT=51, 
		BANG=52, EQUAL=53, LE=54, GE=55, NOTEQUAL=56, AND=57, OR=58, INC=59, DEC=60, 
		ADD=61, SUB=62, MUL=63, DIV=64, MOD=65, ADD_ASSIGN=66, SUB_ASSIGN=67, 
		MUL_ASSIGN=68, DIV_ASSIGN=69, WS=70, COMMENT=71, LINE_COMMENT=72, IDENTIFIER=73, 
		ERROR=74, PUBLIC=75, STATIC=76, THROWS=77, EXTENDS=78, SUPER=79, CHAR_LITERAL=80, 
		DEFAULT=81;
	public static final int
		RULE_start = 0, RULE_modifier = 1, RULE_classOrInterfaceModifier = 2, 
		RULE_classBodyDeclaration = 3, RULE_memberDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_methodBody = 6, RULE_typeTypeOrVoid = 7, RULE_constructorDeclaration = 8, 
		RULE_constDeclaration = 9, RULE_constantDeclarator = 10, RULE_interfaceMethodModifier = 11, 
		RULE_variableDeclarators = 12, RULE_variableDeclarator = 13, RULE_variableDeclaratorId = 14, 
		RULE_variableInitializer = 15, RULE_arrayInitializer = 16, RULE_classOrInterfaceType = 17, 
		RULE_typeArgument = 18, RULE_qualifiedNameList = 19, RULE_formalParameters = 20, 
		RULE_formalParameterList = 21, RULE_formalParameter = 22, RULE_lastFormalParameter = 23, 
		RULE_qualifiedName = 24, RULE_literal = 25, RULE_integerLiteral = 26, 
		RULE_floatLiteral = 27, RULE_annotation = 28, RULE_elementValuePairs = 29, 
		RULE_elementValuePair = 30, RULE_elementValue = 31, RULE_elementValueArrayInitializer = 32, 
		RULE_block = 33, RULE_blockStatement = 34, RULE_localVariableDeclaration = 35, 
		RULE_elseStatement = 36, RULE_statement = 37, RULE_resourceSpecification = 38, 
		RULE_resources = 39, RULE_resource = 40, RULE_switchBlockStatementGroup = 41, 
		RULE_switchLabel = 42, RULE_forControl = 43, RULE_forInit = 44, RULE_parExpression = 45, 
		RULE_expressionList = 46, RULE_methodCall = 47, RULE_expression = 48, 
		RULE_primary = 49, RULE_creator = 50, RULE_createdName = 51, RULE_arrayCreatorRest = 52, 
		RULE_typeType = 53, RULE_primitiveType = 54, RULE_typeArguments = 55, 
		RULE_superSuffix = 56, RULE_explicitGenericInvocationSuffix = 57, RULE_arguments = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "modifier", "classOrInterfaceModifier", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"constructorDeclaration", "constDeclaration", "constantDeclarator", "interfaceMethodModifier", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "annotation", "elementValuePairs", "elementValuePair", 
			"elementValue", "elementValueArrayInitializer", "block", "blockStatement", 
			"localVariableDeclaration", "elseStatement", "statement", "resourceSpecification", 
			"resources", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "parExpression", "expressionList", "methodCall", 
			"expression", "primary", "creator", "createdName", "arrayCreatorRest", 
			"typeType", "primitiveType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
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
			"IDENTIFIER", "ERROR", "PUBLIC", "STATIC", "THROWS", "EXTENDS", "SUPER", 
			"CHAR_LITERAL", "DEFAULT"
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << STRING) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (IDENTIFIER - 73)) | (1L << (PUBLIC - 73)) | (1L << (STATIC - 73)))) != 0)) {
				{
				{
				setState(118);
				classBodyDeclaration();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(126);
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
			setState(128);
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
		enterRule(_localctx, 6, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(SEMI);
				}
				break;
			case LBRACE:
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(131);
					match(STATIC);
					}
				}

				setState(134);
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
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUBLIC) {
					{
					{
					setState(135);
					modifier();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
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
		enterRule(_localctx, 8, RULE_memberDeclaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			typeTypeOrVoid();
			setState(149);
			match(IDENTIFIER);
			setState(150);
			formalParameters();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(151);
				match(LBRACK);
				setState(152);
				match(RBRACK);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(158);
				match(THROWS);
				setState(159);
				qualifiedNameList();
				}
			}

			setState(162);
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
		enterRule(_localctx, 12, RULE_methodBody);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
		enterRule(_localctx, 14, RULE_typeTypeOrVoid);
		try {
			setState(170);
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
				setState(168);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
		enterRule(_localctx, 16, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IDENTIFIER);
			setState(173);
			formalParameters();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(174);
				match(THROWS);
				setState(175);
				qualifiedNameList();
				}
			}

			setState(178);
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
		enterRule(_localctx, 18, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			typeType();
			setState(181);
			constantDeclarator();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				constantDeclarator();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
		enterRule(_localctx, 20, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENTIFIER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(192);
				match(LBRACK);
				setState(193);
				match(RBRACK);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(ASSIGN);
			setState(200);
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
		enterRule(_localctx, 22, RULE_interfaceMethodModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 24, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			variableDeclarator();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				variableDeclarator();
				}
				}
				setState(211);
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
		enterRule(_localctx, 26, RULE_variableDeclarator);
		int _la;
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			variableDeclaratorId();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(213);
				match(ASSIGN);
				setState(214);
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
		enterRule(_localctx, 28, RULE_variableDeclaratorId);
		int _la;
		try {
			_localctx = new VarDeclaratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(218);
				match(LBRACK);
				setState(219);
				match(RBRACK);
				}
				}
				setState(224);
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
		enterRule(_localctx, 30, RULE_variableInitializer);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new ArrInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				arrayInitializer();
				}
				break;
			case NEW:
			case THIS:
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case SUPER:
			case CHAR_LITERAL:
				_localctx = new ExprInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
		enterRule(_localctx, 32, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(LBRACE);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (LBRACE - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
				{
				setState(230);
				variableInitializer();
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						match(COMMA);
						setState(232);
						variableInitializer();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(238);
					match(COMMA);
					}
				}

				}
			}

			setState(243);
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
		enterRule(_localctx, 34, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(IDENTIFIER);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(246);
				typeArguments();
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(249);
				match(DOT);
				setState(250);
				match(IDENTIFIER);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(251);
					typeArguments();
					}
				}

				}
				}
				setState(258);
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
		enterRule(_localctx, 36, RULE_typeArgument);
		int _la;
		try {
			setState(265);
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
				setState(259);
				typeType();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(261);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(262);
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
		enterRule(_localctx, 38, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			qualifiedName();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268);
				match(COMMA);
				setState(269);
				qualifiedName();
				}
				}
				setState(274);
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
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0) || _la==IDENTIFIER) {
				{
				setState(276);
				formalParameterList();
				}
			}

			setState(279);
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
		enterRule(_localctx, 42, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				formalParameter();
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						match(COMMA);
						setState(283);
						formalParameter();
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(289);
					match(COMMA);
					setState(290);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
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
		enterRule(_localctx, 44, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			typeType();
			setState(297);
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
		enterRule(_localctx, 46, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			typeType();
			setState(300);
			match(T__1);
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
		enterRule(_localctx, 48, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENTIFIER);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(304);
				match(DOT);
				setState(305);
				match(IDENTIFIER);
				}
				}
				setState(310);
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
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
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
		enterRule(_localctx, 52, RULE_integerLiteral);
		try {
			_localctx = new IntLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 54, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__2);
			setState(324);
			qualifiedName();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(325);
				match(LPAREN);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(326);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(327);
					elementValue();
					}
					break;
				}
				setState(330);
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
		enterRule(_localctx, 58, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			elementValuePair();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				elementValuePair();
				}
				}
				setState(340);
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
		enterRule(_localctx, 60, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IDENTIFIER);
			setState(342);
			match(ASSIGN);
			setState(343);
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
		enterRule(_localctx, 62, RULE_elementValue);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case THIS:
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case SUPER:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
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
		enterRule(_localctx, 64, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (LBRACE - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
				{
				setState(350);
				elementValue();
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(COMMA);
						setState(352);
						elementValue();
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(360);
				match(COMMA);
				}
			}

			setState(363);
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
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LBRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (IDENTIFIER - 73)) | (1L << (SUPER - 73)) | (1L << (CHAR_LITERAL - 73)))) != 0)) {
				{
				{
				setState(366);
				blockStatement();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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
		enterRule(_localctx, 68, RULE_blockStatement);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				localVariableDeclaration();
				setState(375);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
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
		enterRule(_localctx, 70, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			typeType();
			setState(381);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	 
		public ElseStatementContext() { }
		public void copyFrom(ElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStmtContext extends ElseStatementContext {
		public TerminalNode ELSE() { return getToken(EzBrewParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStmtContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseStatement);
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ELSE);
			setState(384);
			statement();
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
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				((BlockStmtContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(IF);
				setState(388);
				parExpression();
				setState(389);
				statement();
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(390);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new IfStmt2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(IF);
				setState(394);
				match(LPAREN);
				setState(395);
				expression(0);
				setState(396);
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
				setState(397);
				expression(0);
				setState(398);
				match(RPAREN);
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(399);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(FOR);
				setState(403);
				match(LPAREN);
				setState(404);
				forControl();
				setState(405);
				match(RPAREN);
				setState(406);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				match(WHILE);
				setState(409);
				parExpression();
				setState(410);
				statement();
				}
				break;
			case 6:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(DO);
				setState(413);
				statement();
				setState(414);
				match(WHILE);
				setState(415);
				parExpression();
				setState(416);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				match(SWITCH);
				setState(419);
				parExpression();
				setState(420);
				match(LBRACE);
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(427);
					switchLabel();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(435);
				match(RETURN);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
					{
					setState(436);
					expression(0);
					}
				}

				setState(439);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
				((ExprStmtContext)_localctx).statementExpression = expression(0);
				setState(441);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(443);
				match(PRINT);
				setState(444);
				match(LPAREN);
				setState(445);
				primary();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(446);
					match(ADD);
					setState(447);
					primary();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
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
			setState(457);
			match(LPAREN);
			setState(458);
			resources();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(459);
				match(SEMI);
				}
			}

			setState(462);
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
			setState(464);
			resource();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					match(SEMI);
					setState(466);
					resource();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			classOrInterfaceType();
			setState(473);
			variableDeclaratorId();
			setState(474);
			match(ASSIGN);
			setState(475);
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
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				switchLabel();
				}
				}
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(483); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(482);
				blockStatement();
				}
				}
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (IDENTIFIER - 73)) | (1L << (SUPER - 73)) | (1L << (CHAR_LITERAL - 73)))) != 0) );
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
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(CASE);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(488);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(489);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(492);
				match(T__4);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(DEFAULT);
				setState(494);
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
			setState(497);
			forInit();
			setState(498);
			match(SEMI);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
				{
				setState(499);
				expression(0);
				}
			}

			setState(502);
			match(SEMI);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
				{
				setState(503);
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
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				typeType();
				setState(507);
				variableDeclaratorId();
				setState(508);
				match(ASSIGN);
				setState(509);
				variableInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
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
			setState(514);
			match(LPAREN);
			setState(515);
			expression(0);
			setState(516);
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
			setState(518);
			expression(0);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				expression(0);
				}
				}
				setState(525);
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
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(IDENTIFIER);
				setState(527);
				match(LPAREN);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
					{
					setState(528);
					expressionList();
					}
				}

				setState(531);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(THIS);
				setState(533);
				match(LPAREN);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
					{
					setState(534);
					expressionList();
					}
				}

				setState(537);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(SUPER);
				setState(539);
				match(LPAREN);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
					{
					setState(540);
					expressionList();
					}
				}

				setState(543);
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
	public static class MthdCallContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MthdCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterMthdCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitMthdCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitMthdCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecContext extends ExpressionContext {
		public Token postfix;
		public TerminalNode IDENTIFIER() { return getToken(EzBrewParser.IDENTIFIER, 0); }
		public TerminalNode INC() { return getToken(EzBrewParser.INC, 0); }
		public TerminalNode DEC() { return getToken(EzBrewParser.DEC, 0); }
		public IncDecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitIncDec(this);
			else return visitor.visitChildren(this);
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
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EzBrewParser.RPAREN, 0); }
		public List<TerminalNode> ADD() { return getTokens(EzBrewParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(EzBrewParser.ADD, i);
		}
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
	public static class ArrayAccessContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(EzBrewParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(EzBrewParser.RBRACK, 0); }
		public ArrayAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitArrayAccess(this);
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
	public static class NewCreatorContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(EzBrewParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewCreatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterNewCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitNewCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitNewCreator(this);
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
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				_localctx = new PriContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(547);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new MthdCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new NewCreatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(549);
				match(NEW);
				setState(550);
				creator();
				}
				break;
			case 4:
				{
				_localctx = new IncDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(551);
				match(IDENTIFIER);
				setState(552);
				((IncDecContext)_localctx).postfix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncDecContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				match(SCAN);
				setState(554);
				match(LPAREN);
				setState(555);
				primary();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(556);
					match(ADD);
					setState(557);
					primary();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(593);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(567);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(568);
						((MulDivContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (MUL - 63)) | (1L << (DIV - 63)) | (1L << (MOD - 63)))) != 0)) ) {
							((MulDivContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(569);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(571);
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
						setState(572);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new Compare1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(574);
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
						setState(575);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new Compare2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(577);
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
						setState(578);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(580);
						((AndContext)_localctx).bop = match(AND);
						setState(581);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(583);
						((OrContext)_localctx).bop = match(OR);
						setState(584);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(586);
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
						setState(587);
						expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ArrayAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(589);
						match(LBRACK);
						setState(590);
						expression(0);
						setState(591);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParEpsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(LPAREN);
				setState(599);
				expression(0);
				setState(600);
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
				setState(602);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			createdName();
			setState(607);
			arrayCreatorRest();
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

	public static class CreatedNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzBrewListener ) ((EzBrewListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EzBrewVisitor ) return ((EzBrewVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_createdName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			primitiveType();
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
		enterRule(_localctx, 104, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LBRACK);
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(612);
				match(RBRACK);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(613);
					match(LBRACK);
					setState(614);
					match(RBRACK);
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(620);
				arrayInitializer();
				}
				break;
			case NEW:
			case THIS:
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
			case SUPER:
			case CHAR_LITERAL:
				{
				setState(621);
				expression(0);
				setState(622);
				match(RBRACK);
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(623);
						match(LBRACK);
						setState(624);
						expression(0);
						setState(625);
						match(RBRACK);
						}
						} 
					}
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(632);
						match(LBRACK);
						setState(633);
						match(RBRACK);
						}
						} 
					}
					setState(638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		enterRule(_localctx, 106, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(641);
				annotation();
				}
			}

			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(644);
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
				setState(645);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(648);
				match(LBRACK);
				setState(649);
				match(RBRACK);
				}
				}
				setState(654);
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
		enterRule(_localctx, 108, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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
		enterRule(_localctx, 110, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(LT);
			setState(658);
			typeArgument();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(659);
				match(COMMA);
				setState(660);
				typeArgument();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
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
		enterRule(_localctx, 112, RULE_superSuffix);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(DOT);
				setState(670);
				match(IDENTIFIER);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(671);
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
		enterRule(_localctx, 114, RULE_explicitGenericInvocationSuffix);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(SUPER);
				setState(677);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(IDENTIFIER);
				setState(679);
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
		enterRule(_localctx, 116, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(LPAREN);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (NEW - 26)) | (1L << (THIS - 26)) | (1L << (SCAN - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (SUPER - 26)) | (1L << (CHAR_LITERAL - 26)))) != 0)) {
				{
				setState(683);
				expressionList();
				}
			}

			setState(686);
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
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u02b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u0087\n\5\3"+
		"\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\5\5\u0091\n\5\3\6\3\6\5\6"+
		"\u0095\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\7\3"+
		"\7\5\7\u00a3\n\7\3\7\3\7\3\b\3\b\5\b\u00a9\n\b\3\t\3\t\5\t\u00ad\n\t\3"+
		"\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00bb\n"+
		"\13\f\13\16\13\u00be\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16"+
		"\f\u00c8\13\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00d2\n\16\f\16"+
		"\16\16\u00d5\13\16\3\17\3\17\3\17\5\17\u00da\n\17\3\20\3\20\3\20\7\20"+
		"\u00df\n\20\f\20\16\20\u00e2\13\20\3\21\3\21\5\21\u00e6\n\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22\3\22\5\22\u00f2\n\22"+
		"\5\22\u00f4\n\22\3\22\3\22\3\23\3\23\5\23\u00fa\n\23\3\23\3\23\3\23\5"+
		"\23\u00ff\n\23\7\23\u0101\n\23\f\23\16\23\u0104\13\23\3\24\3\24\3\24\3"+
		"\24\5\24\u010a\n\24\5\24\u010c\n\24\3\25\3\25\3\25\7\25\u0111\n\25\f\25"+
		"\16\25\u0114\13\25\3\26\3\26\5\26\u0118\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u011f\n\27\f\27\16\27\u0122\13\27\3\27\3\27\5\27\u0126\n\27\3\27"+
		"\5\27\u0129\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32"+
		"\u0135\n\32\f\32\16\32\u0138\13\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0140\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u014b\n"+
		"\36\3\36\5\36\u014e\n\36\3\37\3\37\3\37\7\37\u0153\n\37\f\37\16\37\u0156"+
		"\13\37\3 \3 \3 \3 \3!\3!\5!\u015e\n!\3\"\3\"\3\"\3\"\7\"\u0164\n\"\f\""+
		"\16\"\u0167\13\"\5\"\u0169\n\"\3\"\5\"\u016c\n\"\3\"\3\"\3#\3#\7#\u0172"+
		"\n#\f#\16#\u0175\13#\3#\3#\3$\3$\3$\3$\5$\u017d\n$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u018a\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0193"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\7\'\u01a9\n\'\f\'\16\'\u01ac\13\'\3\'\7\'\u01af\n\'\f\'"+
		"\16\'\u01b2\13\'\3\'\3\'\3\'\3\'\5\'\u01b8\n\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u01c3\n\'\f\'\16\'\u01c6\13\'\3\'\3\'\5\'\u01ca\n\'\3"+
		"(\3(\3(\5(\u01cf\n(\3(\3(\3)\3)\3)\7)\u01d6\n)\f)\16)\u01d9\13)\3*\3*"+
		"\3*\3*\3*\3+\6+\u01e1\n+\r+\16+\u01e2\3+\6+\u01e6\n+\r+\16+\u01e7\3,\3"+
		",\3,\5,\u01ed\n,\3,\3,\3,\5,\u01f2\n,\3-\3-\3-\5-\u01f7\n-\3-\3-\5-\u01fb"+
		"\n-\3.\3.\3.\3.\3.\3.\5.\u0203\n.\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u020c"+
		"\n\60\f\60\16\60\u020f\13\60\3\61\3\61\3\61\5\61\u0214\n\61\3\61\3\61"+
		"\3\61\3\61\5\61\u021a\n\61\3\61\3\61\3\61\3\61\5\61\u0220\n\61\3\61\5"+
		"\61\u0223\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0231\n\62\f\62\16\62\u0234\13\62\3\62\3\62\5\62\u0238\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0254"+
		"\n\62\f\62\16\62\u0257\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u025f"+
		"\n\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u026a\n\66\f\66"+
		"\16\66\u026d\13\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0276\n\66"+
		"\f\66\16\66\u0279\13\66\3\66\3\66\7\66\u027d\n\66\f\66\16\66\u0280\13"+
		"\66\5\66\u0282\n\66\3\67\5\67\u0285\n\67\3\67\3\67\5\67\u0289\n\67\3\67"+
		"\3\67\7\67\u028d\n\67\f\67\16\67\u0290\13\67\38\38\39\39\39\39\79\u0298"+
		"\n9\f9\169\u029b\139\39\39\3:\3:\3:\3:\5:\u02a3\n:\5:\u02a5\n:\3;\3;\3"+
		";\3;\5;\u02ab\n;\3<\3<\5<\u02af\n<\3<\3<\3<\2\3b=\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtv\2\n\3\2PQ\4\2\67\67::\3\2=>\3\2AC\3\2?@\4\2\64\6589\5\2\b\16\63\63"+
		"DG\b\2\20\20\23\23\26\26\30\30\33\33$$\2\u02de\2{\3\2\2\2\4\u0080\3\2"+
		"\2\2\6\u0082\3\2\2\2\b\u0090\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16"+
		"\u00a8\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2\2\2\24\u00b6\3\2\2\2\26\u00c1"+
		"\3\2\2\2\30\u00cc\3\2\2\2\32\u00ce\3\2\2\2\34\u00d6\3\2\2\2\36\u00db\3"+
		"\2\2\2 \u00e5\3\2\2\2\"\u00e7\3\2\2\2$\u00f7\3\2\2\2&\u010b\3\2\2\2(\u010d"+
		"\3\2\2\2*\u0115\3\2\2\2,\u0128\3\2\2\2.\u012a\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u0131\3\2\2\2\64\u013f\3\2\2\2\66\u0141\3\2\2\28\u0143\3\2\2\2:\u0145"+
		"\3\2\2\2<\u014f\3\2\2\2>\u0157\3\2\2\2@\u015d\3\2\2\2B\u015f\3\2\2\2D"+
		"\u016f\3\2\2\2F\u017c\3\2\2\2H\u017e\3\2\2\2J\u0181\3\2\2\2L\u01c9\3\2"+
		"\2\2N\u01cb\3\2\2\2P\u01d2\3\2\2\2R\u01da\3\2\2\2T\u01e0\3\2\2\2V\u01f1"+
		"\3\2\2\2X\u01f3\3\2\2\2Z\u0202\3\2\2\2\\\u0204\3\2\2\2^\u0208\3\2\2\2"+
		"`\u0222\3\2\2\2b\u0237\3\2\2\2d\u025e\3\2\2\2f\u0260\3\2\2\2h\u0263\3"+
		"\2\2\2j\u0265\3\2\2\2l\u0284\3\2\2\2n\u0291\3\2\2\2p\u0293\3\2\2\2r\u02a4"+
		"\3\2\2\2t\u02aa\3\2\2\2v\u02ac\3\2\2\2xz\5\b\5\2yx\3\2\2\2z}\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\2\2\3\177\3\3\2\2\2\u0080"+
		"\u0081\5\6\4\2\u0081\5\3\2\2\2\u0082\u0083\7M\2\2\u0083\7\3\2\2\2\u0084"+
		"\u0091\7\60\2\2\u0085\u0087\7N\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0091\5D#\2\u0089\u008b\5\4\3\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\n\6\2\u0090\u0084\3\2"+
		"\2\2\u0090\u0086\3\2\2\2\u0090\u008c\3\2\2\2\u0091\t\3\2\2\2\u0092\u0095"+
		"\5\f\7\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\13\3\2\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7K\2\2\u0098\u009d"+
		"\5*\26\2\u0099\u009a\7.\2\2\u009a\u009c\7/\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7O\2\2\u00a1\u00a3\5(\25\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\5\16"+
		"\b\2\u00a5\r\3\2\2\2\u00a6\u00a9\5D#\2\u00a7\u00a9\7\60\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ad\5l\67\2\u00ab"+
		"\u00ad\7 \2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\21\3\2\2\2"+
		"\u00ae\u00af\7K\2\2\u00af\u00b2\5*\26\2\u00b0\u00b1\7O\2\2\u00b1\u00b3"+
		"\5(\25\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\5D#\2\u00b5\23\3\2\2\2\u00b6\u00b7\5l\67\2\u00b7\u00bc\5\26\f\2"+
		"\u00b8\u00b9\7\61\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00b8\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\25\3\2\2\2\u00c1\u00c6\7K\2"+
		"\2\u00c2\u00c3\7.\2\2\u00c3\u00c5\7/\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\63\2\2\u00ca\u00cb\5 \21\2\u00cb\27\3\2\2"+
		"\2\u00cc\u00cd\7M\2\2\u00cd\31\3\2\2\2\u00ce\u00d3\5\34\17\2\u00cf\u00d0"+
		"\7\61\2\2\u00d0\u00d2\5\34\17\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\5\36\20\2\u00d7\u00d8\7\63\2\2\u00d8\u00da\5 \21"+
		"\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\35\3\2\2\2\u00db\u00e0"+
		"\7K\2\2\u00dc\u00dd\7.\2\2\u00dd\u00df\7/\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\37\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\5\"\22\2\u00e4\u00e6\5b\62\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00f3\7,\2\2\u00e8"+
		"\u00ed\5 \21\2\u00e9\u00ea\7\61\2\2\u00ea\u00ec\5 \21\2\u00eb\u00e9\3"+
		"\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\61\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7-\2\2\u00f6#\3\2\2\2\u00f7"+
		"\u00f9\7K\2\2\u00f8\u00fa\5p9\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2"+
		"\2\u00fa\u0102\3\2\2\2\u00fb\u00fc\7\62\2\2\u00fc\u00fe\7K\2\2\u00fd\u00ff"+
		"\5p9\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103%\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010c\5l\67\2\u0106\u0109"+
		"\7\3\2\2\u0107\u0108\t\2\2\2\u0108\u010a\5l\67\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2"+
		"\2\2\u010c\'\3\2\2\2\u010d\u0112\5\62\32\2\u010e\u010f\7\61\2\2\u010f"+
		"\u0111\5\62\32\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113)\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117"+
		"\7*\2\2\u0116\u0118\5,\27\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\7+\2\2\u011a+\3\2\2\2\u011b\u0120\5.\30\2\u011c"+
		"\u011d\7\61\2\2\u011d\u011f\5.\30\2\u011e\u011c\3\2\2\2\u011f\u0122\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0126\5\60\31\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0129\5\60\31\2"+
		"\u0128\u011b\3\2\2\2\u0128\u0127\3\2\2\2\u0129-\3\2\2\2\u012a\u012b\5"+
		"l\67\2\u012b\u012c\5\36\20\2\u012c/\3\2\2\2\u012d\u012e\5l\67\2\u012e"+
		"\u012f\7\4\2\2\u012f\u0130\5\36\20\2\u0130\61\3\2\2\2\u0131\u0136\7K\2"+
		"\2\u0132\u0133\7\62\2\2\u0133\u0135\7K\2\2\u0134\u0132\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\63\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u0140\5\66\34\2\u013a\u0140\58\35\2\u013b\u0140\7"+
		"R\2\2\u013c\u0140\7(\2\2\u013d\u0140\7\'\2\2\u013e\u0140\7)\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\65\3\2\2\2\u0141\u0142"+
		"\7%\2\2\u0142\67\3\2\2\2\u0143\u0144\7&\2\2\u01449\3\2\2\2\u0145\u0146"+
		"\7\5\2\2\u0146\u014d\5\62\32\2\u0147\u014a\7*\2\2\u0148\u014b\5<\37\2"+
		"\u0149\u014b\5@!\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\7+\2\2\u014d\u0147\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e;\3\2\2\2\u014f\u0154\5> \2\u0150\u0151\7\61\2\2\u0151"+
		"\u0153\5> \2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155=\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158"+
		"\7K\2\2\u0158\u0159\7\63\2\2\u0159\u015a\5@!\2\u015a?\3\2\2\2\u015b\u015e"+
		"\5b\62\2\u015c\u015e\5B\"\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"A\3\2\2\2\u015f\u0168\7,\2\2\u0160\u0165\5@!\2\u0161\u0162\7\61\2\2\u0162"+
		"\u0164\5@!\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2"+
		"\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0160"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\7\61\2\2"+
		"\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\7-\2\2\u016eC\3\2\2\2\u016f\u0173\7,\2\2\u0170\u0172\5F$\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7-\2\2\u0177E\3\2\2\2\u0178"+
		"\u0179\5H%\2\u0179\u017a\7\60\2\2\u017a\u017d\3\2\2\2\u017b\u017d\5L\'"+
		"\2\u017c\u0178\3\2\2\2\u017c\u017b\3\2\2\2\u017dG\3\2\2\2\u017e\u017f"+
		"\5l\67\2\u017f\u0180\5\32\16\2\u0180I\3\2\2\2\u0181\u0182\7\27\2\2\u0182"+
		"\u0183\5L\'\2\u0183K\3\2\2\2\u0184\u01ca\5D#\2\u0185\u0186\7\32\2\2\u0186"+
		"\u0187\5\\/\2\u0187\u0189\5L\'\2\u0188\u018a\5J&\2\u0189\u0188\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u01ca\3\2\2\2\u018b\u018c\7\32\2\2\u018c\u018d"+
		"\7*\2\2\u018d\u018e\5b\62\2\u018e\u018f\t\3\2\2\u018f\u0190\5b\62\2\u0190"+
		"\u0192\7+\2\2\u0191\u0193\5J&\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2"+
		"\2\u0193\u01ca\3\2\2\2\u0194\u0195\7\31\2\2\u0195\u0196\7*\2\2\u0196\u0197"+
		"\5X-\2\u0197\u0198\7+\2\2\u0198\u0199\5L\'\2\u0199\u01ca\3\2\2\2\u019a"+
		"\u019b\7!\2\2\u019b\u019c\5\\/\2\u019c\u019d\5L\'\2\u019d\u01ca\3\2\2"+
		"\2\u019e\u019f\7\25\2\2\u019f\u01a0\5L\'\2\u01a0\u01a1\7!\2\2\u01a1\u01a2"+
		"\5\\/\2\u01a2\u01a3\7\60\2\2\u01a3\u01ca\3\2\2\2\u01a4\u01a5\7\36\2\2"+
		"\u01a5\u01a6\5\\/\2\u01a6\u01aa\7,\2\2\u01a7\u01a9\5T+\2\u01a8\u01a7\3"+
		"\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01b0\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\5V,\2\u01ae\u01ad\3\2\2"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7-\2\2\u01b4\u01ca\3\2\2\2\u01b5"+
		"\u01b7\7\35\2\2\u01b6\u01b8\5b\62\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ca\7\60\2\2\u01ba\u01bb\5b\62\2\u01bb"+
		"\u01bc\7\60\2\2\u01bc\u01ca\3\2\2\2\u01bd\u01be\7#\2\2\u01be\u01bf\7*"+
		"\2\2\u01bf\u01c4\5d\63\2\u01c0\u01c1\7?\2\2\u01c1\u01c3\5d\63\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u0184\3\2\2\2\u01c9\u0185\3\2\2\2\u01c9\u018b\3\2"+
		"\2\2\u01c9\u0194\3\2\2\2\u01c9\u019a\3\2\2\2\u01c9\u019e\3\2\2\2\u01c9"+
		"\u01a4\3\2\2\2\u01c9\u01b5\3\2\2\2\u01c9\u01ba\3\2\2\2\u01c9\u01bd\3\2"+
		"\2\2\u01caM\3\2\2\2\u01cb\u01cc\7*\2\2\u01cc\u01ce\5P)\2\u01cd\u01cf\7"+
		"\60\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\7+\2\2\u01d1O\3\2\2\2\u01d2\u01d7\5R*\2\u01d3\u01d4\7\60\2\2\u01d4"+
		"\u01d6\5R*\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8Q\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\5$\23\2\u01db\u01dc\5\36\20\2\u01dc\u01dd\7\63\2\2\u01dd\u01de\5b\62"+
		"\2\u01deS\3\2\2\2\u01df\u01e1\5V,\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3"+
		"\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e6\5F$\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8U\3\2\2\2\u01e9\u01ec\7\22\2\2\u01ea\u01ed"+
		"\5b\62\2\u01eb\u01ed\7K\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f2\7\7\2\2\u01ef\u01f0\7S\2\2\u01f0\u01f2\7\7"+
		"\2\2\u01f1\u01e9\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2W\3\2\2\2\u01f3\u01f4"+
		"\5Z.\2\u01f4\u01f6\7\60\2\2\u01f5\u01f7\5b\62\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\7\60\2\2\u01f9\u01fb\5"+
		"^\60\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbY\3\2\2\2\u01fc\u01fd"+
		"\5l\67\2\u01fd\u01fe\5\36\20\2\u01fe\u01ff\7\63\2\2\u01ff\u0200\5 \21"+
		"\2\u0200\u0203\3\2\2\2\u0201\u0203\5^\60\2\u0202\u01fc\3\2\2\2\u0202\u0201"+
		"\3\2\2\2\u0203[\3\2\2\2\u0204\u0205\7*\2\2\u0205\u0206\5b\62\2\u0206\u0207"+
		"\7+\2\2\u0207]\3\2\2\2\u0208\u020d\5b\62\2\u0209\u020a\7\61\2\2\u020a"+
		"\u020c\5b\62\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e_\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\7K\2\2\u0211\u0213\7*\2\2\u0212\u0214\5^\60\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0223\7+\2\2\u0216\u0217\7\37"+
		"\2\2\u0217\u0219\7*\2\2\u0218\u021a\5^\60\2\u0219\u0218\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0223\7+\2\2\u021c\u021d\7Q\2"+
		"\2\u021d\u021f\7*\2\2\u021e\u0220\5^\60\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\7+\2\2\u0222\u0210\3\2\2\2\u0222"+
		"\u0216\3\2\2\2\u0222\u021c\3\2\2\2\u0223a\3\2\2\2\u0224\u0225\b\62\1\2"+
		"\u0225\u0238\5d\63\2\u0226\u0238\5`\61\2\u0227\u0228\7\34\2\2\u0228\u0238"+
		"\5f\64\2\u0229\u022a\7K\2\2\u022a\u0238\t\4\2\2\u022b\u022c\7\"\2\2\u022c"+
		"\u022d\7*\2\2\u022d\u0232\5d\63\2\u022e\u022f\7?\2\2\u022f\u0231\5d\63"+
		"\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7+\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0224\3\2\2\2\u0237\u0226\3\2\2\2\u0237\u0227\3\2"+
		"\2\2\u0237\u0229\3\2\2\2\u0237\u022b\3\2\2\2\u0238\u0255\3\2\2\2\u0239"+
		"\u023a\f\n\2\2\u023a\u023b\t\5\2\2\u023b\u0254\5b\62\13\u023c\u023d\f"+
		"\t\2\2\u023d\u023e\t\6\2\2\u023e\u0254\5b\62\n\u023f\u0240\f\b\2\2\u0240"+
		"\u0241\t\7\2\2\u0241\u0254\5b\62\t\u0242\u0243\f\7\2\2\u0243\u0244\t\3"+
		"\2\2\u0244\u0254\5b\62\b\u0245\u0246\f\6\2\2\u0246\u0247\7;\2\2\u0247"+
		"\u0254\5b\62\7\u0248\u0249\f\5\2\2\u0249\u024a\7<\2\2\u024a\u0254\5b\62"+
		"\6\u024b\u024c\f\4\2\2\u024c\u024d\t\b\2\2\u024d\u0254\5b\62\4\u024e\u024f"+
		"\f\16\2\2\u024f\u0250\7.\2\2\u0250\u0251\5b\62\2\u0251\u0252\7/\2\2\u0252"+
		"\u0254\3\2\2\2\u0253\u0239\3\2\2\2\u0253\u023c\3\2\2\2\u0253\u023f\3\2"+
		"\2\2\u0253\u0242\3\2\2\2\u0253\u0245\3\2\2\2\u0253\u0248\3\2\2\2\u0253"+
		"\u024b\3\2\2\2\u0253\u024e\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256c\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259"+
		"\7*\2\2\u0259\u025a\5b\62\2\u025a\u025b\7+\2\2\u025b\u025f\3\2\2\2\u025c"+
		"\u025f\5\64\33\2\u025d\u025f\7K\2\2\u025e\u0258\3\2\2\2\u025e\u025c\3"+
		"\2\2\2\u025e\u025d\3\2\2\2\u025fe\3\2\2\2\u0260\u0261\5h\65\2\u0261\u0262"+
		"\5j\66\2\u0262g\3\2\2\2\u0263\u0264\5n8\2\u0264i\3\2\2\2\u0265\u0281\7"+
		".\2\2\u0266\u026b\7/\2\2\u0267\u0268\7.\2\2\u0268\u026a\7/\2\2\u0269\u0267"+
		"\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0282\5\"\22\2\u026f\u0270\5"+
		"b\62\2\u0270\u0277\7/\2\2\u0271\u0272\7.\2\2\u0272\u0273\5b\62\2\u0273"+
		"\u0274\7/\2\2\u0274\u0276\3\2\2\2\u0275\u0271\3\2\2\2\u0276\u0279\3\2"+
		"\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027e\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u027a\u027b\7.\2\2\u027b\u027d\7/\2\2\u027c\u027a\3\2\2"+
		"\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0266\3\2\2\2\u0281\u026f\3\2\2\2\u0282"+
		"k\3\2\2\2\u0283\u0285\5:\36\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2"+
		"\u0285\u0288\3\2\2\2\u0286\u0289\5$\23\2\u0287\u0289\5n8\2\u0288\u0286"+
		"\3\2\2\2\u0288\u0287\3\2\2\2\u0289\u028e\3\2\2\2\u028a\u028b\7.\2\2\u028b"+
		"\u028d\7/\2\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028fm\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292"+
		"\t\t\2\2\u0292o\3\2\2\2\u0293\u0294\7\65\2\2\u0294\u0299\5&\24\2\u0295"+
		"\u0296\7\61\2\2\u0296\u0298\5&\24\2\u0297\u0295\3\2\2\2\u0298\u029b\3"+
		"\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029d\7\64\2\2\u029dq\3\2\2\2\u029e\u02a5\5v<\2\u029f"+
		"\u02a0\7\62\2\2\u02a0\u02a2\7K\2\2\u02a1\u02a3\5v<\2\u02a2\u02a1\3\2\2"+
		"\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4\u029f"+
		"\3\2\2\2\u02a5s\3\2\2\2\u02a6\u02a7\7Q\2\2\u02a7\u02ab\5r:\2\u02a8\u02a9"+
		"\7K\2\2\u02a9\u02ab\5v<\2\u02aa\u02a6\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"u\3\2\2\2\u02ac\u02ae\7*\2\2\u02ad\u02af\5^\60\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\7+\2\2\u02b1w\3\2\2\2P"+
		"{\u0086\u008c\u0090\u0094\u009d\u00a2\u00a8\u00ac\u00b2\u00bc\u00c6\u00d3"+
		"\u00d9\u00e0\u00e5\u00ed\u00f1\u00f3\u00f9\u00fe\u0102\u0109\u010b\u0112"+
		"\u0117\u0120\u0125\u0128\u0136\u013f\u014a\u014d\u0154\u015d\u0165\u0168"+
		"\u016b\u0173\u017c\u0189\u0192\u01aa\u01b0\u01b7\u01c4\u01c9\u01ce\u01d7"+
		"\u01e2\u01e7\u01ec\u01f1\u01f6\u01fa\u0202\u020d\u0213\u0219\u021f\u0222"+
		"\u0232\u0237\u0253\u0255\u025e\u026b\u0277\u027e\u0281\u0284\u0288\u028e"+
		"\u0299\u02a2\u02a4\u02aa\u02ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}