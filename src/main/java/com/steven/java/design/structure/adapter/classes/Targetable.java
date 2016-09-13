package com.steven.java.design.structure.adapter.classes;

/**
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.adapter.classes
 * @date 16/9/13 下午6:36
 */
public interface Targetable {

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();

}
