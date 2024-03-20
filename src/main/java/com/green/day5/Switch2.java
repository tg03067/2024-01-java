package com.green.day5;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (남/여) >> ");
        String gender = scan.nextLine();

        //Reference 변수는 객체의 주소값을 저장할 수 있다.
        //객체의 주소값만 저장 가능 ( 그리고 이것은 객체를 가리키고 있다고 표현.)
        //null은 주소값이 없다는 것을 의미 ( 그리고 이것은 객체를 가리키고 있지 않다.)
        String result = null;
        //Reference type에만 넣을 수 있음.
        //int num = null; = X //primitive type은 null을 가질 수 없다.
        switch (gender){
            case "여":
            case "여자":
                result = "당신은 여성입니다:";
                break;
            case "남":
            case "남자":
                result = "당신은 남성입니다.";
                break;
            default:
                result = "성별을 입력해 주세요.";
                break;
        }
        System.out.println(result);
    }
}
