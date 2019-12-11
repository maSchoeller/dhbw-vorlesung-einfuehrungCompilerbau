package parser.adapter;

import parser.MarkdownParser;
import syntaxtree.BlockElement;

import java.util.ArrayList;
import java.util.List;

public class DocumentAdapter {

    public static List<BlockElement> adapt(MarkdownParser.DocumentContext ctx) {
        List<BlockElement> elements = new ArrayList<BlockElement>();
        for (MarkdownParser.BlockElementContext blockCon : ctx.blockElement()) {
            elements.add(BlocKElementAdapter.adapt(blockCon));
        }
        return elements;
    }
}

