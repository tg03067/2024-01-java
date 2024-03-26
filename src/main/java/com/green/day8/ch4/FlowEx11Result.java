package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11Result {
    //System.out.print("당신의 주민번호를 입력하세요.(011234-1111222 >>");
        /*
        1,3 > 남자
        2,4 > 여자
        Scanner 객체를 통해 주민번호를 입력받으시고
        '1' > 당신은 2000년 이전에 출생한 남자입니다.
        '3' > 당신은 2000년 이후에 출생한 남자입니다.
        '2' > 당신은 2000년 이전에 출생한 여자입니다.
        '4' > 당신은 2000년 이후에 출생한 여자입니다.
        이외값 > "유효하지않은 주민번호" 출력
        switch만 사용가능
         */
    public static void main(String[] args){
        System.out.print("당신의 주민번호를 입력해주세요. (000000-0000000) >> ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char genVal = input.charAt(7);
        String direction = "전";
        switch(genVal){
            default:
                System.out.println("유효하지않은 주민번호");
                break;
            case '1': case '3':
                switch(genVal){
                    case '3':
                        direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 남자입니다.", direction);
                break;
            case '2': case '4':
                switch (genVal){
                    case '4':
                        direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 여자입니다.", direction);
                break;
        }
    }
}
