package com.imooc.facade;
//外观模式
//主要目的减小接口数目
public class PageMaker {
    private PageMaker(){}
    public static void makeH1Page(){
        HTMLWriter htmlWriter=new HTMLWriter();
        String resultStr=htmlWriter.writeH1(TxtDataBase.getProperties("database").
                getProperty("username"));
        System.out.println("生成"+resultStr);
    }
}
