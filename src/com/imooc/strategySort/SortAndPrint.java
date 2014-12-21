package com.imooc.strategySort;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;//Strategy

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute(){
        print();
        sorter.sort(data);
    }
    private void print(){
        for (Comparable aData : data) {
            System.out.print(aData + ",");
        }
        System.out.println("");
    }
}
