package com.imooc.singleton;

import com.imooc.singleton.Singleton;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleton() throws Exception {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        if(s1==s2){
            System.out.println("s1和s2是同一个实例");
        }else {
            System.out.println("s1和s2不是是同一个实例");
        }
    }
}