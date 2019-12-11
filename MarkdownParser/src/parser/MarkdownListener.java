// Generated from C:/_data/01_sourcecode/github/dhbw-vorlesungen/dhbw-vorlesung-einfuehrungCompilerbau/MarkdownParser/src\Markdown.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownParser}.
 */
public interface MarkdownListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(MarkdownParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(MarkdownParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void enterBlockElement(MarkdownParser.BlockElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void exitBlockElement(MarkdownParser.BlockElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#textElement}.
	 * @param ctx the parse tree
	 */
	void enterTextElement(MarkdownParser.TextElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#textElement}.
	 * @param ctx the parse tree
	 */
	void exitTextElement(MarkdownParser.TextElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#codeElement}.
	 * @param ctx the parse tree
	 */
	void enterCodeElement(MarkdownParser.CodeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#codeElement}.
	 * @param ctx the parse tree
	 */
	void exitCodeElement(MarkdownParser.CodeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#headline}.
	 * @param ctx the parse tree
	 */
	void enterHeadline(MarkdownParser.HeadlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#headline}.
	 * @param ctx the parse tree
	 */
	void exitHeadline(MarkdownParser.HeadlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h1}.
	 * @param ctx the parse tree
	 */
	void enterH1(MarkdownParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h1}.
	 * @param ctx the parse tree
	 */
	void exitH1(MarkdownParser.H1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h2}.
	 * @param ctx the parse tree
	 */
	void enterH2(MarkdownParser.H2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h2}.
	 * @param ctx the parse tree
	 */
	void exitH2(MarkdownParser.H2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h3}.
	 * @param ctx the parse tree
	 */
	void enterH3(MarkdownParser.H3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h3}.
	 * @param ctx the parse tree
	 */
	void exitH3(MarkdownParser.H3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h4}.
	 * @param ctx the parse tree
	 */
	void enterH4(MarkdownParser.H4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h4}.
	 * @param ctx the parse tree
	 */
	void exitH4(MarkdownParser.H4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h5}.
	 * @param ctx the parse tree
	 */
	void enterH5(MarkdownParser.H5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h5}.
	 * @param ctx the parse tree
	 */
	void exitH5(MarkdownParser.H5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#h6}.
	 * @param ctx the parse tree
	 */
	void enterH6(MarkdownParser.H6Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#h6}.
	 * @param ctx the parse tree
	 */
	void exitH6(MarkdownParser.H6Context ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MarkdownParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MarkdownParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedList(MarkdownParser.OrderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedList(MarkdownParser.OrderedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#orderedListElement}.
	 * @param ctx the parse tree
	 */
	void enterOrderedListElement(MarkdownParser.OrderedListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#orderedListElement}.
	 * @param ctx the parse tree
	 */
	void exitOrderedListElement(MarkdownParser.OrderedListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#unorderedList}.
	 * @param ctx the parse tree
	 */
	void enterUnorderedList(MarkdownParser.UnorderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#unorderedList}.
	 * @param ctx the parse tree
	 */
	void exitUnorderedList(MarkdownParser.UnorderedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#unorderedListElement}.
	 * @param ctx the parse tree
	 */
	void enterUnorderedListElement(MarkdownParser.UnorderedListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#unorderedListElement}.
	 * @param ctx the parse tree
	 */
	void exitUnorderedListElement(MarkdownParser.UnorderedListElementContext ctx);
}