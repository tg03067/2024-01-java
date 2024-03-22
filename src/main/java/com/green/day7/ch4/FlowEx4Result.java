package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4Result {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 >> ");
        int score = scan.nextInt();
        scan.close(); //stream이라는 글이 나오면 흐르고 있기때문에 닫아주는게 리소스사용을 줄일 수 있음.

        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
        } else {
            char grade = 'D';
            if(score >= 90){
                grade = 'A';
            } else if(score >= 80){
                grade = 'B';
            } else if(score >= 70){
                grade = 'C';
            }
            System.out.printf("당신의 학점은 %c입니다.", grade);
        }
        System.out.println("---종료---");
    }
}
