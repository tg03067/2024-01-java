package com.green.day4;

public class MisstionSumEvenForLoop {
    public static void main(String[] args){
        //1~100 짝수만 더한 값 출력
//        int sum = 0;
//        for(int i = 1; i <= 100; i++){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);
//        System.out.println("------------------------");

        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                evenSum = evenSum + i;
                //evenSum += i; == //evenSum = evenSum + i;
                // 사칙연산 전부 가능
                // ex)evenSum *= i;
            }
        }
        System.out.println("evenSum: " + evenSum);
        System.out.println("----------------------------");
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                oddSum = oddSum + i;
                //evenSum += i; == //evenSum = evenSum + i;
                // 사칙연산 전부 가능
                // ex)evenSum *= i;
            }
        }
        System.out.println("oddSum: " + oddSum);
    }
}
