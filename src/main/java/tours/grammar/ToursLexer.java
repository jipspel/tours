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
		AND=1, BEGIN=2, BOOLEAN=3, CHARACTER=4, ELSE=5, END=6, EXIT=7, FALSE=8, 
		FOR=9, FUNC=10, IF=11, INPUT=12, INTEGER=13, NOT=14, OR=15, PRINT=16, 
		PROC=17, PROGRAM=18, TRUE=19, WHILE=20, ASSIGNMENT=21, COLON=22, COMMA=23, 
		DOT=24, DQUOTE=25, EQ=26, GE=27, GT=28, LE=29, LBRACE=30, LPAR=31, LT=32, 
		MINUS=33, NE=34, PLUS=35, RBRACE=36, RPAR=37, SEMI=38, SLASH=39, STAR=40, 
		IDENTIFIER=41, NUM=42, STR=43, COMMENT=44, WS=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", 
		"FOR", "FUNC", "IF", "INPUT", "INTEGER", "NOT", "OR", "PRINT", "PROC", 
		"PROGRAM", "TRUE", "WHILE", "ASSIGNMENT", "COLON", "COMMA", "DOT", "DQUOTE", 
		"EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", 
		"RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "IDENTIFIER", "NUM", "STR", 
		"LETTER", "DIGIT", "COMMENT", "WS", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "':'", "','", 
		"'.'", "'\"'", null, "'>='", "'>'", "'<='", "'{'", "'('", "'<'", "'-'", 
		"'!='", "'+'", "'}'", "')'", "';'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", 
		"FOR", "FUNC", "IF", "INPUT", "INTEGER", "NOT", "OR", "PRINT", "PROC", 
		"PROGRAM", "TRUE", "WHILE", "ASSIGNMENT", "COLON", "COMMA", "DOT", "DQUOTE", 
		"EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", 
		"RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "IDENTIFIER", "NUM", "STR", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0199\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\7*\u013c\n*\f*\16*\u013f\13*\3+\3"+
		"+\7+\u0143\n+\f+\16+\u0146\13+\3,\3,\7,\u014a\n,\f,\16,\u014d\13,\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3/\7/\u0158\n/\f/\16/\u015b\13/\3/\3/\3\60\6\60\u0160"+
		"\n\60\r\60\16\60\u0161\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I"+
		"\3I\3J\3J\3\u014b\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]._/a\2c\2e\2"+
		"g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\3\2 \4\2C\\c|\3\2\62"+
		";\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\3\u0095\3\2\2\2\5\u0099\3\2\2\2\7\u009f\3\2\2\2\t\u00a7"+
		"\3\2\2\2\13\u00b1\3\2\2\2\r\u00b6\3\2\2\2\17\u00ba\3\2\2\2\21\u00bf\3"+
		"\2\2\2\23\u00c5\3\2\2\2\25\u00c9\3\2\2\2\27\u00d2\3\2\2\2\31\u00d5\3\2"+
		"\2\2\33\u00db\3\2\2\2\35\u00e3\3\2\2\2\37\u00e7\3\2\2\2!\u00ea\3\2\2\2"+
		"#\u00f0\3\2\2\2%\u00fa\3\2\2\2\'\u0102\3\2\2\2)\u0107\3\2\2\2+\u010d\3"+
		"\2\2\2-\u010f\3\2\2\2/\u0111\3\2\2\2\61\u0113\3\2\2\2\63\u0115\3\2\2\2"+
		"\65\u0117\3\2\2\2\67\u0119\3\2\2\29\u011c\3\2\2\2;\u011e\3\2\2\2=\u0121"+
		"\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C\u0127\3\2\2\2E\u0129\3\2\2\2G"+
		"\u012c\3\2\2\2I\u012e\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2"+
		"\2\2Q\u0136\3\2\2\2S\u0138\3\2\2\2U\u0140\3\2\2\2W\u0147\3\2\2\2Y\u0150"+
		"\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u015f\3\2\2\2a\u0165\3\2\2\2c"+
		"\u0167\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016d\3\2\2\2k\u016f\3\2"+
		"\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0175\3\2\2\2s\u0177\3\2\2\2u\u0179"+
		"\3\2\2\2w\u017b\3\2\2\2y\u017d\3\2\2\2{\u017f\3\2\2\2}\u0181\3\2\2\2\177"+
		"\u0183\3\2\2\2\u0081\u0185\3\2\2\2\u0083\u0187\3\2\2\2\u0085\u0189\3\2"+
		"\2\2\u0087\u018b\3\2\2\2\u0089\u018d\3\2\2\2\u008b\u018f\3\2\2\2\u008d"+
		"\u0191\3\2\2\2\u008f\u0193\3\2\2\2\u0091\u0195\3\2\2\2\u0093\u0197\3\2"+
		"\2\2\u0095\u0096\5a\61\2\u0096\u0097\5{>\2\u0097\u0098\5g\64\2\u0098\4"+
		"\3\2\2\2\u0099\u009a\5c\62\2\u009a\u009b\5i\65\2\u009b\u009c\5m\67\2\u009c"+
		"\u009d\5q9\2\u009d\u009e\5{>\2\u009e\6\3\2\2\2\u009f\u00a0\5c\62\2\u00a0"+
		"\u00a1\5}?\2\u00a1\u00a2\5}?\2\u00a2\u00a3\5w<\2\u00a3\u00a4\5i\65\2\u00a4"+
		"\u00a5\5a\61\2\u00a5\u00a6\5{>\2\u00a6\b\3\2\2\2\u00a7\u00a8\5e\63\2\u00a8"+
		"\u00a9\5o8\2\u00a9\u00aa\5a\61\2\u00aa\u00ab\5\u0083B\2\u00ab\u00ac\5"+
		"a\61\2\u00ac\u00ad\5e\63\2\u00ad\u00ae\5\u0087D\2\u00ae\u00af\5i\65\2"+
		"\u00af\u00b0\5\u0083B\2\u00b0\n\3\2\2\2\u00b1\u00b2\5i\65\2\u00b2\u00b3"+
		"\5w<\2\u00b3\u00b4\5\u0085C\2\u00b4\u00b5\5i\65\2\u00b5\f\3\2\2\2\u00b6"+
		"\u00b7\5i\65\2\u00b7\u00b8\5{>\2\u00b8\u00b9\5g\64\2\u00b9\16\3\2\2\2"+
		"\u00ba\u00bb\5i\65\2\u00bb\u00bc\5\u008fH\2\u00bc\u00bd\5q9\2\u00bd\u00be"+
		"\5\u0087D\2\u00be\20\3\2\2\2\u00bf\u00c0\5k\66\2\u00c0\u00c1\5a\61\2\u00c1"+
		"\u00c2\5w<\2\u00c2\u00c3\5\u0085C\2\u00c3\u00c4\5i\65\2\u00c4\22\3\2\2"+
		"\2\u00c5\u00c6\5k\66\2\u00c6\u00c7\5}?\2\u00c7\u00c8\5\u0083B\2\u00c8"+
		"\24\3\2\2\2\u00c9\u00ca\5k\66\2\u00ca\u00cb\5\u0089E\2\u00cb\u00cc\5{"+
		">\2\u00cc\u00cd\5e\63\2\u00cd\u00ce\5\u0087D\2\u00ce\u00cf\5q9\2\u00cf"+
		"\u00d0\5}?\2\u00d0\u00d1\5{>\2\u00d1\26\3\2\2\2\u00d2\u00d3\5q9\2\u00d3"+
		"\u00d4\5k\66\2\u00d4\30\3\2\2\2\u00d5\u00d6\5q9\2\u00d6\u00d7\5{>\2\u00d7"+
		"\u00d8\5\177@\2\u00d8\u00d9\5\u0089E\2\u00d9\u00da\5\u0087D\2\u00da\32"+
		"\3\2\2\2\u00db\u00dc\5q9\2\u00dc\u00dd\5{>\2\u00dd\u00de\5\u0087D\2\u00de"+
		"\u00df\5i\65\2\u00df\u00e0\5m\67\2\u00e0\u00e1\5i\65\2\u00e1\u00e2\5\u0083"+
		"B\2\u00e2\34\3\2\2\2\u00e3\u00e4\5{>\2\u00e4\u00e5\5}?\2\u00e5\u00e6\5"+
		"\u0087D\2\u00e6\36\3\2\2\2\u00e7\u00e8\5}?\2\u00e8\u00e9\5\u0083B\2\u00e9"+
		" \3\2\2\2\u00ea\u00eb\5\177@\2\u00eb\u00ec\5\u0083B\2\u00ec\u00ed\5q9"+
		"\2\u00ed\u00ee\5{>\2\u00ee\u00ef\5\u0087D\2\u00ef\"\3\2\2\2\u00f0\u00f1"+
		"\5\177@\2\u00f1\u00f2\5\u0083B\2\u00f2\u00f3\5}?\2\u00f3\u00f4\5e\63\2"+
		"\u00f4\u00f5\5i\65\2\u00f5\u00f6\5g\64\2\u00f6\u00f7\5\u0089E\2\u00f7"+
		"\u00f8\5\u0083B\2\u00f8\u00f9\5i\65\2\u00f9$\3\2\2\2\u00fa\u00fb\5\177"+
		"@\2\u00fb\u00fc\5\u0083B\2\u00fc\u00fd\5}?\2\u00fd\u00fe\5m\67\2\u00fe"+
		"\u00ff\5\u0083B\2\u00ff\u0100\5a\61\2\u0100\u0101\5y=\2\u0101&\3\2\2\2"+
		"\u0102\u0103\5\u0087D\2\u0103\u0104\5\u0083B\2\u0104\u0105\5\u0089E\2"+
		"\u0105\u0106\5i\65\2\u0106(\3\2\2\2\u0107\u0108\5\u008dG\2\u0108\u0109"+
		"\5o8\2\u0109\u010a\5q9\2\u010a\u010b\5w<\2\u010b\u010c\5i\65\2\u010c*"+
		"\3\2\2\2\u010d\u010e\7?\2\2\u010e,\3\2\2\2\u010f\u0110\7<\2\2\u0110.\3"+
		"\2\2\2\u0111\u0112\7.\2\2\u0112\60\3\2\2\2\u0113\u0114\7\60\2\2\u0114"+
		"\62\3\2\2\2\u0115\u0116\7$\2\2\u0116\64\3\2\2\2\u0117\u0118\7?\2\2\u0118"+
		"\66\3\2\2\2\u0119\u011a\7@\2\2\u011a\u011b\7?\2\2\u011b8\3\2\2\2\u011c"+
		"\u011d\7@\2\2\u011d:\3\2\2\2\u011e\u011f\7>\2\2\u011f\u0120\7?\2\2\u0120"+
		"<\3\2\2\2\u0121\u0122\7}\2\2\u0122>\3\2\2\2\u0123\u0124\7*\2\2\u0124@"+
		"\3\2\2\2\u0125\u0126\7>\2\2\u0126B\3\2\2\2\u0127\u0128\7/\2\2\u0128D\3"+
		"\2\2\2\u0129\u012a\7#\2\2\u012a\u012b\7?\2\2\u012bF\3\2\2\2\u012c\u012d"+
		"\7-\2\2\u012dH\3\2\2\2\u012e\u012f\7\177\2\2\u012fJ\3\2\2\2\u0130\u0131"+
		"\7+\2\2\u0131L\3\2\2\2\u0132\u0133\7=\2\2\u0133N\3\2\2\2\u0134\u0135\7"+
		"\61\2\2\u0135P\3\2\2\2\u0136\u0137\7,\2\2\u0137R\3\2\2\2\u0138\u013d\5"+
		"Y-\2\u0139\u013c\5Y-\2\u013a\u013c\5[.\2\u013b\u0139\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"T\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\5[.\2\u0141\u0143\5[.\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145V\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014b\5\63\32\2\u0148\u014a"+
		"\13\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\5\63\32\2\u014fX\3\2\2\2\u0150\u0151\t\2\2\2\u0151Z\3\2\2\2\u0152\u0153"+
		"\t\3\2\2\u0153\\\3\2\2\2\u0154\u0155\5O(\2\u0155\u0159\5O(\2\u0156\u0158"+
		"\n\4\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\b/"+
		"\2\2\u015d^\3\2\2\2\u015e\u0160\t\5\2\2\u015f\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\b\60\2\2\u0164`\3\2\2\2\u0165\u0166\t\6\2\2\u0166b\3\2\2\2\u0167"+
		"\u0168\t\7\2\2\u0168d\3\2\2\2\u0169\u016a\t\b\2\2\u016af\3\2\2\2\u016b"+
		"\u016c\t\t\2\2\u016ch\3\2\2\2\u016d\u016e\t\n\2\2\u016ej\3\2\2\2\u016f"+
		"\u0170\t\13\2\2\u0170l\3\2\2\2\u0171\u0172\t\f\2\2\u0172n\3\2\2\2\u0173"+
		"\u0174\t\r\2\2\u0174p\3\2\2\2\u0175\u0176\t\16\2\2\u0176r\3\2\2\2\u0177"+
		"\u0178\t\17\2\2\u0178t\3\2\2\2\u0179\u017a\t\20\2\2\u017av\3\2\2\2\u017b"+
		"\u017c\t\21\2\2\u017cx\3\2\2\2\u017d\u017e\t\22\2\2\u017ez\3\2\2\2\u017f"+
		"\u0180\t\23\2\2\u0180|\3\2\2\2\u0181\u0182\t\24\2\2\u0182~\3\2\2\2\u0183"+
		"\u0184\t\25\2\2\u0184\u0080\3\2\2\2\u0185\u0186\t\26\2\2\u0186\u0082\3"+
		"\2\2\2\u0187\u0188\t\27\2\2\u0188\u0084\3\2\2\2\u0189\u018a\t\30\2\2\u018a"+
		"\u0086\3\2\2\2\u018b\u018c\t\31\2\2\u018c\u0088\3\2\2\2\u018d\u018e\t"+
		"\32\2\2\u018e\u008a\3\2\2\2\u018f\u0190\t\33\2\2\u0190\u008c\3\2\2\2\u0191"+
		"\u0192\t\34\2\2\u0192\u008e\3\2\2\2\u0193\u0194\t\35\2\2\u0194\u0090\3"+
		"\2\2\2\u0195\u0196\t\36\2\2\u0196\u0092\3\2\2\2\u0197\u0198\t\37\2\2\u0198"+
		"\u0094\3\2\2\2\t\2\u013b\u013d\u0144\u014b\u0159\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}