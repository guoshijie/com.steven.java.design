package com.steven.java.design.behavior.iterator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.iterator
 * @date 16/10/3 下午9:07
 */
public interface Collection {

    public com.steven.java.design.behavior.iterator.Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();

}
