package com.imooc.observer;

import org.junit.Test;
public class ObserverTest {
    @Test
    public void testMain() {
        NumberGenerator numberGenerator=new RandomNumberGenerator();
        Observer o1=new DigitObserver();
        Observer o2=new GraphObserver();
        numberGenerator.addObserver(o1);
        numberGenerator.addObserver(o2);
        numberGenerator.execute();
    }
}