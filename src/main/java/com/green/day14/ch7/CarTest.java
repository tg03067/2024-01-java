package com.green.day14.ch7;
//p.316 is-a(상속관계), has-a(포함관계) 관계.

public class CarTest {
    public static void main(String[] args){

    }
}

class Car {
    int cc;
    String company;
    Speaker speaker; //포함관계

    void drive(){
        System.out.println("차동차가 붕붕");
    }
}

class Avante extends Car{ //상속관계

}

class Speaker{
    int volume;

    void play(){
        System.out.println("음악이 흘러나온다.");
    }
}
//아반떼
//차

//차
//스피커