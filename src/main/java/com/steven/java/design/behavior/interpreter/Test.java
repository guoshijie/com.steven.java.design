package com.steven.java.design.behavior.interpreter;

/**
 * 基本就这样，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.interpreter
 * @date 16/10/6 下午6:19
 */
public class Test {

    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }

}
