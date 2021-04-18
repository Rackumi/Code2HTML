// Generated from C:/Users/alvar/Desktop/WorkinSpace/ANTLR/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeToHTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		B=25, E=26, S=27, ABRE=28, CIERRA=29, F=30, P=31, INICIO=32, FIN=33, ENTERO=34, 
		REAL=35, CAR=36, PUNTOYCOMA=37, COMA=38, IGUAL=39, IDENTIFICADOR=40, CONSTENTERO=41, 
		CONSTREAL=42, CONSTLIT=43, COMENTARIOL=44, COMENTARIOM=45, WS=46, HEXADECIMAL=47, 
		ALPHA=48, WORD=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "B", "E", 
			"S", "ABRE", "CIERRA", "F", "P", "INICIO", "FIN", "ENTERO", "REAL", "CAR", 
			"PUNTOYCOMA", "COMA", "IGUAL", "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", 
			"CONSTLIT", "COMENTARIOL", "COMENTARIOM", "WS", "DECIMAL", "HEXADECIMAL", 
			"ALPHA", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'buclepara'", "'buclemientras'", "'bucle'", "'hasta'", 
			"'+='", "'-='", "'*='", "'/='", "'+'", "'-'", "'*'", "'/'", "'no'", "'cierto'", 
			"'falso'", "'y'", "'o'", "'=='", "'<>'", "'<'", "'>'", "'>='", "'<='", 
			"'bifurcacion'", "'entonces'", "'sino'", "'('", "')'", "'funcion'", "'procedimiento'", 
			"'inicio'", "'fin'", "'entero'", "'real'", "'caracter'", "';'", "','", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "B", "E", "S", "ABRE", "CIERRA", "F", "P", "INICIO", "FIN", "ENTERO", 
			"REAL", "CAR", "PUNTOYCOMA", "COMA", "IGUAL", "IDENTIFICADOR", "CONSTENTERO", 
			"CONSTREAL", "CONSTLIT", "COMENTARIOL", "COMENTARIOM", "WS", "HEXADECIMAL", 
			"ALPHA", "WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CodeToHTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CodeToHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			S_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			F_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			INICIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			IDENTIFICADOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			CONSTENTERO_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			CONSTREAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			CONSTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			COMENTARIOL_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			COMENTARIOM_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void S_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("fUNCIONA");
			break;
		}
	}
	private void F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("fUNCIONA");
			break;
		}
	}
	private void INICIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("fUNCIONA");
			break;
		}
	}
	private void IDENTIFICADOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println(getText());
			break;
		}
	}
	private void CONSTENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println(getText());
			break;
		}
	}
	private void CONSTREAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println(getText());
			break;
		}
	}
	private void CONSTLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println(getText());
			break;
		}
	}
	private void COMENTARIOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println(getText());
			break;
		}
	}
	private void COMENTARIOM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u012d\n)\3)\3)\3)"+
		"\6)\u0132\n)\r)\16)\u0133\3)\3)\3*\5*\u0139\n*\3*\6*\u013c\n*\r*\16*\u013d"+
		"\3*\3*\5*\u0142\n*\3*\6*\u0145\n*\r*\16*\u0146\5*\u0149\n*\3*\3*\3+\5"+
		"+\u014e\n+\3+\6+\u0151\n+\r+\16+\u0152\3+\3+\6+\u0157\n+\r+\16+\u0158"+
		"\3+\3+\5+\u015d\n+\3+\6+\u0160\n+\r+\16+\u0161\3+\3+\6+\u0166\n+\r+\16"+
		"+\u0167\5+\u016a\n+\3+\3+\3,\3,\3,\3,\3,\3,\6,\u0174\n,\r,\16,\u0175\3"+
		",\3,\3,\3,\3,\3,\3,\6,\u017f\n,\r,\16,\u0180\3,\5,\u0184\n,\3,\3,\3-\3"+
		"-\3-\3-\6-\u018c\n-\r-\16-\u018d\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\6.\u019a"+
		"\n.\r.\16.\u019b\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\6\63\u01ae\n\63\r\63\16\63\u01af\2\2\64\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\2a\61c\62e\63\3\2\7\4\2--//\5\2\13\f\17\17\"\"\3\2"+
		"\62;\4\2\62;CH\4\2C\\c|\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5n\3\2\2\2"+
		"\7x\3\2\2\2\t\u0086\3\2\2\2\13\u008c\3\2\2\2\r\u0092\3\2\2\2\17\u0095"+
		"\3\2\2\2\21\u0098\3\2\2\2\23\u009b\3\2\2\2\25\u009e\3\2\2\2\27\u00a0\3"+
		"\2\2\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2"+
		"\2\2!\u00b0\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00c0\3\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2"+
		"\63\u00ca\3\2\2\2\65\u00d6\3\2\2\2\67\u00df\3\2\2\29\u00e6\3\2\2\2;\u00e8"+
		"\3\2\2\2=\u00ea\3\2\2\2?\u00f4\3\2\2\2A\u0102\3\2\2\2C\u010b\3\2\2\2E"+
		"\u010f\3\2\2\2G\u0116\3\2\2\2I\u011b\3\2\2\2K\u0124\3\2\2\2M\u0126\3\2"+
		"\2\2O\u0128\3\2\2\2Q\u012c\3\2\2\2S\u0148\3\2\2\2U\u0169\3\2\2\2W\u0183"+
		"\3\2\2\2Y\u0187\3\2\2\2[\u0194\3\2\2\2]\u01a2\3\2\2\2_\u01a6\3\2\2\2a"+
		"\u01a8\3\2\2\2c\u01aa\3\2\2\2e\u01ad\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7v\2"+
		"\2jk\7w\2\2kl\7t\2\2lm\7p\2\2m\4\3\2\2\2no\7d\2\2op\7w\2\2pq\7e\2\2qr"+
		"\7n\2\2rs\7g\2\2st\7r\2\2tu\7c\2\2uv\7t\2\2vw\7c\2\2w\6\3\2\2\2xy\7d\2"+
		"\2yz\7w\2\2z{\7e\2\2{|\7n\2\2|}\7g\2\2}~\7o\2\2~\177\7k\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\b\3\2\2\2\u0086\u0087\7d\2\2\u0087"+
		"\u0088\7w\2\2\u0088\u0089\7e\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2"+
		"\u008b\n\3\2\2\2\u008c\u008d\7j\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u"+
		"\2\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2\u0091\f\3\2\2\2\u0092\u0093"+
		"\7-\2\2\u0093\u0094\7?\2\2\u0094\16\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097"+
		"\7?\2\2\u0097\20\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7?\2\2\u009a\22"+
		"\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7?\2\2\u009d\24\3\2\2\2\u009e"+
		"\u009f\7-\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\30\3\2\2\2\u00a2"+
		"\u00a3\7,\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\34\3\2\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7q\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7v\2\2"+
		"\u00ae\u00af\7q\2\2\u00af \3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2"+
		"\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7q\2\2\u00b5\"\3"+
		"\2\2\2\u00b6\u00b7\7{\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9&\3\2"+
		"\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7>\2\2\u00be\u00bf\7@\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1,\3"+
		"\2\2\2\u00c2\u00c3\7@\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7?\2\2\u00c9\62"+
		"\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\u00ce\7w\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1\u00d2\7e\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\64\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7e\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7u\2\2\u00de\66\3\2\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\3\2\2"+
		"\2\u00e4\u00e5\b\34\2\2\u00e58\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7:\3\2\2"+
		"\2\u00e8\u00e9\7+\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7"+
		"w\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\37\3\2\u00f3"+
		">\3\2\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"\u00f8\7e\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7o\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101@\3\2\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105\7k\2\2\u0105\u0106\7e\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7q\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b!\4"+
		"\2\u010aB\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7k\2\2\u010d\u010e\7"+
		"p\2\2\u010eD\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7v\2\2\u0112\u0113\7g\2\2\u0113\u0114\7t\2\2\u0114\u0115\7q\2\2\u0115"+
		"F\3\2\2\2\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7n\2\2\u011aH\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7c\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7e\2\2\u0120\u0121\7v\2\2"+
		"\u0121\u0122\7g\2\2\u0122\u0123\7t\2\2\u0123J\3\2\2\2\u0124\u0125\7=\2"+
		"\2\u0125L\3\2\2\2\u0126\u0127\7.\2\2\u0127N\3\2\2\2\u0128\u0129\7?\2\2"+
		"\u0129P\3\2\2\2\u012a\u012d\7a\2\2\u012b\u012d\5e\63\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012b\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0132\7a\2\2\u012f"+
		"\u0132\5e\63\2\u0130\u0132\5_\60\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b)\5\2\u0136R\3\2\2\2\u0137"+
		"\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u013c\5_\60\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0149\3\2\2\2\u013f\u0141\7&"+
		"\2\2\u0140\u0142\t\2\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\5a\61\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0138\3\2\2\2\u0148\u013f\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b*"+
		"\6\2\u014bT\3\2\2\2\u014c\u014e\t\2\2\2\u014d\u014c\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\5_\60\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\7\60\2\2\u0155\u0157\5_\60\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u016a\3\2"+
		"\2\2\u015a\u015c\7&\2\2\u015b\u015d\t\2\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\5a\61\2\u015f\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\7\60\2\2\u0164\u0166\5a\61\2\u0165\u0164\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u014d\3\2\2\2\u0169\u015a\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\b+\7\2\u016cV\3\2\2\2\u016d\u0173\7$\2\2\u016e\u0174"+
		"\5e\63\2\u016f\u0174\7)\2\2\u0170\u0171\7$\2\2\u0171\u0174\7$\2\2\u0172"+
		"\u0174\5]/\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2"+
		"\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0184\7$\2\2\u0178\u017e\7)\2\2\u0179"+
		"\u017f\5e\63\2\u017a\u017f\7$\2\2\u017b\u017c\7)\2\2\u017c\u017f\7)\2"+
		"\2\u017d\u017f\5]/\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017e\u017b"+
		"\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\7)\2\2\u0183\u016d\3\2"+
		"\2\2\u0183\u0178\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b,\b\2\u0186"+
		"X\3\2\2\2\u0187\u0188\7\'\2\2\u0188\u0189\7\'\2\2\u0189\u018b\3\2\2\2"+
		"\u018a\u018c\5e\63\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\17\2\2"+
		"\u0190\u0191\7\f\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b-\t\2\u0193Z\3\2"+
		"\2\2\u0194\u0195\7\'\2\2\u0195\u0196\7/\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u019a\5e\63\2\u0198\u019a\5]/\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019e\7/\2\2\u019e\u019f\7\'\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b.\n\2\u01a1\\\3\2\2\2\u01a2\u01a3\t\3\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a5\b/\13\2\u01a5^\3\2\2\2\u01a6\u01a7\t\4\2\2\u01a7`\3\2\2\2"+
		"\u01a8\u01a9\t\5\2\2\u01a9b\3\2\2\2\u01aa\u01ab\t\6\2\2\u01abd\3\2\2\2"+
		"\u01ac\u01ae\5c\62\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0f\3\2\2\2\33\2\u012c\u0131\u0133\u0138"+
		"\u013d\u0141\u0146\u0148\u014d\u0152\u0158\u015c\u0161\u0167\u0169\u0173"+
		"\u0175\u017e\u0180\u0183\u018d\u0199\u019b\u01af\f\3\34\2\3\37\3\3!\4"+
		"\3)\5\3*\6\3+\7\3,\b\3-\t\3.\n\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}