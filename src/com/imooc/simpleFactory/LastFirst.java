package com.imooc.simpleFactory;

/**
 * Created by gongeek on 2014/11/25.
 *子类二
 */
public class LastFirst extends Namer {
    public LastFirst(String name) {
        int i = name.indexOf(",");
        if (i > 0) {
            this.firstName = name.substring(0, i).trim();
            this.lastName = name.substring(i + 1).trim();
        } else {
            this.firstName = "";
            this.lastName = name;
        }
    }
}
