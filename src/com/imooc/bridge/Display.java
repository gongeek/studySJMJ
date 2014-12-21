package com.imooc.bridge;
//桥接模式:实现类的功能层次和实现层次的分离
public class Display {
//委托
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.open();
    }
    public void print(String s){
        impl.print(s);
    }
    public void close(){
        impl.close();
    }
    public void display(String s){
        open();
        print(s);
        close();
    }


}
