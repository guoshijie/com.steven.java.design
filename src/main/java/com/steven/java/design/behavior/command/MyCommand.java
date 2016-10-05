package com.steven.java.design.behavior.command;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.command
 * @date 16/10/5 下午6:31
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }

}
