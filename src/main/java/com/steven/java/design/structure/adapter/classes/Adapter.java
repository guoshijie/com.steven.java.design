package com.steven.java.design.structure.adapter.classes;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.adapter.classes
 * @date 16/9/13 下午6:37
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
