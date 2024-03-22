package com.green.day6.ch3;
//p.98 ~ 100
public class OperatorEx6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        //byte c = a + b; 오류가 뜸.
        int c = a + b; //byte + byte, short + short 는 int값으로 나옴, 값이 나올려면 강제형변환을 해야됨.
                       // 쓸 일은 거의 없음.
        //System.out.println(c);

        int d = 1_000_000;// _는 출력이 안됨. spacebar쓸경우 에러가 발샐하면서 안됨.자릿수 확인하기 좋음.
        System.out.println(d);

        long e = 1_000_000 * 1_000_000; //int * int = int, overflow현상 발생.
        long f = 1_000_000 * 1_000_000L;

        System.out.println("e: " + e);
        System.out.println("f: " + f);

        double g = 10 / 3;
        double g2 = 10 / (double)3;
        System.out.println("g: " + g);
        System.out.println("g2: " + g2);
    }
}
