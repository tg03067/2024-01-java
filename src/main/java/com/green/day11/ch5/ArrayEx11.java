package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args){
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
        //Q1. numArr 모든 방에 0~9사이의 랜덤값 넣어주세요 ( 중복허용 )
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * numArr.length);
        }
        for(int i = 0; i < len; i++){
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("-------------");
        //Q2. numArr 각 칸에 들어있는 값의 갯수를 counterArr에 정리한다.
        //예를 들어 [6, 1, 6, 1, 9, 0, 5, 7, 7, 0]인 경우
        //counterArr[0]에는 2
        //counterArr[1]에는 2
        //counterArr[2]에는 0
        //counterArr[3]에는 0
        //counterArr[4]에는 0
        //counterArr[5]에는 1
        //counterArr[6]에는 2
        //counterArr[7]에는 2
        //counterArr[8]에는 0
        //counterArr[9]에는 1
        for(int i = 0 ; i < numArr.length; i++){
            counterArr[numArr[i]]++;
            //counterArr[numArr[i]] += 1;
        }
        for(int i = 0; i < len; i++){
            System.out.printf("counterArr[%d]: %d\n", i, counterArr[i]);
        }
        System.out.print(Arrays.toString(counterArr));
    }
}
