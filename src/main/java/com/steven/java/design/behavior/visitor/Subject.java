package com.steven.java.design.behavior.visitor;

/**
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.visitor
 * @date 16/10/6 下午5:50
 */
public interface Subject {

    public void accept(Visitor visitor);
    public String getSubject();
}
