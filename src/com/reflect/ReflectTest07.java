package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest07 {
    //    用反射获取类中的构造方法
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("java.util.Date");
        Constructor[] constructors=c.getConstructors();
//        获取带参数的构造方法
//        Constructor cons=c.getConstructor(String.class);
//        System.out.println(cons.getName());
        for (Constructor constructor:constructors){
            System.out.println(constructor.getName());
            System.out.println(Modifier.toString(constructor.getModifiers()));
        }
    }
}
