package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5Result {
    public static void main(String[] args) {
        /*
        무식하게 해결 요망!!!!!!
        Scanner를 통해 점수를 입력받으세요.
        점수는 정수로 바로 받으시고, grade(학점)을 관리할 문자타입을 선언해주세요.
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        나머지는 C값을 저장하고
        1점대가 0~2 -
               3~6 0
               7~9 +

        나머지는 C학점 오로지 C0학점.

        (출력) 당신의 학점은 ?입니다.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요. >> ");
        int score = scan.nextInt();
        if(score > 100 || score < 0 ) {
            System.out.println("점수가 잘못기입되었습니다.");
        } else {
            System.out.println("score: " + score);
            String grade = "C";
            String symbol = "0";
            if (score >= 90) {
                grade = "A";
                if(score >=97){ symbol = "+"; }
                else if (score < 93){ symbol = "-"; }
            } else if(score >= 80) {
                grade = "B";
                if(score >=87){symbol = "+";}
                else if (score < 83){ symbol = "-";}
            }
            System.out.printf("당신의 학점은 %s%s입니다.\n", grade, symbol);
        }
        System.out.println("---종료---");
    }
}
