package com.steven.java.design.create.builder;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.create.builder
 * @date 16/9/12 下午12:08
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
