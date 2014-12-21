package com.imooc.mementox;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class Gamer {
    private int money;
    private Vector fruits=new Vector();
    private Random random=new Random();
    private static String[] fruitsName={"苹果","葡萄","香蕉","橘子"};
    public Gamer(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dice=random.nextInt(6)+1;
        if(dice==1){
            money+=100;
            System.out.println("金钱增加");
        }else if(dice==2){
            money/=2;
            System.out.println("金钱剩下一半");
        }else if(dice==6){
            String f=getFruit();
            fruits.add(f);
            System.out.println("得到水果"+f);
        }else {
            System.out.println("什么都没有发生");
        }
    }

    private String getFruit(){
        String prefix="";
        if(random.nextBoolean()){
            prefix="好吃的";
        }
        return prefix+fruitsName[random.nextInt(fruitsName.length)];
    }

    public String toString(){
        return "money="+money+",fruits="+fruits;
    }

    public Memento createMemento(){
        Memento memento=new Memento(money);
        Iterator it=fruits.iterator();
        while (it.hasNext()){
            String f= (String) it.next();
            if(f.startsWith("好吃的")){
                memento.addFruit(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.money=memento.getMoney();
        this.fruits=memento.getFruits();
    }






}
