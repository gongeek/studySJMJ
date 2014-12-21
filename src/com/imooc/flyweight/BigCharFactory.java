package com.imooc.flyweight;

import java.util.Hashtable;

public class BigCharFactory {
    private Hashtable pool=new Hashtable();
    private static final BigCharFactory singleton=new BigCharFactory();
    public static BigCharFactory getInstance(){
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName){
        BigChar bc= (BigChar) pool.get(String.valueOf(charName));
        if(bc==null){
            bc=new BigChar(charName);
            pool.put(String.valueOf(charName),bc);
        }
        return bc;
    }
}
