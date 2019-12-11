package parser.adapter;

import parser.MarkdownParser;
import syntaxtree.BlockElement;
import syntaxtree.Headline;
import syntaxtree.Text;

public class BlocKElementAdapter {
    public static BlockElement adapt(MarkdownParser.BlockElementContext ctx){
        if(ctx.headline()!=null){
            return new Headline(ctx.headline().h1().Text().getText());
        }
        if(ctx.textElement()!=null){
            return new Text(ctx.textElement().getText());
        }
        if(ctx.list()!=null){
            return ListAdapter.adapt(ctx.list());
        }
        return null; //Tritt nie ein!
    }
}
