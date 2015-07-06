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
		BEGIN=1, BOOLEAN=2, BOOLEAN_ARRAY=3, CHARACTER=4, CHARACTER_ARRAY=5, ELSE=6, 
		END=7, EXIT=8, FALSE=9, FOR=10, FUNC=11, IF=12, INPUT=13, INTEGER=14, 
		INTEGER_ARRAY=15, NEW=16, PRINT=17, PROGRAM=18, RETURN=19, STRING=20, 
		STRING_ARRAY=21, TRUE=22, VOID=23, WHILE=24, ASSIGNMENT=25, AND=26, COLON=27, 
		COMMA=28, DOT=29, DQUOTE=30, EQ=31, GE=32, GT=33, LE=34, LBLOCK=35, LBRACE=36, 
		LPAR=37, LT=38, MINUS=39, MODULO=40, NE=41, NOT=42, OR=43, PLUS=44, RBLOCK=45, 
		RBRACE=46, RPAR=47, SEMI=48, SLASH=49, STAR=50, SQUOTE=51, UNDERSCORE=52, 
		IDENTIFIER=53, INT=54, STR=55, CHAR=56, COMMENT=57, WS=58;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_variable = 2, RULE_variableAssignment = 3, 
		RULE_function = 4, RULE_block = 5, RULE_returnBlock = 6, RULE_statement = 7, 
		RULE_conditionalStatement = 8, RULE_returnStatement = 9, RULE_expression = 10, 
		RULE_compound = 11, RULE_arrayAssignment = 12, RULE_prefixOperator = 13, 
		RULE_multiplyOperator = 14, RULE_plusOperator = 15, RULE_booleanOperator = 16, 
		RULE_compareOperator = 17, RULE_variableType = 18, RULE_primitiveType = 19, 
		RULE_arrayType = 20;
	public static final String[] ruleNames = {
		"program", "body", "variable", "variableAssignment", "function", "block", 
		"returnBlock", "statement", "conditionalStatement", "returnStatement", 
		"expression", "compound", "arrayAssignment", "prefixOperator", "multiplyOperator", 
		"plusOperator", "booleanOperator", "compareOperator", "variableType", 
		"primitiveType", "arrayType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'='", "'&&'", "':'", "','", "'.'", "'\"'", "'=='", "'>='", "'>'", 
		"'<='", "'['", "'{'", "'('", "'<'", "'-'", "'%'", "'!='", "'!'", "'||'", 
		"'+'", "']'", "'}'", "')'", "';'", "'/'", "'*'", "'''", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "BOOLEAN_ARRAY", "CHARACTER", "CHARACTER_ARRAY", 
		"ELSE", "END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", 
		"INTEGER_ARRAY", "NEW", "PRINT", "PROGRAM", "RETURN", "STRING", "STRING_ARRAY", 
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(44); 
				function();
				}
				}
				setState(49);
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
		enterRule(_localctx, 4, RULE_variable);
		int _la;
		try {
			setState(75);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				_localctx = new VariablePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50); 
				primitiveType();
				setState(51); 
				match(IDENTIFIER);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(52); 
					match(COMMA);
					setState(53); 
					match(IDENTIFIER);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(59); 
					match(ASSIGNMENT);
					setState(60); 
					expression(0);
					}
				}

				}
				break;
			case BOOLEAN_ARRAY:
			case CHARACTER_ARRAY:
			case INTEGER_ARRAY:
			case STRING_ARRAY:
				_localctx = new VariableArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63); 
				arrayType();
				setState(64); 
				match(IDENTIFIER);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(65); 
					match(COMMA);
					setState(66); 
					match(IDENTIFIER);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(72); 
				match(ASSIGNMENT);
				setState(73); 
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
		enterRule(_localctx, 6, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			match(IDENTIFIER);
			setState(82);
			_la = _input.LA(1);
			if (_la==LBLOCK) {
				{
				setState(78); 
				match(LBLOCK);
				setState(79); 
				expression(0);
				setState(80); 
				match(RBLOCK);
				}
			}

			setState(84); 
			match(ASSIGNMENT);
			setState(85); 
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
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87); 
				match(FUNC);
				setState(88); 
				match(VOID);
				setState(89); 
				match(IDENTIFIER);
				setState(90); 
				match(LPAR);
				setState(103);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) {
					{
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(91); 
							variableType();
							setState(92); 
							match(IDENTIFIER);
							setState(93); 
							match(COMMA);
							}
							} 
						}
						setState(99);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					{
					setState(100); 
					variableType();
					setState(101); 
					match(IDENTIFIER);
					}
					}
				}

				setState(105); 
				match(RPAR);
				setState(106); 
				block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107); 
				match(FUNC);
				setState(108); 
				variableType();
				setState(109); 
				match(IDENTIFIER);
				setState(110); 
				match(LPAR);
				setState(123);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) {
					{
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(111); 
							variableType();
							setState(112); 
							match(IDENTIFIER);
							setState(113); 
							match(COMMA);
							}
							} 
						}
						setState(119);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					{
					setState(120); 
					variableType();
					setState(121); 
					match(IDENTIFIER);
					}
					}
				}

				setState(125); 
				match(RPAR);
				setState(126); 
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			match(LBRACE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << PRINT) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(139);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					{
					setState(134);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(131); 
						statement();
						}
						break;
					case 2:
						{
						setState(132); 
						variable();
						}
						break;
					case 3:
						{
						setState(133); 
						expression(0);
						}
						break;
					}
					setState(136); 
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(138); 
					conditionalStatement();
					}
					break;
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); 
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
		enterRule(_localctx, 12, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); 
			match(LBRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << PRINT) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(155);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					{
					setState(150);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(147); 
						statement();
						}
						break;
					case 2:
						{
						setState(148); 
						variable();
						}
						break;
					case 3:
						{
						setState(149); 
						expression(0);
						}
						break;
					}
					setState(152); 
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(154); 
					conditionalStatement();
					}
					break;
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); 
			returnStatement();
			setState(161); 
			match(SEMI);
			setState(162); 
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(188);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164); 
				variableAssignment();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); 
				match(INPUT);
				setState(166); 
				match(LPAR);
				setState(167); 
				match(IDENTIFIER);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168); 
					match(COMMA);
					setState(169); 
					match(IDENTIFIER);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175); 
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176); 
				match(PRINT);
				setState(177); 
				match(LPAR);
				setState(178); 
				expression(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179); 
					match(COMMA);
					setState(180); 
					expression(0);
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
		enterRule(_localctx, 16, RULE_conditionalStatement);
		int _la;
		try {
			setState(218);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190); 
				match(IF);
				setState(191); 
				match(LPAR);
				setState(192); 
				expression(0);
				setState(193); 
				match(RPAR);
				setState(194); 
				block();
				setState(197);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(195); 
					match(ELSE);
					setState(196); 
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199); 
				match(WHILE);
				setState(200); 
				match(LPAR);
				setState(201); 
				expression(0);
				setState(202); 
				match(RPAR);
				setState(203); 
				block();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205); 
				match(FOR);
				setState(206); 
				match(LPAR);
				setState(209);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BOOLEAN_ARRAY:
				case CHARACTER:
				case CHARACTER_ARRAY:
				case INTEGER:
				case INTEGER_ARRAY:
				case STRING:
				case STRING_ARRAY:
					{
					setState(207); 
					variable();
					}
					break;
				case INPUT:
				case PRINT:
				case IDENTIFIER:
					{
					setState(208); 
					statement();
					}
					break;
				case SEMI:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211); 
				match(SEMI);
				setState(212); 
				expression(0);
				setState(213); 
				match(SEMI);
				setState(214); 
				statement();
				setState(215); 
				match(RPAR);
				setState(216); 
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
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			match(RETURN);
			setState(221); 
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
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExpressionContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(ToursParser.FALSE, 0); }
		public FalseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitFalseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitFalseExpression(this);
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
	public static class IfElseExpressionContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(ToursParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public List<CompoundContext> compound() {
			return getRuleContexts(CompoundContext.class);
		}
		public CompoundContext compound(int i) {
			return getRuleContext(CompoundContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ToursParser.ELSE, 0); }
		public IfElseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIfElseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIfElseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIfElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ToursParser.INT, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntegerExpression(this);
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
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
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
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STR() { return getToken(ToursParser.STR, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(ToursParser.TRUE, 0); }
		public TrueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitTrueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitTrueExpression(this);
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
	public static class CharacterExpressionContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(ToursParser.CHAR, 0); }
		public CharacterExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharacterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharacterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharacterExpression(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(224); 
				prefixOperator();
				setState(225); 
				expression(18);
				}
				break;
			case 2:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); 
				match(LPAR);
				setState(228); 
				expression(0);
				setState(229); 
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); 
				compound();
				}
				break;
			case 4:
				{
				_localctx = new IfElseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); 
				match(IF);
				setState(233); 
				match(LPAR);
				setState(234); 
				expression(0);
				setState(235); 
				match(RPAR);
				setState(236); 
				compound();
				setState(237); 
				match(ELSE);
				setState(238); 
				compound();
				}
				break;
			case 5:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240); 
				match(INPUT);
				setState(241); 
				match(LPAR);
				setState(242); 
				match(IDENTIFIER);
				setState(243); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); 
				match(PRINT);
				setState(245); 
				match(LPAR);
				setState(246); 
				expression(0);
				setState(247); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); 
				match(IDENTIFIER);
				setState(250); 
				match(LBLOCK);
				setState(251); 
				expression(0);
				setState(252); 
				match(RBLOCK);
				}
				break;
			case 8:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); 
				match(IDENTIFIER);
				setState(255); 
				match(LPAR);
				setState(265);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << IF) | (1L << INPUT) | (1L << PRINT) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
					{
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(256); 
							expression(0);
							setState(257); 
							match(COMMA);
							}
							} 
						}
						setState(263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(264); 
					expression(0);
					}
				}

				setState(267); 
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); 
				match(IDENTIFIER);
				}
				break;
			case 10:
				{
				_localctx = new CharacterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); 
				match(CHAR);
				}
				break;
			case 11:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); 
				match(STR);
				}
				break;
			case 12:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); 
				match(INT);
				}
				break;
			case 13:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); 
				match(TRUE);
				}
				break;
			case 14:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273); 
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(277); 
						multiplyOperator();
						setState(278); 
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(281); 
						plusOperator();
						setState(282); 
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(285); 
						compareOperator();
						setState(286); 
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(289); 
						match(AND);
						setState(290); 
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(292); 
						match(OR);
						setState(293); 
						expression(14);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class CompoundContext extends ParserRuleContext {
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
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299); 
			match(LBRACE);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(308);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(303);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(300); 
							statement();
							}
							break;
						case 2:
							{
							setState(301); 
							variable();
							}
							break;
						case 3:
							{
							setState(302); 
							expression(0);
							}
							break;
						}
						setState(305); 
						match(SEMI);
						}
						break;
					case 2:
						{
						setState(307); 
						conditionalStatement();
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			{
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(313); 
				statement();
				}
				break;
			case 2:
				{
				setState(314); 
				variable();
				}
				break;
			case 3:
				{
				setState(315); 
				expression(0);
				}
				break;
			}
			setState(318); 
			match(SEMI);
			}
			setState(320); 
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
	public static class ArrayAssignmentWithInitialisationContext extends ArrayAssignmentContext {
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
		public ArrayAssignmentWithInitialisationContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayAssignmentWithInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayAssignmentWithInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayAssignmentWithInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentNewContext extends ArrayAssignmentContext {
		public TerminalNode NEW() { return getToken(ToursParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public ArrayAssignmentNewContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayAssignmentNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayAssignmentNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayAssignmentNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAssignment);
		int _la;
		try {
			setState(339);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new ArrayAssignmentWithInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322); 
				match(LBRACE);
				setState(323); 
				expression(0);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324); 
					match(COMMA);
					setState(325); 
					expression(0);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331); 
				match(RBRACE);
				}
				break;
			case NEW:
				_localctx = new ArrayAssignmentNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(333); 
				match(NEW);
				setState(334); 
				primitiveType();
				setState(335); 
				match(LBLOCK);
				setState(336); 
				expression(0);
				setState(337); 
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
			setState(341);
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
			setState(343);
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
			setState(345);
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
			setState(347);
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
			setState(349);
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
			setState(353);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); 
				primitiveType();
				}
				break;
			case BOOLEAN_ARRAY:
			case CHARACTER_ARRAY:
			case INTEGER_ARRAY:
			case STRING_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); 
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
	public static class BooleanTypeContext extends PrimitiveTypeContext {
		public TerminalNode BOOLEAN() { return getToken(ToursParser.BOOLEAN, 0); }
		public BooleanTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterTypeContext extends PrimitiveTypeContext {
		public TerminalNode CHARACTER() { return getToken(ToursParser.CHARACTER, 0); }
		public CharacterTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharacterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharacterType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerTypeContext extends PrimitiveTypeContext {
		public TerminalNode INTEGER() { return getToken(ToursParser.INTEGER, 0); }
		public IntegerTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends PrimitiveTypeContext {
		public TerminalNode STRING() { return getToken(ToursParser.STRING, 0); }
		public StringTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		try {
			setState(359);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(358); 
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
	public static class BooleanArrayTypeContext extends ArrayTypeContext {
		public TerminalNode BOOLEAN_ARRAY() { return getToken(ToursParser.BOOLEAN_ARRAY, 0); }
		public BooleanArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterBooleanArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitBooleanArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitBooleanArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterArrayTypeContext extends ArrayTypeContext {
		public TerminalNode CHARACTER_ARRAY() { return getToken(ToursParser.CHARACTER_ARRAY, 0); }
		public CharacterArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCharacterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCharacterArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitCharacterArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringArrayTypeContext extends ArrayTypeContext {
		public TerminalNode STRING_ARRAY() { return getToken(ToursParser.STRING_ARRAY, 0); }
		public StringArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterStringArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitStringArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitStringArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerArrayTypeContext extends ArrayTypeContext {
		public TerminalNode INTEGER_ARRAY() { return getToken(ToursParser.INTEGER_ARRAY, 0); }
		public IntegerArrayTypeContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIntegerArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIntegerArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitIntegerArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayType);
		try {
			setState(365);
			switch (_input.LA(1)) {
			case INTEGER_ARRAY:
				_localctx = new IntegerArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361); 
				match(INTEGER_ARRAY);
				}
				break;
			case BOOLEAN_ARRAY:
				_localctx = new BooleanArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362); 
				match(BOOLEAN_ARRAY);
				}
				break;
			case CHARACTER_ARRAY:
				_localctx = new CharacterArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(363); 
				match(CHARACTER_ARRAY);
				}
				break;
			case STRING_ARRAY:
				_localctx = new StringArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364); 
				match(STRING_ARRAY);
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
		case 10: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 17);
		case 1: 
			return precpred(_ctx, 16);
		case 2: 
			return precpred(_ctx, 15);
		case 3: 
			return precpred(_ctx, 14);
		case 4: 
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u0172\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\5\4@\n\4\3"+
		"\4\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5U\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n"+
		"\6\f\6\16\6e\13\6\3\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\5\6"+
		"\u0083\n\6\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7"+
		"\16\7\u0091\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\b\3\b\3\b\7\b"+
		"\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b8\n"+
		"\t\f\t\16\t\u00bb\13\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00c8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d4\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00dd\n\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0106"+
		"\n\f\f\f\16\f\u0109\13\f\3\f\5\f\u010c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0115\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0129\n\f\f\f\16\f\u012c\13\f\3\r\3\r\3\r\3\r\5\r"+
		"\u0132\n\r\3\r\3\r\3\r\7\r\u0137\n\r\f\r\16\r\u013a\13\r\3\r\3\r\3\r\5"+
		"\r\u013f\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0149\n\16\f\16"+
		"\16\16\u014c\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0156"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24"+
		"\u0164\n\24\3\25\3\25\3\25\3\25\5\25\u016a\n\25\3\26\3\26\3\26\3\26\5"+
		"\26\u0170\n\26\3\26\2\3\26\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*\2\7\5\2)),,..\4\2**\63\64\4\2))..\4\2\34\34--\5\2!$((++\u019b\2"+
		",\3\2\2\2\4\61\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\n\u0082\3\2\2\2\f\u0084\3"+
		"\2\2\2\16\u0094\3\2\2\2\20\u00be\3\2\2\2\22\u00dc\3\2\2\2\24\u00de\3\2"+
		"\2\2\26\u0114\3\2\2\2\30\u012d\3\2\2\2\32\u0155\3\2\2\2\34\u0157\3\2\2"+
		"\2\36\u0159\3\2\2\2 \u015b\3\2\2\2\"\u015d\3\2\2\2$\u015f\3\2\2\2&\u0163"+
		"\3\2\2\2(\u0169\3\2\2\2*\u016f\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\60\5\n\6"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\5(\25\2\65:\7\67\2\2\66\67\7\36\2\2\679\7\67\2\28\66\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<:\3\2\2\2=>\7\33\2\2>@"+
		"\5\26\f\2?=\3\2\2\2?@\3\2\2\2@N\3\2\2\2AB\5*\26\2BG\7\67\2\2CD\7\36\2"+
		"\2DF\7\67\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2"+
		"\2\2JK\7\33\2\2KL\5\32\16\2LN\3\2\2\2M\64\3\2\2\2MA\3\2\2\2N\7\3\2\2\2"+
		"OT\7\67\2\2PQ\7%\2\2QR\5\26\f\2RS\7/\2\2SU\3\2\2\2TP\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VW\7\33\2\2WX\5\26\f\2X\t\3\2\2\2YZ\7\r\2\2Z[\7\31\2\2[\\\7"+
		"\67\2\2\\i\7\'\2\2]^\5&\24\2^_\7\67\2\2_`\7\36\2\2`b\3\2\2\2a]\3\2\2\2"+
		"be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5&\24\2gh\7\67\2"+
		"\2hj\3\2\2\2ic\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\61\2\2l\u0083\5\f\7\2m"+
		"n\7\r\2\2no\5&\24\2op\7\67\2\2p}\7\'\2\2qr\5&\24\2rs\7\67\2\2st\7\36\2"+
		"\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2"+
		"\2z{\5&\24\2{|\7\67\2\2|~\3\2\2\2}w\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\61\2\2\u0080\u0081\5\16\b\2\u0081\u0083\3\2\2\2\u0082Y\3\2\2"+
		"\2\u0082m\3\2\2\2\u0083\13\3\2\2\2\u0084\u008f\7&\2\2\u0085\u0089\5\20"+
		"\t\2\u0086\u0089\5\6\4\2\u0087\u0089\5\26\f\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\62"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5\22\n\2\u008d\u0088\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\60\2\2\u0093"+
		"\r\3\2\2\2\u0094\u009f\7&\2\2\u0095\u0099\5\20\t\2\u0096\u0099\5\6\4\2"+
		"\u0097\u0099\5\26\f\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\62\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009e\5\22\n\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\62\2\2\u00a4\u00a5"+
		"\7\60\2\2\u00a5\17\3\2\2\2\u00a6\u00bf\5\b\5\2\u00a7\u00a8\7\17\2\2\u00a8"+
		"\u00a9\7\'\2\2\u00a9\u00ae\7\67\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ad\7"+
		"\67\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00bf\7\61"+
		"\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b9\5\26\f\2\u00b5"+
		"\u00b6\7\36\2\2\u00b6\u00b8\5\26\f\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00bf\3\2\2\2\u00be\u00a6\3"+
		"\2\2\2\u00be\u00a7\3\2\2\2\u00be\u00b2\3\2\2\2\u00bf\21\3\2\2\2\u00c0"+
		"\u00c1\7\16\2\2\u00c1\u00c2\7\'\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7"+
		"\61\2\2\u00c4\u00c7\5\f\7\2\u00c5\u00c6\7\b\2\2\u00c6\u00c8\5\f\7\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00dd\3\2\2\2\u00c9\u00ca\7\32"+
		"\2\2\u00ca\u00cb\7\'\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\u00ce\5\f\7\2\u00ce\u00dd\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d3\7\'"+
		"\2\2\u00d1\u00d4\5\6\4\2\u00d2\u00d4\5\20\t\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\62"+
		"\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\62\2\2\u00d8\u00d9\5\20\t\2\u00d9"+
		"\u00da\7\61\2\2\u00da\u00db\5\f\7\2\u00db\u00dd\3\2\2\2\u00dc\u00c0\3"+
		"\2\2\2\u00dc\u00c9\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dd\23\3\2\2\2\u00de"+
		"\u00df\7\25\2\2\u00df\u00e0\5\26\f\2\u00e0\25\3\2\2\2\u00e1\u00e2\b\f"+
		"\1\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4\5\26\f\24\u00e4\u0115\3\2\2\2\u00e5"+
		"\u00e6\7\'\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00e8\7\61\2\2\u00e8\u0115\3"+
		"\2\2\2\u00e9\u0115\5\30\r\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\7\'\2\2\u00ec"+
		"\u00ed\5\26\f\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0"+
		"\7\b\2\2\u00f0\u00f1\5\30\r\2\u00f1\u0115\3\2\2\2\u00f2\u00f3\7\17\2\2"+
		"\u00f3\u00f4\7\'\2\2\u00f4\u00f5\7\67\2\2\u00f5\u0115\7\61\2\2\u00f6\u00f7"+
		"\7\23\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\5\26\f\2\u00f9\u00fa\7\61\2"+
		"\2\u00fa\u0115\3\2\2\2\u00fb\u00fc\7\67\2\2\u00fc\u00fd\7%\2\2\u00fd\u00fe"+
		"\5\26\f\2\u00fe\u00ff\7/\2\2\u00ff\u0115\3\2\2\2\u0100\u0101\7\67\2\2"+
		"\u0101\u010b\7\'\2\2\u0102\u0103\5\26\f\2\u0103\u0104\7\36\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5\26"+
		"\f\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0115\7\61\2\2\u010e\u0115\7\67\2\2\u010f\u0115\7:\2\2\u0110\u0115\7"+
		"9\2\2\u0111\u0115\78\2\2\u0112\u0115\7\30\2\2\u0113\u0115\7\13\2\2\u0114"+
		"\u00e1\3\2\2\2\u0114\u00e5\3\2\2\2\u0114\u00e9\3\2\2\2\u0114\u00ea\3\2"+
		"\2\2\u0114\u00f2\3\2\2\2\u0114\u00f6\3\2\2\2\u0114\u00fb\3\2\2\2\u0114"+
		"\u0100\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2"+
		"\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u012a\3\2\2\2\u0116\u0117\f\23\2\2\u0117\u0118\5\36\20\2\u0118\u0119"+
		"\5\26\f\24\u0119\u0129\3\2\2\2\u011a\u011b\f\22\2\2\u011b\u011c\5 \21"+
		"\2\u011c\u011d\5\26\f\23\u011d\u0129\3\2\2\2\u011e\u011f\f\21\2\2\u011f"+
		"\u0120\5$\23\2\u0120\u0121\5\26\f\22\u0121\u0129\3\2\2\2\u0122\u0123\f"+
		"\20\2\2\u0123\u0124\7\34\2\2\u0124\u0129\5\26\f\21\u0125\u0126\f\17\2"+
		"\2\u0126\u0127\7-\2\2\u0127\u0129\5\26\f\20\u0128\u0116\3\2\2\2\u0128"+
		"\u011a\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\27\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0138\7&\2\2\u012e\u0132\5\20\t"+
		"\2\u012f\u0132\5\6\4\2\u0130\u0132\5\26\f\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\62"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0137\5\22\n\2\u0136\u0131\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013e\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013f\5\20\t\2\u013c"+
		"\u013f\5\6\4\2\u013d\u013f\5\26\f\2\u013e\u013b\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\62\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\7\60\2\2\u0143\31\3\2\2\2\u0144\u0145\7&\2"+
		"\2\u0145\u014a\5\26\f\2\u0146\u0147\7\36\2\2\u0147\u0149\5\26\f\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\60\2\2\u014e"+
		"\u0156\3\2\2\2\u014f\u0150\7\22\2\2\u0150\u0151\5(\25\2\u0151\u0152\7"+
		"%\2\2\u0152\u0153\5\26\f\2\u0153\u0154\7/\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0144\3\2\2\2\u0155\u014f\3\2\2\2\u0156\33\3\2\2\2\u0157\u0158\t\2\2"+
		"\2\u0158\35\3\2\2\2\u0159\u015a\t\3\2\2\u015a\37\3\2\2\2\u015b\u015c\t"+
		"\4\2\2\u015c!\3\2\2\2\u015d\u015e\t\5\2\2\u015e#\3\2\2\2\u015f\u0160\t"+
		"\6\2\2\u0160%\3\2\2\2\u0161\u0164\5(\25\2\u0162\u0164\5*\26\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0162\3\2\2\2\u0164\'\3\2\2\2\u0165\u016a\7\20\2\2\u0166"+
		"\u016a\7\4\2\2\u0167\u016a\7\6\2\2\u0168\u016a\7\26\2\2\u0169\u0165\3"+
		"\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		")\3\2\2\2\u016b\u0170\7\21\2\2\u016c\u0170\7\5\2\2\u016d\u0170\7\7\2\2"+
		"\u016e\u0170\7\27\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u016e\3\2\2\2\u0170+\3\2\2\2\'\61:?GMTciw}\u0082\u0088"+
		"\u008d\u008f\u0098\u009d\u009f\u00ae\u00b9\u00be\u00c7\u00d3\u00dc\u0107"+
		"\u010b\u0114\u0128\u012a\u0131\u0136\u0138\u013e\u014a\u0155\u0163\u0169"+
		"\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}