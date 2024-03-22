package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        /*
        switch문으로 해결
        Scanner 객체를 사용하여 month(월) 값을 정수로 입력받는다.

        month 값이 3~5라면 "현재의 계절은 봄입니다."(출력)
                  6~8라면 "현재의 계절은 여름입니다."(출력)
                  9~11라면 "현재의 계절은 가을입니다."(출력)
                  12, 1, 2라면 "현재의 계절은 겨울입니다."(출력)
                  이외의 값은 "잘못입력하셨습니다." (출력)
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("입력하신 달 (1~12): ");
        int month = scan.nextInt();
        if(month > 12 || month < 1){
            System.out.println("잘못입력하셨습니다.");
        } else {
            String season = switch(month){
                case 12, 1, 2 -> season = "겨울";
                case 3, 4, 5 -> season = "봄";
                case 6, 7, 8 -> season = "여름";
                default ->  season = "가을";
            };
            System.out.printf("현재의 계절은 %s입니다.\n\n", season);
        }
        System.out.println("---- 종료 ----");
    }
}