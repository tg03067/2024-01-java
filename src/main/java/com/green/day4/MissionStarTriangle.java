package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        //int star = 3 ~ 7 사이의 랜덤값
        int star = (int) (Math.random() * 5.0) + 3;
//        System.out.println(star);

        /*
        star = 3;
        *     0 1
        **    1 2
        ***   2 3
        규칙성 찾기.

        star = 5
        *
        **
        ***
        ****
        *****
         */
        System.out.println("star: " + star);
        for (int i = 0; i < star; i++) {
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---종료---");

        for (int i = 1; i <= star; i++) {
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
