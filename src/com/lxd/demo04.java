package com.lxd;

import com.bean.User;

//值传递与引用传递
public class demo04 {
    //    值传递,分别存放在不同的地址
    public static void test(int i) {
        System.out.println(++i);
    }

    //    String类型的调用
    public static void test(String s) {
        s = s + "1";
        System.out.println(s);
    }

    //其他引用类型的调用
    public static void test(User user){
        user.setId("50");
        System.out.println(user.getId());
    }
    public static void main(String[] args) {
        int i = 10;
        test(i);
        System.out.println(i);
//        String不会改变，因为String类中使用final定义的char[]数组存放结果，在常量池中
//        不可改变，因此调用时是复制一个值
        String s = "你好";
        test(s);
        System.out.println(s);
//        引用类型操作的是同一个对象
        User user=new User();
        user.setId("400");
        test(user);
        System.out.println(user.getId());
    }
}
