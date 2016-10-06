package com.steven.java.design.behavior.memento;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.memento
 * @date 16/10/6 下午3:56
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
