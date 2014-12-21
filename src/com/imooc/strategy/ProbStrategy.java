package com.imooc.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int preHandValue=0;
    private int curHandValue=0;
    private int[][] historys={{1,1,1},{1,1,1},{1,1,1}};

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int handValue=0;
        int randomInt=random.nextInt(getSum(preHandValue));
        if(randomInt<=historys[preHandValue][0]){
            handValue=0;
        }else if (historys[preHandValue][0]<randomInt&&
                randomInt<=historys[preHandValue][1]){
            handValue=1;
        }else {
            handValue=2;
        }
        curHandValue=handValue;
        preHandValue=curHandValue;
        return Hand.getHand(handValue);
    }

    public int getSum(int preHandValue){
        int sum=0;
        for (int i=0;i<3;i++){
            sum+=historys[preHandValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean isWin) {
        if(isWin){
            historys[preHandValue][curHandValue]+=1;
        }else {
            historys[preHandValue][(curHandValue+1)%3]+=1;
            historys[preHandValue][(curHandValue+2)%3]+=1;
        }
    }
}
