// Generated from C:/Users/gocruz17/IdeaProjects/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1
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
		RULE_r = 0, RULE_program = 1, RULE_part = 2, RULE_restpart = 3, RULE_listparam = 4, 
		RULE_listparamAux = 5, RULE_type = 6, RULE_blq = 7, RULE_sentlist = 8, 
		RULE_sentlistAux = 9, RULE_sent = 10, RULE_lid = 11, RULE_asig = 12, RULE_exp = 13, 
		RULE_expAux = 14, RULE_op = 15, RULE_lcond = 16, RULE_lcondAux = 17, RULE_cond = 18, 
		RULE_opl = 19, RULE_opr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "part", "restpart", "listparam", "listparamAux", "type", 
			"blq", "sentlist", "sentlistAux", "sent", "lid", "asig", "exp", "expAux", 
			"op", "lcond", "lcondAux", "cond", "opl", "opr"
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
			setState(42);
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				part();
				setState(45);
				program();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				part();
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
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(F);
				setState(51);
				type();
				setState(52);
				restpart();
				}
				break;
			case P:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(P);
				setState(55);
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
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
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
		enterRule(_localctx, 6, RULE_restpart);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(IDENTIFICADOR);
				setState(59);
				match(ABRE);
				setState(60);
				listparam();
				setState(61);
				match(CIERRA);
				setState(62);
				blq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(IDENTIFICADOR);
				setState(65);
				match(ABRE);
				setState(66);
				match(CIERRA);
				setState(67);
				blq();
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
		enterRule(_localctx, 8, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			match(IDENTIFICADOR);
			setState(72);
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
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(CodeToHTMLParser.PUNTOYCOMA, 0); }
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
		enterRule(_localctx, 10, RULE_listparamAux);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				listparam();
				setState(75);
				match(PUNTOYCOMA);
				setState(76);
				type();
				setState(77);
				match(IDENTIFICADOR);
				setState(78);
				listparamAux();
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		enterRule(_localctx, 14, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(INICIO);
			setState(86);
			sentlist();
			setState(87);
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
		enterRule(_localctx, 16, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			sent();
			setState(90);
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
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_sentlistAux);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				sentlist();
				setState(93);
				sent();
				setState(94);
				sentlistAux();
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
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ABRE() { return getToken(CodeToHTMLParser.ABRE, 0); }
		public TerminalNode CIERRA() { return getToken(CodeToHTMLParser.CIERRA, 0); }
		public TerminalNode B() { return getToken(CodeToHTMLParser.B, 0); }
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public TerminalNode E() { return getToken(CodeToHTMLParser.E, 0); }
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode S() { return getToken(CodeToHTMLParser.S, 0); }
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
		enterRule(_localctx, 20, RULE_sent);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				type();
				setState(100);
				lid();
				setState(101);
				match(PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IDENTIFICADOR);
				setState(104);
				asig();
				setState(105);
				exp();
				setState(106);
				match(PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__0);
				setState(109);
				exp();
				setState(110);
				match(PUNTOYCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(IDENTIFICADOR);
				setState(113);
				match(ABRE);
				setState(114);
				lid();
				setState(115);
				match(CIERRA);
				setState(116);
				match(PUNTOYCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(IDENTIFICADOR);
				setState(119);
				match(ABRE);
				setState(120);
				match(CIERRA);
				setState(121);
				match(PUNTOYCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(B);
				setState(123);
				match(ABRE);
				setState(124);
				lcond();
				setState(125);
				match(CIERRA);
				setState(126);
				match(E);
				setState(127);
				blq();
				setState(128);
				match(S);
				setState(129);
				blq();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(T__1);
				setState(132);
				match(ABRE);
				setState(133);
				match(IDENTIFICADOR);
				setState(134);
				asig();
				setState(135);
				exp();
				setState(136);
				match(PUNTOYCOMA);
				setState(137);
				lcond();
				setState(138);
				match(PUNTOYCOMA);
				setState(139);
				match(IDENTIFICADOR);
				setState(140);
				asig();
				setState(141);
				exp();
				setState(142);
				match(CIERRA);
				setState(143);
				blq();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(T__2);
				setState(146);
				match(ABRE);
				setState(147);
				lcond();
				setState(148);
				match(CIERRA);
				setState(149);
				blq();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(T__3);
				setState(152);
				blq();
				setState(153);
				match(T__4);
				setState(154);
				match(ABRE);
				setState(155);
				lcond();
				setState(156);
				match(CIERRA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				blq();
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

	public static class LidContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode COMA() { return getToken(CodeToHTMLParser.COMA, 0); }
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
		enterRule(_localctx, 22, RULE_lid);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(162);
				match(IDENTIFICADOR);
				setState(163);
				match(COMA);
				}
				setState(165);
				lid();
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
		enterRule(_localctx, 24, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		enterRule(_localctx, 26, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(170);
				match(IDENTIFICADOR);
				setState(171);
				match(ABRE);
				setState(172);
				lid();
				setState(173);
				match(CIERRA);
				}
				break;
			case 2:
				{
				setState(175);
				match(ABRE);
				setState(176);
				exp();
				setState(177);
				match(CIERRA);
				}
				break;
			case 3:
				{
				setState(179);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				{
				setState(180);
				match(CONSTENTERO);
				}
				break;
			case 5:
				{
				setState(181);
				match(CONSTREAL);
				}
				break;
			case 6:
				{
				setState(182);
				match(CONSTLIT);
				}
				break;
			}
			setState(185);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
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
		enterRule(_localctx, 28, RULE_expAux);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				exp();
				setState(188);
				op();
				setState(189);
				exp();
				setState(190);
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
		enterRule(_localctx, 30, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 32, RULE_lcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
				setState(197);
				cond();
				}
				break;
			case T__13:
				{
				setState(198);
				match(T__13);
				setState(199);
				cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
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
		public List<LcondContext> lcond() {
			return getRuleContexts(LcondContext.class);
		}
		public LcondContext lcond(int i) {
			return getRuleContext(LcondContext.class,i);
		}
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
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
		enterRule(_localctx, 34, RULE_lcondAux);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				lcond();
				setState(205);
				opl();
				setState(206);
				lcond();
				setState(207);
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
		enterRule(_localctx, 36, RULE_cond);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				exp();
				setState(213);
				opr();
				setState(214);
				exp();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
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
		enterRule(_localctx, 38, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 40, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13d\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00a9\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00ba\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c4\n\20\3\21\3\21\3\22\3\22\3\22\5\22\u00cb\n\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00dd\n\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2$&\4\2\b\13))\3\2\f\17\3\2\23"+
		"\24\3\2\25\32\2\u00e6\2,\3\2\2\2\4\62\3\2\2\2\6:\3\2\2\2\bF\3\2\2\2\n"+
		"H\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22[\3\2\2\2\24c\3\2\2\2\26"+
		"\u00a1\3\2\2\2\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34\u00b9\3\2\2\2\36\u00c3"+
		"\3\2\2\2 \u00c5\3\2\2\2\"\u00ca\3\2\2\2$\u00d4\3\2\2\2&\u00dc\3\2\2\2"+
		"(\u00de\3\2\2\2*\u00e0\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\5\6\4\2/\60\5\4"+
		"\3\2\60\63\3\2\2\2\61\63\5\6\4\2\62.\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2"+
		"\2\64\65\7 \2\2\65\66\5\16\b\2\66\67\5\b\5\2\67;\3\2\2\289\7!\2\29;\5"+
		"\b\5\2:\64\3\2\2\2:8\3\2\2\2;\7\3\2\2\2<=\7*\2\2=>\7\36\2\2>?\5\n\6\2"+
		"?@\7\37\2\2@A\5\20\t\2AG\3\2\2\2BC\7*\2\2CD\7\36\2\2DE\7\37\2\2EG\5\20"+
		"\t\2F<\3\2\2\2FB\3\2\2\2G\t\3\2\2\2HI\5\16\b\2IJ\7*\2\2JK\5\f\7\2K\13"+
		"\3\2\2\2LM\5\n\6\2MN\7\'\2\2NO\5\16\b\2OP\7*\2\2PQ\5\f\7\2QT\3\2\2\2R"+
		"T\3\2\2\2SL\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\t\2\2\2V\17\3\2\2\2WX\7\"\2"+
		"\2XY\5\22\n\2YZ\7#\2\2Z\21\3\2\2\2[\\\5\26\f\2\\]\5\24\13\2]\23\3\2\2"+
		"\2^_\5\22\n\2_`\5\26\f\2`a\5\24\13\2ad\3\2\2\2bd\3\2\2\2c^\3\2\2\2cb\3"+
		"\2\2\2d\25\3\2\2\2ef\5\16\b\2fg\5\30\r\2gh\7\'\2\2h\u00a2\3\2\2\2ij\7"+
		"*\2\2jk\5\32\16\2kl\5\34\17\2lm\7\'\2\2m\u00a2\3\2\2\2no\7\3\2\2op\5\34"+
		"\17\2pq\7\'\2\2q\u00a2\3\2\2\2rs\7*\2\2st\7\36\2\2tu\5\30\r\2uv\7\37\2"+
		"\2vw\7\'\2\2w\u00a2\3\2\2\2xy\7*\2\2yz\7\36\2\2z{\7\37\2\2{\u00a2\7\'"+
		"\2\2|}\7\33\2\2}~\7\36\2\2~\177\5\"\22\2\177\u0080\7\37\2\2\u0080\u0081"+
		"\7\34\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7\35\2\2\u0083\u0084\5\20\t"+
		"\2\u0084\u00a2\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\36\2\2\u0087"+
		"\u0088\7*\2\2\u0088\u0089\5\32\16\2\u0089\u008a\5\34\17\2\u008a\u008b"+
		"\7\'\2\2\u008b\u008c\5\"\22\2\u008c\u008d\7\'\2\2\u008d\u008e\7*\2\2\u008e"+
		"\u008f\5\32\16\2\u008f\u0090\5\34\17\2\u0090\u0091\7\37\2\2\u0091\u0092"+
		"\5\20\t\2\u0092\u00a2\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095\7\36\2\2"+
		"\u0095\u0096\5\"\22\2\u0096\u0097\7\37\2\2\u0097\u0098\5\20\t\2\u0098"+
		"\u00a2\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\5\20\t\2\u009b\u009c\7"+
		"\7\2\2\u009c\u009d\7\36\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\37\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u00a2\5\20\t\2\u00a1e\3\2\2\2\u00a1i\3\2\2"+
		"\2\u00a1n\3\2\2\2\u00a1r\3\2\2\2\u00a1x\3\2\2\2\u00a1|\3\2\2\2\u00a1\u0085"+
		"\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\27\3\2\2\2\u00a3\u00a9\7*\2\2\u00a4\u00a5\7*\2\2\u00a5\u00a6\7(\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3"+
		"\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\33\3\2\2\2\u00ac\u00ad"+
		"\7*\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\37\2\2"+
		"\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\7\37\2\2\u00b4\u00ba\3\2\2\2\u00b5\u00ba\7*\2\2\u00b6\u00ba\7+"+
		"\2\2\u00b7\u00ba\7,\2\2\u00b8\u00ba\7-\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00b1"+
		"\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\36\20\2\u00bc\35\3\2"+
		"\2\2\u00bd\u00be\5\34\17\2\u00be\u00bf\5 \21\2\u00bf\u00c0\5\34\17\2\u00c0"+
		"\u00c1\5\36\20\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\t\4\2\2\u00c6"+
		"!\3\2\2\2\u00c7\u00cb\5&\24\2\u00c8\u00c9\7\20\2\2\u00c9\u00cb\5&\24\2"+
		"\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\5$\23\2\u00cd#\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\5(\25\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\5$\23\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\3"+
		"\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d7"+
		"\5\34\17\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\5\34\17\2\u00d9\u00dd\3\2\2"+
		"\2\u00da\u00dd\7\21\2\2\u00db\u00dd\7\22\2\2\u00dc\u00d6\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\t\5\2\2"+
		"\u00df)\3\2\2\2\u00e0\u00e1\t\6\2\2\u00e1+\3\2\2\2\16\62:FSc\u00a1\u00a8"+
		"\u00b9\u00c3\u00ca\u00d4\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}