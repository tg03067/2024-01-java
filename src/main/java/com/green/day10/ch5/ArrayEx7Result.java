package com.green.day10.ch5;

import java.util.Arrays;

//셔플문제.
public class ArrayEx7Result {
    public static void main(String[] args){
        int[] numArr = new int[10];
        //10, 11, 12, ~~19

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = i + 10;
            System.out.printf("numArr[%s]: %s\n", i, numArr[i]);
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("-------------");

        for(int i = 0; i < numArr.length; i++){
            int rIdx = (int)(Math.random() * numArr.length);
            int tmp = numArr[i];
            numArr[i] = numArr[rIdx];
            numArr[rIdx] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
//        for(int i = 0; i < numArr.length; i++){
//            int rVal = (int)(Math.random() * numArr.length);
//            int num = numArr[i];
//            numArr[i] = numArr[rVal];
//            numArr[rVal] = num;
//        }
//        for(int i = 0; i < numArr.length; i++){
//            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
//        }
//        System.out.print("numArr: ");
//        System.out.println(Arrays.toString(numArr));

    }
}