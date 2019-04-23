package com.lxd;

import com.bean.User;

//finalize方法，在回收垃圾之前调用，系统自动调用
public class demo08 {
    public static void main(String[] args) {
        User user=new User();
        user=null;
//        建议；垃圾回收器回收垃圾，只是建议，在User类中重写finalize方法
        System.gc();
    }

}
