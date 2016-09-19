package com.steven.java.design.structure.bridge;

/**
 * 通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。
 * 接下来我再画个图，大家就应该明白了，因为这个图是我们JDBC连接的原理，有数据库学习基础的，一结合就都懂了。
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.bridge
 * @date 16/9/19 上午10:35
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
