package com.imooc.strategy;

//单例模式
public class Hand {
    private static int JIAN_DAO = 0;
    private static int QUAN_TOU = 1;
    private static int BU = 2;
    private int handValue;
    private static Hand[] hands = {new Hand(Hand.JIAN_DAO),
            new Hand(Hand.QUAN_TOU), new Hand(Hand.BU)};
    private String[] names={"剪刀","石头","布"};
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand)==1;
    }
    public boolean isWeekerThan(Hand hand){
        return fight(hand)==-1;
    }

    private int fight(Hand hand){
        if(this==hand){
            return 0;
        }else if((this.handValue+2)%3== hand.handValue){
            return 1;
        }else {
            return -1;
        }
    }

    public String toString(){
        return names[handValue];
    }

}
