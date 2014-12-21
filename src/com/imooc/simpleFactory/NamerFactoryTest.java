package com.imooc.simpleFactory;

import com.imooc.simpleFactory.Namer;
import com.imooc.simpleFactory.NamerFactory;
import org.junit.Test;

public class NamerFactoryTest {

    @Test
    public void testGetNamerInstance() throws Exception {
        Namer n1 = new NamerFactory().getNamerInstance("Gong Wei");
        System.out.println("FirstName:" + n1.getFirstName() + ";LastName:" +
                n1.getLastName());
        Namer n2 = new NamerFactory().getNamerInstance("Gong,Wei");
        System.out.println("FirstName:" + n2.getFirstName() + ";LastName:" +
                n2.getLastName());
    }
}