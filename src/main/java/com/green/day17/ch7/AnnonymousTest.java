package com.green.day17.ch7;

public class AnnonymousTest {
    public static void main(String[] args){
        Object obj = new Car();
        Object obj2 = new Object() { //익명 클래스 : 객체화와 동시에 클래스를 만드는 기법.
            public String toString(){
                return "익명  클래스";
            }
        };
        System.out.println(obj);
        System.out.println(obj2);
    }
}

class Car{
    void drive(){
        System.out.println("자동차가 붕붕");
    }
    public String toString(){
        return "Car";
    }
}