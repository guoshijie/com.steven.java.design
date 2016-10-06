package com.steven.java.design.behavior.mediator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.mediator
 * @date 16/10/6 下午6:08
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
