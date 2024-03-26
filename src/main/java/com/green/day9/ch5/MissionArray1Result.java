package com.green.day9.ch5;

public class MissionArray1Result {
    public static void main(String[] args){
        // Q1) for문 활용 =  10, 20, 30, 40, (출력)
        int[] numArr = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i < numArr.length; i++){
            //System.out.printf("%d, ", numArr[i]);
            System.out.print(numArr[i] + ", ");
        }
    }
}
