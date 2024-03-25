package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int star = scan.nextInt();
        for(int i = 0; i < star; i++){
            for(int z = star - 1; z > i; z--) {
                System.out.print("-");
            }
            for(int b = 0; b <= i ; b++){
                System.out.print("*");
            }
            System.out.println();
        }


        // for문 안에 for문안에서 여러번 연산하는거는 안좋음.
        // 최대한 하지 말것


        /*
        Scanner를 이용하여 정수를 입력받는다.
        가이드 내용 "*을 출력할 라인의 수를 입력하세요 >>"

        만약 정수 값이 3이라면
        --*
        -**
        ***

        만약 정수값이 5라면
        ----*
        ---**
        --***
        -****
        *****

        3= - 2 * 1
           - 1 * 2
           - 0 * 3

         */


    }
}
