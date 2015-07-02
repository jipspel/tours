// Generated from C:/Users/Jip/Documents/tours/src/main/java/tours/grammar\Tours.g4 by ANTLR 4.5
package tours.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToursParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, BOOLEAN=2, BOOLEANARRAY=3, CHARACTER=4, CHARACTERARRAY=5, ELSE=6, 
		END=7, EXIT=8, FALSE=9, FOR=10, FUNC=11, IF=12, INPUT=13, INTEGER=14, 
		INTEGERARRAY=15, PRINT=16, PROGRAM=17, RETURN=18, STRING=19, STRINGARRAY=20, 
		TRUE=21, VOID=22, WHILE=23, ASSIGNMENT=24, AND=25, COLON=26, COMMA=27, 
		DOT=28, DQUOTE=29, EQ=30, GE=31, GT=32, LE=33, LBLOCK=34, LBRACE=35, LPAR=36, 
		LT=37, MINUS=38, MODULO=39, NE=40, NOT=41, OR=42, PLUS=43, RBLOCK=44, 
		RBRACE=45, RPAR=46, SEMI=47, SLASH=48, STAR=49, SQUOTE=50, UNDERSCORE=51, 
		IDENTIFIER=52, INT=53, STR=54, CHAR=55, COMMENT=56, WS=57;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_variableDeclaration = 2, RULE_variable = 3, 
		RULE_variableAssignment = 4, RULE_function = 5, RULE_block = 6, RULE_returnBlock = 7, 
		RULE_statement = 8, RULE_conditionalStatement = 9, RULE_returnStatement = 10, 
		RULE_expression = 11, RULE_arrayAssignment = 12, RULE_prefixOperator = 13, 
		RULE_multiplyOperator = 14, RULE_plusOperator = 15, RULE_booleanOperator = 16, 
		RULE_compareOperator = 17, RULE_variableType = 18, RULE_primitiveType = 19, 
		RULE_arrayType = 20;
	public static final String[] ruleNames = {
		"program", "body", "variableDeclaration", "variable", "variableAssignment", 
		"function", "block", "returnBlock", "statement", "conditionalStatement", 
		"returnStatement", "expression", "arrayAssignment", "prefixOperator", 
		"multiplyOperator", "plusOperator", "booleanOperator", "compareOperator", 
		"variableType", "primitiveType", "arrayType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'='", "'&&'", "':'", "','", "'.'", "'\"'", "'=='", "'>='", "'>'", "'<='", 
		"'['", "'{'", "'('", "'<'", "'-'", "'%'", "'!='", "'!'", "'||'", "'+'", 
		"']'", "'}'", "')'", "';'", "'/'", "'*'", "'''", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "BOOLEANARRAY", "CHARACTER", "CHARACTERARRAY", 
		"ELSE", "END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", 
		"INTEGERARRAY", "PRINT", "PROGRAM", "RETURN", "STRING", "STRINGARRAY", 
		"TRUE", "VOID", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", 
		"DQUOTE", "EQ", "GE", "GT", "LE", "LBLOCK", "LBRACE", "LPAR", "LT", "MINUS", 
		"MODULO", "NE", "NOT", "OR", "PLUS", "RBLOCK", "RBRACE", "RPAR", "SEMI", 
		"SLASH", "STAR", "SQUOTE", "UNDERSCORE", "IDENTIFIER", "INT", "STR", "CHAR", 
		"COMMENT", "WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tours.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToursParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEANARRAY) | (1L << CHARACTER) | (1L << CHARACTERARRAY) | (1L << FUNC) | (1L << INTEGER) | (1L << INTEGERARRAY) | (1L << STRING) | (1L << STRINGARRAY) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(49);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BOOLEANARRAY:
				case CHARACTER:
				case CHARACTERARRAY:
				case INTEGER:
				case INTEGERARRAY:
				case STRING:
				case STRINGARRAY:
					{
					setState(44); 
					variableDeclaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(45); 
					variableAssignment();
					setState(46); 
					match(SEMI);
					}
					break;
				case FUNC:
					{
					setState(48); 
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54); 
					variable();
					setState(55); 
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablePrimitiveContext extends VariableContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ToursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ToursParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariablePrimitiveContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariablePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariablePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariablePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableArrayContext extends VariableContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ToursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ToursParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public VariableArrayContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariableArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariableArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariableArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			setState(86);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				_localctx = new VariablePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61); 
				primitiveType();
				setState(62); 
				match(IDENTIFIER);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63); 
					match(COMMA);
					setState(64); 
					match(IDENTIFIER);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(70); 
					match(ASSIGNMENT);
					setState(71); 
					expression(0);
					}
				}

				}
				break;
			case BOOLEANARRAY:
			case CHARACTERARRAY:
			case INTEGERARRAY:
			case STRINGARRAY:
				_localctx = new VariableArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74); 
				arrayType();
				setState(75); 
				match(IDENTIFIER);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76); 
					match(COMMA);
					setState(77); 
					match(IDENTIFIER);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(83); 
				match(ASSIGNMENT);
				setState(84); 
				arrayAssignment();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			match(IDENTIFIER);
			setState(93);
			_la = _input.LA(1);
			if (_la==LBLOCK) {
				{
				setState(89); 
				match(LBLOCK);
				setState(90); 
				expression(0);
				setState(91); 
				match(RBLOCK);
				}
			}

			setState(95); 
			match(ASSIGNMENT);
			setState(96); 
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNC() { return getToken(ToursParser.FUNC, 0); }
		public List<VariableTypeContext> variableType() {
			return getRuleContexts(VariableTypeContext.class);
		}
		public VariableTypeContext variableType(int i) {
			return getRuleContext(VariableTypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ToursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ToursParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNC() { return getToken(ToursParser.FUNC, 0); }
		public TerminalNode VOID() { return getToken(ToursParser.VOID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ToursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ToursParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableTypeContext> variableType() {
			return getRuleContexts(VariableTypeContext.class);
		}
		public VariableTypeContext variableType(int i) {
			return getRuleContext(VariableTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				match(FUNC);
				setState(99); 
				match(VOID);
				setState(100); 
				match(IDENTIFIER);
				setState(101); 
				match(LPAR);
				setState(114);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEANARRAY) | (1L << CHARACTER) | (1L << CHARACTERARRAY) | (1L << INTEGER) | (1L << INTEGERARRAY) | (1L << STRING) | (1L << STRINGARRAY))) != 0)) {
					{
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(102); 
							variableType();
							setState(103); 
							match(IDENTIFIER);
							setState(104); 
							match(COMMA);
							}
							} 
						}
						setState(110);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					{
					setState(111); 
					variableType();
					setState(112); 
					match(IDENTIFIER);
					}
					}
				}

				setState(116); 
				match(RPAR);
				setState(117); 
				block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118); 
				match(FUNC);
				setState(119); 
				variableType();
				setState(120); 
				match(IDENTIFIER);
				setState(121); 
				match(LPAR);
				setState(134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEANARRAY) | (1L << CHARACTER) | (1L << CHARACTERARRAY) | (1L << INTEGER) | (1L << INTEGERARRAY) | (1L << STRING) | (1L << STRINGARRAY))) != 0)) {
					{
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(122); 
							variableType();
							setState(123); 
							match(IDENTIFIER);
							setState(124); 
							match(COMMA);
							}
							} 
						}
						setState(130);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					{
					setState(131); 
					variableType();
					setState(132); 
					match(IDENTIFIER);
					}
					}
				}

				setState(136); 
				match(RPAR);
				setState(137); 
				returnBlock();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ToursParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ToursParser.RBRACE, 0); }
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEANARRAY) | (1L << CHARACTER) | (1L << CHARACTERARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGERARRAY) | (1L << PRINT) | (1L << STRING) | (1L << STRINGARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(150);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BOOLEANARRAY:
				case CHARACTER:
				case CHARACTERARRAY:
				case FALSE:
				case INPUT:
				case INTEGER:
				case INTEGERARRAY:
				case PRINT:
				case STRING:
				case STRINGARRAY:
				case TRUE:
				case LBRACE:
				case LPAR:
				case MINUS:
				case NOT:
				case PLUS:
				case IDENTIFIER:
				case INT:
				case STR:
				case CHAR:
					{
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(142); 
						statement();
						}
						break;
					case 2:
						{
						setState(143); 
						variable();
						}
						break;
					case 3:
						{
						setState(144); 
						expression(0);
						}
						break;
					}
					setState(147); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(149); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); 
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ToursParser.LBRACE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public TerminalNode RBRACE() { return getToken(ToursParser.RBRACE, 0); }
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitReturnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); 
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEANARRAY) | (1L << CHARACTER) | (1L << CHARACTERARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGERARRAY) | (1L << PRINT) | (1L << STRING) | (1L << STRINGARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(166);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BOOLEANARRAY:
				case CHARACTER:
				case CHARACTERARRAY:
				case FALSE:
				case INPUT:
				case INTEGER:
				case INTEGERARRAY:
				case PRINT:
				case STRING:
				case STRINGARRAY:
				case TRUE:
				case LBRACE:
				case LPAR:
				case MINUS:
				case NOT:
				case PLUS:
				case IDENTIFIER:
				case INT:
				case STR:
				case CHAR:
					{
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(158); 
						statement();
						}
						break;
					case 2:
						{
						setState(159); 
						variable();
						}
						break;
					case 3:
						{
						setState(160); 
						expression(0);
						}
						break;
					}
					setState(163); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(165); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); 
			returnStatement();
			setState(172); 
			match(SEMI);
			setState(173); 
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
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(ToursParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStatementContext extends StatementContext {
		public TerminalNode INPUT() { return getToken(ToursParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ToursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ToursParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public InputStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(199);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); 
				variableAssignment();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); 
				match(INPUT);
				setState(177); 
				match(LPAR);
				setState(178); 
				match(IDENTIFIER);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179); 
					match(COMMA);
					setState(180); 
					match(IDENTIFIER);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186); 
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187); 
				match(PRINT);
				setState(188); 
				match(LPAR);
				setState(189); 
				expression(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(190); 
					match(COMMA);
					setState(191); 
					expression(0);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197); 
				match(RPAR);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	 
		public ConditionalStatementContext() { }
		public void copyFrom(ConditionalStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends ConditionalStatementContext {
		public TerminalNode WHILE() { return getToken(ToursParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends ConditionalStatementContext {
		public TerminalNode FOR() { return getToken(ToursParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends ConditionalStatementContext {
		public TerminalNode IF() { return getToken(ToursParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ToursParser.ELSE, 0); }
		public IfStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalStatement);
		int _la;
		try {
			setState(229);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201); 
				match(IF);
				setState(202); 
				match(LPAR);
				setState(203); 
				expression(0);
				setState(204); 
				match(RPAR);
				setState(205); 
				block();
				setState(208);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(206); 
					match(ELSE);
					setState(207); 
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210); 
				match(WHILE);
				setState(211); 
				match(LPAR);
				setState(212); 
				expression(0);
				setState(213); 
				match(RPAR);
				setState(214); 
				block();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216); 
				match(FOR);
				setState(217); 
				match(LPAR);
				setState(220);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BOOLEANARRAY:
				case CHARACTER:
				case CHARACTERARRAY:
				case INTEGER:
				case INTEGERARRAY:
				case STRING:
				case STRINGARRAY:
					{
					setState(218); 
					variable();
					}
					break;
				case INPUT:
				case PRINT:
				case IDENTIFIER:
					{
					setState(219); 
					statement();
					}
					break;
				case SEMI:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				match(SEMI);
				setState(223); 
				expression(0);
				setState(224); 
				match(SEMI);
				setState(225); 
				statement();
				setState(226); 
				match(RPAR);
				setState(227); 
				block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ToursParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			match(RETURN);
			setState(232); 
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
	public static class ArrayExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ToursParser.INT, 0); }
		public IntegerExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntegerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntegerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(ToursParser.TRUE, 0); }
		public TrueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode PRINT() { return getToken(ToursParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ToursParser.OR, 0); }
		public BooleanOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBooleanOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBooleanOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBooleanOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyOperatorContext multiplyOperator() {
			return getRuleContext(MultiplyOperatorContext.class,0);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STR() { return getToken(ToursParser.STR, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends ExpressionContext {
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundExpressionContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(ToursParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ToursParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
		}
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompoundExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCompoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCompoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterExprContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(ToursParser.CHAR, 0); }
		public CharacterExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharacterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharacterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharacterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusOperatorContext plusOperator() {
			return getRuleContext(PlusOperatorContext.class,0);
		}
		public PlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(ToursParser.FALSE, 0); }
		public FalseExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpressionContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public ParExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode INPUT() { return getToken(ToursParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ToursParser.AND, 0); }
		public BooleanAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBooleanAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBooleanAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBooleanAndExpression(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235); 
				prefixOperator();
				setState(236); 
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); 
				match(LPAR);
				setState(239); 
				expression(0);
				setState(240); 
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); 
				match(LBRACE);
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(251);
						switch (_input.LA(1)) {
						case BOOLEAN:
						case BOOLEANARRAY:
						case CHARACTER:
						case CHARACTERARRAY:
						case FALSE:
						case INPUT:
						case INTEGER:
						case INTEGERARRAY:
						case PRINT:
						case STRING:
						case STRINGARRAY:
						case TRUE:
						case LBRACE:
						case LPAR:
						case MINUS:
						case NOT:
						case PLUS:
						case IDENTIFIER:
						case INT:
						case STR:
						case CHAR:
							{
							setState(246);
							switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
							case 1:
								{
								setState(243); 
								statement();
								}
								break;
							case 2:
								{
								setState(244); 
								variable();
								}
								break;
							case 3:
								{
								setState(245); 
								expression(0);
								}
								break;
							}
							setState(248); 
							match(SEMI);
							}
							break;
						case FOR:
						case IF:
						case WHILE:
							{
							setState(250); 
							conditionalStatement();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				{
				setState(259);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(256); 
					statement();
					}
					break;
				case 2:
					{
					setState(257); 
					variable();
					}
					break;
				case 3:
					{
					setState(258); 
					expression(0);
					}
					break;
				}
				setState(261); 
				match(SEMI);
				}
				setState(263); 
				match(RBRACE);
				}
				break;
			case 4:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); 
				match(INPUT);
				setState(266); 
				match(LPAR);
				setState(267); 
				match(IDENTIFIER);
				setState(268); 
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); 
				match(PRINT);
				setState(270); 
				match(LPAR);
				setState(271); 
				expression(0);
				setState(272); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274); 
				match(IDENTIFIER);
				setState(275); 
				match(LBLOCK);
				setState(276); 
				expression(0);
				setState(277); 
				match(RBLOCK);
				}
				break;
			case 7:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); 
				match(IDENTIFIER);
				setState(280); 
				match(LPAR);
				setState(290);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << INPUT) | (1L << PRINT) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
					{
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(281); 
							expression(0);
							setState(282); 
							match(COMMA);
							}
							} 
						}
						setState(288);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(289); 
					expression(0);
					}
				}

				setState(292); 
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293); 
				match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new CharacterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294); 
				match(CHAR);
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295); 
				match(STR);
				}
				break;
			case 11:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296); 
				match(INT);
				}
				break;
			case 12:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297); 
				match(TRUE);
				}
				break;
			case 13:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298); 
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(302); 
						multiplyOperator();
						setState(303); 
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(306); 
						plusOperator();
						setState(307); 
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(310); 
						compareOperator();
						setState(311); 
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(314); 
						match(AND);
						setState(315); 
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(317); 
						match(OR);
						setState(318); 
						expression(13);
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	 
		public ArrayAssignmentContext() { }
		public void copyFrom(ArrayAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayExpressionInitialisationContext extends ArrayAssignmentContext {
		public TerminalNode LBRACE() { return getToken(ToursParser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ToursParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public ArrayExpressionInitialisationContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayExpressionInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayExpressionInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayExpressionInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExpressionNewContext extends ArrayAssignmentContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public TerminalNode INT() { return getToken(ToursParser.INT, 0); }
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public ArrayExpressionNewContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayExpressionNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayExpressionNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayExpressionNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAssignment);
		int _la;
		try {
			setState(340);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new ArrayExpressionInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324); 
				match(LBRACE);
				setState(325); 
				expression(0);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326); 
					match(COMMA);
					setState(327); 
					expression(0);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333); 
				match(RBRACE);
				}
				break;
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				_localctx = new ArrayExpressionNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335); 
				primitiveType();
				setState(336); 
				match(LBLOCK);
				setState(337); 
				match(INT);
				setState(338); 
				match(RBLOCK);
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

	public static class PrefixOperatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ToursParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ToursParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(ToursParser.PLUS, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPrefixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MultiplyOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ToursParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(ToursParser.SLASH, 0); }
		public TerminalNode MODULO() { return getToken(ToursParser.MODULO, 0); }
		public MultiplyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterMultiplyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitMultiplyOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitMultiplyOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyOperatorContext multiplyOperator() throws RecognitionException {
		MultiplyOperatorContext _localctx = new MultiplyOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << SLASH) | (1L << STAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PlusOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ToursParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ToursParser.MINUS, 0); }
		public PlusOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOperatorContext plusOperator() throws RecognitionException {
		PlusOperatorContext _localctx = new PlusOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plusOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ToursParser.AND, 0); }
		public TerminalNode OR() { return getToken(ToursParser.OR, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBooleanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBooleanOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBooleanOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CompareOperatorContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(ToursParser.LE, 0); }
		public TerminalNode LT() { return getToken(ToursParser.LT, 0); }
		public TerminalNode GE() { return getToken(ToursParser.GE, 0); }
		public TerminalNode GT() { return getToken(ToursParser.GT, 0); }
		public TerminalNode EQ() { return getToken(ToursParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ToursParser.NE, 0); }
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCompareOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCompareOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VariableTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableType);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); 
				primitiveType();
				}
				break;
			case BOOLEANARRAY:
			case CHARACTERARRAY:
			case INTEGERARRAY:
			case STRINGARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); 
				arrayType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharTypeContext extends PrimitiveTypeContext {
		public TerminalNode CHARACTER() { return getToken(ToursParser.CHARACTER, 0); }
		public CharTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrTypeContext extends PrimitiveTypeContext {
		public TerminalNode STRING() { return getToken(ToursParser.STRING, 0); }
		public StrTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStrType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends PrimitiveTypeContext {
		public TerminalNode INTEGER() { return getToken(ToursParser.INTEGER, 0); }
		public IntTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends PrimitiveTypeContext {
		public TerminalNode BOOLEAN() { return getToken(ToursParser.BOOLEAN, 0); }
		public BoolTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359); 
				match(STRING);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolArrayTypeContext extends ArrayTypeContext {
		public TerminalNode BOOLEANARRAY() { return getToken(ToursParser.BOOLEANARRAY, 0); }
		public BoolArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBoolArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBoolArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBoolArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrArrayTypeContext extends ArrayTypeContext {
		public TerminalNode STRINGARRAY() { return getToken(ToursParser.STRINGARRAY, 0); }
		public StrArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStrArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStrArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStrArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArrayTypeContext extends ArrayTypeContext {
		public TerminalNode INTEGERARRAY() { return getToken(ToursParser.INTEGERARRAY, 0); }
		public IntArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharArrayTypeContext extends ArrayTypeContext {
		public TerminalNode CHARACTERARRAY() { return getToken(ToursParser.CHARACTERARRAY, 0); }
		public CharArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayType);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case INTEGERARRAY:
				_localctx = new IntArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362); 
				match(INTEGERARRAY);
				}
				break;
			case BOOLEANARRAY:
				_localctx = new BoolArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363); 
				match(BOOLEANARRAY);
				}
				break;
			case CHARACTERARRAY:
				_localctx = new CharArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364); 
				match(CHARACTERARRAY);
				}
				break;
			case STRINGARRAY:
				_localctx = new StrArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(365); 
				match(STRINGARRAY);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 16);
		case 1: 
			return precpred(_ctx, 15);
		case 2: 
			return precpred(_ctx, 14);
		case 3: 
			return precpred(_ctx, 13);
		case 4: 
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u0173\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\6\4<\n\4\r\4\16\4=\3\5\3\5\3\5"+
		"\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\7\5Q\n\5"+
		"\f\5\16\5T\13\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3"+
		"\7\3\7\5\7u\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7"+
		"\f\7\16\7\u0084\13\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\5\7\u008e\n"+
		"\7\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\t\3\t\3\t\7\t\u00a9\n\t"+
		"\f\t\16\t\u00ac\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b8"+
		"\n\n\f\n\16\n\u00bb\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c3\n\n\f\n\16"+
		"\n\u00c6\13\n\3\n\3\n\5\n\u00ca\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d3\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00df\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e8\n\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f9\n\r\3\r"+
		"\3\r\3\r\7\r\u00fe\n\r\f\r\16\r\u0101\13\r\3\r\3\r\3\r\5\r\u0106\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13\r\3\r\5\r\u0125\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u012e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0142\n\r\f\r\16\r"+
		"\u0145\13\r\3\16\3\16\3\16\3\16\7\16\u014b\n\16\f\16\16\16\u014e\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0157\n\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0165\n\24\3\25\3\25\3\25"+
		"\3\25\5\25\u016b\n\25\3\26\3\26\3\26\3\26\5\26\u0171\n\26\3\26\2\3\30"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\5\2((++--\4\2))"+
		"\62\63\4\2((--\4\2\33\33,,\5\2 #\'\'**\u019e\2,\3\2\2\2\4\65\3\2\2\2\6"+
		";\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20\u009f"+
		"\3\2\2\2\22\u00c9\3\2\2\2\24\u00e7\3\2\2\2\26\u00e9\3\2\2\2\30\u012d\3"+
		"\2\2\2\32\u0156\3\2\2\2\34\u0158\3\2\2\2\36\u015a\3\2\2\2 \u015c\3\2\2"+
		"\2\"\u015e\3\2\2\2$\u0160\3\2\2\2&\u0164\3\2\2\2(\u016a\3\2\2\2*\u0170"+
		"\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\64\5\6\4\2/\60\5\n\6\2\60\61\7\61\2\2\61"+
		"\64\3\2\2\2\62\64\5\f\7\2\63.\3\2\2\2\63/\3\2\2\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\5\b"+
		"\5\29:\7\61\2\2:<\3\2\2\2;8\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3"+
		"\2\2\2?@\5(\25\2@E\7\66\2\2AB\7\35\2\2BD\7\66\2\2CA\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GE\3\2\2\2HI\7\32\2\2IK\5\30\r\2JH\3\2\2"+
		"\2JK\3\2\2\2KY\3\2\2\2LM\5*\26\2MR\7\66\2\2NO\7\35\2\2OQ\7\66\2\2PN\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\32\2\2VW"+
		"\5\32\16\2WY\3\2\2\2X?\3\2\2\2XL\3\2\2\2Y\t\3\2\2\2Z_\7\66\2\2[\\\7$\2"+
		"\2\\]\5\30\r\2]^\7.\2\2^`\3\2\2\2_[\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\32"+
		"\2\2bc\5\30\r\2c\13\3\2\2\2de\7\r\2\2ef\7\30\2\2fg\7\66\2\2gt\7&\2\2h"+
		"i\5&\24\2ij\7\66\2\2jk\7\35\2\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\5&\24\2rs\7\66\2\2su\3\2\2\2tn\3\2"+
		"\2\2tu\3\2\2\2uv\3\2\2\2vw\7\60\2\2w\u008e\5\16\b\2xy\7\r\2\2yz\5&\24"+
		"\2z{\7\66\2\2{\u0088\7&\2\2|}\5&\24\2}~\7\66\2\2~\177\7\35\2\2\177\u0081"+
		"\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5&"+
		"\24\2\u0086\u0087\7\66\2\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\60\2\2\u008b\u008c\5"+
		"\20\t\2\u008c\u008e\3\2\2\2\u008dd\3\2\2\2\u008dx\3\2\2\2\u008e\r\3\2"+
		"\2\2\u008f\u009a\7%\2\2\u0090\u0094\5\22\n\2\u0091\u0094\5\b\5\2\u0092"+
		"\u0094\5\30\r\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0099\5\24\13\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7/\2\2\u009e\17\3\2\2\2\u009f\u00aa\7%\2\2"+
		"\u00a0\u00a4\5\22\n\2\u00a1\u00a4\5\b\5\2\u00a2\u00a4\5\30\r\2\u00a3\u00a0"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\7\61\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a3"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\26"+
		"\f\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7/\2\2\u00b0\21\3\2\2\2\u00b1\u00ca"+
		"\5\n\6\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b9\7\66\2\2"+
		"\u00b5\u00b6\7\35\2\2\u00b6\u00b8\7\66\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00ca\7\60\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\7"+
		"&\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1\7\35\2\2\u00c1\u00c3\5\30\r\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00b1\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00bd\3\2"+
		"\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\7&\2\2\u00cd\u00ce"+
		"\5\30\r\2\u00ce\u00cf\7\60\2\2\u00cf\u00d2\5\16\b\2\u00d0\u00d1\7\b\2"+
		"\2\u00d1\u00d3\5\16\b\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00e8\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\5\30"+
		"\r\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00e8\3\2\2\2\u00da"+
		"\u00db\7\f\2\2\u00db\u00de\7&\2\2\u00dc\u00df\5\b\5\2\u00dd\u00df\5\22"+
		"\n\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3\7"+
		"\61\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\5\16\b\2"+
		"\u00e6\u00e8\3\2\2\2\u00e7\u00cb\3\2\2\2\u00e7\u00d4\3\2\2\2\u00e7\u00da"+
		"\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5\30\r\2\u00eb"+
		"\27\3\2\2\2\u00ec\u00ed\b\r\1\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\5\30"+
		"\r\23\u00ef\u012e\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\5\30\r\2\u00f2"+
		"\u00f3\7\60\2\2\u00f3\u012e\3\2\2\2\u00f4\u00ff\7%\2\2\u00f5\u00f9\5\22"+
		"\n\2\u00f6\u00f9\5\b\5\2\u00f7\u00f9\5\30\r\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\61"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\24\13\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0105\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0106\5\22\n\2\u0103"+
		"\u0106\5\b\5\2\u0104\u0106\5\30\r\2\u0105\u0102\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\61\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7/\2\2\u010a\u012e\3\2\2\2\u010b\u010c\7\17"+
		"\2\2\u010c\u010d\7&\2\2\u010d\u010e\7\66\2\2\u010e\u012e\7\60\2\2\u010f"+
		"\u0110\7\22\2\2\u0110\u0111\7&\2\2\u0111\u0112\5\30\r\2\u0112\u0113\7"+
		"\60\2\2\u0113\u012e\3\2\2\2\u0114\u0115\7\66\2\2\u0115\u0116\7$\2\2\u0116"+
		"\u0117\5\30\r\2\u0117\u0118\7.\2\2\u0118\u012e\3\2\2\2\u0119\u011a\7\66"+
		"\2\2\u011a\u0124\7&\2\2\u011b\u011c\5\30\r\2\u011c\u011d\7\35\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0125\5\30\r\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u012e\7\60\2\2\u0127\u012e\7\66\2\2\u0128\u012e\79\2\2\u0129"+
		"\u012e\78\2\2\u012a\u012e\7\67\2\2\u012b\u012e\7\27\2\2\u012c\u012e\7"+
		"\13\2\2\u012d\u00ec\3\2\2\2\u012d\u00f0\3\2\2\2\u012d\u00f4\3\2\2\2\u012d"+
		"\u010b\3\2\2\2\u012d\u010f\3\2\2\2\u012d\u0114\3\2\2\2\u012d\u0119\3\2"+
		"\2\2\u012d\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d"+
		"\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0143\3\2"+
		"\2\2\u012f\u0130\f\22\2\2\u0130\u0131\5\36\20\2\u0131\u0132\5\30\r\23"+
		"\u0132\u0142\3\2\2\2\u0133\u0134\f\21\2\2\u0134\u0135\5 \21\2\u0135\u0136"+
		"\5\30\r\22\u0136\u0142\3\2\2\2\u0137\u0138\f\20\2\2\u0138\u0139\5$\23"+
		"\2\u0139\u013a\5\30\r\21\u013a\u0142\3\2\2\2\u013b\u013c\f\17\2\2\u013c"+
		"\u013d\7\33\2\2\u013d\u0142\5\30\r\20\u013e\u013f\f\16\2\2\u013f\u0140"+
		"\7,\2\2\u0140\u0142\5\30\r\17\u0141\u012f\3\2\2\2\u0141\u0133\3\2\2\2"+
		"\u0141\u0137\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\31\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7%\2\2\u0147\u014c\5\30\r\2\u0148\u0149\7\35"+
		"\2\2\u0149\u014b\5\30\r\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0150\7/\2\2\u0150\u0157\3\2\2\2\u0151\u0152\5(\25\2\u0152"+
		"\u0153\7$\2\2\u0153\u0154\7\67\2\2\u0154\u0155\7.\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u0146\3\2\2\2\u0156\u0151\3\2\2\2\u0157\33\3\2\2\2\u0158\u0159"+
		"\t\2\2\2\u0159\35\3\2\2\2\u015a\u015b\t\3\2\2\u015b\37\3\2\2\2\u015c\u015d"+
		"\t\4\2\2\u015d!\3\2\2\2\u015e\u015f\t\5\2\2\u015f#\3\2\2\2\u0160\u0161"+
		"\t\6\2\2\u0161%\3\2\2\2\u0162\u0165\5(\25\2\u0163\u0165\5*\26\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\'\3\2\2\2\u0166\u016b\7\20\2"+
		"\2\u0167\u016b\7\4\2\2\u0168\u016b\7\6\2\2\u0169\u016b\7\25\2\2\u016a"+
		"\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2"+
		"\2\2\u016b)\3\2\2\2\u016c\u0171\7\21\2\2\u016d\u0171\7\5\2\2\u016e\u0171"+
		"\7\7\2\2\u016f\u0171\7\26\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171+\3\2\2\2)\63\65=EJRX_n"+
		"t\u0082\u0088\u008d\u0093\u0098\u009a\u00a3\u00a8\u00aa\u00b9\u00c4\u00c9"+
		"\u00d2\u00de\u00e7\u00f8\u00fd\u00ff\u0105\u0120\u0124\u012d\u0141\u0143"+
		"\u014c\u0156\u0164\u016a\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}