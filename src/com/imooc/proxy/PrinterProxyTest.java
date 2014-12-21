package com.imooc.proxy;

import org.junit.Test;

public class PrinterProxyTest {
    @Test
    public void testMain() {
        Printable p=new PrinterProxy("gongeek");
        p.setPrinterName("gongwei");
        System.out.println(p.getPrinterName());
        p.print();
    }

}