package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args){
        int i = 120;
        //overflow
        int i2 = -129;
        //underflow

        int n3 = 100; //n3를 byte로 형변환을 할 것이다.
        //형변환을 할 수 있는 값인지 체크하는 if문 작성해주세요.
//        if(Byte.MAX_VALUE <= n3 || Byte.MIN_VALUE >= n3){
                                //(or)
//        if(Byte.MAX_VALUE <= n3 && Byte.MIN_VALUE >= n3){
                                //(and)
//            //127                   //-128
//            byte b = (byte) n3;
//            System.out.println("byte b: " + b);
//        } else {
//            System.out.println("byte n3: " + n3);
//        }
//        System.out.println("-------------");
        if(n3 <= Byte.MAX_VALUE){

        }

        if (Byte.MAX_VALUE >= i) { //127 and -128
            byte b = (byte)i;
            System.out.println("b: " + b);
        }
        if (Byte.MIN_VALUE <= i2) {
            byte b2 = (byte)i2;
            System.out.println("b2: " + b2);
        }
        System.out.println("종료");

    }
}
