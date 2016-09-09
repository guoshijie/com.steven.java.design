package com.steven.java.design.create.factory.general;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.general
 * @date 16/9/9 下午12:09
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
