package com.imooc.factoryMethod;

import java.util.Hashtable;

/**
 * Created by gongeek on 2014/11/27.
 * IDCard工厂
 */

public class IDCardFactory extends Factory {
    private Hashtable idCards = new Hashtable();
    private int id = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, id++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        idCards.put(idCard.getOwner(), idCard.getId());
    }

    public Hashtable getIdCards() {
        return idCards;
    }
}
