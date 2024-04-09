package com.green.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args){
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();
        game.start();
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
    public void start(){
        Scanner scan = new Scanner(System.in);
        Main:
        while(true){
            System.out.printf("숫자를 %d개 입력해 주세요. (구분은 스페이스) >>> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine(); // 3 7 9
            String[] answerStrArr = strAnswer.split(" ");
            int[] answerArr = new int[answerStrArr.length];

            HashSet<Integer> numSet = new HashSet();
            try {
                for (int i = 0; i < answerStrArr.length; i++) {
                    answerArr[i] = Integer.parseInt(answerStrArr[i]);
                    if(!numSet.add(answerArr[i])){
                        System.out.println("중복된 숫자가 있습니다. 다시 입력해 주세요.");
                        continue Main;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해 주세요.");
                continue;
            }


            if(numArr.length != answerArr.length){
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            int striker = 0, ball = 0;
            for(int i = 0; i < answerArr.length; i++){
                for(int z = 0; z < answerArr.length; z++) {
                    if (answerArr[i] == numArr[z]) {
                        if (i == z){
                            striker++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            //striker, ball 갯수 찾아내면된다.
            if(striker == NUMBER_COUNT){
                System.out.println("정답!!");
                break;
            }
            System.out.printf("S: %d, B: %d, O: %d\n\n", striker, ball, NUMBER_COUNT - striker - ball);
        }
        scan.close();
    }
}