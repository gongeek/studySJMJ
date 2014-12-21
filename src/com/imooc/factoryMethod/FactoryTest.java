package com.imooc.factoryMethod;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void testCreate() throws Exception {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("gongwei");
        Product p2 = factory.create("gongeek");
        Product p3 = factory.create("gw");
        p1.use();
        p2.use();
        p3.use();
    }
}