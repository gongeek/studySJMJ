package com.imooc.abstractFactory;


import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption).append("\n");
        stringBuffer.append("<ul>\n");
        Iterator it= (Iterator) tray.iterator();
        while (it.hasNext()){
            stringBuffer.append(((Item)(it.next())).makeHTML());
        }

        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");

        return stringBuffer.toString();
    }
}
