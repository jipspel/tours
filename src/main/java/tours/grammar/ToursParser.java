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
		INTEGER_ARRAY=15, LENGTH=16, MAIN=17, NEW=18, PRINT=19, PROGRAM=20, RETURN=21, 
		STRING=22, STRING_ARRAY=23, TRUE=24, VOID=25, WHILE=26, ASSIGNMENT=27, 
		AND=28, COLON=29, COMMA=30, DOT=31, DQUOTE=32, EQ=33, GE=34, GT=35, LE=36, 
		LBLOCK=37, LBRACE=38, LPAR=39, LT=40, MINUS=41, MODULO=42, NE=43, NOT=44, 
		OR=45, PLUS=46, RBLOCK=47, RBRACE=48, RPAR=49, SEMI=50, SLASH=51, STAR=52, 
		SQUOTE=53, UNDERSCORE=54, IDENTIFIER=55, INT=56, STR=57, CHAR=58, COMMENT=59, 
		WS=60;
	public static final int
		RULE_program = 0, RULE_variable = 1, RULE_variableAssignment = 2, RULE_voidFunction = 3, 
		RULE_returnFunction = 4, RULE_mainFunction = 5, RULE_block = 6, RULE_returnBlock = 7, 
		RULE_statement = 8, RULE_conditionalStatement = 9, RULE_returnStatement = 10, 
		RULE_expression = 11, RULE_compound = 12, RULE_prefixOperator = 13, RULE_multiplyOperator = 14, 
		RULE_plusOperator = 15, RULE_booleanOperator = 16, RULE_compareOperator = 17, 
		RULE_variableType = 18, RULE_primitiveType = 19, RULE_arrayType = 20;
	public static final String[] ruleNames = {
		"program", "variable", "variableAssignment", "voidFunction", "returnFunction", 
		"mainFunction", "block", "returnBlock", "statement", "conditionalStatement", 
		"returnStatement", "expression", "compound", "prefixOperator", "multiplyOperator", 
		"plusOperator", "booleanOperator", "compareOperator", "variableType", 
		"primitiveType", "arrayType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'='", "'&&'", "':'", "','", "'.'", "'\"'", "'=='", 
		"'>='", "'>'", "'<='", "'['", "'{'", "'('", "'<'", "'-'", "'%'", "'!='", 
		"'!'", "'||'", "'+'", "']'", "'}'", "')'", "';'", "'/'", "'*'", "'''", 
		"'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "BOOLEAN_ARRAY", "CHARACTER", "CHARACTER_ARRAY", 
		"ELSE", "END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", 
		"INTEGER_ARRAY", "LENGTH", "MAIN", "NEW", "PRINT", "PROGRAM", "RETURN", 
		"STRING", "STRING_ARRAY", "TRUE", "VOID", "WHILE", "ASSIGNMENT", "AND", 
		"COLON", "COMMA", "DOT", "DQUOTE", "EQ", "GE", "GT", "LE", "LBLOCK", "LBRACE", 
		"LPAR", "LT", "MINUS", "MODULO", "NE", "NOT", "OR", "PLUS", "RBLOCK", 
		"RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "SQUOTE", "UNDERSCORE", "IDENTIFIER", 
		"INT", "STR", "CHAR", "COMMENT", "WS"
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
		public List<VoidFunctionContext> voidFunction() {
			return getRuleContexts(VoidFunctionContext.class);
		}
		public VoidFunctionContext voidFunction(int i) {
			return getRuleContext(VoidFunctionContext.class,i);
		}
		public List<ReturnFunctionContext> returnFunction() {
			return getRuleContexts(ReturnFunctionContext.class);
		}
		public ReturnFunctionContext returnFunction(int i) {
			return getRuleContext(ReturnFunctionContext.class,i);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(44);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(42); 
						voidFunction();
						}
						break;
					case 2:
						{
						setState(43); 
						returnFunction();
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(49); 
				mainFunction();
				}
				break;
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				setState(54);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52); 
					voidFunction();
					}
					break;
				case 2:
					{
					setState(53); 
					returnFunction();
					}
					break;
				}
				}
				setState(58);
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
		public List<TerminalNode> COMMA() { return getTokens(ToursParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToursParser.COMMA, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ToursParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 2, RULE_variable);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				_localctx = new VariablePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59); 
				primitiveType();
				setState(60); 
				match(IDENTIFIER);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61); 
					match(COMMA);
					setState(62); 
					match(IDENTIFIER);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(68); 
					match(ASSIGNMENT);
					setState(69); 
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
				setState(72); 
				arrayType();
				setState(73); 
				match(IDENTIFIER);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74); 
					match(COMMA);
					setState(75); 
					match(IDENTIFIER);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(81); 
					match(ASSIGNMENT);
					setState(82); 
					expression(0);
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
		enterRule(_localctx, 4, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			match(IDENTIFIER);
			setState(92);
			_la = _input.LA(1);
			if (_la==LBLOCK) {
				{
				setState(88); 
				match(LBLOCK);
				setState(89); 
				expression(0);
				setState(90); 
				match(RBLOCK);
				}
			}

			setState(94); 
			match(ASSIGNMENT);
			setState(95); 
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

	public static class VoidFunctionContext extends ParserRuleContext {
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
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
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

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_voidFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			match(FUNC);
			setState(98); 
			match(VOID);
			setState(99); 
			match(IDENTIFIER);
			setState(100); 
			match(LPAR);
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101); 
						variableType();
						setState(102); 
						match(IDENTIFIER);
						setState(103); 
						match(COMMA);
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				{
				setState(110); 
				variableType();
				setState(111); 
				match(IDENTIFIER);
				}
				}
			}

			setState(115); 
			match(RPAR);
			setState(116); 
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

	public static class ReturnFunctionContext extends ParserRuleContext {
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
		public ReturnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunction; }
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

	public final ReturnFunctionContext returnFunction() throws RecognitionException {
		ReturnFunctionContext _localctx = new ReturnFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ToursParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(ToursParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			match(FUNC);
			setState(140); 
			match(MAIN);
			setState(141); 
			match(LPAR);
			setState(142); 
			match(RPAR);
			setState(143); 
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
			setState(145); 
			match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << NEW) | (1L << PRINT) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(154);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(146); 
						statement();
						}
						break;
					case 2:
						{
						setState(147); 
						variable();
						}
						break;
					case 3:
						{
						setState(148); 
						expression(0);
						}
						break;
					}
					setState(151); 
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(153); 
					conditionalStatement();
					}
					break;
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); 
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
			setState(161); 
			match(LBRACE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BOOLEAN_ARRAY) | (1L << CHARACTER) | (1L << CHARACTER_ARRAY) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << INTEGER) | (1L << INTEGER_ARRAY) | (1L << NEW) | (1L << PRINT) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << TRUE) | (1L << WHILE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				setState(170);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(162); 
						statement();
						}
						break;
					case 2:
						{
						setState(163); 
						variable();
						}
						break;
					case 3:
						{
						setState(164); 
						expression(0);
						}
						break;
					}
					setState(167); 
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(169); 
					conditionalStatement();
					}
					break;
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); 
			returnStatement();
			setState(176); 
			match(SEMI);
			setState(177); 
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
			setState(203);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179); 
				variableAssignment();
				}
				break;
			case INPUT:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180); 
				match(INPUT);
				setState(181); 
				match(LPAR);
				setState(182); 
				match(IDENTIFIER);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183); 
					match(COMMA);
					setState(184); 
					match(IDENTIFIER);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190); 
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191); 
				match(PRINT);
				setState(192); 
				match(LPAR);
				setState(193); 
				expression(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194); 
					match(COMMA);
					setState(195); 
					expression(0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201); 
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
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
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
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		public List<CompoundContext> compound() {
			return getRuleContexts(CompoundContext.class);
		}
		public CompoundContext compound(int i) {
			return getRuleContext(CompoundContext.class,i);
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
			setState(233);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				match(IF);
				setState(206); 
				match(LPAR);
				setState(207); 
				expression(0);
				setState(208); 
				match(RPAR);
				setState(209); 
				compound();
				setState(212);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(210); 
					match(ELSE);
					setState(211); 
					compound();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); 
				match(WHILE);
				setState(215); 
				match(LPAR);
				setState(216); 
				expression(0);
				setState(217); 
				match(RPAR);
				setState(218); 
				compound();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); 
				match(FOR);
				setState(221); 
				match(LPAR);
				setState(224);
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
					setState(222); 
					variable();
					}
					break;
				case INPUT:
				case PRINT:
				case IDENTIFIER:
					{
					setState(223); 
					statement();
					}
					break;
				case SEMI:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226); 
				match(SEMI);
				setState(227); 
				expression(0);
				setState(228); 
				match(SEMI);
				setState(229); 
				variableAssignment();
				setState(230); 
				match(RPAR);
				setState(231); 
				compound();
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
			setState(235); 
			match(RETURN);
			setState(236); 
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
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(ToursParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ToursParser.RPAR, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayNewExpressionContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(ToursParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public ArrayNewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInitialisationExpressionContext extends ExpressionContext {
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
		public ArrayInitialisationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayInitialisationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayInitialisationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayInitialisationExpression(this);
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
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(ToursParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ToursParser.LENGTH, 0); }
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayLengthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayLengthExpression(this);
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
	public static class ArrayElementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ToursParser.IDENTIFIER, 0); }
		public TerminalNode LBLOCK() { return getToken(ToursParser.LBLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBLOCK() { return getToken(ToursParser.RBLOCK, 0); }
		public ArrayElementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).enterArrayElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToursListener ) ((ToursListener)listener).exitArrayElementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToursVisitor ) return ((ToursVisitor<? extends T>)visitor).visitArrayElementExpression(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(239); 
				prefixOperator();
				setState(240); 
				expression(21);
				}
				break;
			case 2:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); 
				match(LPAR);
				setState(243); 
				expression(0);
				setState(244); 
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new ArrayElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246); 
				match(IDENTIFIER);
				setState(247); 
				match(LBLOCK);
				setState(248); 
				expression(0);
				setState(249); 
				match(RBLOCK);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitialisationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); 
				match(LBRACE);
				setState(252); 
				expression(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(253); 
					match(COMMA);
					setState(254); 
					expression(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260); 
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new ArrayNewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); 
				match(NEW);
				setState(263); 
				primitiveType();
				setState(264); 
				match(LBLOCK);
				setState(265); 
				expression(0);
				setState(266); 
				match(RBLOCK);
				}
				break;
			case 6:
				{
				_localctx = new ArrayLengthExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); 
				match(IDENTIFIER);
				setState(269); 
				match(DOT);
				setState(270); 
				match(LENGTH);
				}
				break;
			case 7:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); 
				compound();
				}
				break;
			case 8:
				{
				_localctx = new IfElseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); 
				match(IF);
				setState(273); 
				match(LPAR);
				setState(274); 
				expression(0);
				setState(275); 
				match(RPAR);
				setState(276); 
				compound();
				setState(277); 
				match(ELSE);
				setState(278); 
				compound();
				}
				break;
			case 9:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); 
				match(INPUT);
				setState(281); 
				match(LPAR);
				setState(282); 
				match(IDENTIFIER);
				setState(283); 
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); 
				match(PRINT);
				setState(285); 
				match(LPAR);
				setState(286); 
				expression(0);
				setState(287); 
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289); 
				match(IDENTIFIER);
				setState(290); 
				match(LPAR);
				setState(300);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << IF) | (1L << INPUT) | (1L << NEW) | (1L << PRINT) | (1L << TRUE) | (1L << LBRACE) | (1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << IDENTIFIER) | (1L << INT) | (1L << STR) | (1L << CHAR))) != 0)) {
					{
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(291); 
							expression(0);
							setState(292); 
							match(COMMA);
							}
							} 
						}
						setState(298);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					setState(299); 
					expression(0);
					}
				}

				setState(302); 
				match(RPAR);
				}
				break;
			case 12:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303); 
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new CharacterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304); 
				match(CHAR);
				}
				break;
			case 14:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305); 
				match(STR);
				}
				break;
			case 15:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306); 
				match(INT);
				}
				break;
			case 16:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307); 
				match(TRUE);
				}
				break;
			case 17:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308); 
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(312); 
						multiplyOperator();
						setState(313); 
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(316); 
						plusOperator();
						setState(317); 
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(320); 
						compareOperator();
						setState(321); 
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new BooleanAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(324); 
						match(AND);
						setState(325); 
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new BooleanOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(327); 
						match(OR);
						setState(328); 
						expression(17);
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 24, RULE_compound);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			match(LBRACE);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(343);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(338);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(335); 
							statement();
							}
							break;
						case 2:
							{
							setState(336); 
							variable();
							}
							break;
						case 3:
							{
							setState(337); 
							expression(0);
							}
							break;
						}
						setState(340); 
						match(SEMI);
						}
						break;
					case 2:
						{
						setState(342); 
						conditionalStatement();
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			{
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(348); 
				statement();
				}
				break;
			case 2:
				{
				setState(349); 
				variable();
				}
				break;
			case 3:
				{
				setState(350); 
				expression(0);
				}
				break;
			}
			setState(353); 
			match(SEMI);
			}
			setState(355); 
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
			setState(357);
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
			setState(359);
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
			setState(361);
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
			setState(363);
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
			setState(365);
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
			setState(369);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); 
				primitiveType();
				}
				break;
			case BOOLEAN_ARRAY:
			case CHARACTER_ARRAY:
			case INTEGER_ARRAY:
			case STRING_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); 
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
			setState(375);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371); 
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(373); 
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(374); 
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
			setState(381);
			switch (_input.LA(1)) {
			case INTEGER_ARRAY:
				_localctx = new IntegerArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377); 
				match(INTEGER_ARRAY);
				}
				break;
			case BOOLEAN_ARRAY:
				_localctx = new BooleanArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378); 
				match(BOOLEAN_ARRAY);
				}
				break;
			case CHARACTER_ARRAY:
				_localctx = new CharacterArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379); 
				match(CHARACTER_ARRAY);
				}
				break;
			case STRING_ARRAY:
				_localctx = new StringArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380); 
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
		case 11: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 20);
		case 1: 
			return precpred(_ctx, 19);
		case 2: 
			return precpred(_ctx, 18);
		case 3: 
			return precpred(_ctx, 17);
		case 4: 
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\5\2\65\n\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\7"+
		"\3B\n\3\f\3\16\3E\13\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16"+
		"\3R\13\3\3\3\3\3\5\3V\n\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5"+
		"\3\5\5\5t\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n"+
		"\6\f\6\16\6\u0084\13\6\3\6\3\6\3\6\5\6\u0089\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\b\3\b\3\b\7\b\u009d\n\b"+
		"\f\b\16\b\u00a0\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\3\t"+
		"\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c7"+
		"\n\n\f\n\16\n\u00ca\13\n\3\n\3\n\5\n\u00ce\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00e3\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ec\n"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0129\n\r\f\r\16\r\u012c"+
		"\13\r\3\r\5\r\u012f\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0138\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u014c\n\r\f\r\16\r\u014f\13\r\3\16\3\16\3\16\3\16\5\16\u0155\n\16\3"+
		"\16\3\16\3\16\7\16\u015a\n\16\f\16\16\16\u015d\13\16\3\16\3\16\3\16\5"+
		"\16\u0162\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\5\24\u0174\n\24\3\25\3\25\3\25\3\25\5\25\u017a"+
		"\n\25\3\26\3\26\3\26\3\26\5\26\u0180\n\26\3\26\2\3\30\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\7\5\2++..\60\60\4\2,,\65\66\4\2++\60"+
		"\60\4\2\36\36//\5\2#&**--\u01b1\2\60\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bc"+
		"\3\2\2\2\nx\3\2\2\2\f\u008d\3\2\2\2\16\u0093\3\2\2\2\20\u00a3\3\2\2\2"+
		"\22\u00cd\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2\2\2\30\u0137\3\2\2\2\32"+
		"\u0150\3\2\2\2\34\u0167\3\2\2\2\36\u0169\3\2\2\2 \u016b\3\2\2\2\"\u016d"+
		"\3\2\2\2$\u016f\3\2\2\2&\u0173\3\2\2\2(\u0179\3\2\2\2*\u017f\3\2\2\2,"+
		"/\5\b\5\2-/\5\n\6\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63\65\5\f\7\2\64\63\3\2\2\2\64\65"+
		"\3\2\2\2\65:\3\2\2\2\669\5\b\5\2\679\5\n\6\28\66\3\2\2\28\67\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<:\3\2\2\2=>\5(\25\2>C\79\2\2"+
		"?@\7 \2\2@B\79\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2E"+
		"C\3\2\2\2FG\7\35\2\2GI\5\30\r\2HF\3\2\2\2HI\3\2\2\2IX\3\2\2\2JK\5*\26"+
		"\2KP\79\2\2LM\7 \2\2MO\79\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QU\3\2\2\2RP\3\2\2\2ST\7\35\2\2TV\5\30\r\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2W=\3\2\2\2WJ\3\2\2\2X\5\3\2\2\2Y^\79\2\2Z[\7\'\2\2[\\\5\30\r\2\\]\7"+
		"\61\2\2]_\3\2\2\2^Z\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\35\2\2ab\5\30\r\2"+
		"b\7\3\2\2\2cd\7\r\2\2de\7\33\2\2ef\79\2\2fs\7)\2\2gh\5&\24\2hi\79\2\2"+
		"ij\7 \2\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
		"om\3\2\2\2pq\5&\24\2qr\79\2\2rt\3\2\2\2sm\3\2\2\2st\3\2\2\2tu\3\2\2\2"+
		"uv\7\63\2\2vw\5\16\b\2w\t\3\2\2\2xy\7\r\2\2yz\5&\24\2z{\79\2\2{\u0088"+
		"\7)\2\2|}\5&\24\2}~\79\2\2~\177\7 \2\2\177\u0081\3\2\2\2\u0080|\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5&\24\2\u0086\u0087\79\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\7\63\2\2\u008b\u008c\5\20\t\2\u008c\13\3\2\2\2\u008d"+
		"\u008e\7\r\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7)\2\2\u0090\u0091\7\63"+
		"\2\2\u0091\u0092\5\16\b\2\u0092\r\3\2\2\2\u0093\u009e\7(\2\2\u0094\u0098"+
		"\5\22\n\2\u0095\u0098\5\4\3\2\u0096\u0098\5\30\r\2\u0097\u0094\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\7\64\2\2\u009a\u009d\3\2\2\2\u009b\u009d\5\24\13\2\u009c\u0097\3\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\62\2\2"+
		"\u00a2\17\3\2\2\2\u00a3\u00ae\7(\2\2\u00a4\u00a8\5\22\n\2\u00a5\u00a8"+
		"\5\4\3\2\u00a6\u00a8\5\30\r\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\64\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00a7\3\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\64\2\2"+
		"\u00b3\u00b4\7\62\2\2\u00b4\21\3\2\2\2\u00b5\u00ce\5\6\4\2\u00b6\u00b7"+
		"\7\17\2\2\u00b7\u00b8\7)\2\2\u00b8\u00bd\79\2\2\u00b9\u00ba\7 \2\2\u00ba"+
		"\u00bc\79\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00ce\7\63\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\7)\2\2\u00c3\u00c8\5"+
		"\30\r\2\u00c4\u00c5\7 \2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\63\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00b5\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00c1\3\2\2\2\u00ce\23\3\2\2"+
		"\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\5\30\r\2\u00d2"+
		"\u00d3\7\63\2\2\u00d3\u00d6\5\32\16\2\u00d4\u00d5\7\b\2\2\u00d5\u00d7"+
		"\5\32\16\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00ec\3\2\2\2"+
		"\u00d8\u00d9\7\34\2\2\u00d9\u00da\7)\2\2\u00da\u00db\5\30\r\2\u00db\u00dc"+
		"\7\63\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00ec\3\2\2\2\u00de\u00df\7\f\2"+
		"\2\u00df\u00e2\7)\2\2\u00e0\u00e3\5\4\3\2\u00e1\u00e3\5\22\n\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7\64\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7\64\2\2\u00e7\u00e8"+
		"\5\6\4\2\u00e8\u00e9\7\63\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00ec\3\2\2"+
		"\2\u00eb\u00cf\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb\u00de\3\2\2\2\u00ec\25"+
		"\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef\5\30\r\2\u00ef\27\3\2\2\2\u00f0"+
		"\u00f1\b\r\1\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\5\30\r\27\u00f3\u0138"+
		"\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7\63\2\2"+
		"\u00f7\u0138\3\2\2\2\u00f8\u00f9\79\2\2\u00f9\u00fa\7\'\2\2\u00fa\u00fb"+
		"\5\30\r\2\u00fb\u00fc\7\61\2\2\u00fc\u0138\3\2\2\2\u00fd\u00fe\7(\2\2"+
		"\u00fe\u0103\5\30\r\2\u00ff\u0100\7 \2\2\u0100\u0102\5\30\r\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0138\3"+
		"\2\2\2\u0108\u0109\7\24\2\2\u0109\u010a\5(\25\2\u010a\u010b\7\'\2\2\u010b"+
		"\u010c\5\30\r\2\u010c\u010d\7\61\2\2\u010d\u0138\3\2\2\2\u010e\u010f\7"+
		"9\2\2\u010f\u0110\7!\2\2\u0110\u0138\7\22\2\2\u0111\u0138\5\32\16\2\u0112"+
		"\u0113\7\16\2\2\u0113\u0114\7)\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7"+
		"\63\2\2\u0116\u0117\5\32\16\2\u0117\u0118\7\b\2\2\u0118\u0119\5\32\16"+
		"\2\u0119\u0138\3\2\2\2\u011a\u011b\7\17\2\2\u011b\u011c\7)\2\2\u011c\u011d"+
		"\79\2\2\u011d\u0138\7\63\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7)\2\2\u0120"+
		"\u0121\5\30\r\2\u0121\u0122\7\63\2\2\u0122\u0138\3\2\2\2\u0123\u0124\7"+
		"9\2\2\u0124\u012e\7)\2\2\u0125\u0126\5\30\r\2\u0126\u0127\7 \2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\5\30\r\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0138\7\63\2\2\u0131\u0138\79\2\2\u0132\u0138\7<\2\2\u0133"+
		"\u0138\7;\2\2\u0134\u0138\7:\2\2\u0135\u0138\7\32\2\2\u0136\u0138\7\13"+
		"\2\2\u0137\u00f0\3\2\2\2\u0137\u00f4\3\2\2\2\u0137\u00f8\3\2\2\2\u0137"+
		"\u00fd\3\2\2\2\u0137\u0108\3\2\2\2\u0137\u010e\3\2\2\2\u0137\u0111\3\2"+
		"\2\2\u0137\u0112\3\2\2\2\u0137\u011a\3\2\2\2\u0137\u011e\3\2\2\2\u0137"+
		"\u0123\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2"+
		"\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u014d\3\2\2\2\u0139\u013a\f\26\2\2\u013a\u013b\5\36\20\2\u013b\u013c"+
		"\5\30\r\27\u013c\u014c\3\2\2\2\u013d\u013e\f\25\2\2\u013e\u013f\5 \21"+
		"\2\u013f\u0140\5\30\r\26\u0140\u014c\3\2\2\2\u0141\u0142\f\24\2\2\u0142"+
		"\u0143\5$\23\2\u0143\u0144\5\30\r\25\u0144\u014c\3\2\2\2\u0145\u0146\f"+
		"\23\2\2\u0146\u0147\7\36\2\2\u0147\u014c\5\30\r\24\u0148\u0149\f\22\2"+
		"\2\u0149\u014a\7/\2\2\u014a\u014c\5\30\r\23\u014b\u0139\3\2\2\2\u014b"+
		"\u013d\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0148\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\31\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u015b\7(\2\2\u0151\u0155\5\22\n"+
		"\2\u0152\u0155\5\4\3\2\u0153\u0155\5\30\r\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\64"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u015a\5\24\13\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u0161\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0162\5\22\n\2\u015f"+
		"\u0162\5\4\3\2\u0160\u0162\5\30\r\2\u0161\u015e\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\64\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\7\62\2\2\u0166\33\3\2\2\2\u0167\u0168\t\2\2"+
		"\2\u0168\35\3\2\2\2\u0169\u016a\t\3\2\2\u016a\37\3\2\2\2\u016b\u016c\t"+
		"\4\2\2\u016c!\3\2\2\2\u016d\u016e\t\5\2\2\u016e#\3\2\2\2\u016f\u0170\t"+
		"\6\2\2\u0170%\3\2\2\2\u0171\u0174\5(\25\2\u0172\u0174\5*\26\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174\'\3\2\2\2\u0175\u017a\7\20\2\2\u0176"+
		"\u017a\7\4\2\2\u0177\u017a\7\6\2\2\u0178\u017a\7\30\2\2\u0179\u0175\3"+
		"\2\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a"+
		")\3\2\2\2\u017b\u0180\7\21\2\2\u017c\u0180\7\5\2\2\u017d\u0180\7\7\2\2"+
		"\u017e\u0180\7\31\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u017e\3\2\2\2\u0180+\3\2\2\2*.\60\648:CHPUW^ms\u0082\u0088"+
		"\u0097\u009c\u009e\u00a7\u00ac\u00ae\u00bd\u00c8\u00cd\u00d6\u00e2\u00eb"+
		"\u0103\u012a\u012e\u0137\u014b\u014d\u0154\u0159\u015b\u0161\u0173\u0179"+
		"\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}