package com.steven.java.design.structure.bridge;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.bridge
 * @date 16/9/19 上午10:30
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }

}
