package com.imooc.adapter;

/**
 * Created by gongeek on 2014/11/26.
 * 适配器 连接220和12v
 * 特点：1.就算没有源程序也无妨，不需要改动源程序就能实现新的规则接口
 * 2.版本更新与兼容，新版本为220v，旧版本为12v中间加一个适配器实习新版本兼容旧版本
 */

public class PrintBanner extends Banner implements Print {

//    private String str;

    //str是私有属性不能被继承，但是下面确可以访问
    public PrintBanner(String str) {
        super(str);
//        this.str = "gongeek";
    }

    @Override
    public String printWeak() {
        return showWithParen();
    }

    @Override
    public String printStrong() {
        return showWithAster();
    }

//    public void showOwnStr() {
//        System.out.println(this.str);
//    }


}
