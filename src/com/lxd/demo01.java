package com.lxd;

//基本类型数据
public class demo01 {
    public static void main(String[] args) {
//        byte 一个字节
//        short 两个字节
//        int 四个字节
//        long 八个字节
//        float四个字节
//        double八个字节
//        会自动转换为long型
        long l1 = 888;
//        在后面要加字母，默认是int型，把整型的字面值当做int型，会报错
        long l2 = 88888888888888l;
//        高到低强制类型转换，会损失精度

//        小数默认是double型，所以定义float后加f
        float f = 3.14159f;
        double d = 3.14159;
//        char只能有一个字符
        char c = 'a';
        char c2 = 78;
//        赋值数字会输出对应的ASCII码
        System.out.println(c2);
//        转义字符
        char c3 = '\'';
        System.out.println(c3);
//        换行符
        char c4='\n';
//        制表符
        char c5='\t';
        System.out.println(c5);
        char c6='a';
        int i=1;
//        会计算ASCII编码
        System.out.println(i+c6);
    }
}
