package com.arr;

public class BubbleSort {
    public static void bubbleSort(int a[]){
        int temp;
        int l=a.length;
        for (int i=0;i<l;i++){
            for (int j=0;j<l-i-1;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int x:a
             ) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int a[]={1,8,7,4,6,1,2};
        bubbleSort(a);
    }
}
