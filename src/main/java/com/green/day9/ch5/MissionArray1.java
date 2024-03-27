package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%s, ", numArr[i]);
        }
        /*
        for문 활용
        10, 20, 30, 40, (출력)
         */
        //Q2) for문 활용 오른쪽과 같이 출력 >> 10, 20, 30, 40, 50
        System.out.println();
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%s", numArr[i]);
            if (i < numArr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d%s", numArr[i], i < numArr.length - 1 ? ", " : "");
        }


        System.out.println();
        for (int i = 0; i < numArr.length - 1; i++) {
            System.out.printf("%s, ", numArr[i]);
        }
        if (numArr.length > 0) {
            System.out.printf("%s", numArr[numArr.length - 1]);
        }
    }
}