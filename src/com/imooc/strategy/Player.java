package com.imooc.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount=0;
    private int loseCount=0;
    private int gameCount=0;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }
    public void lose(){
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even(){
        gameCount++;
    }

    public String toString(){
        return name+":"+gameCount+"次,赢"+winCount+"；输"+loseCount+"次"+
                ";平"+(gameCount-winCount-loseCount)+"次";
    }


}
