package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        //System.out.print("당신의 주민번호를 입력하세요.(011234-1111222 >>");
        /*
        1,3 > 남자
        2,4 > 여자
        Scanner 객체를 통해 주민번호를 입력받으시고
        주민번호를 확인하여 "여자"인지 "남자"인지 "유효하지않은 주민번호" 추력
        switch
         */

        //String의 기능중에 char를 하나씩 뽑아낼 수 있음.
        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요. >> ");
        String i = scan.nextLine();
        char z = i.charAt(7);
        String gender = switch (z){
          case '1', '3' -> "당신은 남자입니다.";
          case '2', '4' -> "당신은 여자입니다.";
          default -> "유효하지않은 주민번호입니다.";
        };
        System.out.println(gender);
        System.out.println("---종료---");
        //111111-1000000
//        char gender = ' ';
//        String i = scan.nextLine();
//        gender = i.charAt(7);
//        int z = Character.getDirectionality(gender);
//        if(z > 0 || z < 5){
//            System.out.println("유효하지않은 주민번호입니다.");
//        } else {
//            String gen = switch ()
//        }
    }
}
