package com.imooc.prototype;

import java.util.Hashtable;

/**
 * Created by gongeek on 2014/11/27.
 * 管理克隆过来的对象
 */
public class Manager {
    private Hashtable showcase = new Hashtable();

    public void register(String key, Product product) {
        showcase.put(key, product);
    }

    public Product create(String key) {
        return ((Product) showcase.get(key)).createClone();
    }

}
