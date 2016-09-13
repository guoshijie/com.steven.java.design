package com.steven.java.design.structure.adapter.object;

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
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

}
