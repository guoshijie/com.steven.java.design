package com.steven.java.design.behavior.memento;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.memento
 * @date 16/10/6 下午3:55
 */
public class Original {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

}
