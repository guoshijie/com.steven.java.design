package com.steven.java.design.behavior.observer;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.observer
 * @date 16/9/29 下午7:54
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }

}
