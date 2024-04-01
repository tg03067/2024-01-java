package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args){
        int[] arr = { 3, 2, 1, 6, 5, 4, 15, 10};

        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // [3, 2, 1, 6, 5, 4]
    }
    static void printIntArr(int[] i){
//        i = new int[]{3, 2, 1, 6, 5, 4};
//        System.out.println(Arrays.toString(i));
        if(i.length == 0){
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", i[0]);
        for(int z = 0; z < i.length; z++){
            System.out.printf(", %d", i[z]);
        }
        System.out.println("]");

//        System.out.print("[");
//        for(int z = 0; z < i.length; z++){
//            System.out.printf("%s", i[z]);
//            if(z < i.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");
    }
}