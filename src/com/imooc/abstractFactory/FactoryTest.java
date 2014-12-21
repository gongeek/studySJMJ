package com.imooc.abstractFactory;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void testList(){
        Factory factory=Factory.getFactory("com.imooc.abstractFactory.ListFactory");
        Link asahi=factory.createLink("朝日新闻", "http://www.asahi.com");
        Link yomiuri=factory.createLink("读卖新闻", "http://www.baidu.com");
        Link yahoo=factory.createLink("美国雅虎","http://www.baidu.com");
        Link jp=factory.createLink("日本雅虎","http://www.baidu.com");
        Tray traynews=factory.createTray("新闻");
        traynews.add(asahi);
        traynews.add(yomiuri);
        Tray trayyahoo=factory.createTray("搜索");
        trayyahoo.add(yahoo);
        trayyahoo.add(jp);
        Page page=factory.createPage("LinkPage","龚巍");
        page.add(traynews);
        page.add(trayyahoo);
        page.output();
    }
    @Test
    public void testTable(){
        Factory factory=Factory.getFactory("com.imooc.abstractFactory.TableFactory");
        Link asahi=factory.createLink("朝日新闻", "http://www.asahi.com");
        Link yomiuri=factory.createLink("读卖新闻", "http://www.baidu.com");
        Link yahoo=factory.createLink("美国雅虎","http://www.baidu.com");
        Link jp=factory.createLink("日本雅虎","http://www.baidu.com");
        Tray traynews=factory.createTray("新闻");
        traynews.add(asahi);
        traynews.add(yomiuri);
        Tray trayyahoo=factory.createTray("搜索");
        trayyahoo.add(yahoo);
        trayyahoo.add(jp);
        Page page=factory.createPage("LinkPageTable","龚巍");
        page.add(traynews);
        page.add(trayyahoo);
        page.output();
    }
}