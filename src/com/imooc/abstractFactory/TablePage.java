package com.imooc.abstractFactory;


public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder=new StringBuilder();
        builder.append("<html><head><title></title><style>td{\nborder: 1px" +
                " solid #000000;\n" +
                "        }</style></head><body><table>");
        for (Object aContent : content) {
            builder.append("<tr>").append(((Item)(aContent)).makeHTML())
                    .append("</tr>");
        }
        builder.append("</table><hr>"+author+"</hr></body><html>");
        return builder.toString();
    }
}
