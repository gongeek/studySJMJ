package com.imooc.prototype;

import org.junit.Test;

public class ManagerTest {
    @Test
    public void Test() {
        Manager manager = new Manager();
        Product messageBox = new MessageBox("@");
        Product underlinePen = new UnderlinePen("*");
        manager.register("firstProduct", messageBox);
        manager.register("secondProduct", underlinePen);
        Product p1 = manager.create("firstProduct");
        Product p2 = manager.create("secondProduct");
        p1.use("gongwei");
        p2.use("gongwei");
    }

}