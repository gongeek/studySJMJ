package com.imooc.visitor;


import java.util.Iterator;
import java.util.Vector;

public class Director extends Entry{
    private Vector dirs=new Vector();
    private String dirName;

    public Director(String dirName) {
        this.dirName = dirName;
    }

    @Override
    public String getName() {
        return dirName;
    }

    @Override
    public int getSize() {
        Iterator iterator=iterator();
        int size=0;
        while (iterator.hasNext()){
            Entry entry= (Entry) iterator.next();
            size+=entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        dirs.add(entry);
        return this;
    }

    public Iterator iterator(){
        return dirs.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
