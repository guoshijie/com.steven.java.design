package com.steven.java.design.behavior.observer;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.observer
 * @date 16/9/29 下午7:56
 */
public interface Subject {

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();

}
