package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args){
        String[] names = { "Kim", "park", "Yi"};
        //String객체의 주소값을 넣을 수 있는 배열.
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println("tmp: " + tmp);
        System.out.println(tmp == names[1]);
        //reference 타입끼리의 비교는 주소값비교. 동일성비교.

        //0번방 값을 "Yu"변경
        names[0] = "Yu";
        System.out.println(names[0]);
        System.out.println("-----------");


        //일반 for문
        for(int i = 0; i < names.length; i++){
            String val = names[i];
            System.out.printf("val: %s\n", val);
        }
        System.out.println("-----------");

        //향상된 for문
        //foreach문 - 읽어오는 것이 목적.
        for(String val : names){
            //받을 공간. //컬렉션이 와야됨. 값이 있는것.
            //String은 주소값. reference type.
            //변수명은 상관없음. 배열에 맞춰서 받을 공간타입을 정해주면됨.
            System.out.printf("val: %s\n", val);
        //배열을 수정할 수는 없지만, 배열내에 객체는 수정가능.
        //배열을 수정할려면 그냥 일반 for문을 사용해야됨.
        }
    }
}
