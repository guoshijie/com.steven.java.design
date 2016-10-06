package com.steven.java.design.behavior.mediator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.mediator
 * @date 16/10/6 下午6:09
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }

}
