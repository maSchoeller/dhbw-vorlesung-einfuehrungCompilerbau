package syntaxtree;

public class Headline extends BlockElement{
    private final String text;

    public Headline(String headline){
        this.text = headline;
    }

    @Override
    public String getHTML() {
        return "<h1>"+text+"</h1>";
    }
}
