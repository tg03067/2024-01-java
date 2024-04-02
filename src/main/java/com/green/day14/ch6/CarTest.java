package com.green.day14.ch6;
//p.294 매개변수 있는 생성자(오버로딩된 생성자), this를 배움
public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car("white", "auto", 5);
        //c1.color = "white"; = this color = color;
        System.out.printf("c1.color: %5s, c1.gearType: %6s, c1.door: %d\n"
                , c1.color, c1.gearType, c1.door);

        Car c2 = new Car("black", "manual", 3);
        System.out.printf("c2.color: %5s, c2.gearType: %6s, c2.door: %d\n"
                , c2.color, c2.gearType, c2.door);

        Car c3 = new Car();
        System.out.printf("c3.color: %5s, c3.gearType: %6s, c3.door: %d\n"
                , c3.color, c3.gearType, c3.door); //red, manual, 5

        Car c4 = new Car(c2);
        System.out.printf("c4.color: %5s, c4.gearType: %6s, c4.door: %d\n"
                , c4.color, c4.gearType, c4.door); //red, manual, 5
    }
}


class Car{
    String color;
    String gearType;
    int door;

    //생성자는 생성 후에는 호출 불가.
    Car(){
//        this.color = "red";
//        this.gearType = "manual";
//        this.door = 5;
        this("red", "manual", 5);
    }

    Car(Car i){
        this(i.color, i.gearType, i.door);
//        this.color = i.color;
//        this.gearType = i.gearType;
//        this.door = i.door;
    }

    //this() = 생성자 호출 할 때 사용할 수 있음.
    //this = 나 자신의 값이 들어있는 상수 값.
    //매개변수의 타입을 가져오는 게 아니라 클래스의 값을 가져옴.(전역변수)
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
        init();
    }

    void init(){

    }

    void start(){

    }
}