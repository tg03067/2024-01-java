package com.green.day2;

public class MissonOddEven {
    public static void main(String[] args){
        for(int i=0; i<1; i++){
            int num = (int) (Math.random() * 10) + 1; //1~10
            int num2 = num % 2;

            //정수타입: byte, short, int, long
            //실수타입: float, double

            //예를들어 -- num 만약 5라면 --
            //콘솔에 출력이 "5는 홀수입니다."

            //예를들어 -- num 만약 10이라면 --
            //콘솔에 출력이 "10는(은) 짝수입니다."
            if (num2 == 0) {
                System.out.println(num + "은 짝수입니다.");
            } else {
                System.out.println(num + "는 홀수입니다.");
            }
        }
    }
}