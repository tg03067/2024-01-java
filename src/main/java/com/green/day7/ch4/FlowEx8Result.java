package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8Result {
    public static void main(String[] args){
        System.out.print("당신의 주민번호를 입력하세요. >> ");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        char genderVal = id.charAt(7); //객체의 주소를 알면 명령을 내릴 수 있음. / String 전용 메시지.
        String result = switch(genderVal){
            case '1', '3' -> "당신은 남자입니다.";
            case '2', '4' -> "당신은 여자입니다.";
            default -> "유효하지않은 주민번호입니다.";
        };
        System.out.println(result);
        System.out.println("-----");
        /*
        111111-1
        1,3 > 남자
        2,4 > 여자
        Scanner 객체를 통해 주민번호를 입력받으시고
        주민번호를 확인하여 "여자입니다."인지 "남자입니다."인지 "유효하지않은 주민번호" 추력
        switch
         */
    }
}
