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
		FUNC=9, IF=10, INPUT=11, INTEGER=12, NOT=13, PRINT=14, PROC=15, PROGRAM=16, 
		STRING=17, TRUE=18, WHILE=19, ASSIGNMENT=20, AND=21, COLON=22, COMMA=23, 
		DOT=24, DQUOTE=25, EQ=26, GE=27, GT=28, LE=29, LBRACE=30, LPAR=31, LT=32, 
		MINUS=33, MODULO=34, NE=35, OR=36, PLUS=37, RBRACE=38, RPAR=39, SEMI=40, 
		SLASH=41, STAR=42, SQUOTE=43, IDENTIFIER=44, INT=45, STR=46, CHAR=47, 
		COMMENT=48, WS=49;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_variableDeclaration = 2, RULE_variable = 3, 
		RULE_function = 4, RULE_block = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_prefixOperator = 8, RULE_multiplyOperator = 9, RULE_plusOperator = 10, 
		RULE_booleanOperator = 11, RULE_compareOperator = 12, RULE_variableType = 13;
	public static final String[] ruleNames = {
		"program", "body", "variableDeclaration", "variable", "function", "block", 
		"statement", "expression", "prefixOperator", "multiplyOperator", "plusOperator", 
		"booleanOperator", "compareOperator", "variableType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'='", "'&&'", "':'", 
		"','", "'.'", "'\"'", "'=='", "'>='", "'>'", "'<='", "'{'", "'('", "'<'", 
		"'-'", "'%'", "'!='", "'||'", "'+'", "'}'", "')'", "';'", "'/'", "'*'", 
		"'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", 
		"FOR", "FUNC", "IF", "INPUT", "INTEGER", "NOT", "PRINT", "PROC", "PROGRAM", 
		"STRING", "TRUE", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", 
		"DQUOTE", "EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "MODULO", 
		"NE", "OR", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "SQUOTE", 
		"IDENTIFIER", "INT", "STR", "CHAR", "COMMENT", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
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
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << INTEGER) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(32);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(30); 
					variableDeclaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(31); 
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37); 
					variable();
					setState(38); 
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			variableType();
			setState(45); 
			match(IDENTIFIER);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(46); 
				match(COMMA);
				setState(47); 
				match(IDENTIFIER);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(53); 
				match(ASSIGNMENT);
				setState(54); 
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			match(IDENTIFIER);
			setState(58); 
			match(LPAR);
			setState(59); 
			match(RPAR);
			setState(60); 
			block();
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
		public List<TerminalNode> SEMI() { return getTokens(ToursParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ToursParser.SEMI, i);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			match(LBRACE);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				switch (_input.LA(1)) {
				case FOR:
				case IF:
				case INPUT:
				case PRINT:
				case WHILE:
				case IDENTIFIER:
					{
					setState(63); 
					statement();
					}
					break;
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(64); 
					variable();
					setState(65); 
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << WHILE) | (1L << IDENTIFIER))) != 0) );
			setState(73); 
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
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(ToursParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitWhileStatement(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(ToursParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ToursParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitPrintStatement(this);
		}
	}
	public static class InputStatementContext extends StatementContext {
		public TerminalNode INPUT() { return getToken(ToursParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ToursParser.SEMI, 0); }
		public InputStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitInputStatement(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ToursParser.SEMI, 0); }
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitAssignStatement(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
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
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitIfStatement(this);
		}
	}
	public static class ForSTatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(ToursParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForSTatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterForSTatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitForSTatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(120);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75); 
				match(IDENTIFIER);
				setState(76); 
				match(ASSIGNMENT);
				setState(77); 
				expression(0);
				setState(78); 
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80); 
				match(IF);
				setState(81); 
				match(LPAR);
				setState(82); 
				expression(0);
				setState(83); 
				match(RPAR);
				setState(84); 
				block();
				setState(87);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(85); 
					match(ELSE);
					setState(86); 
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89); 
				match(WHILE);
				setState(90); 
				match(LPAR);
				setState(91); 
				expression(0);
				setState(92); 
				match(RPAR);
				setState(93); 
				block();
				}
				break;
			case FOR:
				_localctx = new ForSTatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95); 
				match(FOR);
				setState(96); 
				match(LPAR);
				setState(101);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHARACTER:
				case INTEGER:
				case STRING:
					{
					setState(97); 
					variable();
					setState(98); 
					match(SEMI);
					}
					break;
				case FOR:
				case IF:
				case INPUT:
				case PRINT:
				case WHILE:
				case IDENTIFIER:
					{
					setState(100); 
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103); 
				expression(0);
				setState(104); 
				match(SEMI);
				setState(105); 
				statement();
				setState(106); 
				match(RPAR);
				setState(107); 
				block();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109); 
				match(INPUT);
				setState(110); 
				match(LPAR);
				setState(111); 
				match(IDENTIFIER);
				setState(112); 
				match(RPAR);
				setState(113); 
				match(SEMI);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114); 
				match(PRINT);
				setState(115); 
				match(LPAR);
				setState(116); 
				expression(0);
				setState(117); 
				match(RPAR);
				setState(118); 
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
	}
	public static class CompoundExpressionContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(ToursParser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public CompoundExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitCompoundExpression(this);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
			case PLUS:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123); 
				prefixOperator();
				setState(124); 
				expression(13);
				}
				break;
			case LPAR:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126); 
				match(LPAR);
				setState(127); 
				expression(0);
				setState(128); 
				match(RPAR);
				}
				break;
			case LBRACE:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); 
				match(LBRACE);
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(135);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(131); 
							expression(0);
							setState(132); 
							match(SEMI);
							}
							break;
						case 2:
							{
							setState(134); 
							statement();
							}
							break;
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(140); 
				expression(0);
				setState(141); 
				match(RBRACE);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); 
				match(IDENTIFIER);
				}
				break;
			case CHAR:
				{
				_localctx = new CharacterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144); 
				match(CHAR);
				}
				break;
			case STR:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); 
				match(STR);
				}
				break;
			case INT:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); 
				match(INT);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147); 
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); 
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(152); 
						multiplyOperator();
						setState(153); 
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(156); 
						plusOperator();
						setState(157); 
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(160); 
						compareOperator();
						setState(161); 
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(164); 
						match(AND);
						setState(165); 
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(167); 
						match(OR);
						setState(168); 
						expression(9);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << PLUS))) != 0)) ) {
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
	}

	public final MultiplyOperatorContext multiplyOperator() throws RecognitionException {
		MultiplyOperatorContext _localctx = new MultiplyOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
	}

	public final PlusOperatorContext plusOperator() throws RecognitionException {
		PlusOperatorContext _localctx = new PlusOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_plusOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableType);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187); 
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
		case 7: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 12);
		case 1: 
			return precpred(_ctx, 11);
		case 2: 
			return precpred(_ctx, 10);
		case 3: 
			return precpred(_ctx, 9);
		case 4: 
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\3\5\3\5\7\5\63\n\5"+
		"\f\5\16\5\66\13\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7F\n\7\6\7H\n\7\r\7\16\7I\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3"+
		"\17\2\3\20\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\5\2\17\17##\'\'"+
		"\4\2$$+,\4\2##\'\'\4\2\27\27&&\5\2\34\37\"\"%%\u00d2\2\36\3\2\2\2\4$\3"+
		"\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n;\3\2\2\2\f@\3\2\2\2\16z\3\2\2\2\20\u0097"+
		"\3\2\2\2\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2\26\u00b4\3\2\2\2\30\u00b6\3"+
		"\2\2\2\32\u00b8\3\2\2\2\34\u00be\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 #"+
		"\5\6\4\2!#\5\n\6\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2"+
		"\2%\5\3\2\2\2&$\3\2\2\2\'(\5\b\5\2()\7*\2\2)+\3\2\2\2*\'\3\2\2\2+,\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2./\5\34\17\2/\64\7.\2\2\60\61\7\31"+
		"\2\2\61\63\7.\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\659\3\2\2\2\66\64\3\2\2\2\678\7\26\2\28:\5\20\t\29\67\3\2\2\29:\3"+
		"\2\2\2:\t\3\2\2\2;<\7.\2\2<=\7!\2\2=>\7)\2\2>?\5\f\7\2?\13\3\2\2\2@G\7"+
		" \2\2AF\5\16\b\2BC\5\b\5\2CD\7*\2\2DF\3\2\2\2EA\3\2\2\2EB\3\2\2\2FH\3"+
		"\2\2\2GE\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7(\2\2L\r\3"+
		"\2\2\2MN\7.\2\2NO\7\26\2\2OP\5\20\t\2PQ\7*\2\2Q{\3\2\2\2RS\7\f\2\2ST\7"+
		"!\2\2TU\5\20\t\2UV\7)\2\2VY\5\f\7\2WX\7\6\2\2XZ\5\f\7\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z{\3\2\2\2[\\\7\25\2\2\\]\7!\2\2]^\5\20\t\2^_\7)\2\2_`\5\f\7\2`"+
		"{\3\2\2\2ab\7\n\2\2bg\7!\2\2cd\5\b\5\2de\7*\2\2eh\3\2\2\2fh\5\16\b\2g"+
		"c\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\5\20\t\2jk\7*\2\2kl\5\16\b\2lm\7)\2\2"+
		"mn\5\f\7\2n{\3\2\2\2op\7\r\2\2pq\7!\2\2qr\7.\2\2rs\7)\2\2s{\7*\2\2tu\7"+
		"\20\2\2uv\7!\2\2vw\5\20\t\2wx\7)\2\2xy\7*\2\2y{\3\2\2\2zM\3\2\2\2zR\3"+
		"\2\2\2z[\3\2\2\2za\3\2\2\2zo\3\2\2\2zt\3\2\2\2{\17\3\2\2\2|}\b\t\1\2}"+
		"~\5\22\n\2~\177\5\20\t\17\177\u0098\3\2\2\2\u0080\u0081\7!\2\2\u0081\u0082"+
		"\5\20\t\2\u0082\u0083\7)\2\2\u0083\u0098\3\2\2\2\u0084\u008b\7 \2\2\u0085"+
		"\u0086\5\20\t\2\u0086\u0087\7*\2\2\u0087\u008a\3\2\2\2\u0088\u008a\5\16"+
		"\b\2\u0089\u0085\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7(\2\2\u0090\u0098\3\2\2\2\u0091"+
		"\u0098\7.\2\2\u0092\u0098\7\61\2\2\u0093\u0098\7\60\2\2\u0094\u0098\7"+
		"/\2\2\u0095\u0098\7\24\2\2\u0096\u0098\7\t\2\2\u0097|\3\2\2\2\u0097\u0080"+
		"\3\2\2\2\u0097\u0084\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u00ad\3\2\2\2\u0099\u009a\f\16\2\2\u009a\u009b\5\24\13\2\u009b"+
		"\u009c\5\20\t\17\u009c\u00ac\3\2\2\2\u009d\u009e\f\r\2\2\u009e\u009f\5"+
		"\26\f\2\u009f\u00a0\5\20\t\16\u00a0\u00ac\3\2\2\2\u00a1\u00a2\f\f\2\2"+
		"\u00a2\u00a3\5\32\16\2\u00a3\u00a4\5\20\t\r\u00a4\u00ac\3\2\2\2\u00a5"+
		"\u00a6\f\13\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00ac\5\20\t\f\u00a8\u00a9"+
		"\f\n\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ac\5\20\t\13\u00ab\u0099\3\2\2\2"+
		"\u00ab\u009d\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\23\3\2\2\2\u00b2"+
		"\u00b3\t\3\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5\27\3\2\2\2\u00b6"+
		"\u00b7\t\5\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9\33\3\2\2\2\u00ba"+
		"\u00bf\7\16\2\2\u00bb\u00bf\7\4\2\2\u00bc\u00bf\7\5\2\2\u00bd\u00bf\7"+
		"\23\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\35\3\2\2\2\22\"$,\649EIYgz\u0089\u008b\u0097\u00ab"+
		"\u00ad\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}