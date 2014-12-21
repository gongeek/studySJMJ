package com.imooc.adapterEx;

import java.io.IOException;

/**
 * Created by gongeek on 2014/11/26.
 * 课后习题
 * Target
 */
public interface FileIO {
    public void readFormFile(String filename) throws IOException;

    public void writeToFile(String filename) throws IOException;

    public String getValue(String key);

    public void setValue(String key, String value);
}
