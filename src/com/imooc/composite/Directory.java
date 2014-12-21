package com.imooc.composite;


import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;
    private Vector directory=new Vector();

    public Directory(String name) {
        this.name = name;
    }

    public Entry add(Entry entry){
        directory.add(entry);
        entry.parent=this;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator iterator=directory.iterator();
        while (iterator.hasNext()){
            size+=((Entry)(iterator.next())).getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator iterator=directory.iterator();
        while (iterator.hasNext()){
            ((Entry)(iterator.next())).printList(prefix+"/"+name);
        }
    }
}
