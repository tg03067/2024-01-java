package com.green.day2;

public class If {
    public static void main(String[] args){
        int n1 = 10, n2 = 20;
        n2 = 30;
        if(n1 < n2){
            System.out.println("n1이 n2보다 초과값입니다");
        } else {
            System.out.println("n1이 n2보다 미만값입니다");
        }
        System.out.println("----------------------");

        int n3 = 10, n4 = 20;
        n4 = 30;
        if(n3 < n4){
            System.out.println("n3이 n4보다 초과값입니다");
        } else {
            System.out.println("n3이 n4보다 미만값입니다");
        }

        if(n3 > n4){
            System.out.println("n3이 크다");
        }  else {
            System.out.println("n3과 n4가 같다");
        } // 참인 명제일 경우 처음 나타나는 명제선언 후 그룹넘어감
        if(n3 < n4) {
            System.out.println("n3이 작다");
        }
    }
}
