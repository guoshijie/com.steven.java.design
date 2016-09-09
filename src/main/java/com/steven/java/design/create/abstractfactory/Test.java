package com.steven.java.design.create.abstractfactory;

/**
 * 这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.abstractfactory
 * @date 16/9/9 下午6:06
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }

}
