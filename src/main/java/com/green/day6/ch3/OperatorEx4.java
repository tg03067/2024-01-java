package com.green.day6.ch3;
//p.96
public class OperatorEx4 {
    public static void main(String[] args){
        int i = -10;
        i = +i;
        //i = i;
        //i = +(-10) -> -10
        System.out.println("i: " + i);

        i = -10;
        i = -i;
        //i = -(-10) -> 10
        System.out.println("i: " + i);

    }
}
