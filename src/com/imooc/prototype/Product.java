package com.imooc.prototype;

/**
 * Created by gongeek on 2014/11/27.
 * 原型模式
 */
public interface Product extends Cloneable {
    public void use(String s);

    public Product createClone();
}
