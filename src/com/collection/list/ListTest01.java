package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class ListTest01 {
    //    List中特有的方法
    public static void main(String[] args) {
//        多态
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");
        c2.add("e");
        c2.add("f");
//        特有的add方法，可以根据索引添加值
        ((ArrayList) c2).add(0,"A");
        System.out.println(c2);
//        特有的remove方法，根据索引删除值
        ((ArrayList) c2).remove(0);
        System.out.println(c2);
//        特有的get方法，根据索引获取值
        System.out.println(((ArrayList) c2).get(0));
//        特有的遍历方式
       for (int i=0;i<c2.size();i++){
           System.out.print(((ArrayList) c2).get(i)+" ");
       }
//       特有的set方法修改list
        ((ArrayList) c2).set(0,"A");
        System.out.println();
        System.out.println(c2);
    }
}
