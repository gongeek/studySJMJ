package com.imooc.visitor;

import java.util.Iterator;
public class ListVistor implements Visitor {
    private String currentDir="";
    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }
    public void visit(Director director){
        System.out.println(currentDir+"/"+director);
        String saveDir=currentDir;
        currentDir=currentDir+"/"+director.getName();
        Iterator it=director.iterator();
        while (it.hasNext()){
            Entry entry= (Entry) it.next();
            entry.accept(this);
        }
        currentDir=saveDir;
    }
}
