package com.imooc.chain;

import org.junit.Test;

public class SupportTest {
    @Test
    public void testMain(){
        Support alice=new NoSupport("alice");
        Support bob=new LimitSupport("Bob",100);
        Support charline=new SpecialSupport("Charline",429);
        Support diana=new LimitSupport("Diana",200);
        Support elmo=new OddSupport("Elmo");
        Support freq=new LimitSupport("Freq",300);
        alice.setNext(bob).setNext(charline).setNext(diana).setNext(elmo).
                setNext(freq);
        for (int i=0;i<500;i+=33){
            alice.support(new Trouble(i));
        }
    }
}