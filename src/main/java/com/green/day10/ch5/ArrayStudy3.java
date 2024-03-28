package com.green.day10.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args){
        int[] nArr1 = {10, 20, 30}; //nArr1 여러개의 주소값 중에 1개를 입력받음.
        int[] nArr2 = nArr1; //nArr2가 nArr1의 주소값을 컨트롤을 얻을 수 있음.
                             //주소값을 복사해주는 것 : 얕은 복사, Shallow copy

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;
        nArr1[0] = 80;
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
    }
}
