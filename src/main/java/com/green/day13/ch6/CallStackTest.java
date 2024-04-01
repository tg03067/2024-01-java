package com.green.day13.ch6;
//p.262
public class CallStackTest {
    public static void main(String[] args){
        firstMethod(); //메소드 호출,
        System.out.println("------------");
        CallStackTest.firstMethod();
    }

    public static void firstMethod(){
        System.out.println("call firstMethod");
        secondMethod();
    }

    public static void secondMethod(){
        System.out.println("call secondMethod");
    }
}
