package com.steven.java.design.behavior.memento;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.memento
 * @date 16/10/6 下午3:57
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
