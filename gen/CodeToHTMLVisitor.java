// Generated from C:/Users/gocruz17/IdeaProjects/Code2HTML/src\CodeToHTML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodeToHTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodeToHTMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(CodeToHTMLParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CodeToHTMLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(CodeToHTMLParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(CodeToHTMLParser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#listparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam(CodeToHTMLParser.ListparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#listparamAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparamAux(CodeToHTMLParser.ListparamAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CodeToHTMLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(CodeToHTMLParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(CodeToHTMLParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#sentlistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistAux(CodeToHTMLParser.SentlistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(CodeToHTMLParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid(CodeToHTMLParser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(CodeToHTMLParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CodeToHTMLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#expAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAux(CodeToHTMLParser.ExpAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(CodeToHTMLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#lcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond(CodeToHTMLParser.LcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#lcondAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcondAux(CodeToHTMLParser.LcondAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(CodeToHTMLParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(CodeToHTMLParser.OplContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeToHTMLParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(CodeToHTMLParser.OprContext ctx);
}