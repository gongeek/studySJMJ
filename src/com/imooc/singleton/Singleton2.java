package com.imooc.singleton;

/**
 * Created by gongeek on 2014/11/25.
 * 懒汉模式
 */

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }
    public static Singleton2 getInstance() {
        //增加效率
        if(instance==null){
            synchronized (Singleton2.class){
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
