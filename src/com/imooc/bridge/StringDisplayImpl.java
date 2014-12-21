package com.imooc.bridge;

public class StringDisplayImpl implements DisplayImpl {
    @Override
    public void open() {
        System.out.println("++++++++");
    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }

    @Override
    public void close() {
        System.out.println("--------");
    }
}
