package com.imooc.prototype;

public class UnderlinePen implements Product {
    private String ulchar;

    public UnderlinePen(String ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
