package com.example.transaction.in.using.spring.exception;

public class InsufficieantAmountEx  extends RuntimeException{
    public InsufficieantAmountEx(String msg){
        super(msg);
    }
}
