package com.green.day3;

public class MisstionForLoopGugudan {
    public static void main(String[] args){
        int dan = (int)(Math.random() * 8.0) + 2; //2~9 랜덤값
        System.out.println("dan: " + dan);

        /*
        만약 dan = 2
        2 X 1 = 2
        2 X 2 = 4
        2 X 3 = 6
        ...
        2 X 9 = 18

        만약 dan = 5
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        ...
        5 X 9 = 45
         */

//      for(int i=1; i<10; i++){
//          System.out.print(dan + " * " + i + " = " );
//          System.out.println(dan * i)
//      }

        for(int i=1; i<10; i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

//      for(int i=1; i<10; i++){
//            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
//      }

    }
}
