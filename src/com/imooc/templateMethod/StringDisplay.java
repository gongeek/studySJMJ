package com.imooc.templateMethod;

/**
 * Created by gongeek on 2014/11/26.
 * 子类二
 */
public class StringDisplay extends AbstractDisplay {
    @Override
    protected void open() {
        System.out.println("++++++");
    }

    @Override
    protected void print() {
        System.out.println("HaHa!");
    }

    @Override
    protected void close() {
        System.out.println("------");
    }
}
