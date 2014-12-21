package com.imooc.decorator;

public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 2+display.getColumns();
    }

    @Override
    public int getRows() {
        return 2+display.getRows();
    }

    @Override
    public String getRowText(int i) {
        if(i==0){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else if(i==display.getRows()+1){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else {
            return "|"+display.getRowText(i-1)+"|";
        }
    }

    private String makeLine(char ch,int count){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<count;i++){
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
