package com.imooc.factoryMethod;

/**
 * Created by gongeek on 2014/11/27.
 * 模版方法在创建类的实例上的应用
 */

public abstract class Factory {
    //工厂方法
    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
