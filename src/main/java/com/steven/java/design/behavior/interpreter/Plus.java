package com.steven.java.design.behavior.interpreter;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.interpreter
 * @date 16/10/6 下午6:17
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }

}
