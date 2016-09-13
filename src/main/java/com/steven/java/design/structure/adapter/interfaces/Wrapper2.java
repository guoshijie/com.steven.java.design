package com.steven.java.design.structure.adapter.interfaces;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.adapter.interfaces
 * @date 16/9/13 下午7:12
 */
public class Wrapper2 implements Sourceable{

    @Override
    public void method1() {
        System.out.println("the wrapper method1");
    }

    @Override
    public void method2() {
        System.out.println("the wrapper method2");
    }
}
