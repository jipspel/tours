// Generated from /Users/twancoenraad/Code/tours/src/main/java/tours/grammar/Tours.g4 by ANTLR 4.5
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
		BEGIN=1, BOOLEAN=2, CHARACTER=3, ELSE=4, END=5, EXIT=6, FALSE=7, FOR=8, 
		FUNC=9, IF=10, INPUT=11, INTEGER=12, PRINT=13, PROC=14, PROGRAM=15, STRING=16, 
		TRUE=17, WHILE=18, ASSIGNMENT=19, AND=20, COLON=21, COMMA=22, DOT=23, 
		DQUOTE=24, EQ=25, GE=26, GT=27, LE=28, LBRACE=29, LPAR=30, LT=31, MINUS=32, 
		MODULO=33, NE=34, NOT=35, OR=36, PLUS=37, RBRACE=38, RPAR=39, SEMI=40, 
		SLASH=41, STAR=42, SQUOTE=43, IDENTIFIER=44, INT=45, STR=46, CHAR=47, 
		COMMENT=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", "FOR", 
		"FUNC", "IF", "INPUT", "INTEGER", "PRINT", "PROC", "PROGRAM", "STRING", 
		"TRUE", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", "DQUOTE", 
		"EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "MODULO", "NE", 
		"NOT", "OR", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "SQUOTE", 
		"IDENTIFIER", "INT", "STR", "CHAR", "LETTER", "DIGIT", "COMMENT", "WS", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'='", "'&&'", "':'", "','", 
		"'.'", "'\"'", "'=='", "'>='", "'>'", "'<='", "'{'", "'('", "'<'", "'-'", 
		"'%'", "'!='", "'!'", "'||'", "'+'", "'}'", "')'", "';'", "'/'", "'*'", 
		"'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "CHARACTER", "ELSE", "END", "EXIT", "FALSE", 
		"FOR", "FUNC", "IF", "INPUT", "INTEGER", "PRINT", "PROC", "PROGRAM", "STRING", 
		"TRUE", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", "DQUOTE", 
		"EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "MODULO", "NE", 
		"NOT", "OR", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "SQUOTE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u01ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3-\7-\u014d\n-\f-\16-\u0150\13-\3.\3.\7.\u0154\n.\f.\16.\u0157"+
		"\13.\3/\3/\7/\u015b\n/\f/\16/\u015e\13/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\7\63\u016d\n\63\f\63\16\63\u0170\13\63"+
		"\3\63\3\63\3\64\6\64\u0175\n\64\r\64\16\64\u0176\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3N\3N\3\u015c\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\2c\2e\62g\63i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2"+
		"\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\3\2 \4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4"+
		"\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2"+
		"[[{{\4\2\\\\||\u0197\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3\u009d\3\2\2\2\5\u00a3\3\2\2\2"+
		"\7\u00ab\3\2\2\2\t\u00b5\3\2\2\2\13\u00ba\3\2\2\2\r\u00be\3\2\2\2\17\u00c3"+
		"\3\2\2\2\21\u00c9\3\2\2\2\23\u00cd\3\2\2\2\25\u00d6\3\2\2\2\27\u00d9\3"+
		"\2\2\2\31\u00df\3\2\2\2\33\u00e7\3\2\2\2\35\u00ed\3\2\2\2\37\u00f7\3\2"+
		"\2\2!\u00ff\3\2\2\2#\u0106\3\2\2\2%\u010b\3\2\2\2\'\u0111\3\2\2\2)\u0113"+
		"\3\2\2\2+\u0116\3\2\2\2-\u0118\3\2\2\2/\u011a\3\2\2\2\61\u011c\3\2\2\2"+
		"\63\u011e\3\2\2\2\65\u0121\3\2\2\2\67\u0124\3\2\2\29\u0126\3\2\2\2;\u0129"+
		"\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C\u0131\3\2\2\2E"+
		"\u0133\3\2\2\2G\u0136\3\2\2\2I\u0138\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2"+
		"\2\2O\u013f\3\2\2\2Q\u0141\3\2\2\2S\u0143\3\2\2\2U\u0145\3\2\2\2W\u0147"+
		"\3\2\2\2Y\u0149\3\2\2\2[\u0151\3\2\2\2]\u0158\3\2\2\2_\u0161\3\2\2\2a"+
		"\u0165\3\2\2\2c\u0167\3\2\2\2e\u0169\3\2\2\2g\u0174\3\2\2\2i\u017a\3\2"+
		"\2\2k\u017c\3\2\2\2m\u017e\3\2\2\2o\u0180\3\2\2\2q\u0182\3\2\2\2s\u0184"+
		"\3\2\2\2u\u0186\3\2\2\2w\u0188\3\2\2\2y\u018a\3\2\2\2{\u018c\3\2\2\2}"+
		"\u018e\3\2\2\2\177\u0190\3\2\2\2\u0081\u0192\3\2\2\2\u0083\u0194\3\2\2"+
		"\2\u0085\u0196\3\2\2\2\u0087\u0198\3\2\2\2\u0089\u019a\3\2\2\2\u008b\u019c"+
		"\3\2\2\2\u008d\u019e\3\2\2\2\u008f\u01a0\3\2\2\2\u0091\u01a2\3\2\2\2\u0093"+
		"\u01a4\3\2\2\2\u0095\u01a6\3\2\2\2\u0097\u01a8\3\2\2\2\u0099\u01aa\3\2"+
		"\2\2\u009b\u01ac\3\2\2\2\u009d\u009e\5k\66\2\u009e\u009f\5q9\2\u009f\u00a0"+
		"\5u;\2\u00a0\u00a1\5y=\2\u00a1\u00a2\5\u0083B\2\u00a2\4\3\2\2\2\u00a3"+
		"\u00a4\5k\66\2\u00a4\u00a5\5\u0085C\2\u00a5\u00a6\5\u0085C\2\u00a6\u00a7"+
		"\5\177@\2\u00a7\u00a8\5q9\2\u00a8\u00a9\5i\65\2\u00a9\u00aa\5\u0083B\2"+
		"\u00aa\6\3\2\2\2\u00ab\u00ac\5m\67\2\u00ac\u00ad\5w<\2\u00ad\u00ae\5i"+
		"\65\2\u00ae\u00af\5\u008bF\2\u00af\u00b0\5i\65\2\u00b0\u00b1\5m\67\2\u00b1"+
		"\u00b2\5\u008fH\2\u00b2\u00b3\5q9\2\u00b3\u00b4\5\u008bF\2\u00b4\b\3\2"+
		"\2\2\u00b5\u00b6\5q9\2\u00b6\u00b7\5\177@\2\u00b7\u00b8\5\u008dG\2\u00b8"+
		"\u00b9\5q9\2\u00b9\n\3\2\2\2\u00ba\u00bb\5q9\2\u00bb\u00bc\5\u0083B\2"+
		"\u00bc\u00bd\5o8\2\u00bd\f\3\2\2\2\u00be\u00bf\5q9\2\u00bf\u00c0\5\u0097"+
		"L\2\u00c0\u00c1\5y=\2\u00c1\u00c2\5\u008fH\2\u00c2\16\3\2\2\2\u00c3\u00c4"+
		"\5s:\2\u00c4\u00c5\5i\65\2\u00c5\u00c6\5\177@\2\u00c6\u00c7\5\u008dG\2"+
		"\u00c7\u00c8\5q9\2\u00c8\20\3\2\2\2\u00c9\u00ca\5s:\2\u00ca\u00cb\5\u0085"+
		"C\2\u00cb\u00cc\5\u008bF\2\u00cc\22\3\2\2\2\u00cd\u00ce\5s:\2\u00ce\u00cf"+
		"\5\u0091I\2\u00cf\u00d0\5\u0083B\2\u00d0\u00d1\5m\67\2\u00d1\u00d2\5\u008f"+
		"H\2\u00d2\u00d3\5y=\2\u00d3\u00d4\5\u0085C\2\u00d4\u00d5\5\u0083B\2\u00d5"+
		"\24\3\2\2\2\u00d6\u00d7\5y=\2\u00d7\u00d8\5s:\2\u00d8\26\3\2\2\2\u00d9"+
		"\u00da\5y=\2\u00da\u00db\5\u0083B\2\u00db\u00dc\5\u0087D\2\u00dc\u00dd"+
		"\5\u0091I\2\u00dd\u00de\5\u008fH\2\u00de\30\3\2\2\2\u00df\u00e0\5y=\2"+
		"\u00e0\u00e1\5\u0083B\2\u00e1\u00e2\5\u008fH\2\u00e2\u00e3\5q9\2\u00e3"+
		"\u00e4\5u;\2\u00e4\u00e5\5q9\2\u00e5\u00e6\5\u008bF\2\u00e6\32\3\2\2\2"+
		"\u00e7\u00e8\5\u0087D\2\u00e8\u00e9\5\u008bF\2\u00e9\u00ea\5y=\2\u00ea"+
		"\u00eb\5\u0083B\2\u00eb\u00ec\5\u008fH\2\u00ec\34\3\2\2\2\u00ed\u00ee"+
		"\5\u0087D\2\u00ee\u00ef\5\u008bF\2\u00ef\u00f0\5\u0085C\2\u00f0\u00f1"+
		"\5m\67\2\u00f1\u00f2\5q9\2\u00f2\u00f3\5o8\2\u00f3\u00f4\5\u0091I\2\u00f4"+
		"\u00f5\5\u008bF\2\u00f5\u00f6\5q9\2\u00f6\36\3\2\2\2\u00f7\u00f8\5\u0087"+
		"D\2\u00f8\u00f9\5\u008bF\2\u00f9\u00fa\5\u0085C\2\u00fa\u00fb\5u;\2\u00fb"+
		"\u00fc\5\u008bF\2\u00fc\u00fd\5i\65\2\u00fd\u00fe\5\u0081A\2\u00fe \3"+
		"\2\2\2\u00ff\u0100\5\u008dG\2\u0100\u0101\5\u008fH\2\u0101\u0102\5\u008b"+
		"F\2\u0102\u0103\5y=\2\u0103\u0104\5\u0083B\2\u0104\u0105\5u;\2\u0105\""+
		"\3\2\2\2\u0106\u0107\5\u008fH\2\u0107\u0108\5\u008bF\2\u0108\u0109\5\u0091"+
		"I\2\u0109\u010a\5q9\2\u010a$\3\2\2\2\u010b\u010c\5\u0095K\2\u010c\u010d"+
		"\5w<\2\u010d\u010e\5y=\2\u010e\u010f\5\177@\2\u010f\u0110\5q9\2\u0110"+
		"&\3\2\2\2\u0111\u0112\7?\2\2\u0112(\3\2\2\2\u0113\u0114\7(\2\2\u0114\u0115"+
		"\7(\2\2\u0115*\3\2\2\2\u0116\u0117\7<\2\2\u0117,\3\2\2\2\u0118\u0119\7"+
		".\2\2\u0119.\3\2\2\2\u011a\u011b\7\60\2\2\u011b\60\3\2\2\2\u011c\u011d"+
		"\7$\2\2\u011d\62\3\2\2\2\u011e\u011f\7?\2\2\u011f\u0120\7?\2\2\u0120\64"+
		"\3\2\2\2\u0121\u0122\7@\2\2\u0122\u0123\7?\2\2\u0123\66\3\2\2\2\u0124"+
		"\u0125\7@\2\2\u01258\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7?\2\2\u0128"+
		":\3\2\2\2\u0129\u012a\7}\2\2\u012a<\3\2\2\2\u012b\u012c\7*\2\2\u012c>"+
		"\3\2\2\2\u012d\u012e\7>\2\2\u012e@\3\2\2\2\u012f\u0130\7/\2\2\u0130B\3"+
		"\2\2\2\u0131\u0132\7\'\2\2\u0132D\3\2\2\2\u0133\u0134\7#\2\2\u0134\u0135"+
		"\7?\2\2\u0135F\3\2\2\2\u0136\u0137\7#\2\2\u0137H\3\2\2\2\u0138\u0139\7"+
		"~\2\2\u0139\u013a\7~\2\2\u013aJ\3\2\2\2\u013b\u013c\7-\2\2\u013cL\3\2"+
		"\2\2\u013d\u013e\7\177\2\2\u013eN\3\2\2\2\u013f\u0140\7+\2\2\u0140P\3"+
		"\2\2\2\u0141\u0142\7=\2\2\u0142R\3\2\2\2\u0143\u0144\7\61\2\2\u0144T\3"+
		"\2\2\2\u0145\u0146\7,\2\2\u0146V\3\2\2\2\u0147\u0148\7)\2\2\u0148X\3\2"+
		"\2\2\u0149\u014e\5a\61\2\u014a\u014d\5a\61\2\u014b\u014d\5c\62\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014fZ\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155"+
		"\5c\62\2\u0152\u0154\5c\62\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\\\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0158\u015c\5\61\31\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0160\5\61\31\2\u0160^\3\2\2\2\u0161\u0162"+
		"\5W,\2\u0162\u0163\13\2\2\2\u0163\u0164\5W,\2\u0164`\3\2\2\2\u0165\u0166"+
		"\t\2\2\2\u0166b\3\2\2\2\u0167\u0168\t\3\2\2\u0168d\3\2\2\2\u0169\u016a"+
		"\5S*\2\u016a\u016e\5S*\2\u016b\u016d\n\4\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0172\b\63\2\2\u0172f\3\2\2\2\u0173\u0175"+
		"\t\5\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b\64\2\2\u0179h\3\2\2\2"+
		"\u017a\u017b\t\6\2\2\u017bj\3\2\2\2\u017c\u017d\t\7\2\2\u017dl\3\2\2\2"+
		"\u017e\u017f\t\b\2\2\u017fn\3\2\2\2\u0180\u0181\t\t\2\2\u0181p\3\2\2\2"+
		"\u0182\u0183\t\n\2\2\u0183r\3\2\2\2\u0184\u0185\t\13\2\2\u0185t\3\2\2"+
		"\2\u0186\u0187\t\f\2\2\u0187v\3\2\2\2\u0188\u0189\t\r\2\2\u0189x\3\2\2"+
		"\2\u018a\u018b\t\16\2\2\u018bz\3\2\2\2\u018c\u018d\t\17\2\2\u018d|\3\2"+
		"\2\2\u018e\u018f\t\20\2\2\u018f~\3\2\2\2\u0190\u0191\t\21\2\2\u0191\u0080"+
		"\3\2\2\2\u0192\u0193\t\22\2\2\u0193\u0082\3\2\2\2\u0194\u0195\t\23\2\2"+
		"\u0195\u0084\3\2\2\2\u0196\u0197\t\24\2\2\u0197\u0086\3\2\2\2\u0198\u0199"+
		"\t\25\2\2\u0199\u0088\3\2\2\2\u019a\u019b\t\26\2\2\u019b\u008a\3\2\2\2"+
		"\u019c\u019d\t\27\2\2\u019d\u008c\3\2\2\2\u019e\u019f\t\30\2\2\u019f\u008e"+
		"\3\2\2\2\u01a0\u01a1\t\31\2\2\u01a1\u0090\3\2\2\2\u01a2\u01a3\t\32\2\2"+
		"\u01a3\u0092\3\2\2\2\u01a4\u01a5\t\33\2\2\u01a5\u0094\3\2\2\2\u01a6\u01a7"+
		"\t\34\2\2\u01a7\u0096\3\2\2\2\u01a8\u01a9\t\35\2\2\u01a9\u0098\3\2\2\2"+
		"\u01aa\u01ab\t\36\2\2\u01ab\u009a\3\2\2\2\u01ac\u01ad\t\37\2\2\u01ad\u009c"+
		"\3\2\2\2\t\2\u014c\u014e\u0155\u015c\u016e\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}