package com.arr;

public class SelectSort {
//    选择排序
    public static void selectSort(int a[]){
        int temp;
        int l=a.length;
        for (int i=0;i<l;i++){
            for (int j=i+1;j<l;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int x:a
             ) {
            System.out.print(x+"  ");
        }
    }

    public static void main(String[] args) {
        int a[]={5,7,8,9,1,2};
        selectSort(a);
    }
}
