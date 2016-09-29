package com.steven.java.design.behavior.templatemethod;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.templatemethod
 * @date 16/9/29 下午7:46
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}