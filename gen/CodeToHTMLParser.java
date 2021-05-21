// Generated from C:/Users/alvar/Desktop/WorkinSpace/ANTLR/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1

	import SintData.Sintesis;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, IDENTIFICADOR=40, CONSTENTERO=41, CONSTREAL=42, CONSTLIT=43, 
		COMENTARIOL=44, COMENTARIOM=45, WS=46, HEXADECIMAL=47, SYMBOL=48, ALPHA=49, 
		WORD=50;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_program_f = 2, RULE_part = 3, RULE_restpart = 4, 
		RULE_restpart_f = 5, RULE_listparam = 6, RULE_listparam_r = 7, RULE_type = 8, 
		RULE_blq = 9, RULE_sentlist = 10, RULE_sentlist_r = 11, RULE_sent = 12, 
		RULE_sent_f1 = 13, RULE_sent_f2 = 14, RULE_lid = 15, RULE_lid_f = 16, 
		RULE_asig = 17, RULE_exp = 18, RULE_exp_f = 19, RULE_exp_r = 20, RULE_op = 21, 
		RULE_lcond = 22, RULE_lcond_r = 23, RULE_cond = 24, RULE_opl = 25, RULE_opr = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "program_f", "part", "restpart", "restpart_f", "listparam", 
			"listparam_r", "type", "blq", "sentlist", "sentlist_r", "sent", "sent_f1", 
			"sent_f2", "lid", "lid_f", "asig", "exp", "exp_f", "exp_r", "op", "lcond", 
			"lcond_r", "cond", "opl", "opr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'bifurcacion'", 
			"'entonces'", "'sino'", "'buclepara'", "'buclemientras'", "'bucle'", 
			"'hasta'", "'='", "'+='", "'-='", "'*='", "'/='", "'+'", "'-'", "'*'", 
			"'/'", "'no'", "'cierto'", "'falso'", "'y'", "'o'", "'=='", "'<>'", "'<'", 
			"'>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", 
			"CONSTLIT", "COMENTARIOL", "COMENTARIOM", "WS", "HEXADECIMAL", "SYMBOL", 
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



	    private Sintesis myinfo;

	    public CodeToHTMLParser(TokenStream input, Sintesis theinfo){
	        this(input);
	        myinfo = theinfo;
	    }


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
			setState(54);
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
		public Program_fContext program_f() {
			return getRuleContext(Program_fContext.class,0);
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
			setState(56);
			part();
			setState(57);
			program_f();
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

	public static class Program_fContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Program_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterProgram_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitProgram_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitProgram_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_fContext program_f() throws RecognitionException {
		Program_fContext _localctx = new Program_fContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_f);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__0);
				setState(64);
				type();
				setState(65);
				restpart();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__1);
				setState(68);
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
		public Restpart_fContext restpart_f() {
			return getRuleContext(Restpart_fContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENTIFICADOR);
			setState(72);
			match(T__2);
			setState(73);
			restpart_f();
			setState(74);
			match(T__3);
			setState(75);
			blq();
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

	public static class Restpart_fContext extends ParserRuleContext {
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public Restpart_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterRestpart_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitRestpart_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitRestpart_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restpart_fContext restpart_f() throws RecognitionException {
		Restpart_fContext _localctx = new Restpart_fContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_restpart_f);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				listparam();
				}
				break;
			case T__3:
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

	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public Listparam_rContext listparam_r() {
			return getRuleContext(Listparam_rContext.class,0);
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
			listparam_r();
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

	public static class Listparam_rContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public Listparam_rContext listparam_r() {
			return getRuleContext(Listparam_rContext.class,0);
		}
		public Listparam_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterListparam_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitListparam_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitListparam_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listparam_rContext listparam_r() throws RecognitionException {
		Listparam_rContext _localctx = new Listparam_rContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listparam_r);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__4);
				setState(86);
				type();
				setState(87);
				match(IDENTIFICADOR);
				setState(88);
				listparam_r();
				}
				break;
			case T__3:
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
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__7);
				myinfo.newDec();
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

	public static class BlqContext extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
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
			setState(99);
			match(T__8);
			setState(100);
			sentlist();
			setState(101);
			match(T__9);
			myinfo.newVar();
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
		public Sentlist_rContext sentlist_r() {
			return getRuleContext(Sentlist_rContext.class,0);
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
			setState(104);
			sent();
			setState(105);
			sentlist_r();
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

	public static class Sentlist_rContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_rContext sentlist_r() {
			return getRuleContext(Sentlist_rContext.class,0);
		}
		public Sentlist_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSentlist_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSentlist_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSentlist_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist_rContext sentlist_r() throws RecognitionException {
		Sentlist_rContext _localctx = new Sentlist_rContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentlist_r);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__11:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				sent();
				setState(108);
				sentlist_r();
				}
				break;
			case T__9:
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(CodeToHTMLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(CodeToHTMLParser.IDENTIFICADOR, i);
		}
		public Sent_f1Context sent_f1() {
			return getRuleContext(Sent_f1Context.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				type();
				setState(114);
				lid();
				setState(115);
				match(T__10);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(IDENTIFICADOR);
				setState(118);
				sent_f1();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__11);
				setState(120);
				exp();
				setState(121);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__12);
				setState(124);
				match(T__2);
				setState(125);
				lcond();
				setState(126);
				match(T__3);
				setState(127);
				match(T__13);
				setState(128);
				blq();
				setState(129);
				match(T__14);
				setState(130);
				blq();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(T__15);
				setState(133);
				match(T__2);
				setState(134);
				match(IDENTIFICADOR);
				setState(135);
				asig();
				setState(136);
				exp();
				setState(137);
				match(T__10);
				setState(138);
				lcond();
				setState(139);
				match(T__10);
				setState(140);
				match(IDENTIFICADOR);
				setState(141);
				asig();
				setState(142);
				exp();
				setState(143);
				match(T__3);
				setState(144);
				blq();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(T__16);
				setState(147);
				match(T__2);
				setState(148);
				lcond();
				setState(149);
				match(T__3);
				setState(150);
				blq();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(T__17);
				setState(153);
				blq();
				setState(154);
				match(T__18);
				setState(155);
				match(T__2);
				setState(156);
				lcond();
				setState(157);
				match(T__3);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
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

	public static class Sent_f1Context extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Sent_f2Context sent_f2() {
			return getRuleContext(Sent_f2Context.class,0);
		}
		public Sent_f1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_f1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSent_f1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSent_f1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSent_f1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_f1Context sent_f1() throws RecognitionException {
		Sent_f1Context _localctx = new Sent_f1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_sent_f1);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				asig();
				setState(163);
				exp();
				setState(164);
				match(T__10);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__2);
				setState(167);
				sent_f2();
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

	public static class Sent_f2Context extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Sent_f2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_f2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterSent_f2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitSent_f2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitSent_f2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_f2Context sent_f2() throws RecognitionException {
		Sent_f2Context _localctx = new Sent_f2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_sent_f2);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				lid();
				setState(171);
				match(T__3);
				setState(172);
				match(T__10);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__2);
				setState(175);
				match(T__3);
				setState(176);
				match(T__10);
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
		public Lid_fContext lid_f() {
			return getRuleContext(Lid_fContext.class,0);
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
			setState(179);
			match(IDENTIFICADOR);
			setState(180);
			lid_f();
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

	public static class Lid_fContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Lid_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLid_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLid_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLid_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lid_fContext lid_f() throws RecognitionException {
		Lid_fContext _localctx = new Lid_fContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lid_f);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__4);
				setState(183);
				lid();
				}
				break;
			case T__3:
			case T__10:
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
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		public TerminalNode IDENTIFICADOR() { return getToken(CodeToHTMLParser.IDENTIFICADOR, 0); }
		public Exp_fContext exp_f() {
			return getRuleContext(Exp_fContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_rContext exp_r() {
			return getRuleContext(Exp_rContext.class,0);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IDENTIFICADOR);
				setState(190);
				exp_f();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__2);
				setState(192);
				exp();
				setState(193);
				match(T__3);
				setState(194);
				exp_r();
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(CONSTENTERO);
				setState(197);
				exp_r();
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(CONSTREAL);
				setState(199);
				exp_r();
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(CONSTLIT);
				setState(201);
				exp_r();
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

	public static class Exp_fContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Exp_rContext exp_r() {
			return getRuleContext(Exp_rContext.class,0);
		}
		public Exp_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterExp_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitExp_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitExp_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_fContext exp_f() throws RecognitionException {
		Exp_fContext _localctx = new Exp_fContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_f);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__2);
				setState(205);
				lid();
				setState(206);
				match(T__3);
				setState(207);
				exp_r();
				}
				break;
			case T__3:
			case T__10:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				exp_r();
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

	public static class Exp_rContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_rContext exp_r() {
			return getRuleContext(Exp_rContext.class,0);
		}
		public Exp_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterExp_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitExp_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitExp_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_rContext exp_r() throws RecognitionException {
		Exp_rContext _localctx = new Exp_rContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp_r);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				op();
				setState(213);
				exp();
				setState(214);
				exp_r();
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
		enterRule(_localctx, 42, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Lcond_rContext lcond_r() {
			return getRuleContext(Lcond_rContext.class,0);
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
		enterRule(_localctx, 44, RULE_lcond);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__29:
			case T__30:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				cond();
				setState(222);
				lcond_r();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__28);
				setState(225);
				cond();
				setState(226);
				lcond_r();
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

	public static class Lcond_rContext extends ParserRuleContext {
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public Lcond_rContext lcond_r() {
			return getRuleContext(Lcond_rContext.class,0);
		}
		public Lcond_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).enterLcond_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeToHTMLListener ) ((CodeToHTMLListener)listener).exitLcond_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeToHTMLVisitor ) return ((CodeToHTMLVisitor<? extends T>)visitor).visitLcond_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lcond_rContext lcond_r() throws RecognitionException {
		Lcond_rContext _localctx = new Lcond_rContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lcond_r);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				opl();
				setState(231);
				lcond();
				setState(232);
				lcond_r();
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
		enterRule(_localctx, 48, RULE_cond);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				exp();
				setState(238);
				opr();
				setState(239);
				exp();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__30);
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
		enterRule(_localctx, 50, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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
		enterRule(_localctx, 52, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00fc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4@\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7R\n"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\5"+
		"\nd\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rr\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ab\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\5\22\u00bc\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cd\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00d5\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00dc\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e7\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u00ee\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00f6\n\32\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2\26\32\3\2\33\36\3\2"+
		"\"#\3\2$)\2\u00fb\28\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bG\3\2\2\2\nI\3\2\2"+
		"\2\fQ\3\2\2\2\16S\3\2\2\2\20]\3\2\2\2\22c\3\2\2\2\24e\3\2\2\2\26j\3\2"+
		"\2\2\30q\3\2\2\2\32\u00a2\3\2\2\2\34\u00aa\3\2\2\2\36\u00b3\3\2\2\2 \u00b5"+
		"\3\2\2\2\"\u00bb\3\2\2\2$\u00bd\3\2\2\2&\u00cc\3\2\2\2(\u00d4\3\2\2\2"+
		"*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00e6\3\2\2\2\60\u00ed\3\2\2\2\62\u00f5"+
		"\3\2\2\2\64\u00f7\3\2\2\2\66\u00f9\3\2\2\289\5\4\3\29\3\3\2\2\2:;\5\b"+
		"\5\2;<\5\6\4\2<\5\3\2\2\2=@\5\4\3\2>@\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3"+
		"\2\2\2AB\7\3\2\2BC\5\22\n\2CD\5\n\6\2DH\3\2\2\2EF\7\4\2\2FH\5\n\6\2GA"+
		"\3\2\2\2GE\3\2\2\2H\t\3\2\2\2IJ\7*\2\2JK\7\5\2\2KL\5\f\7\2LM\7\6\2\2M"+
		"N\5\24\13\2N\13\3\2\2\2OR\5\16\b\2PR\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\r\3"+
		"\2\2\2ST\5\22\n\2TU\7*\2\2UV\5\20\t\2V\17\3\2\2\2WX\7\7\2\2XY\5\22\n\2"+
		"YZ\7*\2\2Z[\5\20\t\2[^\3\2\2\2\\^\3\2\2\2]W\3\2\2\2]\\\3\2\2\2^\21\3\2"+
		"\2\2_d\7\b\2\2`d\7\t\2\2ab\7\n\2\2bd\b\n\1\2c_\3\2\2\2c`\3\2\2\2ca\3\2"+
		"\2\2d\23\3\2\2\2ef\7\13\2\2fg\5\26\f\2gh\7\f\2\2hi\b\13\1\2i\25\3\2\2"+
		"\2jk\5\32\16\2kl\5\30\r\2l\27\3\2\2\2mn\5\32\16\2no\5\30\r\2or\3\2\2\2"+
		"pr\3\2\2\2qm\3\2\2\2qp\3\2\2\2r\31\3\2\2\2st\5\22\n\2tu\5 \21\2uv\7\r"+
		"\2\2v\u00a3\3\2\2\2wx\7*\2\2x\u00a3\5\34\17\2yz\7\16\2\2z{\5&\24\2{|\7"+
		"\r\2\2|\u00a3\3\2\2\2}~\7\17\2\2~\177\7\5\2\2\177\u0080\5.\30\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0082\7\20\2\2\u0082\u0083\5\24\13\2\u0083\u0084"+
		"\7\21\2\2\u0084\u0085\5\24\13\2\u0085\u00a3\3\2\2\2\u0086\u0087\7\22\2"+
		"\2\u0087\u0088\7\5\2\2\u0088\u0089\7*\2\2\u0089\u008a\5$\23\2\u008a\u008b"+
		"\5&\24\2\u008b\u008c\7\r\2\2\u008c\u008d\5.\30\2\u008d\u008e\7\r\2\2\u008e"+
		"\u008f\7*\2\2\u008f\u0090\5$\23\2\u0090\u0091\5&\24\2\u0091\u0092\7\6"+
		"\2\2\u0092\u0093\5\24\13\2\u0093\u00a3\3\2\2\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\7\5\2\2\u0096\u0097\5.\30\2\u0097\u0098\7\6\2\2\u0098\u0099\5\24"+
		"\13\2\u0099\u00a3\3\2\2\2\u009a\u009b\7\24\2\2\u009b\u009c\5\24\13\2\u009c"+
		"\u009d\7\25\2\2\u009d\u009e\7\5\2\2\u009e\u009f\5.\30\2\u009f\u00a0\7"+
		"\6\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\5\24\13\2\u00a2s\3\2\2\2\u00a2"+
		"w\3\2\2\2\u00a2y\3\2\2\2\u00a2}\3\2\2\2\u00a2\u0086\3\2\2\2\u00a2\u0094"+
		"\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\33\3\2\2\2\u00a4"+
		"\u00a5\5$\23\2\u00a5\u00a6\5&\24\2\u00a6\u00a7\7\r\2\2\u00a7\u00ab\3\2"+
		"\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a4\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7\6\2"+
		"\2\u00ae\u00af\7\r\2\2\u00af\u00b4\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2"+
		"\7\6\2\2\u00b2\u00b4\7\r\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\37\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\u00b7\5\"\22\2\u00b7!\3\2\2\2\u00b8"+
		"\u00b9\7\7\2\2\u00b9\u00bc\5 \21\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc#\3\2\2\2\u00bd\u00be\t\2\2\2\u00be%\3\2"+
		"\2\2\u00bf\u00c0\7*\2\2\u00c0\u00cd\5(\25\2\u00c1\u00c2\7\5\2\2\u00c2"+
		"\u00c3\5&\24\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5*\26\2\u00c5\u00cd\3\2"+
		"\2\2\u00c6\u00c7\7+\2\2\u00c7\u00cd\5*\26\2\u00c8\u00c9\7,\2\2\u00c9\u00cd"+
		"\5*\26\2\u00ca\u00cb\7-\2\2\u00cb\u00cd\5*\26\2\u00cc\u00bf\3\2\2\2\u00cc"+
		"\u00c1\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1"+
		"\7\6\2\2\u00d1\u00d2\5*\26\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5*\26\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5)\3\2\2\2\u00d6\u00d7\5,\27\2"+
		"\u00d7\u00d8\5&\24\2\u00d8\u00d9\5*\26\2\u00d9\u00dc\3\2\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc+\3\2\2\2\u00dd"+
		"\u00de\t\3\2\2\u00de-\3\2\2\2\u00df\u00e0\5\62\32\2\u00e0\u00e1\5\60\31"+
		"\2\u00e1\u00e7\3\2\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e4\5\62\32\2\u00e4"+
		"\u00e5\5\60\31\2\u00e5\u00e7\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e2\3"+
		"\2\2\2\u00e7/\3\2\2\2\u00e8\u00e9\5\64\33\2\u00e9\u00ea\5.\30\2\u00ea"+
		"\u00eb\5\60\31\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3"+
		"\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\61\3\2\2\2\u00ef\u00f0\5&\24\2\u00f0"+
		"\u00f1\5\66\34\2\u00f1\u00f2\5&\24\2\u00f2\u00f6\3\2\2\2\u00f3\u00f6\7"+
		" \2\2\u00f4\u00f6\7!\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8\65\3\2\2\2\u00f9"+
		"\u00fa\t\5\2\2\u00fa\67\3\2\2\2\22?GQ]cq\u00a2\u00aa\u00b3\u00bb\u00cc"+
		"\u00d4\u00db\u00e6\u00ed\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}