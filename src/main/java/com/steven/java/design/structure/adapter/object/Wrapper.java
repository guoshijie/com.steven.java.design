package com.steven.java.design.structure.adapter.object;

import com.steven.java.design.structure.adapter.classes.*;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.adapter.object
 * @date 16/9/13 下午7:05
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }

}
