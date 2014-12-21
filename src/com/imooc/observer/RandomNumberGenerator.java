package com.imooc.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random=new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i=0;i<20;i++){
            number=random.nextInt(50);
            notifyObservers();
        }
    }

//    public static void main(String[] args) {
//        NumberGenerator numberGenerator=new RandomNumberGenerator();
//        Observer o1=new DigitObserver();
//        Observer o2=new GraphObserver();
//        numberGenerator.addObserver(o1);
//        numberGenerator.addObserver(o2);
//        numberGenerator.execute();
//    }
}
