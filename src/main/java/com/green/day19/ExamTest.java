package com.green.day19;

public class ExamTest {
    public static void main(String[] args){
        String str = "1 2 3";
        String[] strArr = str.split(" "); //배열로 인식함
        System.out.println("------");

        //strArr 배열을  int배열로 파싱처리.

        int[] nArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            nArr[i] = Integer.parseInt(strArr[i]);
        }
    }
}

class Exam{

}