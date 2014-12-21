package com.imooc.singleton;

import org.junit.Test;

public class Singleton2Test {

    @Test
    public void testSingletonTest2() throws Exception {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        if (s1 == s2) {
            System.out.println("s1和s2是同一个实例");
        } else {
            System.out.println("s1和s2不是同一个实例");
        }
    }
}