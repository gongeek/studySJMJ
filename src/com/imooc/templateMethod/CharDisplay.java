package com.imooc.templateMethod;

/**
 * Created by gongeek on 2014/11/26.
 * 子类一
 */
public class CharDisplay extends AbstractDisplay {
    @Override
    protected void open() {
        System.out.println("<<");
    }

    @Override
    protected void print() {
        System.out.println("H");
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}
