package com.imooc.templateMethod;

/**
 * Created by gongeek on 2014/11/26.
 * 模版方法
 * 抽象类
 */
public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 3; i++) {
            print();
        }
        close();
    }
}
