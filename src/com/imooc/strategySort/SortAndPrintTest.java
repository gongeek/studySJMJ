package com.imooc.strategySort;

import org.junit.Test;


public class SortAndPrintTest {
    @Test
    public void testMain(){
        Integer[] data={2,3,4,35,45,99,21,4,3,234,16,89,44,2,343};
        SortAndPrint sortAndPrint=new SortAndPrint(data,new InsertSorter());
        sortAndPrint.execute();
    }
}