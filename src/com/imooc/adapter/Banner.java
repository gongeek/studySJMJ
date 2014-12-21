package com.imooc.adapter;

/**
 * Created by gongeek on 2014/11/26.
 * 220v电流，即现有内容
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public String showWithParen() {
        String newStr = "(" + str + ")";
        System.out.println(newStr);
        return newStr;
    }

    public String showWithAster() {
        String newStr = "*" + str + "*";
        System.out.println(newStr);
        return newStr;
    }

}
