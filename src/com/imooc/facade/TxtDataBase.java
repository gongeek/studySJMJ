package com.imooc.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TxtDataBase {
    private TxtDataBase(){}
    public static Properties getProperties(String txtName){
        String fileName=txtName+".txt";
        Properties prop=new Properties();
        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
