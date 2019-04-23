package com.lxd;

//递归
public class demo03 {
    //    递归求和
    public static int addSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addSum(n - 1);
        }
    }
//    递归求阶乘
    public static int multiplySum(int n){
        if (n==1){
            return 1;
        }else {
            return n*multiplySum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(addSum(10));
        System.out.println(multiplySum(5));
    }
}
