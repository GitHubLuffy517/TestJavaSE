package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest03 {
    //    使用反射获取类中的属性
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("java.util.Date");
//        获取public修饰的属性
//        Field[] fields=c.getFields();
//        获取所有的属性
        Field[] fields=c.getDeclaredFields();
//        for (Field field:fields){
////            获取属性名
//            System.out.println(field.getName());
////            获取访问修饰符的int值
////            System.out.println(field.getModifiers());
////            将int值转换为修饰符
//            System.out.println(Modifier.toString(field.getModifiers()));
////            获取数据类型,输出包含包名,获取一个Class对象toString方法默认输出带包名的名称
////            System.out.println(field.getType());
////            输出不包含包名
//            System.out.println(field.getType().getSimpleName());
//        }
//        使用反射反编译输出类中的属性代码
        StringBuffer sb=new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+" { \n");
        for (Field field:fields){
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers())+" "+field.getType().getSimpleName()+" "+field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
