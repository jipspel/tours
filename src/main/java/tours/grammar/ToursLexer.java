// Generated from C:/Users/Jip/Documents/tours/src/main/java/tours/grammar\Tours.g4 by ANTLR 4.5
package tours.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToursLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "BOOLEAN", "BOOLEANARRAY", "CHARACTER", "CHARACTERARRAY", "ELSE", 
		"END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", "INTEGERARRAY", 
		"PRINT", "PROGRAM", "RETURN", "STRING", "STRINGARRAY", "TRUE", "VOID", 
		"WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", "DQUOTE", "EQ", 
		"GE", "GT", "LE", "LBLOCK", "LBRACE", "LPAR", "LT", "MINUS", "MODULO", 
		"NE", "NOT", "OR", "PLUS", "RBLOCK", "RBRACE", "RPAR", "SEMI", "SLASH", 
		"STAR", "SQUOTE", "UNDERSCORE", "IDENTIFIER", "INT", "STR", "CHAR", "LETTER", 
		"DIGIT", "COMMENT", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z"
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


	public ToursLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tours.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u01ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65"+
		"\u018b\n\65\f\65\16\65\u018e\13\65\3\66\3\66\7\66\u0192\n\66\f\66\16\66"+
		"\u0195\13\66\3\67\3\67\7\67\u0199\n\67\f\67\16\67\u019c\13\67\3\67\3\67"+
		"\38\38\38\38\39\39\3:\3:\3;\3;\3;\7;\u01ab\n;\f;\16;\u01ae\13;\3;\3;\3"+
		"<\6<\u01b3\n<\r<\16<\u01b4\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3"+
		"C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3"+
		"N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3\u019a\2W\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s\2u"+
		":w;y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\3\2 \4\2C\\c|\3\2\62"+
		";\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u01d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\3\u00ad\3\2\2\2\5\u00b3\3\2\2\2\7\u00bb\3\2\2\2\t\u00c5\3\2\2"+
		"\2\13\u00cf\3\2\2\2\r\u00db\3\2\2\2\17\u00e0\3\2\2\2\21\u00e4\3\2\2\2"+
		"\23\u00e9\3\2\2\2\25\u00ef\3\2\2\2\27\u00f3\3\2\2\2\31\u00f8\3\2\2\2\33"+
		"\u00fb\3\2\2\2\35\u0101\3\2\2\2\37\u0109\3\2\2\2!\u0113\3\2\2\2#\u0119"+
		"\3\2\2\2%\u0121\3\2\2\2\'\u0128\3\2\2\2)\u012f\3\2\2\2+\u0138\3\2\2\2"+
		"-\u013d\3\2\2\2/\u0142\3\2\2\2\61\u0148\3\2\2\2\63\u014a\3\2\2\2\65\u014d"+
		"\3\2\2\2\67\u014f\3\2\2\29\u0151\3\2\2\2;\u0153\3\2\2\2=\u0155\3\2\2\2"+
		"?\u0158\3\2\2\2A\u015b\3\2\2\2C\u015d\3\2\2\2E\u0160\3\2\2\2G\u0162\3"+
		"\2\2\2I\u0164\3\2\2\2K\u0166\3\2\2\2M\u0168\3\2\2\2O\u016a\3\2\2\2Q\u016c"+
		"\3\2\2\2S\u016f\3\2\2\2U\u0171\3\2\2\2W\u0174\3\2\2\2Y\u0176\3\2\2\2["+
		"\u0178\3\2\2\2]\u017a\3\2\2\2_\u017c\3\2\2\2a\u017e\3\2\2\2c\u0180\3\2"+
		"\2\2e\u0182\3\2\2\2g\u0184\3\2\2\2i\u0186\3\2\2\2k\u018f\3\2\2\2m\u0196"+
		"\3\2\2\2o\u019f\3\2\2\2q\u01a3\3\2\2\2s\u01a5\3\2\2\2u\u01a7\3\2\2\2w"+
		"\u01b2\3\2\2\2y\u01b8\3\2\2\2{\u01ba\3\2\2\2}\u01bc\3\2\2\2\177\u01be"+
		"\3\2\2\2\u0081\u01c0\3\2\2\2\u0083\u01c2\3\2\2\2\u0085\u01c4\3\2\2\2\u0087"+
		"\u01c6\3\2\2\2\u0089\u01c8\3\2\2\2\u008b\u01ca\3\2\2\2\u008d\u01cc\3\2"+
		"\2\2\u008f\u01ce\3\2\2\2\u0091\u01d0\3\2\2\2\u0093\u01d2\3\2\2\2\u0095"+
		"\u01d4\3\2\2\2\u0097\u01d6\3\2\2\2\u0099\u01d8\3\2\2\2\u009b\u01da\3\2"+
		"\2\2\u009d\u01dc\3\2\2\2\u009f\u01de\3\2\2\2\u00a1\u01e0\3\2\2\2\u00a3"+
		"\u01e2\3\2\2\2\u00a5\u01e4\3\2\2\2\u00a7\u01e6\3\2\2\2\u00a9\u01e8\3\2"+
		"\2\2\u00ab\u01ea\3\2\2\2\u00ad\u00ae\5{>\2\u00ae\u00af\5\u0081A\2\u00af"+
		"\u00b0\5\u0085C\2\u00b0\u00b1\5\u0089E\2\u00b1\u00b2\5\u0093J\2\u00b2"+
		"\4\3\2\2\2\u00b3\u00b4\5{>\2\u00b4\u00b5\5\u0095K\2\u00b5\u00b6\5\u0095"+
		"K\2\u00b6\u00b7\5\u008fH\2\u00b7\u00b8\5\u0081A\2\u00b8\u00b9\5y=\2\u00b9"+
		"\u00ba\5\u0093J\2\u00ba\6\3\2\2\2\u00bb\u00bc\5{>\2\u00bc\u00bd\5\u0095"+
		"K\2\u00bd\u00be\5\u0095K\2\u00be\u00bf\5\u008fH\2\u00bf\u00c0\5\u0081"+
		"A\2\u00c0\u00c1\5y=\2\u00c1\u00c2\5\u0093J\2\u00c2\u00c3\5E#\2\u00c3\u00c4"+
		"\5Y-\2\u00c4\b\3\2\2\2\u00c5\u00c6\5}?\2\u00c6\u00c7\5\u0087D\2\u00c7"+
		"\u00c8\5y=\2\u00c8\u00c9\5\u009bN\2\u00c9\u00ca\5y=\2\u00ca\u00cb\5}?"+
		"\2\u00cb\u00cc\5\u009fP\2\u00cc\u00cd\5\u0081A\2\u00cd\u00ce\5\u009bN"+
		"\2\u00ce\n\3\2\2\2\u00cf\u00d0\5}?\2\u00d0\u00d1\5\u0087D\2\u00d1\u00d2"+
		"\5y=\2\u00d2\u00d3\5\u009bN\2\u00d3\u00d4\5y=\2\u00d4\u00d5\5}?\2\u00d5"+
		"\u00d6\5\u009fP\2\u00d6\u00d7\5\u0081A\2\u00d7\u00d8\5\u009bN\2\u00d8"+
		"\u00d9\5E#\2\u00d9\u00da\5Y-\2\u00da\f\3\2\2\2\u00db\u00dc\5\u0081A\2"+
		"\u00dc\u00dd\5\u008fH\2\u00dd\u00de\5\u009dO\2\u00de\u00df\5\u0081A\2"+
		"\u00df\16\3\2\2\2\u00e0\u00e1\5\u0081A\2\u00e1\u00e2\5\u0093J\2\u00e2"+
		"\u00e3\5\177@\2\u00e3\20\3\2\2\2\u00e4\u00e5\5\u0081A\2\u00e5\u00e6\5"+
		"\u00a7T\2\u00e6\u00e7\5\u0089E\2\u00e7\u00e8\5\u009fP\2\u00e8\22\3\2\2"+
		"\2\u00e9\u00ea\5\u0083B\2\u00ea\u00eb\5y=\2\u00eb\u00ec\5\u008fH\2\u00ec"+
		"\u00ed\5\u009dO\2\u00ed\u00ee\5\u0081A\2\u00ee\24\3\2\2\2\u00ef\u00f0"+
		"\5\u0083B\2\u00f0\u00f1\5\u0095K\2\u00f1\u00f2\5\u009bN\2\u00f2\26\3\2"+
		"\2\2\u00f3\u00f4\5\u0083B\2\u00f4\u00f5\5\u00a1Q\2\u00f5\u00f6\5\u0093"+
		"J\2\u00f6\u00f7\5}?\2\u00f7\30\3\2\2\2\u00f8\u00f9\5\u0089E\2\u00f9\u00fa"+
		"\5\u0083B\2\u00fa\32\3\2\2\2\u00fb\u00fc\5\u0089E\2\u00fc\u00fd\5\u0093"+
		"J\2\u00fd\u00fe\5\u0097L\2\u00fe\u00ff\5\u00a1Q\2\u00ff\u0100\5\u009f"+
		"P\2\u0100\34\3\2\2\2\u0101\u0102\5\u0089E\2\u0102\u0103\5\u0093J\2\u0103"+
		"\u0104\5\u009fP\2\u0104\u0105\5\u0081A\2\u0105\u0106\5\u0085C\2\u0106"+
		"\u0107\5\u0081A\2\u0107\u0108\5\u009bN\2\u0108\36\3\2\2\2\u0109\u010a"+
		"\5\u0089E\2\u010a\u010b\5\u0093J\2\u010b\u010c\5\u009fP\2\u010c\u010d"+
		"\5\u0081A\2\u010d\u010e\5\u0085C\2\u010e\u010f\5\u0081A\2\u010f\u0110"+
		"\5\u009bN\2\u0110\u0111\5E#\2\u0111\u0112\5Y-\2\u0112 \3\2\2\2\u0113\u0114"+
		"\5\u0097L\2\u0114\u0115\5\u009bN\2\u0115\u0116\5\u0089E\2\u0116\u0117"+
		"\5\u0093J\2\u0117\u0118\5\u009fP\2\u0118\"\3\2\2\2\u0119\u011a\5\u0097"+
		"L\2\u011a\u011b\5\u009bN\2\u011b\u011c\5\u0095K\2\u011c\u011d\5\u0085"+
		"C\2\u011d\u011e\5\u009bN\2\u011e\u011f\5y=\2\u011f\u0120\5\u0091I\2\u0120"+
		"$\3\2\2\2\u0121\u0122\5\u009bN\2\u0122\u0123\5\u0081A\2\u0123\u0124\5"+
		"\u009fP\2\u0124\u0125\5\u00a1Q\2\u0125\u0126\5\u009bN\2\u0126\u0127\5"+
		"\u0093J\2\u0127&\3\2\2\2\u0128\u0129\5\u009dO\2\u0129\u012a\5\u009fP\2"+
		"\u012a\u012b\5\u009bN\2\u012b\u012c\5\u0089E\2\u012c\u012d\5\u0093J\2"+
		"\u012d\u012e\5\u0085C\2\u012e(\3\2\2\2\u012f\u0130\5\u009dO\2\u0130\u0131"+
		"\5\u009fP\2\u0131\u0132\5\u009bN\2\u0132\u0133\5\u0089E\2\u0133\u0134"+
		"\5\u0093J\2\u0134\u0135\5\u0085C\2\u0135\u0136\5E#\2\u0136\u0137\5Y-\2"+
		"\u0137*\3\2\2\2\u0138\u0139\5\u009fP\2\u0139\u013a\5\u009bN\2\u013a\u013b"+
		"\5\u00a1Q\2\u013b\u013c\5\u0081A\2\u013c,\3\2\2\2\u013d\u013e\5\u00a3"+
		"R\2\u013e\u013f\5\u0095K\2\u013f\u0140\5\u0089E\2\u0140\u0141\5\177@\2"+
		"\u0141.\3\2\2\2\u0142\u0143\5\u00a5S\2\u0143\u0144\5\u0087D\2\u0144\u0145"+
		"\5\u0089E\2\u0145\u0146\5\u008fH\2\u0146\u0147\5\u0081A\2\u0147\60\3\2"+
		"\2\2\u0148\u0149\7?\2\2\u0149\62\3\2\2\2\u014a\u014b\7(\2\2\u014b\u014c"+
		"\7(\2\2\u014c\64\3\2\2\2\u014d\u014e\7<\2\2\u014e\66\3\2\2\2\u014f\u0150"+
		"\7.\2\2\u01508\3\2\2\2\u0151\u0152\7\60\2\2\u0152:\3\2\2\2\u0153\u0154"+
		"\7$\2\2\u0154<\3\2\2\2\u0155\u0156\7?\2\2\u0156\u0157\7?\2\2\u0157>\3"+
		"\2\2\2\u0158\u0159\7@\2\2\u0159\u015a\7?\2\2\u015a@\3\2\2\2\u015b\u015c"+
		"\7@\2\2\u015cB\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015fD\3"+
		"\2\2\2\u0160\u0161\7]\2\2\u0161F\3\2\2\2\u0162\u0163\7}\2\2\u0163H\3\2"+
		"\2\2\u0164\u0165\7*\2\2\u0165J\3\2\2\2\u0166\u0167\7>\2\2\u0167L\3\2\2"+
		"\2\u0168\u0169\7/\2\2\u0169N\3\2\2\2\u016a\u016b\7\'\2\2\u016bP\3\2\2"+
		"\2\u016c\u016d\7#\2\2\u016d\u016e\7?\2\2\u016eR\3\2\2\2\u016f\u0170\7"+
		"#\2\2\u0170T\3\2\2\2\u0171\u0172\7~\2\2\u0172\u0173\7~\2\2\u0173V\3\2"+
		"\2\2\u0174\u0175\7-\2\2\u0175X\3\2\2\2\u0176\u0177\7_\2\2\u0177Z\3\2\2"+
		"\2\u0178\u0179\7\177\2\2\u0179\\\3\2\2\2\u017a\u017b\7+\2\2\u017b^\3\2"+
		"\2\2\u017c\u017d\7=\2\2\u017d`\3\2\2\2\u017e\u017f\7\61\2\2\u017fb\3\2"+
		"\2\2\u0180\u0181\7,\2\2\u0181d\3\2\2\2\u0182\u0183\7)\2\2\u0183f\3\2\2"+
		"\2\u0184\u0185\7a\2\2\u0185h\3\2\2\2\u0186\u018c\5q9\2\u0187\u018b\5q"+
		"9\2\u0188\u018b\5s:\2\u0189\u018b\5g\64\2\u018a\u0187\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018dj\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0193\5s:\2\u0190"+
		"\u0192\5s:\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194l\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019a"+
		"\5;\36\2\u0197\u0199\13\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019e\5;\36\2\u019en\3\2\2\2\u019f\u01a0\5e\63\2\u01a0"+
		"\u01a1\13\2\2\2\u01a1\u01a2\5e\63\2\u01a2p\3\2\2\2\u01a3\u01a4\t\2\2\2"+
		"\u01a4r\3\2\2\2\u01a5\u01a6\t\3\2\2\u01a6t\3\2\2\2\u01a7\u01a8\5a\61\2"+
		"\u01a8\u01ac\5a\61\2\u01a9\u01ab\n\4\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b0\b;\2\2\u01b0v\3\2\2\2\u01b1\u01b3\t\5\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\b<\2\2\u01b7x\3\2\2\2\u01b8\u01b9"+
		"\t\6\2\2\u01b9z\3\2\2\2\u01ba\u01bb\t\7\2\2\u01bb|\3\2\2\2\u01bc\u01bd"+
		"\t\b\2\2\u01bd~\3\2\2\2\u01be\u01bf\t\t\2\2\u01bf\u0080\3\2\2\2\u01c0"+
		"\u01c1\t\n\2\2\u01c1\u0082\3\2\2\2\u01c2\u01c3\t\13\2\2\u01c3\u0084\3"+
		"\2\2\2\u01c4\u01c5\t\f\2\2\u01c5\u0086\3\2\2\2\u01c6\u01c7\t\r\2\2\u01c7"+
		"\u0088\3\2\2\2\u01c8\u01c9\t\16\2\2\u01c9\u008a\3\2\2\2\u01ca\u01cb\t"+
		"\17\2\2\u01cb\u008c\3\2\2\2\u01cc\u01cd\t\20\2\2\u01cd\u008e\3\2\2\2\u01ce"+
		"\u01cf\t\21\2\2\u01cf\u0090\3\2\2\2\u01d0\u01d1\t\22\2\2\u01d1\u0092\3"+
		"\2\2\2\u01d2\u01d3\t\23\2\2\u01d3\u0094\3\2\2\2\u01d4\u01d5\t\24\2\2\u01d5"+
		"\u0096\3\2\2\2\u01d6\u01d7\t\25\2\2\u01d7\u0098\3\2\2\2\u01d8\u01d9\t"+
		"\26\2\2\u01d9\u009a\3\2\2\2\u01da\u01db\t\27\2\2\u01db\u009c\3\2\2\2\u01dc"+
		"\u01dd\t\30\2\2\u01dd\u009e\3\2\2\2\u01de\u01df\t\31\2\2\u01df\u00a0\3"+
		"\2\2\2\u01e0\u01e1\t\32\2\2\u01e1\u00a2\3\2\2\2\u01e2\u01e3\t\33\2\2\u01e3"+
		"\u00a4\3\2\2\2\u01e4\u01e5\t\34\2\2\u01e5\u00a6\3\2\2\2\u01e6\u01e7\t"+
		"\35\2\2\u01e7\u00a8\3\2\2\2\u01e8\u01e9\t\36\2\2\u01e9\u00aa\3\2\2\2\u01ea"+
		"\u01eb\t\37\2\2\u01eb\u00ac\3\2\2\2\t\2\u018a\u018c\u0193\u019a\u01ac"+
		"\u01b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}