package com.imooc.bridge;
//功能层次
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(String s,int count){
        open();
        for(int i=0;i<count;i++){
            print(s);
        }
        close();
    }
}
