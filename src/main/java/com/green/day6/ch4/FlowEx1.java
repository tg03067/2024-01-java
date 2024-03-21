package com.green.day6.ch4;

public class FlowEx1 {
    public static void main(String[] args){
        int x = 10;
        //x=0 일 때, 참인것은?(개행)
        System.out.printf("x = %d일 때, 참인것은?\n", x);
//        int x = 10;//0x는 16진수로 찍겠다. %x
//        System.out.printf("x = %x일 때, 참인것은?\n", x);

        String name = "슬랙";
        char bloodType = 'A';

        //"슬랙의 혈액형은 A형입니다."
        //"가나의 혈액형은 B형입니다."
        //"가나의 혈액형은 A형입니다."
        System.out.printf("%s의 혈액형은 %c형입니다.\n", name, bloodType);
    }
}
