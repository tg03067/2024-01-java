package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args){
        Exam2.printGugudan(2, 4);
        /*
        2 x 1 = 2 (tab) 3 x 1 = 3 (tab) 4 x 1 = 4 (개행)
        2 x 2 = 4 (tab) 3 x 2 = 6 (tab) 4 x 2 = 8 (개행)
        ...
        2 x 9 = 18 (tab) 3 x 9 = 27 (tab) 4 x 9 = 36 (개행)
         */
        int sum = Exam2.getSumFromString("23223"); // 2 + 3 + 2 + 2 + 3 값 리턴 (12)
        int sum2 = Exam2.getSumFromString("111"); // 2 + 3 + 2 + 2 + 3 값 리턴 (3)
        System.out.println("sum: " + sum);
        System.out.println("sum2: " + sum2);
        int sum3 = Exam2.getSumFromString2("23223");
        System.out.println("sum3: " + sum3);
        System.out.println("--------");
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr); // 1 ~ 9 사이의 램덤값 중복없이
        System.out.println(Arrays.toString(arr));
    }
}

class Exam2{
    static void printGugudan(int sN, int eN){
        for(int i = 1; i < 10; i++){
            for(int z = sN; z <= eN; z++) {
                System.out.printf("%d x %d = %2d\t", z, i, z * i);
            }
            System.out.println();
        }
    }
    static int getSumFromString(String str){
        int num = Integer.parseInt(str);
        int sum = 0;
        if( num == 0 ){ return 0; }
//        for(int i = 0 ; i < str.length(); i++){
//            sum += num % 10;
//            num /= 10;
//        }
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
//        do{
//            sum += num % 10;
//            num /= 10;
//        } while(num > 0);
        return sum;
    }
    static int getSumFromString2(String str){ //문자열로 처리
        int sum = 0;
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            char ch = charArr[i];
            int val = Character.getNumericValue(ch);
            sum += val;
        }
        return sum;
    }
    static void inputRandomValue(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int rVal = (int)(Math.random() * 9.0) + 1;
            arr[i] = rVal;

            for(int z = 0; z < i; z++){
                if(arr[z] == rVal){
                    i--;
                    break;
                }
            }
        }
    }
//    static void inputRandomValue2(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int rVal;
//            boolean isDuplicate;
//            do {
//                rVal = (int) (Math.random() * 9.0) + 1;
//                isDuplicate = false;
//                for (int z = 0; z < i; z++) {
//                    if (arr[z] == rVal) {
//                        isDuplicate = true;
//                        break;
//                    }
//                }
//            } while (isDuplicate);
//            arr[i] = rVal;
//        }
//    }
}