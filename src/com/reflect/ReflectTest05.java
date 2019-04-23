package com.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    //    使用反编译获取类中的方法
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.reflect.User");
//        获取所有方法
        Method[] methods=c.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(Modifier.toString(method.getModifiers())+" "+method.getReturnType().getSimpleName()+" "+method.getName());
//            获取参数列表
            Class[] params=method.getParameterTypes();
        }
    }
}
