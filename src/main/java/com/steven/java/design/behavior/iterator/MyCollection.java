package com.steven.java.design.behavior.iterator;


/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.iterator
 * @date 16/10/3 下午9:09
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
