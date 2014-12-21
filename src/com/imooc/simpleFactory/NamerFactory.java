package com.imooc.simpleFactory;

/**
 * Created by gongeek on 2014/11/25.
 * 简单工厂，返回一个Namer实例
 */
public class NamerFactory {
    public Namer getNamerInstance(String name) {
        if (name.indexOf(",") > 0) {
            return new LastFirst(name);
        } else {
            return new FirstFirst(name);
        }
    }
}
