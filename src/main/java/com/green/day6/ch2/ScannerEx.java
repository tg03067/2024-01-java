package com.green.day6.ch2;

import java.util.Scanner;

//p.41
public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해 주세요. >> ");
        String input = scan.nextLine();//"123" > 123
        //int num = (int)input;
        int num = Integer.parseInt(input); //문자열을 정수로 바꿔줄 수 있음.
        //검색하는 법 : java String to int
        // 문자가 들어가면 에러가 터짐.
        System.out.println("num: " + num);
        System.out.println("num + 1: " + (num + 1));

    }
}
