package com.green.day16.ch7;
/*
<다형성 대전제 3가지>
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다. (자동형변환)
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
 */
public class PolyTest {
    public static void main(String[] args){
        //1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다. (자동형변환)
        Animal ani_1 = new Dog(); // 상속관계에서만 형변환이 가능하다.
        Animal ani_2 = new BullDog();
        Animal ani_3 = new Cat();
        Dog dog_1 = new BullDog();

        //2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
        //Dog dog_2 = new Animal(); // 컴파일 에러 (문법에러)
        //Dog dog_3 = (Dog)new Animal(); //형변환 에러가 발생.
        //dog_3.sleep();

        //3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
        ani_1.crying();
        //ani_1.sleep(); - Animal에는 슬립이 없다.
        Dog dog_4 = (Dog)ani_1;
        dog_4.sleep();

        //ani_2.sleep();
        Dog dog_5 = (Dog)ani_2;
        dog_5.sleep();
        BullDog bulldog1 = (BullDog)ani_2;
        bulldog1.sleep();


        System.out.println("------종료------");
    }
}

class Animal{
    void crying(){
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal{
    void crying() {
        System.out.println("강아지가 멍멍");
    }
    void sleep(){
        System.out.println("강아지가 잔다.");
    }
}

class BullDog extends Dog{
    void crying(){
        System.out.println("불독이 월월");
    }
    void sleep(){
        System.out.println("불독이 잔다.");
    }
}

class Cat extends Animal {
    void crying(){
        System.out.println("고양이가 야옹");
    }
}