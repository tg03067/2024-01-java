package com.green.day10.ch5;

import java.util.concurrent.ThreadLocalRandom;

public class MissionArray2 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        for(int i = 0; i < numArr.length; i++){
            int ranVal = (int)(Math.random() * 21.0) + 10;
            numArr[i] = ranVal;
        }
        for(int i = 0; i < numArr.length; i++){
            System.out.printf("numArr[%d]: %s\n" , i, numArr[i]);
        }


        System.out.println();
        System.out.println("----------------");

        int[] numArr2 = new int[10];
        for(int i = 0; i < numArr2.length; i++){
            numArr2[i] = (int)(Math.random() * 21.0) + 10;
        }
        for(int i = 0; i < numArr2.length; i++){
            System.out.printf("numArr2[%d]: %s\n" , i, numArr2[i]);
        }

        /*
        정수값 10개 저장할 수 있는 배열 생성
        10칸 초기화 하는데 10 ~ 30 랜덤한 값이 세팅될 수 있도록 해주세요.
        중복허용
        출력 포맷은 자유
         */

        System.out.println();
        System.out.println("----------------");
        int[] numArr3 = new int[10];

        // 배열 초기화 (10 ~ 30 랜덤한 값으로)
        for (int i = 0; i < numArr3.length; i++) {
            numArr3[i] = ThreadLocalRandom.current().nextInt(10, 31);
        }

        // 배열 출력
        for (int i = 0; i < numArr3.length; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr3[i]);
        }
    }
}
