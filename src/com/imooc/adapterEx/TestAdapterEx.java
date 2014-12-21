package com.imooc.adapterEx;

import java.io.IOException;

/**
 * Created by gongeek on 2014/11/26.
 * 测试
 */
public class TestAdapterEx {
    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileProperties();
        fileIO.readFormFile("file.txt");
        fileIO.setValue("year", "2000");
        fileIO.setValue("name", "gongeek");
        fileIO.setValue("company", "alibaba");
        fileIO.setValue("company", "alibaba");
        fileIO.writeToFile("newfile.txt");
    }
}
