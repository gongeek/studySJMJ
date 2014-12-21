package com.imooc.abstractFactory;


import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("<html><head><title></title></head><body>");
        buffer.append("<h1>").append(title).append("</h1>");
        buffer.append("<ul>");
        Iterator it= (Iterator) content.iterator();
        while (it.hasNext()){
            buffer.append(((Item)(it.next())).makeHTML());
        }
        buffer.append("</ul>");
        buffer.append("<hr>").append(author).append("</hr>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}
