package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args){
        //Parent p = new Parent(55);
        //생성자는 객체생성도 하지만 생성하면서 초기화되기를 원하기에 사용한다.
        //리턴타입이 없다. 클래스명이랑 이름이 같다.
        Child child = new Child();
        //child.attack();
        child.doubleAttack();
    }
}

class Parent{
    int age;

    //this = 나 자신을 가르키는 상수.
    Parent(int age){
        super();
        this.age = age;
    }

    public void attack(){
        System.out.println("부모가 적을 공격한다.");
    }

    public void defense() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}

class Child extends Parent{
    int mzPower;
    //this() 생성자호출.
    Child(){
        super(27); //super = 상위 상속자 생성자를 불러옴.
    }

    @Override //애노테이션 Annotation(오버라이딩이 됐는지 확인을 해준다.)
              //오버라이딩은 상위 클래스의 메소드를 재정의하는 것.
    public void attack(){
        System.out.println("자식이 적을 공격한다.");
        //this.attack(); 오버라이딩에서 this사용은 무한루프에 빠짐.
        //super.attack();
    }

    public void doubleAttack(){
        this.defense();  //this는 생략해도 this생김.
        super.defense(); //this와 super는 Override에서 차이가 발생함.
        System.out.println("------");
        this.attack();
        super.attack();
    }
}