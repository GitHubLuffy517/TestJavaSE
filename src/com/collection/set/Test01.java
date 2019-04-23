package com.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test01 {
    //    采用set来生成1-20之间的数不能重复
    public static void main(String[] args) {
        Random random=new Random();
        Set<Integer> set=new HashSet<>();
        while (set.size()!=10){
            int i=random.nextInt(20)+1;
            set.add(i);
        }
        System.out.println(set);
    }
}
