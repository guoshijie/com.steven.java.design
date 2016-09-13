package com.steven.java.design.structure.adapter.classes;

/**
 * 这样Targetable接口的实现类就具有了Source类的功能。
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.adapter.classes
 * @date 16/9/13 下午6:38
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
