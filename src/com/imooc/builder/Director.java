package com.imooc.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public Object construct(){
        builder.makeTitle("你好!");
        builder.makeString("哈哈哈");
        builder.makeItems(new String[]{"gong", "wei", "ok", "now"});
        return builder.getResult();
    }
}
