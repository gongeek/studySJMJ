package com.imooc.builder;

public class TextBuilder implements Builder{
    private StringBuffer buffer;

    @Override
    public void makeTitle(String title) {
        buffer=new StringBuffer();
        buffer.append("#############");
        buffer.append("[").append(title).append("]").append("\n\n\n");
    }

    @Override
    public void makeString(String s) {
        buffer.append("+").append(s).append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("    " + "-").append(item).append("\n");
        }

    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
