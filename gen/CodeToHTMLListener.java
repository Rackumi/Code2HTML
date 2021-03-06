// Generated from C:/Users/gocruz17/IdeaProjects/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1

	import SintData.Sintesis;
	import java.io.File;
	import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeToHTMLParser}.
 */
public interface CodeToHTMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(CodeToHTMLParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(CodeToHTMLParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CodeToHTMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CodeToHTMLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#program_f}.
	 * @param ctx the parse tree
	 */
	void enterProgram_f(CodeToHTMLParser.Program_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#program_f}.
	 * @param ctx the parse tree
	 */
	void exitProgram_f(CodeToHTMLParser.Program_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(CodeToHTMLParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(CodeToHTMLParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#restpart}.
	 * @param ctx the parse tree
	 */
	void enterRestpart(CodeToHTMLParser.RestpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#restpart}.
	 * @param ctx the parse tree
	 */
	void exitRestpart(CodeToHTMLParser.RestpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#restpart_f}.
	 * @param ctx the parse tree
	 */
	void enterRestpart_f(CodeToHTMLParser.Restpart_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#restpart_f}.
	 * @param ctx the parse tree
	 */
	void exitRestpart_f(CodeToHTMLParser.Restpart_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#listparam}.
	 * @param ctx the parse tree
	 */
	void enterListparam(CodeToHTMLParser.ListparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#listparam}.
	 * @param ctx the parse tree
	 */
	void exitListparam(CodeToHTMLParser.ListparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#listparam_r}.
	 * @param ctx the parse tree
	 */
	void enterListparam_r(CodeToHTMLParser.Listparam_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#listparam_r}.
	 * @param ctx the parse tree
	 */
	void exitListparam_r(CodeToHTMLParser.Listparam_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CodeToHTMLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CodeToHTMLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(CodeToHTMLParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(CodeToHTMLParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(CodeToHTMLParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(CodeToHTMLParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#sentlist_r}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_r(CodeToHTMLParser.Sentlist_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#sentlist_r}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_r(CodeToHTMLParser.Sentlist_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(CodeToHTMLParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(CodeToHTMLParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#sent_f1}.
	 * @param ctx the parse tree
	 */
	void enterSent_f1(CodeToHTMLParser.Sent_f1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#sent_f1}.
	 * @param ctx the parse tree
	 */
	void exitSent_f1(CodeToHTMLParser.Sent_f1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#sent_f2}.
	 * @param ctx the parse tree
	 */
	void enterSent_f2(CodeToHTMLParser.Sent_f2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#sent_f2}.
	 * @param ctx the parse tree
	 */
	void exitSent_f2(CodeToHTMLParser.Sent_f2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#lid}.
	 * @param ctx the parse tree
	 */
	void enterLid(CodeToHTMLParser.LidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#lid}.
	 * @param ctx the parse tree
	 */
	void exitLid(CodeToHTMLParser.LidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#lid_f}.
	 * @param ctx the parse tree
	 */
	void enterLid_f(CodeToHTMLParser.Lid_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#lid_f}.
	 * @param ctx the parse tree
	 */
	void exitLid_f(CodeToHTMLParser.Lid_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(CodeToHTMLParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(CodeToHTMLParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CodeToHTMLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CodeToHTMLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#exp_f}.
	 * @param ctx the parse tree
	 */
	void enterExp_f(CodeToHTMLParser.Exp_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#exp_f}.
	 * @param ctx the parse tree
	 */
	void exitExp_f(CodeToHTMLParser.Exp_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#exp_r}.
	 * @param ctx the parse tree
	 */
	void enterExp_r(CodeToHTMLParser.Exp_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#exp_r}.
	 * @param ctx the parse tree
	 */
	void exitExp_r(CodeToHTMLParser.Exp_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CodeToHTMLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CodeToHTMLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#lcond}.
	 * @param ctx the parse tree
	 */
	void enterLcond(CodeToHTMLParser.LcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#lcond}.
	 * @param ctx the parse tree
	 */
	void exitLcond(CodeToHTMLParser.LcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#lcond_r}.
	 * @param ctx the parse tree
	 */
	void enterLcond_r(CodeToHTMLParser.Lcond_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#lcond_r}.
	 * @param ctx the parse tree
	 */
	void exitLcond_r(CodeToHTMLParser.Lcond_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(CodeToHTMLParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(CodeToHTMLParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#opl}.
	 * @param ctx the parse tree
	 */
	void enterOpl(CodeToHTMLParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#opl}.
	 * @param ctx the parse tree
	 */
	void exitOpl(CodeToHTMLParser.OplContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeToHTMLParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(CodeToHTMLParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(CodeToHTMLParser.OprContext ctx);
}