package com.imooc.visitor;


public interface Visitor {
    public void visit(File file);
    public void visit(Director director);
}
