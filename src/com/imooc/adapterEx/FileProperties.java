package com.imooc.adapterEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by gongeek on 2014/11/26.
 * 适配器
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFormFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String header = "written by FileProperties";
        store(new FileOutputStream(filename), header);
    }


    @Override
    public String getValue(String key) {
        return getProperty(key);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
}
