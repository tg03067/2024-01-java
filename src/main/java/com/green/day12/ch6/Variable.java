package com.green.day12.ch6;
//p.246

//변수의 종류
public class Variable {
    int iv; // 인스턴스 변수, 전역 변수.(Global Variable)
    static int cv; //클래스 변수(클래스이름으로 접근해서 사용함.), 스태틱 변수, 전역 변수( Global Variavle )
    //여러 값들을 저장할려면 인스턴스 변수를 이용해야됨.
    //static은 객체화랑은 독립적이다.
    //없는 애들은 무조건 객체화가 필요하다.


    void method(){
        int lv = 0; //지역 변수(메소드 안에 있는 변수, Local Variable)
    }

    static void staticMethod(){
        int lv = 0; // 지역 변수 ( Local Variable )
    }
}
