package com.steven.java.design.behavior.strategy;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.strategy
 * @date 16/9/23 上午11:09
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }

}
