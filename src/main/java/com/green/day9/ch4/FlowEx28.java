package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int random = (int)(Math.random() * 100) + 1;
        while(true){
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            int i = scan.nextInt();
            if(i < random){
                System.out.println("Up");
            } else if( i > random){
                System.out.println("Down");
            } else {
                System.out.printf("입력하신 값은 %d이고 랜덤한 정수값은 %d입니다.\n", random, i);
                break;
            }
        }

        /*
        1~100 사이의 랜덤값을 만들어내고 랜덤값을 맞추는 게임
        가이드 내용: "1~100 사이의 정수를 입력하세요 >> "
        -- 정답을 맞출때까지 반복
        입력한 숫자보다 정답이 크다 > "Up"
        입력한 숫자보다 정답이 작다 > "Down"
        맞출때까지 반복한다.
         */
    }
}
