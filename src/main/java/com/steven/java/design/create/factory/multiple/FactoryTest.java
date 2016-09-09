package com.steven.java.design.create.factory.multiple;

import com.steven.java.design.create.factory.general.Sender;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.multiple
 * @date 16/9/9 下午1:46
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

}
