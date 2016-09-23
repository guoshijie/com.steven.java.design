package com.steven.java.design.behavior.strategy;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.strategy
 * @date 16/9/23 上午11:07
 */
public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
