package com.imooc.adapter;

/**
 * Created by gongeek on 2014/11/26.
 * 适配器模式二：当Print是类不是接口怎么弄，利用委托对象
 */
public abstract class Print2 {
    public abstract String printWeak();

    public abstract String printStrong();
}
