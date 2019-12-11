package syntaxtree;


import java.util.stream.Collectors;

public class OList extends List {

    private java.util.List<String> items;

    public OList(java.util.List<String> items){
        this.items = items;
    }

    @Override
    public String getHTML() {
        return "<ol>" +
                items.stream()
                        .map(i -> "<li>" + i +"</li>")
                        .collect(Collectors.joining()) +
                "</ol>";
    }
}
