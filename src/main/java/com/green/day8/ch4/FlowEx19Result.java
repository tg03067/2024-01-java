package com.green.day8.ch4;

public class FlowEx19Result {
    public static void main(String[] args){
        final int LATS_NUM = 3;
        for(int i1 = 1 ; i1 <= LATS_NUM; i1++){
            for(int i2 = 1; i2 <= LATS_NUM; i2++){
                for(int i3 = 1; i3 <= LATS_NUM; i3++){
                    System.out.printf("%d%d%d\n", i1, i2, i3);
                }
            }
        }



        /*
        반복문을 활용하여 이렇게 출력해 주세요.
        111
        112
        113
        121
        122
        123
        131
        132
        133
        211
        ...
        333
        */
    }
}
