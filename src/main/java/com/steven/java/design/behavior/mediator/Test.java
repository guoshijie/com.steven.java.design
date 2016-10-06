package com.steven.java.design.behavior.mediator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.mediator
 * @date 16/10/6 下午6:10
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }

}
