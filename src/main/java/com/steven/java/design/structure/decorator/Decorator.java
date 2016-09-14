package com.steven.java.design.structure.decorator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.decorator
 * @date 16/9/14 下午2:06
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }

}
