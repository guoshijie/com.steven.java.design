package com.steven.java.design.behavior.iterator;

/**
 * 此处我们貌似模拟了一个集合类的过程，感觉是不是很爽？其实JDK中各个类也都是这些基本的东西，
 * 加一些设计模式，再加一些优化放到一起的，只要我们把这些东西学会了，掌握好了，我们也可以写出自己的集合类，甚至框架！
 *
 * @author Guo shijie
 * @Description
 * @Package com.steven.java.design.behavior.iterator
 * @date 16/10/3 下午9:11
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
