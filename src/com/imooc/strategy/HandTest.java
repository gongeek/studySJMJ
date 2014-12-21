package com.imooc.strategy;

import org.junit.Test;

public class HandTest {
    @Test
    public void testMain(){
        Hand h1=Hand.getHand(0);
        Hand h2=Hand.getHand(2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1.isStrongerThan(h2));
    }
}