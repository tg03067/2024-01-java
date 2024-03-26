package com.green.day9.ch4;

public class FlowEx29Re {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            System.out.printf("i = %d", i);
            int copy = i;

            while(copy > 2){
                int copyNum = copy % 10;
                if(copyNum != 0 && copyNum % 3 == 0){
                    System.out.print("짝");
                }
                copy /= 10;
                if(copy == 0){
                    break;
                }
            }
            System.out.println();

//            while(copy > 2){
//                int val1 = copy % 10;
//                if(val1 != 0 && val1 % 3 == 0){
//                    System.out.print("짝");
//                }
//                val1 /= 10;
//                System.out.println();
//            }
        }
    }
}
