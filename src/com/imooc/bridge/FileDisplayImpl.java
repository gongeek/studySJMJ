package com.imooc.bridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//实现层次
public class FileDisplayImpl implements DisplayImpl {
    private PrintWriter printWriter;
    @Override
    public void open() {
        try {
            printWriter=new PrintWriter(new File("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println("++++++++");
    }

    @Override
    public void print(String s) {
        printWriter.println(s);
    }

    @Override
    public void close() {
        printWriter.println("--------");
        printWriter.close();
    }
}
