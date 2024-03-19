package com.green.day4;

public class MisstionStarTriangle2 {
    public static void main(String[] args){
        int star = (int)(Math.random() * 10) + 1;
        System.out.println("Star : " + star);
        for(int i = 0; i < star; i++){
            for(int z = 0; z <= i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 0; a<star; a++ ){
            for(int b = star - 1; b>a ; b--){
                System.out.print("*");
            }
//            for(int c = 0; c <= a; c++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
}
/*
star = 5
a = 0 1 2 3 4 = 5개
b = star - 1 = 4개
  =
 */
/*
star = 5
a = 0 1 2 3 4 = 5개
c = star = 5
  = a  <  c
 */