package com.green.day8.ch4;

public class FlowEx26 {
    public static void main(String[] args){
        int num = 100;
        int i = 1;
        int z = 0;
        while(true){
            z += i;
            if(z > num){
                break;
            }
            System.out.printf("sum: %3d, i: %3d\n", z, i++);
        }
        System.out.println("------------");
        System.out.printf("i: %d", i - 1);


        /*
        1 ~ 1000
        값들을 계속 더할건데 더한값이 100이하인 index값이 몇인지 구하시오.
         */
    }
}
