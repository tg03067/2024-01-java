package com.green.day10.ch5;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args){
        int[] numArr = {10, 20, 30};

        int numZ = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = numZ;



        System.out.println(Arrays.toString(numArr));

        int[] numArr2 = {10, 20, 30};
        numArr2[0] = numArr2[0] ^ numArr2[2];
        numArr2[2] = numArr2[0] ^ numArr2[2];
        numArr2[0] = numArr2[0] ^ numArr2[2];
        System.out.println(Arrays.toString(numArr2));
        /*
        스와핑, 0번칸, 2번칸 스와핑해주세요
         */
    }
}
