package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1Result {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
       int star = scan.nextInt();

       //for문 3개 + if문
        for(int i = star; i > 0; i--){ // i = 5
            for(int z = 1; z <= star; z++){  // i = 5 ? 1, 2, 3, 4, 5
                System.out.print( z < i ? "-" : "*");
            }
            System.out.println();
        }




       System.out.println("-----------");
       //for문 3개로 해결한 케이스
       for(int i = 1; i <= star; i++){
           for(int z = star - i; z > 0; z--){
               System.out.print("-");
           }
           for(int z = 0; z < i; z++){
               System.out.print("*");
           }
           System.out.println();
       }

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

         */
    }
}
