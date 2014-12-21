package com.imooc.factoryMethod;

/**
 * Created by gongeek on 2014/11/27.
 * IDCard类相当于产品
 */
public class IDCard extends Product {
    private String owner;
    private int id;

    //思考为什么不加public？
    IDCard(String owner, int id) {
        this.owner = owner;
        this.id = id;
        System.out.println("建立" + owner + "的卡!id为" + id);
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡!id为" + id);
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
