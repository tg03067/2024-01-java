package com.green.day2;

public class Var2 {
    int globalNum; //전역 변수
    public static void main(String[] agrs){
        //지역변수
        //변수 선언과 동시에 초기화, 지역변수는 초기화 필수!
        //num = 읽기, = 왼쪽이 쓰기
        int num = 10, num2 = 11, num3 = 0;
        num3 = num + num2;
        //num3 = 10 + 11;
        //num3 = 21;
        num3 = num3 + 3;
        //num3 = 21 + 3;
        //num3 = 24;
        System.out.println(num3);
        num3++;
        ++num3;
        ++num3;
        //대입연산자 없이 증가 ++증감식
        System.out.println(num3);

    }
}
