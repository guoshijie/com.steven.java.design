package com.steven.java.design.behavior.observer;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.observer
 * @date 16/9/29 下午7:57
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
