package com.steven.java.design.structure.bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例：
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.bridge
 * @date 16/9/19 上午10:32
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
