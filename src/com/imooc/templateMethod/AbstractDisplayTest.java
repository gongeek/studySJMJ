package com.imooc.templateMethod;

import com.imooc.templateMethod.AbstractDisplay;
import com.imooc.templateMethod.CharDisplay;
import com.imooc.templateMethod.StringDisplay;
import org.junit.Before;
import org.junit.Test;

public class AbstractDisplayTest {
    private AbstractDisplay ad1;
    private AbstractDisplay ad2;

    @Before
    public void setUp() throws Exception {
        ad1 = new CharDisplay();
        ad2 = new StringDisplay();
    }

    @Test
    public void testDisplay() throws Exception {
        ad1.display();
        ad2.display();
    }
}