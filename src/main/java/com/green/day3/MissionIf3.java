package com.green.day3;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (남/여) >> ");
        String gender = scan.nextLine();

        if("남".equals(gender)){
            System.out.print("당신의 키를 입력해 주세요.");
            int height = scan.nextInt();

                if(height > 175){
                    System.out.print("당신은 남자평균키보다 큽니다.");
                } else if(height < 175){
                    System.out.print("당신은 남자평균키보다 작습니다.");
                } else {
                    System.out.print("당신은 남자키 평균입니다.");
                }

        } else if("여".equals(gender)) {
            System.out.print("당신의 키를 입력해 주세요.");
            int height = scan.nextInt();
            if(height > 161){
                System.out.print("당신은 여자평균키보다 큽니다");
            } else if(height < 161){
                System.out.print("당신은 여자평균키보다 작습니다.");
            } else {
                System.out.print("당신은 여자키 평균입니다");
            }
        } else {
            System.out.println("성별을 입력해 주세요.");
        } System.out.print("--종료--");

        //남자 평균키: 175, 여자 평균키:161
        //gender "남", 기준값 175
        //gender "여", 기준값 161
        //gender "남 or 여 아니면" 성별을 입력해 주세요. > 종료

    }
}
