package com.imooc.mementox;

import org.junit.Test;

public class GamerTest {
    @Test
    public void testMain() {
        Gamer gamer=new Gamer(100);
        Memento memento=gamer.createMemento();
        for (int i=0;i<100;i++){
            System.out.println("===="+i);
            System.out.println("现况:"+gamer);//输出目前状态
            gamer.bet();
            System.out.println("手边金钱为:"+gamer.getMoney());
            if(gamer.getMoney()>memento.getMoney()){
                System.out.println("因为赢了不少故先存着");
                memento=gamer.createMemento();
            }else if(gamer.getMoney()<memento.getMoney()/2){
                System.out.println("输了很多，恢复到前面状态");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }


    }
}