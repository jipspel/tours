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
		BEGIN=1, BOOLEAN=2, CHARACTER=3, ELSE=4, END=5, EXIT=6, FALSE=7, FOR=8, 
		FUNC=9, IF=10, INPUT=11, INTEGER=12, PRINT=13, PROGRAM=14, RETURN=15, 
		STRING=16, TRUE=17, VOID=18, WHILE=19, ASSIGNMENT=20, AND=21, COLON=22, 
		COMMA=23, DOT=24, DQUOTE=25, EQ=26, GE=27, GT=28, LE=29, LBRACE=30, LPAR=31, 
		LT=32, MINUS=33, MODULO=34, NE=35, NOT=36, OR=37, PLUS=38, RBRACE=39, 
		RPAR=40, SEMI=41, SLASH=42, STAR=43, SQUOTE=44, UNDERSCORE=45, IDENTIFIER=46, 
		INT=47, STR=48, CHAR=49, COMMENT=50, WS=51;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_variableDeclaration = 2, RULE_variable = 3, 
		RULE_variableAssignment = 4, RULE_function = 5, RULE_block = 6, RULE_returnBlock = 7, 
		RULE_statement = 8, RULE_conditionalStatement = 9, RULE_returnStatement = 10, 
		RULE_expression = 11, RULE_prefixOperator = 12, RULE_multiplyOperator = 13, 
		RULE_plusOperator = 14, RULE_booleanOperator = 15, RULE_compareOperator = 16, 
		RULE_variableType = 17;
	public static final String[] ruleNames = {
		"program", "body", "variableDeclaration", "variable", "variableAssignment", 
		"function", "block", "returnBlock", "statement", "conditionalStatement", 
		"returnStatement", "expression", "prefixOperator", "multiplyOperator", 
		"plusOperator", "booleanOperator", "compareOperator", "variableType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'='", "'&&'", "':'", 
		"','", "'.'", "'\"'", "'=='", "'>='", "'>'", "'<='", "'{'", "'('", "'<'", 
		"'-'", "'%'", "'!='", "'!'", "'||'", "'+'", "'}'", "')'", "';'", "'/'", 
		"'*'", "'''", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", 
		"FOR", "FUNC", "IF", "INPUT", "INTEGER", "PRINT", "PROGRAM", "RETURN", 
		"STRING", "TRUE", "VOID", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", 
		"DOT", "DQUOTE", "EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", 
		"MODULO", "NE", "NOT", "OR", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", 
		"STAR", "SQUOTE", "UNDERSCORE", "IDENTIFIER", "INT", "STR", "CHAR", "COMMENT", 
		"WS"
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
			setState(36); 
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FUNC) | (1L << INTEGER) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(38); 
					variableDeclaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(39); 
					variableAssignment();
					setState(40); 
					match(SEMI);
					}
					break;
				case FUNC:
					{
					setState(42); 
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
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
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(48); 
					variable();
					setState(49); 
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
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
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			variableType();
			setState(56); 
			match(IDENTIFIER);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(57); 
				match(COMMA);
				setState(58); 
				match(IDENTIFIER);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(64); 
				match(ASSIGNMENT);
				setState(65); 
				expression(0);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			match(IDENTIFIER);
			setState(69); 
			match(ASSIGNMENT);
			setState(70); 
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
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72); 
				match(FUNC);
				setState(73); 
				match(VOID);
				setState(74); 
				match(IDENTIFIER);
				setState(75); 
				match(LPAR);
				setState(88);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
					{
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(76); 
							variableType();
							setState(77); 
							match(IDENTIFIER);
							setState(78); 
							match(COMMA);
							}
							} 
						}
						setState(84);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					{
					setState(85); 
					variableType();
					setState(86); 
					match(IDENTIFIER);
					}
					}
				}

				setState(90); 
				match(RPAR);
				setState(91); 
				block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); 
				match(FUNC);
				setState(93); 
				variableType();
				setState(94); 
				match(IDENTIFIER);
				setState(95); 
				match(LPAR);
				setState(108);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << INTEGER) | (1L << STRING))) != 0)) {
					{
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(96); 
							variableType();
							setState(97); 
							match(IDENTIFIER);
							setState(98); 
							match(COMMA);
							}
							} 
						}
						setState(104);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					{
					setState(105); 
					variableType();
					setState(106); 
					match(IDENTIFIER);
					}
					}
				}

				setState(110); 
				match(RPAR);
				setState(111); 
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
			setState(115); 
			match(LBRACE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(124);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case FALSE:
				case INPUT:
				case INTEGER:
				case PRINT:
				case STRING:
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
					setState(119);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(116); 
						statement();
						}
						break;
					case 2:
						{
						setState(117); 
						variable();
						}
						break;
					case 3:
						{
						setState(118); 
						expression(0);
						}
						break;
					}
					setState(121); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(123); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); 
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
			setState(131); 
			match(LBRACE);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(140);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case FALSE:
				case INPUT:
				case INTEGER:
				case PRINT:
				case STRING:
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
					setState(135);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(132); 
						statement();
						}
						break;
					case 2:
						{
						setState(133); 
						variable();
						}
						break;
					case 3:
						{
						setState(134); 
						expression(0);
						}
						break;
					}
					setState(137); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(139); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145); 
			returnStatement();
			setState(146); 
			match(SEMI);
			setState(147); 
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
			setState(173);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149); 
				variableAssignment();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150); 
				match(INPUT);
				setState(151); 
				match(LPAR);
				setState(152); 
				match(IDENTIFIER);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(153); 
					match(COMMA);
					setState(154); 
					match(IDENTIFIER);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160); 
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161); 
				match(PRINT);
				setState(162); 
				match(LPAR);
				setState(163); 
				expression(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(164); 
					match(COMMA);
					setState(165); 
					expression(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171); 
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
			setState(203);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); 
				match(IF);
				setState(176); 
				match(LPAR);
				setState(177); 
				expression(0);
				setState(178); 
				match(RPAR);
				setState(179); 
				block();
				setState(182);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(180); 
					match(ELSE);
					setState(181); 
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); 
				match(WHILE);
				setState(185); 
				match(LPAR);
				setState(186); 
				expression(0);
				setState(187); 
				match(RPAR);
				setState(188); 
				block();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190); 
				match(FOR);
				setState(191); 
				match(LPAR);
				setState(194);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(192); 
					variable();
					}
					break;
				case INPUT:
				case PRINT:
				case IDENTIFIER:
					{
					setState(193); 
					statement();
					}
					break;
				case SEMI:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
				match(SEMI);
				setState(197); 
				expression(0);
				setState(198); 
				match(SEMI);
				setState(199); 
				statement();
				setState(200); 
				match(RPAR);
				setState(201); 
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
			setState(205); 
			match(RETURN);
			setState(206); 
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
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(209); 
				prefixOperator();
				setState(210); 
				expression(16);
				}
				break;
			case 2:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); 
				match(LPAR);
				setState(213); 
				expression(0);
				setState(214); 
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216); 
				match(LBRACE);
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(225);
						switch (_input.LA(1)) {
						case BOOLEAN:
						case CHARACTER:
						case FALSE:
						case INPUT:
						case INTEGER:
						case PRINT:
						case STRING:
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
							setState(220);
							switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
							case 1:
								{
								setState(217); 
								statement();
								}
								break;
							case 2:
								{
								setState(218); 
								variable();
								}
								break;
							case 3:
								{
								setState(219); 
								expression(0);
								}
								break;
							}
							setState(222); 
							match(SEMI);
							}
							break;
						case FOR:
						case IF:
						case WHILE:
							{
							setState(224); 
							conditionalStatement();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				{
				setState(233);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(230); 
					statement();
					}
					break;
				case 2:
					{
					setState(231); 
					variable();
					}
					break;
				case 3:
					{
					setState(232); 
					expression(0);
					}
					break;
				}
				setState(235); 
				match(SEMI);
				}
				setState(237); 
				match(RBRACE);
				}
				break;
			case 4:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); 
				match(INPUT);
				setState(240); 
				match(LPAR);
				setState(241); 
				match(IDENTIFIER);
				setState(242); 
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); 
				match(PRINT);
				setState(244); 
				match(LPAR);
				setState(245); 
				expression(0);
				setState(246); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); 
				match(IDENTIFIER);
				setState(249); 
				match(LPAR);
				setState(259);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << INPUT) | (1L << PRINT) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
					{
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(250); 
							expression(0);
							setState(251); 
							match(COMMA);
							}
							} 
						}
						setState(257);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					setState(258); 
					expression(0);
					}
				}

				setState(261); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); 
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new CharacterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); 
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264); 
				match(STR);
				}
				break;
			case 10:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); 
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); 
				match(TRUE);
				}
				break;
			case 12:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); 
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(271); 
						multiplyOperator();
						setState(272); 
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275); 
						plusOperator();
						setState(276); 
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(279); 
						compareOperator();
						setState(280); 
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(283); 
						match(AND);
						setState(284); 
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(286); 
						match(OR);
						setState(287); 
						expression(12);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 24, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 26, RULE_multiplyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 28, RULE_plusOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 30, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 32, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	 
		public VariableTypeContext() { }
		public void copyFrom(VariableTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharTypeContext extends VariableTypeContext {
		public TerminalNode CHARACTER() { return getToken(ToursParser.CHARACTER, 0); }
		public CharTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
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
	public static class StrTypeContext extends VariableTypeContext {
		public TerminalNode STRING() { return getToken(ToursParser.STRING, 0); }
		public StrTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
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
	public static class IntTypeContext extends VariableTypeContext {
		public TerminalNode INTEGER() { return getToken(ToursParser.INTEGER, 0); }
		public IntTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
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
	public static class BoolTypeContext extends VariableTypeContext {
		public TerminalNode BOOLEAN() { return getToken(ToursParser.BOOLEAN, 0); }
		public BoolTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
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

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableType);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306); 
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
			return precpred(_ctx, 15);
		case 1: 
			return precpred(_ctx, 14);
		case 2: 
			return precpred(_ctx, 13);
		case 3: 
			return precpred(_ctx, 12);
		case 4: 
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3"+
		"\4\3\4\6\4\66\n\4\r\4\16\4\67\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"S\n\7\f\7\16\7V\13\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\7\t\u008f\n\t"+
		"\f\t\16\t\u0092\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009e"+
		"\n\n\f\n\16\n\u00a1\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16"+
		"\n\u00ac\13\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00b9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00c5\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\r"+
		"\3\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\r\3\r\3\r\5\r\u00ec\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0100\n\r\f\r\16\r\u0103\13\r\3\r\5\r\u0106\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u010f\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0123\n\r\f\r\16\r\u0126\13\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0136"+
		"\n\23\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\7\5"+
		"\2##&&((\4\2$$,-\4\2##((\4\2\27\27\'\'\5\2\34\37\"\"%%\u015c\2&\3\2\2"+
		"\2\4/\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nF\3\2\2\2\fs\3\2\2\2\16u\3\2\2"+
		"\2\20\u0085\3\2\2\2\22\u00af\3\2\2\2\24\u00cd\3\2\2\2\26\u00cf\3\2\2\2"+
		"\30\u010e\3\2\2\2\32\u0127\3\2\2\2\34\u0129\3\2\2\2\36\u012b\3\2\2\2 "+
		"\u012d\3\2\2\2\"\u012f\3\2\2\2$\u0135\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2("+
		".\5\6\4\2)*\5\n\6\2*+\7+\2\2+.\3\2\2\2,.\5\f\7\2-(\3\2\2\2-)\3\2\2\2-"+
		",\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62"+
		"\63\5\b\5\2\63\64\7+\2\2\64\66\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\5$\23\2:?\7\60\2\2;<\7\31\2\2<>\7"+
		"\60\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2\2A?\3\2\2\2BC"+
		"\7\26\2\2CE\5\30\r\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FG\7\60\2\2GH\7\26"+
		"\2\2HI\5\30\r\2I\13\3\2\2\2JK\7\13\2\2KL\7\24\2\2LM\7\60\2\2MZ\7!\2\2"+
		"NO\5$\23\2OP\7\60\2\2PQ\7\31\2\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5$\23\2XY\7\60\2\2Y[\3\2\2\2ZT\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7*\2\2]t\5\16\b\2^_\7\13\2\2_`\5$\23\2`a"+
		"\7\60\2\2an\7!\2\2bc\5$\23\2cd\7\60\2\2de\7\31\2\2eg\3\2\2\2fb\3\2\2\2"+
		"gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5$\23\2lm\7\60\2"+
		"\2mo\3\2\2\2nh\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7*\2\2qr\5\20\t\2rt\3\2\2"+
		"\2sJ\3\2\2\2s^\3\2\2\2t\r\3\2\2\2u\u0080\7 \2\2vz\5\22\n\2wz\5\b\5\2x"+
		"z\5\30\r\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{|\7+\2\2|\177\3\2\2"+
		"\2}\177\5\24\13\2~y\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\7)\2\2\u0084\17\3\2\2\2\u0085\u0090\7 \2\2\u0086\u008a\5\22\n\2\u0087"+
		"\u008a\5\b\5\2\u0088\u008a\5\30\r\2\u0089\u0086\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7+\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008f\5\24\13\2\u008e\u0089\3\2\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7"+
		"+\2\2\u0095\u0096\7)\2\2\u0096\21\3\2\2\2\u0097\u00b0\5\n\6\2\u0098\u0099"+
		"\7\r\2\2\u0099\u009a\7!\2\2\u009a\u009f\7\60\2\2\u009b\u009c\7\31\2\2"+
		"\u009c\u009e\7\60\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00b0\7*\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\7!\2\2\u00a5\u00aa\5\30"+
		"\r\2\u00a6\u00a7\7\31\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u0097\3\2\2\2\u00af\u0098\3\2\2\2\u00af\u00a3\3\2\2\2\u00b0\23\3\2\2"+
		"\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\u00b8\5\16\b\2\u00b6\u00b7\7\6\2\2\u00b7\u00b9\5\16\b\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ce\3\2\2\2\u00ba\u00bb"+
		"\7\25\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7*\2\2\u00be"+
		"\u00bf\5\16\b\2\u00bf\u00ce\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c4\7"+
		"!\2\2\u00c2\u00c5\5\b\5\2\u00c3\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7+"+
		"\2\2\u00c7\u00c8\5\30\r\2\u00c8\u00c9\7+\2\2\u00c9\u00ca\5\22\n\2\u00ca"+
		"\u00cb\7*\2\2\u00cb\u00cc\5\16\b\2\u00cc\u00ce\3\2\2\2\u00cd\u00b1\3\2"+
		"\2\2\u00cd\u00ba\3\2\2\2\u00cd\u00c0\3\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d0"+
		"\7\21\2\2\u00d0\u00d1\5\30\r\2\u00d1\27\3\2\2\2\u00d2\u00d3\b\r\1\2\u00d3"+
		"\u00d4\5\32\16\2\u00d4\u00d5\5\30\r\22\u00d5\u010f\3\2\2\2\u00d6\u00d7"+
		"\7!\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\7*\2\2\u00d9\u010f\3\2\2\2\u00da"+
		"\u00e5\7 \2\2\u00db\u00df\5\22\n\2\u00dc\u00df\5\b\5\2\u00dd\u00df\5\30"+
		"\r\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5\24"+
		"\13\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00ec\5\22\n\2\u00e9\u00ec\5\b\5\2\u00ea\u00ec\5\30\r\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7+\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0\u010f"+
		"\3\2\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3\7!\2\2\u00f3\u00f4\7\60\2\2\u00f4"+
		"\u010f\7*\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8\5\30"+
		"\r\2\u00f8\u00f9\7*\2\2\u00f9\u010f\3\2\2\2\u00fa\u00fb\7\60\2\2\u00fb"+
		"\u0105\7!\2\2\u00fc\u00fd\5\30\r\2\u00fd\u00fe\7\31\2\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5\30"+
		"\r\2\u0105\u0101\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u010f\7*\2\2\u0108\u010f\7\60\2\2\u0109\u010f\7\63\2\2\u010a\u010f\7"+
		"\62\2\2\u010b\u010f\7\61\2\2\u010c\u010f\7\23\2\2\u010d\u010f\7\t\2\2"+
		"\u010e\u00d2\3\2\2\2\u010e\u00d6\3\2\2\2\u010e\u00da\3\2\2\2\u010e\u00f1"+
		"\3\2\2\2\u010e\u00f5\3\2\2\2\u010e\u00fa\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0124\3\2\2\2\u0110\u0111\f\21\2\2\u0111"+
		"\u0112\5\34\17\2\u0112\u0113\5\30\r\22\u0113\u0123\3\2\2\2\u0114\u0115"+
		"\f\20\2\2\u0115\u0116\5\36\20\2\u0116\u0117\5\30\r\21\u0117\u0123\3\2"+
		"\2\2\u0118\u0119\f\17\2\2\u0119\u011a\5\"\22\2\u011a\u011b\5\30\r\20\u011b"+
		"\u0123\3\2\2\2\u011c\u011d\f\16\2\2\u011d\u011e\7\27\2\2\u011e\u0123\5"+
		"\30\r\17\u011f\u0120\f\r\2\2\u0120\u0121\7\'\2\2\u0121\u0123\5\30\r\16"+
		"\u0122\u0110\3\2\2\2\u0122\u0114\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u011c"+
		"\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\31\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\t\2\2"+
		"\2\u0128\33\3\2\2\2\u0129\u012a\t\3\2\2\u012a\35\3\2\2\2\u012b\u012c\t"+
		"\4\2\2\u012c\37\3\2\2\2\u012d\u012e\t\5\2\2\u012e!\3\2\2\2\u012f\u0130"+
		"\t\6\2\2\u0130#\3\2\2\2\u0131\u0136\7\16\2\2\u0132\u0136\7\4\2\2\u0133"+
		"\u0136\7\5\2\2\u0134\u0136\7\22\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136%\3\2\2\2\"-/\67?"+
		"DTZhnsy~\u0080\u0089\u008e\u0090\u009f\u00aa\u00af\u00b8\u00c4\u00cd\u00de"+
		"\u00e3\u00e5\u00eb\u0101\u0105\u010e\u0122\u0124\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}