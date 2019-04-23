package com.synchronize;
//单例模式，一个类只能创建一个对象
public class SingletonTest {
    public static void main(String[] args) {
//        是同一个对象
        SingeTon singeTon1=SingeTon.getInstance();
        SingeTon singeTon2=SingeTon.getInstance();
        System.out.println(singeTon1==singeTon2);
    }

}

//    饿汉模式，在类加载时就创建了类的单例
//class SingeTon{
////    私有的构造方法，只有本类才可以构造
//    private SingeTon(){
//    }
//    private static SingeTon singeTon=new SingeTon();
//    public static SingeTon getInstance(){
//        return singeTon;
//    }
//}

//懒汉式，延迟加载
class SingeTon{
    private SingeTon(){
    }
//    线程安全要加关键字
    private volatile static SingeTon singeTon=null;
    public synchronized static SingeTon getInstance(){
        if (singeTon==null){
            singeTon=new SingeTon();
        }
        return singeTon;
    }
}
