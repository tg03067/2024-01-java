package com.green.day9.ch4;

public class FlowEx29Result {
    public static void main(String[] args){
        for( int i = 1; i <= 100; i++) {
            System.out.printf("i = %d", i);
            int num = i;

        do {
            int a = num % 10;
            if( a != 0 && a % 3 == 0){
                System.out.print("짝");
            }
        } while((num /= 10) > 0);
        System.out.println();
        }
        /*
        1~100
        3, 6, 9게임
        i = 1
        i = 2
        i = 3 짝
        i = 4
        i = 5
        i = 6 짝
        ...
        i = 30 짝
        ...
        i = 33 짝짝
        ...
        i = 99 짝짝
        i = 100
         */
    }
}
