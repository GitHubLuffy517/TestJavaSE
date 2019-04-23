package com.arr;

import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {
        int a[]={1,54,89,12,3,56,4};
//        排序方法,用的是快速排序
        Arrays.sort(a);
        for (int x:a
             ) {
            System.out.print(x+" ");
        }
        System.out.println();
//        二分查找
        System.out.println(Arrays.binarySearch(a,89));
//        比较
        int b[]={1,3,4,12,54,56,89};
        System.out.println(Arrays.equals(a,b));
    }
}
