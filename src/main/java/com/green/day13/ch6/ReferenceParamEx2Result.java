package com.green.day13.ch6;

public class ReferenceParamEx2Result {
    public static void main(String[] args){
        int[] intArr = { 10, 20 };

        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);
        //10, 20

        change(intArr);
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0], intArr[1]);
        //11, 21
    }

    static void change(int[] i){
        //int[] intArr = { 10, 20 } == int[] i랑 같다고 이해하면 됨.
        //실제로 이렇게하면 주소값이 변경되기 때문에 하면안됨.
        for(int z = 0; z < i.length; z++){
            i[z]++;
        }
    }
}