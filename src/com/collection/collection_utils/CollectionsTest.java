package com.collection.collection_utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    //    Collections类中的一些方法
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        获取最大的值
        System.out.println(Collections.max(list));
//        获取最小的
        System.out.println(Collections.min(list));
//        排序,如果是自定义属性需要实现接口并重写compareto方法
        Collections.sort(list);
//        数值随机重组
        Collections.shuffle(list);
        System.out.println(list);
//        反转list
        Collections.reverse(list);
        System.out.println(list);
//        二分法查找
        System.out.println(Collections.binarySearch(list,4));
    }
}
