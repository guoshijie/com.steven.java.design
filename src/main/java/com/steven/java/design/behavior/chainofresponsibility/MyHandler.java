package com.steven.java.design.behavior.chainofresponsibility;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.chainofresponsibility
 * @date 16/10/5 下午4:11
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }

}
