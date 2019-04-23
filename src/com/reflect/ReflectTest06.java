package com.reflect;

import java.lang.reflect.Method;

public class ReflectTest06 {
    //    使用反射调用类中的方法
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.reflect.User");
//        获取方法
        Method method = c.getMethod("Test", String.class, int.class);
//        创建对象
        Object o = c.newInstance();
        method.invoke(o, "张三", 18);

    }
}
