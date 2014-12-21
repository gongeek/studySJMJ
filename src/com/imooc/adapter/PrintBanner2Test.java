package com.imooc.adapter;

import com.imooc.adapter.Print2;
import com.imooc.adapter.PrintBanner2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintBanner2Test {
    private Print2 p2;

    @Before
    public void setUp() throws Exception {
        p2 = new PrintBanner2("hello");

    }

    @Test
    public void testPrintWeak() throws Exception {
        Assert.assertEquals("No", "(hello)", p2.printWeak());
    }

    @Test
    public void testPrintStrong() throws Exception {
        Assert.assertEquals("No", "*hello*", p2.printStrong());
    }
}