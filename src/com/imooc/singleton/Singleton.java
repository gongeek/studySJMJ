package com.imooc.singleton;

/**
 * Created by gongeek on 2014/11/25.
 * 只有一个实例,应用场景:单一配置文件，日志等
 * 1.单例模式
 * 饿汉模式,
 * 加载类时比较慢，获取对象数独快
 * 线程安全
 */

public class Singleton {
    private Singleton() {

    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
