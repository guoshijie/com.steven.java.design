package com.steven.java.design.create.abstractfactory;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.abstractfactory
 * @date 16/9/9 下午6:05
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
