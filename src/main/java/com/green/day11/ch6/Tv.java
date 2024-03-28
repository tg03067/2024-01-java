package com.green.day11.ch6;
//public이 없으면 같은 패키지 내에서만 사용할 수 없음.
//public이 있으면 전부다 사용가능.
public class Tv {
    //멤버 필드.
    String color; //의미부여(color), 문자열값
    boolean power;
    int channel;


    //메소드.
    void power(){ //호출만하면 실행함.
        power = !power; //toggle
    }
    void channulUp(){
        channel++;
        //channel += 1;
    }
    void channelDown(){
        channel--;
    }

}