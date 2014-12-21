package com.imooc.strategy;

import org.junit.Test;

import java.util.Date;

public class PlayerTest {
    @Test
    public void testMain(){ for(int j=0;j<10;j++){
        Player p1=new Player("选手一",new WinningStrategy((int) new Date().
                getTime()));
        Player p2=new Player("选手二",new ProbStrategy((int) new Date().
                getTime()));

        for(int i=0;i<50;i++){
            Hand hand1=p1.nextHand();
            Hand hand2=p2.nextHand();
            if(hand1.isStrongerThan(hand2)){
                p1.win();
                p2.lose();
            }else if(hand1.isWeekerThan(hand2)){
                p2.win();
                p1.lose();
            }else {
                p1.even();
                p2.even();
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("***************************");
        }
    }
}