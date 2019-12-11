package syntaxtree;

import parser.MarkdownParser;

/**
 * Created by janulrich on 28.11.14.
 */
public class Text extends BlockElement {
    private final String text;

    public Text(String text) {
        this.text = text;

    }

    @Override
    public String getHTML() {
        return "<p>"+text+"</p>";
    }
}
