package com.imooc.proxy;


public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if(real!=null){
            real.setPrinterName(name);
        }
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print() {
        realize();
        real.print();
    }

    private void realize() {
        if(real==null){
            real=new Printer(name);
        }
    }
}
