package com.string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1="lxdxhlxd";
//    String类中常用方法
//    char charAt(int index);获取index位置的字符
        System.out.println(s1.charAt(2));
//    boolean contains(CharSequence s);判断字符串中是否包含某个字符串
        System.out.println(s1.contains("xh"));
//    boolean endsWith(String endStr);判断是否是以某个字符串结尾
        System.out.println(s1.endsWith("xd"));
//    boolean equalsIgnoreCase(String anotherString);忽略大小写比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase("lxdXHlxd"));
//    byte[] getBytes();转换成byte数组,会输出对应的ASCII码
        byte[] b1=s1.getBytes();
        for (byte b:b1
             ) {
            System.out.print(b+" ");
        }
        System.out.println();
//    int indexOf(String str);取得指定字符在字符串的位置
        System.out.println(s1.indexOf("l"));
//    int indexOf(String str, int fromIndex);从指定的下标开始取得指定字符在字符串的位置
        System.out.println(s1.indexOf("l",2));
//    int lastIndexOf(String str);从后面开始取得指定字符在字符串最后出现的的位置
        System.out.println(s1.lastIndexOf("l"));
//    int lastIndexOf(String str, int fromIndex);从后面开始指定的下标开始取得指定字符在字符串的位置
        System.out.println(s1.lastIndexOf("l",4));
//    int length();获取字符串的长度
//    String replaceAll(String s1,String s2);替换字符串中的内容
        System.out.println(s1.replaceAll("lxd","LXD"));
//    String[] split(String s);根据指定的表达式拆分字符串
        String s2="1,2,3";
        String[] arr=s2.split(",");
        for (String s:arr
             ) {
            System.out.print(s+" ");
        }
//    boolean startsWith(String s);判断是否是以某个字符串开始
        System.out.println(s1.startsWith("lxd"));
//    String substring(int begin);根据传入的索引位置截子串
        System.out.println(s1.substring(2));
//    String substring(int beginIndex, int endIndex);根据传入的起始和结束位置截子串，不包含后面的
        System.out.println(s1.substring(2,4));
//    char[] toCharArray();将字符串转换为char数组
        char[] ch=s1.toCharArray();
        for (char c:ch
             ) {
            System.out.print(c+" ");
        }
        System.out.println();
//    void toUpperCase();转换为大写
        System.out.println(s1.toUpperCase());
//    void toLowerCase();转换为小写
//    String trim();去除首尾空格
        String s3=" lxd xh ";
        System.out.println(s3.trim());
//    String valueOf(Object obj);将其他类型转换为字符串类型
        int x=10;
        System.out.println(String.valueOf(x));
//        toString方法需要对象不为空
        Object o=new Object();
        System.out.println(String.valueOf(o));
        o=null;
//        会报错
        System.out.println(o.toString());
    }

}
