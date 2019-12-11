package syntaxtree;

import java.util.Collection;
import java.util.Vector;

/**
 * Stellt ein Markdown-Dokument dar
 */
public class Document extends SyntaxTreeNode{
    private java.util.List<BlockElement> blockElements;

    public Document(java.util.List<BlockElement> elements){
        this.blockElements = elements;
    }

    public java.util.List<BlockElement> getBlockElements() {
        return blockElements;
    }

    @Override
    public String getHTML() {
        String ret = "";
        for(BlockElement e : blockElements){
            ret+=e.getHTML();
            ret += "\n";
        }
        return ret;
    }
}
