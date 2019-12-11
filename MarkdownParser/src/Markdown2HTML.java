import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MarkdownBaseListener;
import parser.MarkdownLexer;
import parser.MarkdownParser;
import parser.adapter.DocumentAdapter;
import syntaxtree.Document;

import java.io.IOException;

/**
 * Created by janulrich on 28.11.14.
 */
public class Markdown2HTML {

    public String compile(String input) throws IOException {
        return this.parse(input).doc.getHTML();
    }

    private MarkdownWalker parse(String input) throws IOException {
        MarkdownLexer lexer = new MarkdownLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MarkdownParser parser = new MarkdownParser(tokens);
        ParserRuleContext tree = parser.document(); //Parsen

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        MarkdownWalker extractor = new MarkdownWalker();
        walker.walk(extractor, tree); // initiate walk of tree with listener
        return extractor;
    }

}

class MarkdownWalker extends MarkdownBaseListener {
    Document doc;

    @Override
    public void exitDocument(MarkdownParser.DocumentContext ctx) {
        doc = new Document(DocumentAdapter.adapt(ctx));
    }
}