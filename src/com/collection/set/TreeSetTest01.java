package com.collection.set;

import java.util.TreeSet;

//存放会排序，只能排序基本类型，引用类型排序需要重写compare方法
public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);
        System.out.println(treeSet);
    }

}
