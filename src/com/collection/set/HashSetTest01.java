package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("a");
//        不能添加重复的元素
        System.out.println(set.add("a"));
        set.add("c");
        set.add("b");
//        set是无序的
//        因为重写了equals方法
        System.out.println(set.contains("b"));
        System.out.println(set);
//        也可以使用迭代器来遍历set，能使用迭代器的地方都可以使用foreach
    }
}
