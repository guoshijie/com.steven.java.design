package com.steven.java.design.create.singleton;

/**
 * 其实说Singleton4完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 * 所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
 * 也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.singleton
 * @date 16/9/10 下午4:47
 */
public class Singleton5 {

    private static Singleton5 instance = null;

    private Singleton5() {
    }

    /* 静态工程方法，创建实例 */
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton5();
        }
    }

    /* 赋值参数 */
    public static Singleton5 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
