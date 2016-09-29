package com.steven.java.design.behavior.observer;

/**
 *  这些东西，其实不难，只是有些抽象，不太容易整体理解，建议读者：根据关系图，新建项目，自己写代码（或者参考我的代码）,按照总体思路走一遍，这样才能体会它的思想，理解起来容易！
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.observer
 * @date 16/9/29 下午7:55
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
