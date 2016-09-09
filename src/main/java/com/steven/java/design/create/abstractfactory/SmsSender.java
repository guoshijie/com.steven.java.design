package com.steven.java.design.create.abstractfactory;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.general
 * @date 16/9/9 下午12:08
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
