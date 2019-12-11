import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.MarkdownLexer;
import parser.MarkdownParser;

import java.io.IOException;

/**
 * Created by janulrich on 28.11.14.
 */
public class MarkdownInputParser {
    public static void main(String[] args) throws IOException {
        String html = new Markdown2HTML().compile(
                "# test"+
                        System.getProperty("line.separator") +
                        "# test2" +
                        System.getProperty("line.separator") +
                        "* test3" +
                        System.getProperty("line.separator") +
                        "* test4" +
                        System.getProperty("line.separator") +
                        "* test5" +
                        System.getProperty("line.separator") +
                        "1. test6" +
                        System.getProperty("line.separator") +
                        "1. test7" +
                        System.getProperty("line.separator"));
        System.out.println("out:"+html);
    }
}
