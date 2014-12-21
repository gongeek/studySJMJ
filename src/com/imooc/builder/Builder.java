package com.imooc.builder;

public interface Builder {
    public void makeTitle(String s);
    public void makeString(String s);
    public void makeItems(String[] items);
    public String getResult();
}
