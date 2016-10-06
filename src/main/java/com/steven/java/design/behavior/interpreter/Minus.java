package com.steven.java.design.behavior.interpreter;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.interpreter
 * @date 16/10/6 下午6:18
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }

}
