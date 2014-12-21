package com.imooc.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private Hand prevHand;
    private boolean isWin=false;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!isWin){
            prevHand=Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean isWin) {
        this.isWin=isWin;
    }
}
