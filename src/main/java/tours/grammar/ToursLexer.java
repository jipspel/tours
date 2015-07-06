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
		BEGIN=1, BOOLEAN=2, BOOLEAN_ARRAY=3, CHARACTER=4, CHARACTER_ARRAY=5, ELSE=6, 
		END=7, EXIT=8, FALSE=9, FOR=10, FUNC=11, IF=12, INPUT=13, INTEGER=14, 
		INTEGER_ARRAY=15, MAIN=16, NEW=17, PRINT=18, PROGRAM=19, RETURN=20, STRING=21, 
		STRING_ARRAY=22, TRUE=23, VOID=24, WHILE=25, ASSIGNMENT=26, AND=27, COLON=28, 
		COMMA=29, DOT=30, DQUOTE=31, EQ=32, GE=33, GT=34, LE=35, LBLOCK=36, LBRACE=37, 
		LPAR=38, LT=39, MINUS=40, MODULO=41, NE=42, NOT=43, OR=44, PLUS=45, RBLOCK=46, 
		RBRACE=47, RPAR=48, SEMI=49, SLASH=50, STAR=51, SQUOTE=52, UNDERSCORE=53, 
		IDENTIFIER=54, INT=55, STR=56, CHAR=57, COMMENT=58, WS=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "BOOLEAN", "BOOLEAN_ARRAY", "CHARACTER", "CHARACTER_ARRAY", "ELSE", 
		"END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", "INTEGER_ARRAY", 
		"MAIN", "NEW", "PRINT", "PROGRAM", "RETURN", "STRING", "STRING_ARRAY", 
		"TRUE", "VOID", "WHILE", "ASSIGNMENT", "AND", "COLON", "COMMA", "DOT", 
		"DQUOTE", "EQ", "GE", "GT", "LE", "LBLOCK", "LBRACE", "LPAR", "LT", "MINUS", 
		"MODULO", "NE", "NOT", "OR", "PLUS", "RBLOCK", "RBRACE", "RPAR", "SEMI", 
		"SLASH", "STAR", "SQUOTE", "UNDERSCORE", "IDENTIFIER", "INT", "STR", "CHAR", 
		"LETTER", "DIGIT", "COMMENT", "WS", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "'&&'", "':'", "','", "'.'", "'\"'", "'=='", "'>='", 
		"'>'", "'<='", "'['", "'{'", "'('", "'<'", "'-'", "'%'", "'!='", "'!'", 
		"'||'", "'+'", "']'", "'}'", "')'", "';'", "'/'", "'*'", "'''", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "BOOLEAN", "BOOLEAN_ARRAY", "CHARACTER", "CHARACTER_ARRAY", 
		"ELSE", "END", "EXIT", "FALSE", "FOR", "FUNC", "IF", "INPUT", "INTEGER", 
		"INTEGER_ARRAY", "MAIN", "NEW", "PRINT", "PROGRAM", "RETURN", "STRING", 
		"STRING_ARRAY", "TRUE", "VOID", "WHILE", "ASSIGNMENT", "AND", "COLON", 
		"COMMA", "DOT", "DQUOTE", "EQ", "GE", "GT", "LE", "LBLOCK", "LBRACE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0198\n\67"+
		"\f\67\16\67\u019b\13\67\38\38\78\u019f\n8\f8\168\u01a2\138\39\39\79\u01a6"+
		"\n9\f9\169\u01a9\139\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\7=\u01b8\n"+
		"=\f=\16=\u01bb\13=\3=\3=\3>\6>\u01c0\n>\r>\16>\u01c1\3>\3>\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3"+
		"W\3X\3X\3\u01a7\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u\2w\2y<{=}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\u00af\2\3\2 \4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4"+
		"\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSs"+
		"s\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2"+
		"\\\\||\u01e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3"+
		"\u00b1\3\2\2\2\5\u00b7\3\2\2\2\7\u00bf\3\2\2\2\t\u00c9\3\2\2\2\13\u00d3"+
		"\3\2\2\2\r\u00df\3\2\2\2\17\u00e4\3\2\2\2\21\u00e8\3\2\2\2\23\u00ed\3"+
		"\2\2\2\25\u00f3\3\2\2\2\27\u00f7\3\2\2\2\31\u00fc\3\2\2\2\33\u00ff\3\2"+
		"\2\2\35\u0105\3\2\2\2\37\u010d\3\2\2\2!\u0117\3\2\2\2#\u011c\3\2\2\2%"+
		"\u0120\3\2\2\2\'\u0126\3\2\2\2)\u012e\3\2\2\2+\u0135\3\2\2\2-\u013c\3"+
		"\2\2\2/\u0145\3\2\2\2\61\u014a\3\2\2\2\63\u014f\3\2\2\2\65\u0155\3\2\2"+
		"\2\67\u0157\3\2\2\29\u015a\3\2\2\2;\u015c\3\2\2\2=\u015e\3\2\2\2?\u0160"+
		"\3\2\2\2A\u0162\3\2\2\2C\u0165\3\2\2\2E\u0168\3\2\2\2G\u016a\3\2\2\2I"+
		"\u016d\3\2\2\2K\u016f\3\2\2\2M\u0171\3\2\2\2O\u0173\3\2\2\2Q\u0175\3\2"+
		"\2\2S\u0177\3\2\2\2U\u0179\3\2\2\2W\u017c\3\2\2\2Y\u017e\3\2\2\2[\u0181"+
		"\3\2\2\2]\u0183\3\2\2\2_\u0185\3\2\2\2a\u0187\3\2\2\2c\u0189\3\2\2\2e"+
		"\u018b\3\2\2\2g\u018d\3\2\2\2i\u018f\3\2\2\2k\u0191\3\2\2\2m\u0193\3\2"+
		"\2\2o\u019c\3\2\2\2q\u01a3\3\2\2\2s\u01ac\3\2\2\2u\u01b0\3\2\2\2w\u01b2"+
		"\3\2\2\2y\u01b4\3\2\2\2{\u01bf\3\2\2\2}\u01c5\3\2\2\2\177\u01c7\3\2\2"+
		"\2\u0081\u01c9\3\2\2\2\u0083\u01cb\3\2\2\2\u0085\u01cd\3\2\2\2\u0087\u01cf"+
		"\3\2\2\2\u0089\u01d1\3\2\2\2\u008b\u01d3\3\2\2\2\u008d\u01d5\3\2\2\2\u008f"+
		"\u01d7\3\2\2\2\u0091\u01d9\3\2\2\2\u0093\u01db\3\2\2\2\u0095\u01dd\3\2"+
		"\2\2\u0097\u01df\3\2\2\2\u0099\u01e1\3\2\2\2\u009b\u01e3\3\2\2\2\u009d"+
		"\u01e5\3\2\2\2\u009f\u01e7\3\2\2\2\u00a1\u01e9\3\2\2\2\u00a3\u01eb\3\2"+
		"\2\2\u00a5\u01ed\3\2\2\2\u00a7\u01ef\3\2\2\2\u00a9\u01f1\3\2\2\2\u00ab"+
		"\u01f3\3\2\2\2\u00ad\u01f5\3\2\2\2\u00af\u01f7\3\2\2\2\u00b1\u00b2\5\177"+
		"@\2\u00b2\u00b3\5\u0085C\2\u00b3\u00b4\5\u0089E\2\u00b4\u00b5\5\u008d"+
		"G\2\u00b5\u00b6\5\u0097L\2\u00b6\4\3\2\2\2\u00b7\u00b8\5\177@\2\u00b8"+
		"\u00b9\5\u0099M\2\u00b9\u00ba\5\u0099M\2\u00ba\u00bb\5\u0093J\2\u00bb"+
		"\u00bc\5\u0085C\2\u00bc\u00bd\5}?\2\u00bd\u00be\5\u0097L\2\u00be\6\3\2"+
		"\2\2\u00bf\u00c0\5\177@\2\u00c0\u00c1\5\u0099M\2\u00c1\u00c2\5\u0099M"+
		"\2\u00c2\u00c3\5\u0093J\2\u00c3\u00c4\5\u0085C\2\u00c4\u00c5\5}?\2\u00c5"+
		"\u00c6\5\u0097L\2\u00c6\u00c7\5I%\2\u00c7\u00c8\5]/\2\u00c8\b\3\2\2\2"+
		"\u00c9\u00ca\5\u0081A\2\u00ca\u00cb\5\u008bF\2\u00cb\u00cc\5}?\2\u00cc"+
		"\u00cd\5\u009fP\2\u00cd\u00ce\5}?\2\u00ce\u00cf\5\u0081A\2\u00cf\u00d0"+
		"\5\u00a3R\2\u00d0\u00d1\5\u0085C\2\u00d1\u00d2\5\u009fP\2\u00d2\n\3\2"+
		"\2\2\u00d3\u00d4\5\u0081A\2\u00d4\u00d5\5\u008bF\2\u00d5\u00d6\5}?\2\u00d6"+
		"\u00d7\5\u009fP\2\u00d7\u00d8\5}?\2\u00d8\u00d9\5\u0081A\2\u00d9\u00da"+
		"\5\u00a3R\2\u00da\u00db\5\u0085C\2\u00db\u00dc\5\u009fP\2\u00dc\u00dd"+
		"\5I%\2\u00dd\u00de\5]/\2\u00de\f\3\2\2\2\u00df\u00e0\5\u0085C\2\u00e0"+
		"\u00e1\5\u0093J\2\u00e1\u00e2\5\u00a1Q\2\u00e2\u00e3\5\u0085C\2\u00e3"+
		"\16\3\2\2\2\u00e4\u00e5\5\u0085C\2\u00e5\u00e6\5\u0097L\2\u00e6\u00e7"+
		"\5\u0083B\2\u00e7\20\3\2\2\2\u00e8\u00e9\5\u0085C\2\u00e9\u00ea\5\u00ab"+
		"V\2\u00ea\u00eb\5\u008dG\2\u00eb\u00ec\5\u00a3R\2\u00ec\22\3\2\2\2\u00ed"+
		"\u00ee\5\u0087D\2\u00ee\u00ef\5}?\2\u00ef\u00f0\5\u0093J\2\u00f0\u00f1"+
		"\5\u00a1Q\2\u00f1\u00f2\5\u0085C\2\u00f2\24\3\2\2\2\u00f3\u00f4\5\u0087"+
		"D\2\u00f4\u00f5\5\u0099M\2\u00f5\u00f6\5\u009fP\2\u00f6\26\3\2\2\2\u00f7"+
		"\u00f8\5\u0087D\2\u00f8\u00f9\5\u00a5S\2\u00f9\u00fa\5\u0097L\2\u00fa"+
		"\u00fb\5\u0081A\2\u00fb\30\3\2\2\2\u00fc\u00fd\5\u008dG\2\u00fd\u00fe"+
		"\5\u0087D\2\u00fe\32\3\2\2\2\u00ff\u0100\5\u008dG\2\u0100\u0101\5\u0097"+
		"L\2\u0101\u0102\5\u009bN\2\u0102\u0103\5\u00a5S\2\u0103\u0104\5\u00a3"+
		"R\2\u0104\34\3\2\2\2\u0105\u0106\5\u008dG\2\u0106\u0107\5\u0097L\2\u0107"+
		"\u0108\5\u00a3R\2\u0108\u0109\5\u0085C\2\u0109\u010a\5\u0089E\2\u010a"+
		"\u010b\5\u0085C\2\u010b\u010c\5\u009fP\2\u010c\36\3\2\2\2\u010d\u010e"+
		"\5\u008dG\2\u010e\u010f\5\u0097L\2\u010f\u0110\5\u00a3R\2\u0110\u0111"+
		"\5\u0085C\2\u0111\u0112\5\u0089E\2\u0112\u0113\5\u0085C\2\u0113\u0114"+
		"\5\u009fP\2\u0114\u0115\5I%\2\u0115\u0116\5]/\2\u0116 \3\2\2\2\u0117\u0118"+
		"\5\u0095K\2\u0118\u0119\5}?\2\u0119\u011a\5\u008dG\2\u011a\u011b\5\u0097"+
		"L\2\u011b\"\3\2\2\2\u011c\u011d\5\u0097L\2\u011d\u011e\5\u0085C\2\u011e"+
		"\u011f\5\u00a9U\2\u011f$\3\2\2\2\u0120\u0121\5\u009bN\2\u0121\u0122\5"+
		"\u009fP\2\u0122\u0123\5\u008dG\2\u0123\u0124\5\u0097L\2\u0124\u0125\5"+
		"\u00a3R\2\u0125&\3\2\2\2\u0126\u0127\5\u009bN\2\u0127\u0128\5\u009fP\2"+
		"\u0128\u0129\5\u0099M\2\u0129\u012a\5\u0089E\2\u012a\u012b\5\u009fP\2"+
		"\u012b\u012c\5}?\2\u012c\u012d\5\u0095K\2\u012d(\3\2\2\2\u012e\u012f\5"+
		"\u009fP\2\u012f\u0130\5\u0085C\2\u0130\u0131\5\u00a3R\2\u0131\u0132\5"+
		"\u00a5S\2\u0132\u0133\5\u009fP\2\u0133\u0134\5\u0097L\2\u0134*\3\2\2\2"+
		"\u0135\u0136\5\u00a1Q\2\u0136\u0137\5\u00a3R\2\u0137\u0138\5\u009fP\2"+
		"\u0138\u0139\5\u008dG\2\u0139\u013a\5\u0097L\2\u013a\u013b\5\u0089E\2"+
		"\u013b,\3\2\2\2\u013c\u013d\5\u00a1Q\2\u013d\u013e\5\u00a3R\2\u013e\u013f"+
		"\5\u009fP\2\u013f\u0140\5\u008dG\2\u0140\u0141\5\u0097L\2\u0141\u0142"+
		"\5\u0089E\2\u0142\u0143\5I%\2\u0143\u0144\5]/\2\u0144.\3\2\2\2\u0145\u0146"+
		"\5\u00a3R\2\u0146\u0147\5\u009fP\2\u0147\u0148\5\u00a5S\2\u0148\u0149"+
		"\5\u0085C\2\u0149\60\3\2\2\2\u014a\u014b\5\u00a7T\2\u014b\u014c\5\u0099"+
		"M\2\u014c\u014d\5\u008dG\2\u014d\u014e\5\u0083B\2\u014e\62\3\2\2\2\u014f"+
		"\u0150\5\u00a9U\2\u0150\u0151\5\u008bF\2\u0151\u0152\5\u008dG\2\u0152"+
		"\u0153\5\u0093J\2\u0153\u0154\5\u0085C\2\u0154\64\3\2\2\2\u0155\u0156"+
		"\7?\2\2\u0156\66\3\2\2\2\u0157\u0158\7(\2\2\u0158\u0159\7(\2\2\u01598"+
		"\3\2\2\2\u015a\u015b\7<\2\2\u015b:\3\2\2\2\u015c\u015d\7.\2\2\u015d<\3"+
		"\2\2\2\u015e\u015f\7\60\2\2\u015f>\3\2\2\2\u0160\u0161\7$\2\2\u0161@\3"+
		"\2\2\2\u0162\u0163\7?\2\2\u0163\u0164\7?\2\2\u0164B\3\2\2\2\u0165\u0166"+
		"\7@\2\2\u0166\u0167\7?\2\2\u0167D\3\2\2\2\u0168\u0169\7@\2\2\u0169F\3"+
		"\2\2\2\u016a\u016b\7>\2\2\u016b\u016c\7?\2\2\u016cH\3\2\2\2\u016d\u016e"+
		"\7]\2\2\u016eJ\3\2\2\2\u016f\u0170\7}\2\2\u0170L\3\2\2\2\u0171\u0172\7"+
		"*\2\2\u0172N\3\2\2\2\u0173\u0174\7>\2\2\u0174P\3\2\2\2\u0175\u0176\7/"+
		"\2\2\u0176R\3\2\2\2\u0177\u0178\7\'\2\2\u0178T\3\2\2\2\u0179\u017a\7#"+
		"\2\2\u017a\u017b\7?\2\2\u017bV\3\2\2\2\u017c\u017d\7#\2\2\u017dX\3\2\2"+
		"\2\u017e\u017f\7~\2\2\u017f\u0180\7~\2\2\u0180Z\3\2\2\2\u0181\u0182\7"+
		"-\2\2\u0182\\\3\2\2\2\u0183\u0184\7_\2\2\u0184^\3\2\2\2\u0185\u0186\7"+
		"\177\2\2\u0186`\3\2\2\2\u0187\u0188\7+\2\2\u0188b\3\2\2\2\u0189\u018a"+
		"\7=\2\2\u018ad\3\2\2\2\u018b\u018c\7\61\2\2\u018cf\3\2\2\2\u018d\u018e"+
		"\7,\2\2\u018eh\3\2\2\2\u018f\u0190\7)\2\2\u0190j\3\2\2\2\u0191\u0192\7"+
		"a\2\2\u0192l\3\2\2\2\u0193\u0199\5u;\2\u0194\u0198\5u;\2\u0195\u0198\5"+
		"w<\2\u0196\u0198\5k\66\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019an\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0\5w<\2\u019d\u019f"+
		"\5w<\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1p\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a7\5? \2\u01a4"+
		"\u01a6\13\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a8\3"+
		"\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ab\5? \2\u01abr\3\2\2\2\u01ac\u01ad\5i\65\2\u01ad\u01ae\13\2\2\2\u01ae"+
		"\u01af\5i\65\2\u01aft\3\2\2\2\u01b0\u01b1\t\2\2\2\u01b1v\3\2\2\2\u01b2"+
		"\u01b3\t\3\2\2\u01b3x\3\2\2\2\u01b4\u01b5\5e\63\2\u01b5\u01b9\5e\63\2"+
		"\u01b6\u01b8\n\4\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\b=\2\2\u01bdz\3\2\2\2\u01be\u01c0\t\5\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\b>\2\2\u01c4|\3\2\2\2\u01c5\u01c6\t\6\2\2\u01c6~\3\2"+
		"\2\2\u01c7\u01c8\t\7\2\2\u01c8\u0080\3\2\2\2\u01c9\u01ca\t\b\2\2\u01ca"+
		"\u0082\3\2\2\2\u01cb\u01cc\t\t\2\2\u01cc\u0084\3\2\2\2\u01cd\u01ce\t\n"+
		"\2\2\u01ce\u0086\3\2\2\2\u01cf\u01d0\t\13\2\2\u01d0\u0088\3\2\2\2\u01d1"+
		"\u01d2\t\f\2\2\u01d2\u008a\3\2\2\2\u01d3\u01d4\t\r\2\2\u01d4\u008c\3\2"+
		"\2\2\u01d5\u01d6\t\16\2\2\u01d6\u008e\3\2\2\2\u01d7\u01d8\t\17\2\2\u01d8"+
		"\u0090\3\2\2\2\u01d9\u01da\t\20\2\2\u01da\u0092\3\2\2\2\u01db\u01dc\t"+
		"\21\2\2\u01dc\u0094\3\2\2\2\u01dd\u01de\t\22\2\2\u01de\u0096\3\2\2\2\u01df"+
		"\u01e0\t\23\2\2\u01e0\u0098\3\2\2\2\u01e1\u01e2\t\24\2\2\u01e2\u009a\3"+
		"\2\2\2\u01e3\u01e4\t\25\2\2\u01e4\u009c\3\2\2\2\u01e5\u01e6\t\26\2\2\u01e6"+
		"\u009e\3\2\2\2\u01e7\u01e8\t\27\2\2\u01e8\u00a0\3\2\2\2\u01e9\u01ea\t"+
		"\30\2\2\u01ea\u00a2\3\2\2\2\u01eb\u01ec\t\31\2\2\u01ec\u00a4\3\2\2\2\u01ed"+
		"\u01ee\t\32\2\2\u01ee\u00a6\3\2\2\2\u01ef\u01f0\t\33\2\2\u01f0\u00a8\3"+
		"\2\2\2\u01f1\u01f2\t\34\2\2\u01f2\u00aa\3\2\2\2\u01f3\u01f4\t\35\2\2\u01f4"+
		"\u00ac\3\2\2\2\u01f5\u01f6\t\36\2\2\u01f6\u00ae\3\2\2\2\u01f7\u01f8\t"+
		"\37\2\2\u01f8\u00b0\3\2\2\2\t\2\u0197\u0199\u01a0\u01a7\u01b9\u01c1\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}