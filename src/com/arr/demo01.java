package com.arr;

public class demo01 {
    public static void main(String[] args) {
        int a[] = {50, 45, 78, 89, 26, 12};
        getMax(a);
        for (int x : a
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
        getExchange(a);

    }

    public static void getMax(int a[]) {
        int max = a[0];
        for (int x : a
        ) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }

    public static void getExchange(int a[]) {
        int temp;
        for (int i=0;i<(a.length/2);i++){
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for (int x:a
             ) {
            System.out.print(x+" ");
        }
    }
}
