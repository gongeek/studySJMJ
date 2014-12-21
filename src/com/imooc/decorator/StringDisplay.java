package com.imooc.decorator;

public class StringDisplay extends Display {
    private String strings[];

    public StringDisplay(String s) {
        String[] strings = s.split("\n");
        this.strings=new String[strings.length];
        int c=0;
        for (String string : strings) {
            if (string.length() > c) {
                c = string.length();
            }
        }

        for(int k=0;k<strings.length;k++){
            int i=c-strings[k].length();
            for (int j=0;j<i;j++){
                strings[k]+=" ";
            }
            this.strings[k]=strings[k];
        }
        //请思考这里为什么不能直接用  this.strings=strings;
        //因为strings的每个元素都是不可变的
    }

    @Override
    public int getColumns() {
        return strings[0].length();
    }

    @Override
    public int getRows() {
        return strings.length;
    }

    @Override
    public String getRowText(int i) {
        return strings[i];
    }

}
