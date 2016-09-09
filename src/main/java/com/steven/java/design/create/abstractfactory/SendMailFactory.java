package com.steven.java.design.create.abstractfactory;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.abstractfactory
 * @date 16/9/9 下午6:03
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }

}
