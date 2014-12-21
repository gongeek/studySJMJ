package com.imooc.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader=new BufferedReader(
                    new FileReader("big"+charName+".txt"));
            String line;
            StringBuffer buf=new StringBuffer();
            while ((line=reader.readLine())!=null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData=buf.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        return fontData;
    }
}
