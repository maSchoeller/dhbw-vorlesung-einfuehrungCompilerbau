package parser.adapter;

import parser.MarkdownParser;
import syntaxtree.List;
import syntaxtree.OList;
import syntaxtree.UList;

import java.util.stream.Collectors;

public class ListAdapter {
    public static List adapt(MarkdownParser.ListContext ctx){

        if (ctx.orderedList() != null)
        {
            java.util.List<String> items = ctx.orderedList()
                                                .orderedListElement()
                                                .stream()
                                                .map(l ->l.Text().getText())
                                                .collect(Collectors.toList());
            return new OList(items);
        }
        if(ctx.unorderedList() != null)
        {
            java.util.List<String> items = ctx.unorderedList()
                                                .unorderedListElement()
                                                .stream()
                                                .map(l ->l.Text().getText())
                                                .collect(Collectors.toList());
            return new UList(items);
        }
        return null;
    }
}
