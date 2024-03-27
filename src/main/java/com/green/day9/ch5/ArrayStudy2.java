package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {

        int[] numArr = new int[15];
        //15는 매직넘버라서 int값에 초기화한후 그 변수를 []안에 넣어서 수정해도됨.
        System.out.println(numArr.length);
        //length가 더 편함. 상수.
        System.out.println(Arrays.toString(numArr)); //배열안의 값을 알고싶을때사용, 가로로 길어지면 for문을 사용해도됨.
//        for(int i = 0; i < 100; i++){
//            System.out.printf("numArr[%d}: %d\n", i, numArr[i]);
//        }

//        for (int i = 0; i < 10; i++;) {
//            numArr[i] = i++;
//            System.out.printf("numArr[%d}: %d\n", i, numArr[i]);
//        }


        for(int i = 0; i < numArr.length; i++){
            numArr[i] = i + 1;
        }
        //쓰기와 읽기는 최대한 따로해결할 것.

        for(int i = 0; i < numArr.length; i++){
            System.out.printf("numArr[%d}: %d\n", i, numArr[i]);
        }
        //쓰기와 읽기는 최대한 따로해결할 것.


//        System.out.printf("numArr[%d}: %d\n", 0, numArr[0]);
//        System.out.printf("numArr[%d}: %d\n", 1, numArr[1]);
//        System.out.printf("numArr[%d}: %d\n", 2, numArr[2]);
//        //....
//        System.out.printf("numArr[%d}: %d\n", 99, numArr[99]);
//    }
    }
}
