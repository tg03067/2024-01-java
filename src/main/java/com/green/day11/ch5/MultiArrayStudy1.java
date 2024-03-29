package com.green.day11.ch5;
//p.214
public class MultiArrayStudy1 {
    public static void main(String[] args){
        int[][] score = new int[3][5];
        //다중차원 배열.      [세로줄][가로열]
        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        System.out.println("score.length: " + score.length);
        System.out.println("score[0].length: " + score[0].length);
        int[] temp = score[0];
        // 배열 != 배열의 배열
        // 두개는 서로 다른것임.


        for(int i = 0 ; i < score.length; i++){
            for(int z = 0; z < score[i].length; z++){
                System.out.printf("%d\t", score[i][z]);
            }
            System.out.println();
        }
    }
}