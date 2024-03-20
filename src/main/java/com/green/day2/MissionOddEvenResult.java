package com.green.day2;

public class MissionOddEvenResult {
    public static void main(String[] args){
        int num = (int)(Math.random() * 10) + 1;

        System.out.print(num);
        System.out.print("는(은) "); //하드코딩 - 바뀌지않는코딩

        if(num % 2 == 0) {
            System.out.print("짝"); //경우에 바뀌기떄문에 하드코딩이라하기에는 애매함
        } else {
            System.out.print("홀"); //경우에 바뀌기떄문에 하드코딩이라하기에는 애매함
        }
        System.out.println("수입니다"); //하드코딩 - 바뀌지않는코딩
        System.out.println("----------------");

        int num2 = (int)(Math.random() * 10) + 1;

        System.out.print(num);
        System.out.print("는(은) ");
        System.out.print(num2 % 2 == 0 ? "짝" : "홀");
        System.out.println("수입니다");
    }
}
// class 이후 객체 MissionOddEvenResult(속성){(메소드)}