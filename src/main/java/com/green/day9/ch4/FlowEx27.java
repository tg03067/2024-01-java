package com.green.day9.ch4;

import java.util.Scanner;

//p.172
public class FlowEx27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("합계를 구할 숫자를 입력하세요. (종료:0) >> ");
            int input = scan.nextInt();
            sum += input;
            if(input == 0){
                break;
            }
        }
        System.out.printf("입력한 값들을 모두 더한 값은 %d입니다.\n", sum);


        /*
        가이드 출력 " 합계를 구할 숫자를 입력하세요. ( 종료: 0 )
        가이드 출력이 계속 된다. 0을 입력할때까지...
        입력한 모든 숫자를 더한 값을 마지막에 출력한다.
        출력포맷은 자유
         */
    }
}
