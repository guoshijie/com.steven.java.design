package com.steven.java.design.behavior.iterator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.iterator
 * @date 16/10/3 下午9:08
 */
public interface Iterator {

    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();

}
