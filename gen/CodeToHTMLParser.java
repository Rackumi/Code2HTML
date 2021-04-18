// Generated from C:/Users/alvar/Desktop/WorkinSpace/ANTLR/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeToHTMLParser extends Parser {
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
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_programAux = 2, RULE_part = 3, RULE_restpart = 4, 
		RULE_restpartAux = 5, RULE_listparam = 6, RULE_listparamAux = 7, RULE_type = 8, 
		RULE_blq = 9, RULE_sentlist = 10, RULE_sentlistAux = 11, RULE_sent = 12, 
		RULE_sentId = 13, RULE_sentAbre = 14, RULE_lid = 15, RULE_lidAux = 16, 
		RULE_asig = 17, RULE_exp = 18, RULE_expAux = 19, RULE_op = 20, RULE_lcond = 21, 
		RULE_lcondAux = 22, RULE_cond = 23, RULE_opl = 24, RULE_opr = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "programAux", "part", "restpart", "restpartAux", "listparam", 
			"listparamAux", "type", "blq", "sentlist", "sentlistAux", "sent", "sentId", 
			"sentAbre", "lid", "lidAux", "asig", "exp", "expAux", "op", "lcond", 
			"lcondAux", "cond", "opl", "opr"
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

	@Override
	public String getGrammarFileName() { return "CodeToHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeToHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public ProgramAuxContext programAux() {
			return getRuleContext(ProgramAuxContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			part();
			setState(55);
			programAux();
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

	public static class ProgramAuxContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterProgramAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitProgramAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitProgramAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramAuxContext programAux() throws RecognitionException {
		ProgramAuxContext _localctx = new ProgramAuxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programAux);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
			case P:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				program();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PartContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(CodeToHTMLParser.F, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public TerminalNode P() { return getToken(CodeToHTMLParser.P, 0); }
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_part);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(F);
				setState(62);
				type();
				setState(63);
				restpart();
				}
				break;
			case P:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(P);
				setState(66);
				restpart();
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

	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE() { return getToken(CodeToHTMLParser.ABRE, 0); }
		public RestpartAuxContext restpartAux() {
			return getRuleContext(RestpartAuxContext.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitRestpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENTIFICADOR);
			setState(70);
			match(ABRE);
			setState(71);
			restpartAux();
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

	public static class RestpartAuxContext extends ParserRuleContext {
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public RestpartAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpartAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterRestpartAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitRestpartAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitRestpartAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartAuxContext restpartAux() throws RecognitionException {
		RestpartAuxContext _localctx = new RestpartAuxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_restpartAux);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				listparam();
				setState(74);
				match(CIERRA);
				setState(75);
				blq();
				}
				break;
			case CIERRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(CIERRA);
				setState(78);
				blq();
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

	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public ListparamAuxContext listparamAux() {
			return getRuleContext(ListparamAuxContext.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitListparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			type();
			setState(82);
			match(IDENTIFICADOR);
			setState(83);
			listparamAux();
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

	public static class ListparamAuxContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(CodeToHTMLParser.COMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public ListparamAuxContext listparamAux() {
			return getRuleContext(ListparamAuxContext.class,0);
		}
		public ListparamAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparamAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterListparamAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitListparamAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitListparamAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamAuxContext listparamAux() throws RecognitionException {
		ListparamAuxContext _localctx = new ListparamAuxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listparamAux);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(COMA);
				setState(86);
				type();
				setState(87);
				match(IDENTIFICADOR);
				setState(88);
				listparamAux();
				}
				break;
			case CIERRA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(CodeToHTMLParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(CodeToHTMLParser.REAL, 0); }
		public TerminalNode CAR() { return getToken(CodeToHTMLParser.CAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << REAL) | (1L << CAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlqContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(CodeToHTMLParser.INICIO, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode FIN() { return getToken(CodeToHTMLParser.FIN, 0); }
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(INICIO);
			setState(96);
			sentlist();
			setState(97);
			match(FIN);
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

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			sent();
			setState(100);
			sentlistAux();
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

	public static class SentlistAuxContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
		}
		public SentlistAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSentlistAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSentlistAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSentlistAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistAuxContext sentlistAux() throws RecognitionException {
		SentlistAuxContext _localctx = new SentlistAuxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentlistAux);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case B:
			case INICIO:
			case ENTERO:
			case REAL:
			case CAR:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				sent();
				setState(103);
				sentlistAux();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(CodeToHTMLParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(CodeToHTMLParser.PUNTOYCOMA, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(CodeToHTMLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(CodeToHTMLParser.IDENTIFICADOR, i);
		}
		public SentIdContext sentId() {
			return getRuleContext(SentIdContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode B() { return getToken(CodeToHTMLParser.B, 0); }
		public TerminalNode ABRE() { return getToken(CodeToHTMLParser.ABRE, 0); }
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public TerminalNode E() { return getToken(CodeToHTMLParser.E, 0); }
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode S() { return getToken(CodeToHTMLParser.S, 0); }
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sent);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				type();
				setState(109);
				lid();
				setState(110);
				match(PUNTOYCOMA);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IDENTIFICADOR);
				setState(113);
				sentId();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__0);
				setState(115);
				exp();
				setState(116);
				match(PUNTOYCOMA);
				}
				break;
			case B:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(B);
				setState(119);
				match(ABRE);
				setState(120);
				lcond();
				setState(121);
				match(CIERRA);
				setState(122);
				match(E);
				setState(123);
				blq();
				setState(124);
				match(S);
				setState(125);
				blq();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(T__1);
				setState(128);
				match(ABRE);
				setState(129);
				match(IDENTIFICADOR);
				setState(130);
				asig();
				setState(131);
				exp();
				setState(132);
				match(PUNTOYCOMA);
				setState(133);
				lcond();
				setState(134);
				match(PUNTOYCOMA);
				setState(135);
				match(IDENTIFICADOR);
				setState(136);
				asig();
				setState(137);
				exp();
				setState(138);
				match(CIERRA);
				setState(139);
				blq();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(T__2);
				setState(142);
				match(ABRE);
				setState(143);
				lcond();
				setState(144);
				match(CIERRA);
				setState(145);
				blq();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(T__3);
				setState(148);
				blq();
				setState(149);
				match(T__4);
				setState(150);
				match(ABRE);
				setState(151);
				lcond();
				setState(152);
				match(CIERRA);
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				blq();
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

	public static class SentIdContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(CodeToHTMLParser.PUNTOYCOMA, 0); }
		public TerminalNode ABRE() { return getToken(CodeToHTMLParser.ABRE, 0); }
		public SentAbreContext sentAbre() {
			return getRuleContext(SentAbreContext.class,0);
		}
		public SentIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSentId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSentId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSentId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentIdContext sentId() throws RecognitionException {
		SentIdContext _localctx = new SentIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentId);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				asig();
				setState(158);
				exp();
				setState(159);
				match(PUNTOYCOMA);
				}
				break;
			case ABRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(ABRE);
				setState(162);
				sentAbre();
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

	public static class SentAbreContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(CodeToHTMLParser.PUNTOYCOMA, 0); }
		public SentAbreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentAbre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSentAbre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSentAbre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSentAbre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentAbreContext sentAbre() throws RecognitionException {
		SentAbreContext _localctx = new SentAbreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentAbre);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				lid();
				setState(166);
				match(CIERRA);
				setState(167);
				match(PUNTOYCOMA);
				}
				break;
			case CIERRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(CIERRA);
				setState(170);
				match(PUNTOYCOMA);
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

	public static class LidContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public LidAuxContext lidAux() {
			return getRuleContext(LidAuxContext.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IDENTIFICADOR);
			setState(174);
			lidAux();
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

	public static class LidAuxContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(CodeToHTMLParser.COMA, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public LidAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLidAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLidAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLidAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidAuxContext lidAux() throws RecognitionException {
		LidAuxContext _localctx = new LidAuxContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lidAux);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(COMA);
				setState(177);
				lid();
				}
				break;
			case CIERRA:
			case PUNTOYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(CodeToHTMLParser.IGUAL, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE() { return getToken(CodeToHTMLParser.ABRE, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CONSTENTERO() { return getToken(CodeToHTMLParser.CONSTENTERO, 0); }
		public TerminalNode CONSTREAL() { return getToken(CodeToHTMLParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(CodeToHTMLParser.CONSTLIT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				match(IDENTIFICADOR);
				setState(184);
				match(ABRE);
				setState(185);
				lid();
				setState(186);
				match(CIERRA);
				}
				break;
			case 2:
				{
				setState(188);
				match(ABRE);
				setState(189);
				exp();
				setState(190);
				match(CIERRA);
				}
				break;
			case 3:
				{
				setState(192);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				{
				setState(193);
				match(CONSTENTERO);
				}
				break;
			case 5:
				{
				setState(194);
				match(CONSTREAL);
				}
				break;
			case 6:
				{
				setState(195);
				match(CONSTLIT);
				}
				break;
			}
			setState(198);
			expAux();
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

	public static class ExpAuxContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterExpAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitExpAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitExpAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAuxContext expAux() throws RecognitionException {
		ExpAuxContext _localctx = new ExpAuxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expAux);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				op();
				setState(201);
				exp();
				setState(202);
				expAux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LcondContext extends ParserRuleContext {
		public LcondAuxContext lcondAux() {
			return getRuleContext(LcondAuxContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case ABRE:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				{
				setState(209);
				cond();
				}
				break;
			case T__13:
				{
				setState(210);
				match(T__13);
				setState(211);
				cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
			lcondAux();
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

	public static class LcondAuxContext extends ParserRuleContext {
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public LcondAuxContext lcondAux() {
			return getRuleContext(LcondAuxContext.class,0);
		}
		public LcondAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcondAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLcondAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLcondAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLcondAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondAuxContext lcondAux() throws RecognitionException {
		LcondAuxContext _localctx = new LcondAuxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lcondAux);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				opl();
				setState(217);
				lcond();
				setState(218);
				lcondAux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				exp();
				setState(224);
				opr();
				setState(225);
				exp();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(T__15);
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

	public static class OplContext extends ParserRuleContext {
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitOpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OprContext extends ParserRuleContext {
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u00ee\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4>\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u009e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00ae\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00b6\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00d0\n\25\3\26\3\26\3\27\3\27\3\27\5\27\u00d7\n\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00e8\n\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2$&\4\2\b\13))\3\2\f\17\3\2"+
		"\23\24\3\2\25\32\2\u00ec\2\66\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2"+
		"\nG\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2"+
		"\26e\3\2\2\2\30l\3\2\2\2\32\u009d\3\2\2\2\34\u00a5\3\2\2\2\36\u00ad\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00c6\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d1\3\2\2\2,\u00d6\3\2\2\2.\u00df\3\2\2\2\60\u00e7\3\2\2\2"+
		"\62\u00e9\3\2\2\2\64\u00eb\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\5\b\5"+
		"\29:\5\6\4\2:\5\3\2\2\2;>\5\4\3\2<>\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\7\3\2"+
		"\2\2?@\7 \2\2@A\5\22\n\2AB\5\n\6\2BF\3\2\2\2CD\7!\2\2DF\5\n\6\2E?\3\2"+
		"\2\2EC\3\2\2\2F\t\3\2\2\2GH\7*\2\2HI\7\36\2\2IJ\5\f\7\2J\13\3\2\2\2KL"+
		"\5\16\b\2LM\7\37\2\2MN\5\24\13\2NR\3\2\2\2OP\7\37\2\2PR\5\24\13\2QK\3"+
		"\2\2\2QO\3\2\2\2R\r\3\2\2\2ST\5\22\n\2TU\7*\2\2UV\5\20\t\2V\17\3\2\2\2"+
		"WX\7(\2\2XY\5\22\n\2YZ\7*\2\2Z[\5\20\t\2[^\3\2\2\2\\^\3\2\2\2]W\3\2\2"+
		"\2]\\\3\2\2\2^\21\3\2\2\2_`\t\2\2\2`\23\3\2\2\2ab\7\"\2\2bc\5\26\f\2c"+
		"d\7#\2\2d\25\3\2\2\2ef\5\32\16\2fg\5\30\r\2g\27\3\2\2\2hi\5\32\16\2ij"+
		"\5\30\r\2jm\3\2\2\2km\3\2\2\2lh\3\2\2\2lk\3\2\2\2m\31\3\2\2\2no\5\22\n"+
		"\2op\5 \21\2pq\7\'\2\2q\u009e\3\2\2\2rs\7*\2\2s\u009e\5\34\17\2tu\7\3"+
		"\2\2uv\5&\24\2vw\7\'\2\2w\u009e\3\2\2\2xy\7\33\2\2yz\7\36\2\2z{\5,\27"+
		"\2{|\7\37\2\2|}\7\34\2\2}~\5\24\13\2~\177\7\35\2\2\177\u0080\5\24\13\2"+
		"\u0080\u009e\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7\36\2\2\u0083\u0084"+
		"\7*\2\2\u0084\u0085\5$\23\2\u0085\u0086\5&\24\2\u0086\u0087\7\'\2\2\u0087"+
		"\u0088\5,\27\2\u0088\u0089\7\'\2\2\u0089\u008a\7*\2\2\u008a\u008b\5$\23"+
		"\2\u008b\u008c\5&\24\2\u008c\u008d\7\37\2\2\u008d\u008e\5\24\13\2\u008e"+
		"\u009e\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5"+
		",\27\2\u0092\u0093\7\37\2\2\u0093\u0094\5\24\13\2\u0094\u009e\3\2\2\2"+
		"\u0095\u0096\7\6\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7\7\2\2\u0098\u0099"+
		"\7\36\2\2\u0099\u009a\5,\27\2\u009a\u009b\7\37\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009e\5\24\13\2\u009dn\3\2\2\2\u009dr\3\2\2\2\u009dt\3\2\2\2\u009d"+
		"x\3\2\2\2\u009d\u0081\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0095\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1"+
		"\5&\24\2\u00a1\u00a2\7\'\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a4\7\36\2\2"+
		"\u00a4\u00a6\5\36\20\2\u00a5\u009f\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\35"+
		"\3\2\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\7\'\2\2"+
		"\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ae\7\'\2\2\u00ad\u00a7"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7*\2\2\u00b0"+
		"\u00b1\5\"\22\2\u00b1!\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b6\5 \21\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6#\3"+
		"\2\2\2\u00b7\u00b8\t\3\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb"+
		"\7\36\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\7\37\2\2\u00bd\u00c7\3\2\2\2"+
		"\u00be\u00bf\7\36\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7\37\2\2\u00c1\u00c7"+
		"\3\2\2\2\u00c2\u00c7\7*\2\2\u00c3\u00c7\7+\2\2\u00c4\u00c7\7,\2\2\u00c5"+
		"\u00c7\7-\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c2\3\2"+
		"\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\5(\25\2\u00c9\'\3\2\2\2\u00ca\u00cb\5*\26\2"+
		"\u00cb\u00cc\5&\24\2\u00cc\u00cd\5(\25\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0)\3\2\2\2\u00d1"+
		"\u00d2\t\4\2\2\u00d2+\3\2\2\2\u00d3\u00d7\5\60\31\2\u00d4\u00d5\7\20\2"+
		"\2\u00d5\u00d7\5\60\31\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\5.\30\2\u00d9-\3\2\2\2\u00da\u00db\5\62\32"+
		"\2\u00db\u00dc\5,\27\2\u00dc\u00dd\5.\30\2\u00dd\u00e0\3\2\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0/\3\2\2\2\u00e1"+
		"\u00e2\5&\24\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\5&\24\2\u00e4\u00e8\3"+
		"\2\2\2\u00e5\u00e8\7\21\2\2\u00e6\u00e8\7\22\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\t\5\2"+
		"\2\u00ea\63\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec\65\3\2\2\2\20=EQ]l\u009d"+
		"\u00a5\u00ad\u00b5\u00c6\u00cf\u00d6\u00df\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}