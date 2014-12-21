package com.imooc.visitor;


import java.util.Iterator;

public abstract class Entry implements Acceptor {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws Exception{
        throw new Exception();
    };
    public Iterator iterator() throws Exception{
        throw new Exception();
    }

    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
