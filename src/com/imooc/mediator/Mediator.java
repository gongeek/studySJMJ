package com.imooc.mediator;

/**
 * Created by gongeek on 2014/12/9.
 * 中介着，只要面对一个顾问
 */
public interface Mediator {
    public void createColleagues();
    public void colleagueChanged(Colleague colleague);
}
