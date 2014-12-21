package com.imooc.chain;

public class SpecialSupport extends Support {
    private int number;//只能解决此内问题
    public SpecialSupport(String name,int number) {
        super(name);
        this.number=number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {

        return trouble.getNumber()==number;
    }
}
