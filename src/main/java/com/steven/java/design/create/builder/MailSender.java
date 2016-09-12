package com.steven.java.design.create.builder;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.general
 * @date 16/9/9 下午12:07
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }

}
