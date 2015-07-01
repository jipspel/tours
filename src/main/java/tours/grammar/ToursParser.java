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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(123);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INPUT:
				case INTEGER:
				case PRINT:
				case STRING:
				case IDENTIFIER:
					{
					{
					setState(118);
					switch (_input.LA(1)) {
					case INPUT:
					case PRINT:
					case IDENTIFIER:
						{
						setState(116); 
						statement();
						}
						break;
					case BOOLEAN:
					case CHARACTER:
					case INTEGER:
					case STRING:
						{
						setState(117); 
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(122); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128); 
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
			setState(130); 
			match(LBRACE);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(138);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INPUT:
				case INTEGER:
				case PRINT:
				case STRING:
				case IDENTIFIER:
					{
					{
					setState(133);
					switch (_input.LA(1)) {
					case INPUT:
					case PRINT:
					case IDENTIFIER:
						{
						setState(131); 
						statement();
						}
						break;
					case BOOLEAN:
					case CHARACTER:
					case INTEGER:
					case STRING:
						{
						setState(132); 
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(135); 
					match(SEMI);
					}
					}
					break;
				case FOR:
				case IF:
				case WHILE:
					{
					setState(137); 
					conditionalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143); 
			returnStatement();
			setState(144); 
			match(SEMI);
			setState(145); 
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
			setState(171);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); 
				variableAssignment();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
				match(INPUT);
				setState(149); 
				match(LPAR);
				setState(150); 
				match(IDENTIFIER);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151); 
					match(COMMA);
					setState(152); 
					match(IDENTIFIER);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158); 
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159); 
				match(PRINT);
				setState(160); 
				match(LPAR);
				setState(161); 
				expression(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162); 
					match(COMMA);
					setState(163); 
					expression(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169); 
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
			setState(201);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173); 
				match(IF);
				setState(174); 
				match(LPAR);
				setState(175); 
				expression(0);
				setState(176); 
				match(RPAR);
				setState(177); 
				block();
				setState(180);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(178); 
					match(ELSE);
					setState(179); 
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182); 
				match(WHILE);
				setState(183); 
				match(LPAR);
				setState(184); 
				expression(0);
				setState(185); 
				match(RPAR);
				setState(186); 
				block();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188); 
				match(FOR);
				setState(189); 
				match(LPAR);
				setState(192);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(190); 
					variable();
					}
					break;
				case INPUT:
				case PRINT:
				case IDENTIFIER:
					{
					setState(191); 
					statement();
					}
					break;
				case SEMI:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194); 
				match(SEMI);
				setState(195); 
				expression(0);
				setState(196); 
				match(SEMI);
				setState(197); 
				statement();
				setState(198); 
				match(RPAR);
				setState(199); 
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
			setState(203); 
			match(RETURN);
			setState(204); 
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
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
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
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(207); 
				prefixOperator();
				setState(208); 
				expression(16);
				}
				break;
			case 2:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210); 
				match(LPAR);
				setState(211); 
				expression(0);
				setState(212); 
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); 
				match(LBRACE);
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(215); 
						statement();
						}
						break;
					case 2:
						{
						setState(216); 
						variable();
						}
						break;
					case 3:
						{
						setState(217); 
						expression(0);
						}
						break;
					}
					setState(220); 
					match(SEMI);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FALSE) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0) );
				setState(226); 
				match(RBRACE);
				}
				break;
			case 4:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228); 
				match(INPUT);
				setState(229); 
				match(LPAR);
				setState(230); 
				match(IDENTIFIER);
				setState(231); 
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); 
				match(PRINT);
				setState(233); 
				match(LPAR);
				setState(234); 
				expression(0);
				setState(235); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); 
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); 
				match(IDENTIFIER);
				setState(239); 
				match(LPAR);
				setState(249);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << INPUT) | (1L << PRINT) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
					{
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(240); 
							expression(0);
							setState(241); 
							match(SEMI);
							}
							} 
						}
						setState(247);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(248); 
					expression(0);
					}
				}

				setState(251); 
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new CharacterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); 
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); 
				match(STR);
				}
				break;
			case 10:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); 
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); 
				match(TRUE);
				}
				break;
			case 12:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256); 
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(260); 
						multiplyOperator();
						setState(261); 
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(264); 
						plusOperator();
						setState(265); 
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(268); 
						compareOperator();
						setState(269); 
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(272); 
						match(AND);
						setState(273); 
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(275); 
						match(OR);
						setState(276); 
						expression(12);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(282);
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
			setState(284);
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
			setState(286);
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
			setState(288);
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
			setState(290);
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
			setState(296);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u012d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3"+
		"\4\3\4\6\4\66\n\4\r\4\16\4\67\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"S\n\7\f\7\16\7V\13\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\5\by\n\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16"+
		"\t\u0090\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009c\n\n\f"+
		"\n\16\n\u009f\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa"+
		"\13\n\3\n\3\n\5\n\u00ae\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b7"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cc\n\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dd\n\r\3\r\3\r\6\r\u00e1"+
		"\n\r\r\r\16\r\u00e2\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\5\r\u00fc\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0118\n\r\f\r\16\r\u011b"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u012b\n\23\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\7\5\2##&&((\4\2$$,-\4\2##((\4\2\27\27\'\'\5\2\34\37\"\"%"+
		"%\u014c\2&\3\2\2\2\4/\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nF\3\2\2\2\fs\3"+
		"\2\2\2\16u\3\2\2\2\20\u0084\3\2\2\2\22\u00ad\3\2\2\2\24\u00cb\3\2\2\2"+
		"\26\u00cd\3\2\2\2\30\u0103\3\2\2\2\32\u011c\3\2\2\2\34\u011e\3\2\2\2\36"+
		"\u0120\3\2\2\2 \u0122\3\2\2\2\"\u0124\3\2\2\2$\u012a\3\2\2\2&\'\5\4\3"+
		"\2\'\3\3\2\2\2(.\5\6\4\2)*\5\n\6\2*+\7+\2\2+.\3\2\2\2,.\5\f\7\2-(\3\2"+
		"\2\2-)\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2"+
		"\2\61/\3\2\2\2\62\63\5\b\5\2\63\64\7+\2\2\64\66\3\2\2\2\65\62\3\2\2\2"+
		"\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\5$\23\2:?\7\60\2"+
		"\2;<\7\31\2\2<>\7\60\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2"+
		"\2\2A?\3\2\2\2BC\7\26\2\2CE\5\30\r\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FG"+
		"\7\60\2\2GH\7\26\2\2HI\5\30\r\2I\13\3\2\2\2JK\7\13\2\2KL\7\24\2\2LM\7"+
		"\60\2\2MZ\7!\2\2NO\5$\23\2OP\7\60\2\2PQ\7\31\2\2QS\3\2\2\2RN\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5$\23\2XY\7\60\2\2"+
		"Y[\3\2\2\2ZT\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7*\2\2]t\5\16\b\2^_\7\13"+
		"\2\2_`\5$\23\2`a\7\60\2\2an\7!\2\2bc\5$\23\2cd\7\60\2\2de\7\31\2\2eg\3"+
		"\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5"+
		"$\23\2lm\7\60\2\2mo\3\2\2\2nh\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7*\2\2qr\5"+
		"\20\t\2rt\3\2\2\2sJ\3\2\2\2s^\3\2\2\2t\r\3\2\2\2u\177\7 \2\2vy\5\22\n"+
		"\2wy\5\b\5\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\7+\2\2{~\3\2\2\2|~\5\24\13"+
		"\2}x\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7)\2\2\u0083\17\3\2\2\2\u0084"+
		"\u008e\7 \2\2\u0085\u0088\5\22\n\2\u0086\u0088\5\b\5\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7+\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008d\5\24\13\2\u008c\u0087\3\2\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7"+
		"+\2\2\u0093\u0094\7)\2\2\u0094\21\3\2\2\2\u0095\u00ae\5\n\6\2\u0096\u0097"+
		"\7\r\2\2\u0097\u0098\7!\2\2\u0098\u009d\7\60\2\2\u0099\u009a\7\31\2\2"+
		"\u009a\u009c\7\60\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00ae\7*\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\7!\2\2\u00a3\u00a8\5\30"+
		"\r\2\u00a4\u00a5\7\31\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u0095\3\2\2\2\u00ad\u0096\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ae\23\3\2\2"+
		"\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3"+
		"\7*\2\2\u00b3\u00b6\5\16\b\2\u00b4\u00b5\7\6\2\2\u00b5\u00b7\5\16\b\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00cc\3\2\2\2\u00b8\u00b9"+
		"\7\25\2\2\u00b9\u00ba\7!\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7*\2\2\u00bc"+
		"\u00bd\5\16\b\2\u00bd\u00cc\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c2\7"+
		"!\2\2\u00c0\u00c3\5\b\5\2\u00c1\u00c3\5\22\n\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7+"+
		"\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\5\22\n\2\u00c8"+
		"\u00c9\7*\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cc\3\2\2\2\u00cb\u00af\3\2"+
		"\2\2\u00cb\u00b8\3\2\2\2\u00cb\u00be\3\2\2\2\u00cc\25\3\2\2\2\u00cd\u00ce"+
		"\7\21\2\2\u00ce\u00cf\5\30\r\2\u00cf\27\3\2\2\2\u00d0\u00d1\b\r\1\2\u00d1"+
		"\u00d2\5\32\16\2\u00d2\u00d3\5\30\r\22\u00d3\u0104\3\2\2\2\u00d4\u00d5"+
		"\7!\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7*\2\2\u00d7\u0104\3\2\2\2\u00d8"+
		"\u00e0\7 \2\2\u00d9\u00dd\5\22\n\2\u00da\u00dd\5\b\5\2\u00db\u00dd\5\30"+
		"\r\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7+\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\7)\2\2\u00e5\u0104\3\2\2\2\u00e6\u00e7\7\r"+
		"\2\2\u00e7\u00e8\7!\2\2\u00e8\u00e9\7\60\2\2\u00e9\u0104\7*\2\2\u00ea"+
		"\u00eb\7\17\2\2\u00eb\u00ec\7!\2\2\u00ec\u00ed\5\30\r\2\u00ed\u00ee\7"+
		"*\2\2\u00ee\u0104\3\2\2\2\u00ef\u0104\7\60\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		"\u00fb\7!\2\2\u00f2\u00f3\5\30\r\2\u00f3\u00f4\7+\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\30"+
		"\r\2\u00fb\u00f7\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0104\7*\2\2\u00fe\u0104\7\63\2\2\u00ff\u0104\7\62\2\2\u0100\u0104\7"+
		"\61\2\2\u0101\u0104\7\23\2\2\u0102\u0104\7\t\2\2\u0103\u00d0\3\2\2\2\u0103"+
		"\u00d4\3\2\2\2\u0103\u00d8\3\2\2\2\u0103\u00e6\3\2\2\2\u0103\u00ea\3\2"+
		"\2\2\u0103\u00ef\3\2\2\2\u0103\u00f0\3\2\2\2\u0103\u00fe\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104\u0119\3\2\2\2\u0105\u0106\f\21\2\2\u0106\u0107\5\34\17\2\u0107"+
		"\u0108\5\30\r\22\u0108\u0118\3\2\2\2\u0109\u010a\f\20\2\2\u010a\u010b"+
		"\5\36\20\2\u010b\u010c\5\30\r\21\u010c\u0118\3\2\2\2\u010d\u010e\f\17"+
		"\2\2\u010e\u010f\5\"\22\2\u010f\u0110\5\30\r\20\u0110\u0118\3\2\2\2\u0111"+
		"\u0112\f\16\2\2\u0112\u0113\7\27\2\2\u0113\u0118\5\30\r\17\u0114\u0115"+
		"\f\r\2\2\u0115\u0116\7\'\2\2\u0116\u0118\5\30\r\16\u0117\u0105\3\2\2\2"+
		"\u0117\u0109\3\2\2\2\u0117\u010d\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0114"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\31\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\t\2\2\2\u011d\33\3\2\2\2\u011e"+
		"\u011f\t\3\2\2\u011f\35\3\2\2\2\u0120\u0121\t\4\2\2\u0121\37\3\2\2\2\u0122"+
		"\u0123\t\5\2\2\u0123!\3\2\2\2\u0124\u0125\t\6\2\2\u0125#\3\2\2\2\u0126"+
		"\u012b\7\16\2\2\u0127\u012b\7\4\2\2\u0128\u012b\7\5\2\2\u0129\u012b\7"+
		"\22\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b%\3\2\2\2 -/\67?DTZhnsx}\177\u0087\u008c\u008e\u009d"+
		"\u00a8\u00ad\u00b6\u00c2\u00cb\u00dc\u00e2\u00f7\u00fb\u0103\u0117\u0119"+
		"\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}