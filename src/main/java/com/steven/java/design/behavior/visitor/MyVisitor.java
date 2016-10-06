package com.steven.java.design.behavior.visitor;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.visitor
 * @date 16/10/6 下午5:49
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }

}
