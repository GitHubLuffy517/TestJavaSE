package com.synchronize;

public class RuntimeTest {
    //    调用cmd
    public static void main(String[] args) throws Exception{
        Runtime runtime=Runtime.getRuntime();
        runtime.exec("mspaint");
    }
}
