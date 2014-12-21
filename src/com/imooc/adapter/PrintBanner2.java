package com.imooc.adapter;

/**
 * Created by gongeek on 2014/11/26.
 * 对象委托
 */
public class PrintBanner2 extends Print2 {
    private Banner banner;

    public PrintBanner2(String str) {
        this.banner = new Banner(str);
    }


    @Override
    public String printWeak() {
        return banner.showWithParen();
    }

    @Override
    public String printStrong() {
        return banner.showWithAster();
    }
}
