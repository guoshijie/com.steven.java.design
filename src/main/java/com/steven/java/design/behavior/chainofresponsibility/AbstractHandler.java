package com.steven.java.design.behavior.chainofresponsibility;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.chainofresponsibility
 * @date 16/10/5 下午4:10
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
