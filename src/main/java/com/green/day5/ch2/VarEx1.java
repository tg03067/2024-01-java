package com.green.day5.ch2;

public class VarEx1 {
    public static void main(String[] args){
        int year = 0;
        int age = 14;
        int year2 = 0, age2 = 14;
        System.out.println(year);
//        System.out.println("0");
        System.out.println(age);
//        System.out.println("14");
        //변수선언 후 초기화(할당)
        //int 변수타입 = 들어갈 수 있는 게 정해져있음.

        year = age + 2000;
        age = age + 1;
        System.out.println(year); //year = 2014
        System.out.println(age); //age = 15

    }
}
