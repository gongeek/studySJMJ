package com.imooc.flyweight;

public class BigString {
    private BigChar[] bigChars;
    public BigString(String s){
        bigChars=new BigChar[s.length()];
        BigCharFactory factory=BigCharFactory.getInstance();
        for (int i=0;i<s.length();i++){
            bigChars[i]=factory.getBigChar(s.charAt(i));
        }
    }

    public void print(){
         for (int i=0;i< bigChars.length;i++){
             System.out.print(bigChars[i]);
         }
    }
}
