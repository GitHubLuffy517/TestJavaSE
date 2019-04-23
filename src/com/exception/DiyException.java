package com.exception;

public class DiyException extends Exception {
    public DiyException(String msg){
        super(msg);
    }
    public DiyException(){
//        会自动调用super
    }
}
