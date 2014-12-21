package com.imooc.composite;
//组成模式很棒，递归！！！
public abstract class Entry {
    protected Entry parent;
    public abstract String getName();
    public abstract int getSize();
    public abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName()+":"+getSize();
    }

    public String getFullPath(){
        StringBuilder s=new StringBuilder();
        Entry entry=this;
        do{
            s.insert(0,"/"+entry.getName());
            entry=entry.parent;
        }while (entry!=null);
        return s.toString();
    }

}
