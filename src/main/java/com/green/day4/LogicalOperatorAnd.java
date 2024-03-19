package com.green.day4;

public class LogicalOperatorAnd {
    public static void main(String[] args){
        if(true && true && true){ //and
            System.out.println("true && true && true");
        }
//         int i = 1 / 0; == 에러를 만드는 문자, (0으로 무언가를 나누면)
        boolean r = true && true && true;
        System.out.println("r:" +r);

        boolean r2 = true && true && true && false;
        System.out.println("r2:" + r2);
        //&& 두개는 false가 있으면 바로 결과를 냄

        boolean r3 = true & true & true & true;
        System.out.println("r3:" + r3);

        boolean r4 = true & true & true & false;
        System.out.println("r4:" + r4);
        //& 한개는 끝까지 다 해봄.
    }
}
