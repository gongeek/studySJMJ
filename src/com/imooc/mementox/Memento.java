package com.imooc.mementox;

import java.util.Vector;

public class Memento {
    private int money;
    private Vector fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new Vector();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit){
        fruits.add(fruit);
    }

    public Vector getFruits(){
        return (Vector) fruits.clone();
    }
}
