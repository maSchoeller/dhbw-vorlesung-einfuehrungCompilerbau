package syntaxtree;

import java.util.stream.Collectors;

public class UList extends List {

    private java.util.List<String> items;

    public UList(java.util.List<String> items){
        this.items = items;
    }

    @Override
    public String getHTML() {
        return "<ul>" +
                items.stream()
                        .map(i -> "<li>" + i +"</li>")
                        .collect(Collectors.joining()) +
                "</ul>";
    }
}
