package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
//        Collection是一个接口，特殊的抽象类，不能创建实例，所以采用多态的方式向上转型创建后代类实例
        Collection c=new ArrayList();
        c.add("one");
        c.add("two");
//        会自动调用toString方法，在他的爷爷类中重写的toString方法
        System.out.println(c);
        c.remove("one");
        System.out.println(c);
//        将集合转换为数组
        Object[] o=c.toArray();
        for (Object object:o
             ) {
            System.out.print(object+" ");
        }
//        清空集合
        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());
    }
}
