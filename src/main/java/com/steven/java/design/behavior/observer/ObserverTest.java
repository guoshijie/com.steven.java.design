package com.steven.java.design.behavior.observer;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.observer
 * @date 16/9/29 下午7:58
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
