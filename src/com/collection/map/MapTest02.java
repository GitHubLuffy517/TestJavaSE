package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    //    map的两种遍历方式
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "廖祥栋");
        map.put(1002, "吴彦祖");
        map.put(1003, "彭于晏");
        test2(map);
    }

    //    使用keyset来遍历map
    public static void test1(Map<Integer, String> map) {
        Set<Integer> keyset = map.keySet();
//        Iterator<Integer> iterator=keyset.iterator();
//        while (iterator.hasNext()){
//            Integer key=iterator.next();
//            System.out.print(key+" "+map.get(key)+" ");
//        }
        for (Integer key : keyset
        ) {
            System.out.println(key + " " + map.get(key));
        }
    }

    //    使用键值对entry来遍历map
    public static void test2(Map<Integer, String> map) {
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
//        for (Map.Entry en:entrySet
//             ) {
//            System.out.println(en.getKey()+" "+en.getValue());
//        }
        Iterator <Map.Entry<Integer,String>> iterator=entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
