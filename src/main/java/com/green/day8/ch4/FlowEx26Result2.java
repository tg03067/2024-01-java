package com.green.day8.ch4;

public class FlowEx26Result2 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        while(true){
            int result = sum + i + 1;
            if(result > 100){
                break;
            }
            sum += ++i;
        }
        System.out.println(i); 


        /*
        1 ~ 1000
        값들을 계속 더할건데 더한값이 100이하인 index값이 몇인지 구하시오.
         */
    }
}
