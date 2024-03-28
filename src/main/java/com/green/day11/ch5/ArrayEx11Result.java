package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
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

        for(int i = 0; i < numArr.length; i++){
            int val = numArr[i];
            counterArr[val]++;
        }
        for(int i = 0; i < counterArr.length; i++){
            System.out.printf("counterArr[%d]: %d\n", i, counterArr[i]);
        }
        System.out.print(Arrays.toString(counterArr));
    }
}
