package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args){
        /*
        switch문 사용
        90점 이상은 "당신의 학점은 A입니다."
        80점 이상은 "당신의 학점은 B입니다."
        70점 이상은 "당신의 학점은 C입니다."
        나머지는 "당신의 학점은 F입니다."
        10의 자리 숫자를 뽑아내서 switch로 해결.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요. >> ");
        int score = scan.nextInt();
        System.out.println("score: " + score);
        if(score > 100 || score <0){
            System.out.println("잘못입력된 숫자입니다.");
        } else { //0~100
            String grade = "F";
            if(score >= 70) {
                int score_10 = score / 10;
                grade = switch(score_10){
                  case 10, 9 -> "A";
                  case 8 -> "B";
                  default -> "C";
                };
            }
            System.out.printf("당신의 학점은 %s입니다.\n", grade);
        }
        System.out.println("---END---");
    }
}
