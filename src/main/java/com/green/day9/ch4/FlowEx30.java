package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args){
        int n = 100;
        int sum = 0;
        while (true) {
            for(int i = 1; sum < n; i++){
                sum += i;
                System.out.printf("i: %s, sum: %s\n", i, sum);
            }
            break;
        }

        /*
        1~n까지 더하는데 100이 막 넘은 index값과 sum값을 출력한다.
        i: 14, sum: 105
        while문으로 해결
         */
    }
}
