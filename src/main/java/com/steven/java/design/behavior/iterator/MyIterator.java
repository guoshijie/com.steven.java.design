package com.steven.java.design.behavior.iterator;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.iterator
 * @date 16/10/3 下午9:10
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
