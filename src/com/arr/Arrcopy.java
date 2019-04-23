package com.arr;

public class Arrcopy {
    //    数组扩容之数组拷贝
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[10];
//        四个参数：要拷贝的数组，起始位置，目标数组，目标数组起始位置，要拷贝数组长度
        System.arraycopy(a,0,b,0,5);
        for (int x:b
        ) {
            System.out.println(x);
        }
    }
}
