package com.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test02 {
    //    去掉list中的重复元素
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        LinkedHashSet linkedHashSet=new LinkedHashSet();
//        使用addAll方法传入一个Collection类的实例
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
        System.out.println(list);
    }
}
