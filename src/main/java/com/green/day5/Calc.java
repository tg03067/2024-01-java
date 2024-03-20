package com.green.day5;
//10의 자리숫자, 1의 자리숫자 구하는 방법.
public class Calc {
    public static void main(String[] args){
        int score = 81;
        int val1 = score / 10; //0~10
        // 소수점으로 나누기안됨.
        System.out.println(val1);

        int val2 = score % 10; //0~9
        System.out.println(val2);

//        double val2 = 10 / 3.0;
//        // 되게할려면 정수타입으로는 소수점 부여X
//        // 형변환을 해줘야됨

        //0~2 -
        //3~6 0
        //7~9 +

        //99 > A+, 82 > B-, 75 > C0




    }
}
