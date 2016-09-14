package com.steven.java.design.structure.decorator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.decorator
 * @date 16/9/14 下午2:06
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

}
