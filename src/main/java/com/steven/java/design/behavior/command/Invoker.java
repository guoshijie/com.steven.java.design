package com.steven.java.design.behavior.command;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.command
 * @date 16/10/5 下午6:32
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
