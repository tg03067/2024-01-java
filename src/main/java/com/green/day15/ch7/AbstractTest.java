package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args){
        //Dog d = new Dog(); //추상클래스는 객체화를 할 수 없음.
    }
}

abstract class Dog { //추상 클래스 - 객체화를 사용하지않고 상속으로만 사용하고 싶을때 사용.

}

abstract class Cat {
    int age;
    //추상 메소드는 반드시 추상 클래스내에 있어야됨.
    abstract void crying();

    void jump(){
        System.out.println("폴짝 폴짝");
    }
}

class KoreaShort extends Cat{

    @Override
    void crying(){ // 추상메소드를 포함한 클래스를 상속받으면 추상메소드를 반드시 추상클래스를 오버라이딩해야됨.
        System.out.println("야옹~ 야옹~");
    }
}

class AmericaCat extends Cat{

    @Override
    void crying() {
        System.out.println("미유~~ 미유~~");
    }
}