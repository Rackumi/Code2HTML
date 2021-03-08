// Generated from C:/Users/alvar/Desktop/WorkinSpace/ANTLR/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link CodeToHTMLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CodeToHTMLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeToHTMLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CodeToHTMLParser.OpContext ctx);
}