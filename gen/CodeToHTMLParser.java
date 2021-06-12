// Generated from C:/Users/alvar/Desktop/WorkinSpace/ANTLR/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1

	import SintData.Sintesis;
	import java.io.File;
	import java.util.LinkedList;

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



	    private Sintesis info;

	    String inic;
	    String end;
	    String cuerpo;

	    public CodeToHTMLParser(TokenStream input, Sintesis theinfo){
	        this(input);
	        info = theinfo;
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
			inic = info.inic(MainClass.nf);
			setState(55);
			program();
			end = info.end();
			    System.out.println(inic+cuerpo+end);
			    
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
		public String program_S;
		public PartContext part;
		public Program_fContext program_f;
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
			setState(58);
			((ProgramContext)_localctx).part = part();
			setState(59);
			((ProgramContext)_localctx).program_f = program_f();
			((ProgramContext)_localctx).program_S =  ((ProgramContext)_localctx).part.part_S + ((ProgramContext)_localctx).program_f.program_f_S; cuerpo = _localctx.program_S;
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
		public String program_f_S;
		public ProgramContext program;
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((Program_fContext)_localctx).program = program();
				((Program_fContext)_localctx).program_f_S =  ((Program_fContext)_localctx).program.program_S;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((Program_fContext)_localctx).program_f_S =  "";
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
		public String part_S;
		public TypeContext type;
		public RestpartContext restpart;
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__0);
				setState(69);
				((PartContext)_localctx).type = type();
				setState(70);
				((PartContext)_localctx).restpart = restpart();
				((PartContext)_localctx).part_S =  info.parrafo("funcion" + ((PartContext)_localctx).type.type_S + ((PartContext)_localctx).restpart.restpart_S);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__1);
				setState(74);
				((PartContext)_localctx).restpart = restpart();
				((PartContext)_localctx).part_S =  "procedimiento" + ((PartContext)_localctx).restpart.restpart_S;
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
		public String restpart_S;
		public Token IDENTIFICADOR;
		public Restpart_fContext restpart_f;
		public BlqContext blq;
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
			setState(79);
			((RestpartContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(80);
			match(T__2);
			setState(81);
			((RestpartContext)_localctx).restpart_f = restpart_f();
			setState(82);
			match(T__3);
			setState(83);
			((RestpartContext)_localctx).blq = blq();
			((RestpartContext)_localctx).restpart_S =  (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null) + "(" + ((RestpartContext)_localctx).restpart_f.restpart_f_S + ")" + ((RestpartContext)_localctx).blq.blq_S;
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
		public String restpart_f_S;
		public ListparamContext listparam;
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((Restpart_fContext)_localctx).listparam = listparam();
				((Restpart_fContext)_localctx).restpart_f_S =  ((Restpart_fContext)_localctx).listparam.listparam_S;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((Restpart_fContext)_localctx).restpart_f_S =  "";
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
		public String listparam_S;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public Listparam_rContext listparam_r;
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
			setState(92);
			((ListparamContext)_localctx).type = type();
			setState(93);
			((ListparamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(94);
			((ListparamContext)_localctx).listparam_r = listparam_r();
			((ListparamContext)_localctx).listparam_S =  ((ListparamContext)_localctx).type.type_S + (((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null) + ((ListparamContext)_localctx).listparam_r.listparam_r_S;
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
		public String listparam_r_S;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public Listparam_rContext listparam_r;
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__4);
				setState(98);
				((Listparam_rContext)_localctx).type = type();
				setState(99);
				((Listparam_rContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(100);
				((Listparam_rContext)_localctx).listparam_r = listparam_r();
				((Listparam_rContext)_localctx).listparam_r_S =  "," + ((Listparam_rContext)_localctx).type.type_S + (((Listparam_rContext)_localctx).IDENTIFICADOR!=null?((Listparam_rContext)_localctx).IDENTIFICADOR.getText():null) + ((Listparam_rContext)_localctx).listparam_r.listparam_r_S;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((Listparam_rContext)_localctx).listparam_r_S =  "";
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
		public String type_S;
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__5);
				((TypeContext)_localctx).type_S =  "entero";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__6);
				((TypeContext)_localctx).type_S =  "real";
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(T__7);
				((TypeContext)_localctx).type_S =  "caracter";
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
		public String blq_S;
		public SentlistContext sentlist;
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
			setState(114);
			match(T__8);
			setState(115);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(116);
			match(T__9);
			((BlqContext)_localctx).blq_S =  "inicio" + ((BlqContext)_localctx).sentlist.sentlist_S + "fin";
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
		public String sentlist_S;
		public SentContext sent;
		public Sentlist_rContext sentlist_r;
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
			setState(119);
			((SentlistContext)_localctx).sent = sent();
			setState(120);
			((SentlistContext)_localctx).sentlist_r = sentlist_r();
			((SentlistContext)_localctx).sentlist_S =  ((SentlistContext)_localctx).sent.sent_S + ((SentlistContext)_localctx).sentlist_r.sentlist_r_S;
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
		public String sentlist_r_S;
		public SentContext sent;
		public Sentlist_rContext sentlist_r;
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
			setState(128);
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
				setState(123);
				((Sentlist_rContext)_localctx).sent = sent();
				setState(124);
				((Sentlist_rContext)_localctx).sentlist_r = sentlist_r();
				((Sentlist_rContext)_localctx).sentlist_r_S =  ((Sentlist_rContext)_localctx).sent.sent_S + ((Sentlist_rContext)_localctx).sentlist_r.sentlist_r_S;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((Sentlist_rContext)_localctx).sentlist_r_S =  "";
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
		public String sent_S;
		public TypeContext type;
		public LidContext lid;
		public Token IDENTIFICADOR;
		public Sent_f1Context sent_f1;
		public ExpContext exp;
		public LcondContext lcond;
		public BlqContext blq;
		public AsigContext asig;
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((SentContext)_localctx).type = type();
				setState(131);
				((SentContext)_localctx).lid = lid();
				setState(132);
				match(T__10);
				((SentContext)_localctx).sent_S =  ((SentContext)_localctx).type.type_S + ((SentContext)_localctx).lid.lid_S + ";" ;
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(136);
				((SentContext)_localctx).sent_f1 = sent_f1();
				((SentContext)_localctx).sent_S =  (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null) + ((SentContext)_localctx).sent_f1.sent_f1_S;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__11);
				setState(140);
				((SentContext)_localctx).exp = exp();
				setState(141);
				match(T__10);
				((SentContext)_localctx).sent_S =  "return" + ((SentContext)_localctx).exp.exp_S + ";";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__12);
				setState(145);
				match(T__2);
				setState(146);
				((SentContext)_localctx).lcond = lcond();
				setState(147);
				match(T__3);
				setState(148);
				match(T__13);
				setState(149);
				((SentContext)_localctx).blq = blq();
				setState(150);
				match(T__14);
				setState(151);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).sent_S =  "bifurcacion" + "(" + ((SentContext)_localctx).lcond.lcond_S + ")" + "entonces" + ((SentContext)_localctx).blq.blq_S + "sino" + ((SentContext)_localctx).blq.blq_S;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(T__15);
				setState(155);
				match(T__2);
				setState(156);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(157);
				((SentContext)_localctx).asig = asig();
				setState(158);
				((SentContext)_localctx).exp = exp();
				setState(159);
				match(T__10);
				setState(160);
				((SentContext)_localctx).lcond = lcond();
				setState(161);
				match(T__10);
				setState(162);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(163);
				((SentContext)_localctx).asig = asig();
				setState(164);
				((SentContext)_localctx).exp = exp();
				setState(165);
				match(T__3);
				setState(166);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).sent_S =  "buclepara" + "(" + (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null) + (((SentContext)_localctx).asig!=null?_input.getText(((SentContext)_localctx).asig.start,((SentContext)_localctx).asig.stop):null) + ((SentContext)_localctx).exp.exp_S + ";" + ((SentContext)_localctx).lcond.lcond_S + ";" + (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null) + (((SentContext)_localctx).asig!=null?_input.getText(((SentContext)_localctx).asig.start,((SentContext)_localctx).asig.stop):null) + ((SentContext)_localctx).exp.exp_S + ")" + ((SentContext)_localctx).blq.blq_S;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(T__16);
				setState(170);
				match(T__2);
				setState(171);
				((SentContext)_localctx).lcond = lcond();
				setState(172);
				match(T__3);
				setState(173);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).sent_S =  "buclemientras" + "(" + ((SentContext)_localctx).lcond.lcond_S + ")" + ((SentContext)_localctx).blq.blq_S;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(T__17);
				setState(177);
				((SentContext)_localctx).blq = blq();
				setState(178);
				match(T__18);
				setState(179);
				match(T__2);
				setState(180);
				((SentContext)_localctx).lcond = lcond();
				setState(181);
				match(T__3);
				((SentContext)_localctx).sent_S =  "bucle" + ((SentContext)_localctx).blq.blq_S + "hasta" + "(" + ((SentContext)_localctx).lcond.lcond_S + ")";
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).sent_S =  ((SentContext)_localctx).blq.blq_S;
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
		public String sent_f1_S;
		public AsigContext asig;
		public ExpContext exp;
		public Sent_f2Context sent_f2;
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((Sent_f1Context)_localctx).asig = asig();
				setState(190);
				((Sent_f1Context)_localctx).exp = exp();
				setState(191);
				match(T__10);
				((Sent_f1Context)_localctx).sent_f1_S =  (((Sent_f1Context)_localctx).asig!=null?_input.getText(((Sent_f1Context)_localctx).asig.start,((Sent_f1Context)_localctx).asig.stop):null) + ((Sent_f1Context)_localctx).exp.exp_S + ";";
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__2);
				setState(195);
				((Sent_f1Context)_localctx).sent_f2 = sent_f2();
				((Sent_f1Context)_localctx).sent_f1_S =  "(" + ((Sent_f1Context)_localctx).sent_f2.sent_f2_S;
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
		public String sent_f2_S;
		public LidContext lid;
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((Sent_f2Context)_localctx).lid = lid();
				setState(201);
				match(T__3);
				setState(202);
				match(T__10);
				((Sent_f2Context)_localctx).sent_f2_S =  ((Sent_f2Context)_localctx).lid.lid_S + ")" + ";";
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__2);
				setState(206);
				match(T__3);
				setState(207);
				match(T__10);
				((Sent_f2Context)_localctx).sent_f2_S =  "(" + ")" + ";";
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
		public String lid_S;
		public Token IDENTIFICADOR;
		public Lid_fContext lid_f;
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
			setState(211);
			((LidContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(212);
			((LidContext)_localctx).lid_f = lid_f();
			((LidContext)_localctx).lid_S =  (((LidContext)_localctx).IDENTIFICADOR!=null?((LidContext)_localctx).IDENTIFICADOR.getText():null) + ((LidContext)_localctx).lid_f.lid_f_S;
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
		public String lid_f_S;
		public LidContext lid;
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__4);
				setState(216);
				((Lid_fContext)_localctx).lid = lid();
				((Lid_fContext)_localctx).lid_f_S =  "," + ((Lid_fContext)_localctx).lid.lid_S;
				}
				break;
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((Lid_fContext)_localctx).lid_f_S =  "";
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
			setState(222);
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
		public String exp_S;
		public Token IDENTIFICADOR;
		public Exp_fContext exp_f;
		public ExpContext exp;
		public Exp_rContext exp_r;
		public Token CONSTENTERO;
		public Token CONSTREAL;
		public Token CONSTLIT;
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
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((ExpContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(225);
				((ExpContext)_localctx).exp_f = exp_f();
				((ExpContext)_localctx).exp_S =  (((ExpContext)_localctx).IDENTIFICADOR!=null?((ExpContext)_localctx).IDENTIFICADOR.getText():null) + ((ExpContext)_localctx).exp_f.exp_f_S;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__2);
				setState(229);
				((ExpContext)_localctx).exp = exp();
				setState(230);
				match(T__3);
				setState(231);
				((ExpContext)_localctx).exp_r = exp_r();
				((ExpContext)_localctx).exp_S =  "(" + ((ExpContext)_localctx).exp.exp_S + ")" + ((ExpContext)_localctx).exp_r.exp_r_S;
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				((ExpContext)_localctx).CONSTENTERO = match(CONSTENTERO);
				setState(235);
				((ExpContext)_localctx).exp_r = exp_r();
				((ExpContext)_localctx).exp_S =  (((ExpContext)_localctx).CONSTENTERO!=null?((ExpContext)_localctx).CONSTENTERO.getText():null) + ((ExpContext)_localctx).exp_r.exp_r_S;
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				((ExpContext)_localctx).CONSTREAL = match(CONSTREAL);
				setState(239);
				((ExpContext)_localctx).exp_r = exp_r();
				((ExpContext)_localctx).exp_S =  (((ExpContext)_localctx).CONSTREAL!=null?((ExpContext)_localctx).CONSTREAL.getText():null) + ((ExpContext)_localctx).exp_r.exp_r_S;
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				((ExpContext)_localctx).CONSTLIT = match(CONSTLIT);
				setState(243);
				((ExpContext)_localctx).exp_r = exp_r();
				((ExpContext)_localctx).exp_S =  (((ExpContext)_localctx).CONSTLIT!=null?((ExpContext)_localctx).CONSTLIT.getText():null) + ((ExpContext)_localctx).exp_r.exp_r_S;
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
		public String exp_f_S;
		public LidContext lid;
		public Exp_rContext exp_r;
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
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__2);
				setState(249);
				((Exp_fContext)_localctx).lid = lid();
				setState(250);
				match(T__3);
				setState(251);
				((Exp_fContext)_localctx).exp_r = exp_r();
				((Exp_fContext)_localctx).exp_f_S =  "(" + ((Exp_fContext)_localctx).lid.lid_S + ")" + ((Exp_fContext)_localctx).exp_r.exp_r_S;
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
				setState(254);
				((Exp_fContext)_localctx).exp_r = exp_r();
				((Exp_fContext)_localctx).exp_f_S =  ((Exp_fContext)_localctx).exp_r.exp_r_S;
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
		public String exp_r_S;
		public OpContext op;
		public ExpContext exp;
		public Exp_rContext exp_r;
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((Exp_rContext)_localctx).op = op();
				setState(260);
				((Exp_rContext)_localctx).exp = exp();
				setState(261);
				((Exp_rContext)_localctx).exp_r = exp_r();
				((Exp_rContext)_localctx).exp_r_S =  (((Exp_rContext)_localctx).op!=null?_input.getText(((Exp_rContext)_localctx).op.start,((Exp_rContext)_localctx).op.stop):null) + ((Exp_rContext)_localctx).exp.exp_S + ((Exp_rContext)_localctx).exp_r.exp_r_S;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Exp_rContext)_localctx).exp_r_S =  "";
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
			setState(267);
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
		public String lcond_S;
		public CondContext cond;
		public Lcond_rContext lcond_r;
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
			setState(278);
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
				setState(269);
				((LcondContext)_localctx).cond = cond();
				setState(270);
				((LcondContext)_localctx).lcond_r = lcond_r();
				((LcondContext)_localctx).lcond_S =  ((LcondContext)_localctx).cond.cond_S + ((LcondContext)_localctx).lcond_r.lcond_r_S;
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__28);
				setState(274);
				((LcondContext)_localctx).cond = cond();
				setState(275);
				((LcondContext)_localctx).lcond_r = lcond_r();
				((LcondContext)_localctx).lcond_S =  "no" + ((LcondContext)_localctx).cond.cond_S + ((LcondContext)_localctx).lcond_r.lcond_r_S;
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
		public String lcond_r_S;
		public OplContext opl;
		public LcondContext lcond;
		public Lcond_rContext lcond_r;
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				((Lcond_rContext)_localctx).opl = opl();
				setState(281);
				((Lcond_rContext)_localctx).lcond = lcond();
				setState(282);
				((Lcond_rContext)_localctx).lcond_r = lcond_r();
				((Lcond_rContext)_localctx).lcond_r_S =  (((Lcond_rContext)_localctx).opl!=null?_input.getText(((Lcond_rContext)_localctx).opl.start,((Lcond_rContext)_localctx).opl.stop):null) + ((Lcond_rContext)_localctx).lcond.lcond_S+ ((Lcond_rContext)_localctx).lcond_r.lcond_r_S;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Lcond_rContext)_localctx).lcond_r_S =  "";
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
		public String cond_S;
		public ExpContext exp;
		public OprContext opr;
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
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((CondContext)_localctx).exp = exp();
				setState(289);
				((CondContext)_localctx).opr = opr();
				setState(290);
				((CondContext)_localctx).exp = exp();
				((CondContext)_localctx).cond_S =  ((CondContext)_localctx).exp.exp_S + (((CondContext)_localctx).opr!=null?_input.getText(((CondContext)_localctx).opr.start,((CondContext)_localctx).opr.stop):null) + ((CondContext)_localctx).exp.exp_S;
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__29);
				((CondContext)_localctx).cond_S =  "cierto";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(T__30);
				((CondContext)_localctx).cond_S =  "falso";
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
			setState(299);
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
			setState(301);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00be\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d4\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f9\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0104\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u010c\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0119\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0121\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012c\n\32\3\33"+
		"\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\6\3\2\26\32\3\2\33\36\3\2\"#\3\2$)\2\u0131\28\3\2"+
		"\2\2\4<\3\2\2\2\6D\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2"+
		"\2\20j\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2\26y\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u00bd\3\2\2\2\34\u00c8\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2\2\"\u00de"+
		"\3\2\2\2$\u00e0\3\2\2\2&\u00f8\3\2\2\2(\u0103\3\2\2\2*\u010b\3\2\2\2,"+
		"\u010d\3\2\2\2.\u0118\3\2\2\2\60\u0120\3\2\2\2\62\u012b\3\2\2\2\64\u012d"+
		"\3\2\2\2\66\u012f\3\2\2\289\b\2\1\29:\5\4\3\2:;\b\2\1\2;\3\3\2\2\2<=\5"+
		"\b\5\2=>\5\6\4\2>?\b\3\1\2?\5\3\2\2\2@A\5\4\3\2AB\b\4\1\2BE\3\2\2\2CE"+
		"\b\4\1\2D@\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\7\3\2\2GH\5\22\n\2HI\5\n\6\2"+
		"IJ\b\5\1\2JP\3\2\2\2KL\7\4\2\2LM\5\n\6\2MN\b\5\1\2NP\3\2\2\2OF\3\2\2\2"+
		"OK\3\2\2\2P\t\3\2\2\2QR\7*\2\2RS\7\5\2\2ST\5\f\7\2TU\7\6\2\2UV\5\24\13"+
		"\2VW\b\6\1\2W\13\3\2\2\2XY\5\16\b\2YZ\b\7\1\2Z]\3\2\2\2[]\b\7\1\2\\X\3"+
		"\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\5\22\n\2_`\7*\2\2`a\5\20\t\2ab\b\b\1\2"+
		"b\17\3\2\2\2cd\7\7\2\2de\5\22\n\2ef\7*\2\2fg\5\20\t\2gh\b\t\1\2hk\3\2"+
		"\2\2ik\b\t\1\2jc\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lm\7\b\2\2ms\b\n\1\2no\7"+
		"\t\2\2os\b\n\1\2pq\7\n\2\2qs\b\n\1\2rl\3\2\2\2rn\3\2\2\2rp\3\2\2\2s\23"+
		"\3\2\2\2tu\7\13\2\2uv\5\26\f\2vw\7\f\2\2wx\b\13\1\2x\25\3\2\2\2yz\5\32"+
		"\16\2z{\5\30\r\2{|\b\f\1\2|\27\3\2\2\2}~\5\32\16\2~\177\5\30\r\2\177\u0080"+
		"\b\r\1\2\u0080\u0083\3\2\2\2\u0081\u0083\b\r\1\2\u0082}\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0086\5 \21"+
		"\2\u0086\u0087\7\r\2\2\u0087\u0088\b\16\1\2\u0088\u00be\3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a\u008b\5\34\17\2\u008b\u008c\b\16\1\2\u008c\u00be\3"+
		"\2\2\2\u008d\u008e\7\16\2\2\u008e\u008f\5&\24\2\u008f\u0090\7\r\2\2\u0090"+
		"\u0091\b\16\1\2\u0091\u00be\3\2\2\2\u0092\u0093\7\17\2\2\u0093\u0094\7"+
		"\5\2\2\u0094\u0095\5.\30\2\u0095\u0096\7\6\2\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0098\5\24\13\2\u0098\u0099\7\21\2\2\u0099\u009a\5\24\13\2\u009a\u009b"+
		"\b\16\1\2\u009b\u00be\3\2\2\2\u009c\u009d\7\22\2\2\u009d\u009e\7\5\2\2"+
		"\u009e\u009f\7*\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\5&\24\2\u00a1\u00a2"+
		"\7\r\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7*\2\2\u00a5"+
		"\u00a6\5$\23\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5\24"+
		"\13\2\u00a9\u00aa\b\16\1\2\u00aa\u00be\3\2\2\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\u00ad\7\5\2\2\u00ad\u00ae\5.\30\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5\24"+
		"\13\2\u00b0\u00b1\b\16\1\2\u00b1\u00be\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3"+
		"\u00b4\5\24\13\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7"+
		"\5.\30\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\b\16\1\2\u00b9\u00be\3\2\2\2"+
		"\u00ba\u00bb\5\24\13\2\u00bb\u00bc\b\16\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u0084\3\2\2\2\u00bd\u0089\3\2\2\2\u00bd\u008d\3\2\2\2\u00bd\u0092\3\2"+
		"\2\2\u00bd\u009c\3\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\5&\24"+
		"\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\b\17\1\2\u00c3\u00c9\3\2\2\2\u00c4"+
		"\u00c5\7\5\2\2\u00c5\u00c6\5\36\20\2\u00c6\u00c7\b\17\1\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\35\3\2\2\2\u00ca"+
		"\u00cb\5 \21\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\b\20"+
		"\1\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\7\r\2\2\u00d2\u00d4\b\20\1\2\u00d3\u00ca\3\2\2\2\u00d3\u00cf\3"+
		"\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6\u00d7\5\"\22\2\u00d7"+
		"\u00d8\b\21\1\2\u00d8!\3\2\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\5 \21\2"+
		"\u00db\u00dc\b\22\1\2\u00dc\u00df\3\2\2\2\u00dd\u00df\b\22\1\2\u00de\u00d9"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df#\3\2\2\2\u00e0\u00e1\t\2\2\2\u00e1"+
		"%\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\b\24\1\2"+
		"\u00e5\u00f9\3\2\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9"+
		"\7\6\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\b\24\1\2\u00eb\u00f9\3\2\2\2"+
		"\u00ec\u00ed\7+\2\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\b\24\1\2\u00ef\u00f9"+
		"\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\5*\26\2\u00f2\u00f3\b\24\1\2\u00f3"+
		"\u00f9\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\b\24"+
		"\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00e2\3\2\2\2\u00f8\u00e6\3\2\2\2\u00f8"+
		"\u00ec\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\'\3\2\2\2"+
		"\u00fa\u00fb\7\5\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe"+
		"\5*\26\2\u00fe\u00ff\b\25\1\2\u00ff\u0104\3\2\2\2\u0100\u0101\5*\26\2"+
		"\u0101\u0102\b\25\1\2\u0102\u0104\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u0100"+
		"\3\2\2\2\u0104)\3\2\2\2\u0105\u0106\5,\27\2\u0106\u0107\5&\24\2\u0107"+
		"\u0108\5*\26\2\u0108\u0109\b\26\1\2\u0109\u010c\3\2\2\2\u010a\u010c\b"+
		"\26\1\2\u010b\u0105\3\2\2\2\u010b\u010a\3\2\2\2\u010c+\3\2\2\2\u010d\u010e"+
		"\t\3\2\2\u010e-\3\2\2\2\u010f\u0110\5\62\32\2\u0110\u0111\5\60\31\2\u0111"+
		"\u0112\b\30\1\2\u0112\u0119\3\2\2\2\u0113\u0114\7\37\2\2\u0114\u0115\5"+
		"\62\32\2\u0115\u0116\5\60\31\2\u0116\u0117\b\30\1\2\u0117\u0119\3\2\2"+
		"\2\u0118\u010f\3\2\2\2\u0118\u0113\3\2\2\2\u0119/\3\2\2\2\u011a\u011b"+
		"\5\64\33\2\u011b\u011c\5.\30\2\u011c\u011d\5\60\31\2\u011d\u011e\b\31"+
		"\1\2\u011e\u0121\3\2\2\2\u011f\u0121\b\31\1\2\u0120\u011a\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\61\3\2\2\2\u0122\u0123\5&\24\2\u0123\u0124\5\66\34"+
		"\2\u0124\u0125\5&\24\2\u0125\u0126\b\32\1\2\u0126\u012c\3\2\2\2\u0127"+
		"\u0128\7 \2\2\u0128\u012c\b\32\1\2\u0129\u012a\7!\2\2\u012a\u012c\b\32"+
		"\1\2\u012b\u0122\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\63\3\2\2\2\u012d\u012e\t\4\2\2\u012e\65\3\2\2\2\u012f\u0130\t\5\2\2\u0130"+
		"\67\3\2\2\2\22DO\\jr\u0082\u00bd\u00c8\u00d3\u00de\u00f8\u0103\u010b\u0118"+
		"\u0120\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}