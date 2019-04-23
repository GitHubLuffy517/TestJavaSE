package com.collection.list;

import static java.util.Arrays.sort;

public class StaticImport {
    //          采用静态导入的方式导入Arrays中的方法
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2};
        sort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
