package com.green.day10.ch5;

public class ArrayEx5 {
    public static void main(String[] args){
        int[] score = { 100, 88, 100, 100, 90, 75 };
        int sum = 0;

        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        double average = sum / (double)score.length;
        System.out.printf("sum: %d, average: %.2f", sum, average);

        /*
        학생들의 국어 점수입니다.
        총점과 평점 출력해주세요.
        포맷은 자유
         */
    }
}
