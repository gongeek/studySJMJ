package com.imooc.adapter;

import com.imooc.adapter.Print;
import com.imooc.adapter.PrintBanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintBannerTest {
    private Print p;

    @Before
    public void setUp() throws Exception {
        this.p = new PrintBanner("hello");
    }

    @Test
    public void testPrintWeak() throws Exception {
        Assert.assertEquals("不通过", "(hello)", p.printWeak());
    }

    @Test
    public void testPrintStrong() throws Exception {
        Assert.assertEquals("不通过", "*hello*", p.printStrong());
    }

//    @Test
//    public void testShowOwnStr() throws Exception{
//        ((PrintBanner)p).showOwnStr();
//    }
}