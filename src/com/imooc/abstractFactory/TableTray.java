package com.imooc.abstractFactory;


public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder=new StringBuilder();
        builder.append("<td>");
        builder.append("<table width=\"100\"><tr>");
        builder.append("<td colspan=\"").append(tray.size()).append("\">")
                .append(caption).append("</td></tr><tr>");
        for (Object aTray : tray) {
            builder.append(((Item) (aTray)).makeHTML());
        }
        builder.append("</tr></table></td>");

        return builder.toString();
    }
}
