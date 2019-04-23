package com.collection.list;

public class ArgsTest {
    //    可变参数，当一个方法传入多个同一类型的参数的时候，要用到可变参数
    public static void main(String[] args) {
        print(1,2,3,4,5);
    }
    public static void print(int ... arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
//    如果传入不同类型的数据，可变参数要放在参数列表最后面
//    public static void print(String s,int ... arr,boolean flag){
//
//    }
}
