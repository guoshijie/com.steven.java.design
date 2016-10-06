package com.steven.java.design.behavior.state;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.state
 * @date 16/10/6 下午5:30
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
