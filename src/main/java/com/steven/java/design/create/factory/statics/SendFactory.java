package com.steven.java.design.create.factory.statics;

import com.steven.java.design.create.factory.general.MailSender;
import com.steven.java.design.create.factory.general.Sender;
import com.steven.java.design.create.factory.general.SmsSender;

/**
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.factory.multiple
 * @date 16/9/9 下午1:44
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
