package com.steven.java.design.structure.proxy;

/**
 * 代理模式的应用场景：
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。-- 开闭原则（Open Close Principle）
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.proxy
 * @date 16/9/18 上午10:50
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}