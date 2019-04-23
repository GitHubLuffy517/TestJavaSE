package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    //    Map中常用的方法
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        String s1=map.put(1001,"廖祥栋");
        map.put(1002,"许晗");
//        输出的是null，因为返回的是被替换的value值
        System.out.println(s1);
        String s2=map.put(1001,"吴彦祖");
        System.out.println(s2);
//        返回的是当前key值对应的value值
        System.out.println(map.get(1001));
        System.out.println(map);
//        是否包含
        System.out.println(map.containsKey(1002));
        Collection<String> c=map.values();
        System.out.println(c);
//        删除并返回value值
        String s3=map.remove(1001);
        System.out.println(s3);
        System.out.println(map);
    }
}
