package com.imooc.decorator;

public class SideBorder extends Border {
    private char borderChar;

    protected SideBorder(Display display,char borderChar) {
        super(display);
        this.borderChar=borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns()+2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int i) {
        return borderChar+display.getRowText(i)+borderChar;
    }
}
