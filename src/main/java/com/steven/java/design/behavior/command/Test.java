package com.steven.java.design.behavior.command;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.command
 * @date 16/10/5 下午6:33
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }

}
