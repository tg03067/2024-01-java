package com.green.day6.ch3;

import java.util.Scanner;

//p.117
public class OperatorEx25 {
    public static void main(String[] args){
//        String str = "abcdefg";
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(4));
//        System.out.println(str.charAt(5));
//        System.out.println(str.charAt(6));
        Scanner scan = new Scanner(System.in);
        char ch = ' '; //변수
        System.out.print("문자를 하나 입력하세요 >> ");
        String input = scan.nextLine();
        ch = input.charAt(0);
        if('0' <= ch && ch <= '9'){ //0~9
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if('a' <= ch && ch <= 'z'){ //a~z
            System.out.println("입력하신 문자는 소문자입니다.");
        } else if('A' <= ch && ch <= 'Z'){ //A~Z
            System.out.println("입력하신 문자는 대문자입니다.");
        }
        System.out.println("-----끝-----");
        // 0은 층값.

        //변수는 단독주택느낌
        //문자열 > 문자배열 ( 아파트느낌 )
        //{'h', 'e', 'l', 'l', 'o'}
        //  0    1    2    3    4 층 - 느낌.
    }
}
