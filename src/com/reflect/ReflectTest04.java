package com.reflect;

import java.lang.reflect.Field;

public class ReflectTest04 {
    //    使用反射为属性赋值
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.reflect.User");
//        获取指定的属性值
        Field f=c.getDeclaredField("name");
//        创建对象
        Object o=c.newInstance();
//        赋属性值
        f.set(o,"张三");
        System.out.println(f.get(o));
//        赋值私有的属性值
        Field field=c.getDeclaredField("age");
//        从外部打破封装性
        field.setAccessible(true);
        field.set(o,15);
        System.out.println(field.get(o));
    }
}
