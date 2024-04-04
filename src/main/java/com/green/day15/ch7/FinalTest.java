package com.green.day15.ch7;

public class FinalTest {
    public static void main(String[] args){
        Car c = new Car(2200);
        System.out.println(c.CC);
        //c.cc = 100;
        Car c2 = new Car(3000);
        System.out.println(c2.CC);
        //c2.cc= 200;
    }
}

class Car {
    final int CC; //생성자를 이용하면 Lazy처리 가능함.

    Car(){
        CC = 100;
    }

    Car(int cc){
        this.CC = cc;
    }
                        //멤버필드 앞 final은 상수로 설정할 수 있음.
    final void start(){ //메소드앞 final은 오버라이딩 금지.
        System.out.println("자동차 시동을 건다.");
    }
}

final class Suv  extends Car{ //final class는 상속 금지.
//    void start(){
//        System.out.println("자동차 시동을 건다.");
//    }
}
/*
class Tucson extends Suv{

}
 */