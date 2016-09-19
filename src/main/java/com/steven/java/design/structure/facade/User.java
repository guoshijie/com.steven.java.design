package com.steven.java.design.structure.facade;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.facade
 * @date 16/9/19 上午10:21
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
