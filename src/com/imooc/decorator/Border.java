package com.imooc.decorator;

public abstract class Border extends Display {
    protected  Display display;//指装饰器里面的"内容"
    protected Border(Display display){
        this.display=display;
    }
}
