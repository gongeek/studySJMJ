package com.imooc.decorator;

import org.junit.Test;

public class BorderTest {
    @Test
    public void testMain(){
        Display display1=new StringDisplay("Hello,world\ni am gongeek\n123");
        Display display2=new SideBorder(display1,'#');
        Display display3=new FullBorder(display2);
        display1.show();
        display2.show();
        display3.show();
        Display display4=new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("您好")),
                                        '&')
                        )),'=');
        display4.show();
    }

}