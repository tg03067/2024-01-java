package com.green.day18;

import java.util.Arrays;

public class NumberBaseBallGameTest {
    public static void main(String[] args){
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();
        //game.start();
    }
}

class NumberBaseBallGame {
    final int MAX_NUMBER = 9;
    final int DEFAULT_NUMBER = 3;
    final int MIN_NUMBER = 1;
    final int NUMBER_COUNT;
    private int[] numArr;

    NumberBaseBallGame(final int NUMBER_COUNT){
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > 9){
            this.NUMBER_COUNT = this.DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }

    private void init(){
        this.numArr = new int[NUMBER_COUNT];
        Main:
        for(int i = 0 ; i < numArr.length; i++){ // 1~9 중복되지않게 각 방에 대입
            int rVal = getRandomValue();
            for(int z = 0; z < i; z++){
                if(numArr[z] == rVal){
                    i--;
                    continue Main; //반복문에 네이밍을 통하여 돌아갈 곳을 설정할 수 있음.
                }
            }
            numArr[i] = rVal;
        }
    }
    private int getRandomValue(){
        return (int)(Math.random() * MAX_NUMBER) + MIN_NUMBER;
    }
    public void showArr(){
        System.out.println(Arrays.toString(this.numArr));
    }
}