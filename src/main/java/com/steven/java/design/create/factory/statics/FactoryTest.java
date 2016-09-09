package com.steven.java.design.create.factory.statics;

import com.steven.java.design.create.factory.general.Sender;

/**
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.statics
 * @date 16/9/9 下午1:48
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }

}
