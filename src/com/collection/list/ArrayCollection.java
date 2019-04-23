package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayCollection {
    //    数组集合相互转换
    public static void main(String[] args) {
        //    集合转换为数组
        List<String> list1=new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
//        当规定的长度小于list的大小时，以list的大小为准，否则反之
        String[] arr=list1.toArray(new String[2]);
        System.out.println(arr.length);
//        数组转换为集合,集合中只能存放引用类型
        String[] array={"1","2","3"};
        List list2= Arrays.asList(array);
//        list2.add(3);报错：UnsupportedOperationException
//        因为是Arrays中的内部类的list，当数组与list大小不一致时会报错
        Iterator iterator=list2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
