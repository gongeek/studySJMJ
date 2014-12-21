package com.imooc.bridge;

import org.junit.Test;

public class CountDisplayTest {
    @Test
    public void testMain(){
        Display d1=new CountDisplay(new StringDisplayImpl());
        d1.display("Hi!");
        //想一想为什么要强制转换
        ((CountDisplay)d1).multiDisplay("Hi!",3);

        Display d2=new CountDisplay(new FileDisplayImpl());
//        d2.display("Hi");
        ((CountDisplay)d2).multiDisplay("Hello!",9);

    }
}