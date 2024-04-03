package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args){
        Tiger tg = new Tiger();
    }
}

class Animal{
    int age;

//    Animal(){
//
//    }

    Animal(int age){
        super();
        this.age = age;
    }
}

class Tiger extends Animal{
    String name;

    Tiger(){
        super(10);
    }

    Tiger(int age){
        super(age);
    }

    Tiger(int age, String name){
        super(age); //상위클래스의 생성자 호출.(기본생성자를 호출하거나, 생성자를 호출해줘야됨.) - 객체화의 조건.
                    //있는 생성자를 호출해서 사용할 것.
        this.name = name;
    }
}