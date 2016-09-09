package com.steven.java.design.create.factory.general;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.general
 * @date 16/9/9 下午12:10
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }

}
