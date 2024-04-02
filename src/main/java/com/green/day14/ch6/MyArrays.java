package com.green.day14.ch6;

import java.util.Arrays;

public class MyArrays {
    static void printArr(int[] i){
        System.out.print("[");
        for(int z = 0; z < i.length; z++){
            if(z > 0){
                System.out.print(", ");
            }
            System.out.printf("%s", i[z]);
        }
        System.out.print("]");
        System.out.println();
    }

    static String toString(int[] i){
        String str = "[";
        for(int z = 0; z < i.length; z++){
            if(z > 0){
                str += ", ";
            }
            str += i[z];
        }
        str += "]";
        return str;
    }
}

class MyArraysTest {
    public static void main(String[] args){
        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        MyArrays.printArr(arr); // [3, 2, 1, 6, 5, 4, 10]

        int[] arr2 = {};
        MyArrays.printArr(arr2); // []

        System.out.println("-----------");
        //static아니면 객체화 먼저.
//        MyArrays mm = new MyArrays();
//        int[] arr3 = { 3, 2, 1, 6, 5, 4, 10 };
//        mm.printArr(arr3); // [3, 2, 1, 6, 5, 4, 10]
//
//        int[] arr4 = {};
//        mm.printArr(arr4); // []
        String str = Arrays.toString(arr);
        System.out.println("str:  " + str);

        String str2 = MyArrays.toString(arr);
        System.out.println("str2: " + str2);
    }
}