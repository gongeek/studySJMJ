package com.imooc.builder;

import org.junit.Test;

public class DirectorTest {

    @Test
    public void testConstruct() throws Exception {
        Director d1=new Director(new TextBuilder());
        Director d2=new Director(new HTMLBuilder());
        System.out.println();
        System.out.println(d1.construct());
        d2.construct();
    }
}