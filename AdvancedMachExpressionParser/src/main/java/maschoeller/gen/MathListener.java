// Generated from C:/_data/01_sourcecode/github/dhbw-vorlesungen/dhbw-vorlesung-einfuehrungCompilerbau/AdvancedMachExpressionParser/src/main/java/maschoeller\Math.g4 by ANTLR 4.7.2

package maschoeller.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathParser}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MathParser.ExprContext ctx);
}