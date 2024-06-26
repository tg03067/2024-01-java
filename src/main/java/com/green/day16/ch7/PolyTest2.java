package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();
        //리턴타입 void, 파라미터 1개씩, static, 메소드위치 PolyTest2, 메소드명 doCrying
        doCrying(dog); //(콘솔출력) 강아지 멍멍, 강이지가 잔다.
        doCrying(bullDog); //(콘솔출력) 불독이 월월, 불독이 잔다.
        doCrying(cat); //(콘솔출력) 고양이 야옹
    }
    public static void doCrying(Animal ani){
        ani.crying();
//        if(ani instanceof Dog){
//            Dog dog = (Dog)ani;
//            dog.sleep();
//        }
        if(ani instanceof Dog dog){ //enhanced instanceof
            dog.sleep();
        }
    }
}
