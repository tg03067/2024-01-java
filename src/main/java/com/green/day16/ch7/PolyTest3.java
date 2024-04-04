package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args){
        BullDog bullDog = new BullDog();


        boolean r = bullDog instanceof Dog;
        //왼쪽에는 변수가 들어감, 오른쪽에는 클래스가 들어감. 형변환의 가능여부를 리턴함.
        //왼쪽이 오른쪽으로 형변환이 가능한지 물어봄.
        System.out.println("r: " + r);

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog: "+ (ani instanceof Dog));

        ani = new BullDog();
        System.out.println("ani instanceof Dog: "+ (ani instanceof Dog));
    }
}
