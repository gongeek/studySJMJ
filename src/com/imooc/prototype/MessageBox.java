package com.imooc.prototype;


public class MessageBox implements Product {
    private String decochar;

    public MessageBox(String decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(decochar);
        }
        System.out.print("\n");
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(decochar);
        }
        System.out.print("\n");
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
