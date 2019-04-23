package com.reflect;

public class ReflectTest08 {
    //    使用反射获取父类与父接口
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("java.lang.StringBuffer");
//        获取父类，只有一个
        Class superC=c.getSuperclass();
        System.out.println(superC.getSimpleName());
//        获取父接口，不只一个
        Class[] inters=c.getInterfaces();
        for (Class cla:inters){
            System.out.println(cla.getSimpleName());
        }
    }
}
