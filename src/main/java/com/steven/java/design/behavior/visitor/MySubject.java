package com.steven.java.design.behavior.visitor;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.visitor
 * @date 16/10/6 下午5:51
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }

}
