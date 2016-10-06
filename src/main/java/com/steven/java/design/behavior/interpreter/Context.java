package com.steven.java.design.behavior.interpreter;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.interpreter
 * @date 16/10/6 下午6:17
 */
public class Context {

    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
