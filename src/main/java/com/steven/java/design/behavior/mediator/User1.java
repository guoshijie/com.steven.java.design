package com.steven.java.design.behavior.mediator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.mediator
 * @date 16/10/6 下午6:09
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }

}
