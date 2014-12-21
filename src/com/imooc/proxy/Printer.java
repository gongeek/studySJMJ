package com.imooc.proxy;

public class Printer implements Printable{
    private String name;

    public Printer(String name) {
        this.name=name;
        heavyJob("正在产生Printer的实例");
    }

    private void heavyJob(String s) {
        System.out.println(s);
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("完成");
    }

    @Override
    public void setPrinterName(String name) {
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("===="+name+"====");
    }
}
