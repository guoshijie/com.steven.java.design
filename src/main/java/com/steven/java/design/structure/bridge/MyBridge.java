package com.steven.java.design.structure.bridge;

/**
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.structure.bridge
 * @date 16/9/19 上午10:35
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }

}
