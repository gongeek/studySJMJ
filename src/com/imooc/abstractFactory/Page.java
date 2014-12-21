package com.imooc.abstractFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

public abstract class Page  {
    protected String title;
    protected String author;
    protected Vector content=new Vector();

    public Page(String title,String author) {
        this.title = title;
        this.author=author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try {
            String filename=title+".html";
            Writer writer=new FileWriter(new File(filename));
            writer.write(this.makeHTML());
            writer.close();
            System.out.println("已产生"+filename+".html !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

    ;
}
