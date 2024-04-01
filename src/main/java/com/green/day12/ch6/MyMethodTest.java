package com.green.day12.ch6;

public class MyMethodTest {
    static void Gugudan(int i){
        for(int z = 1; z < 10; z++){
            System.out.printf("%d x %d = %d\n", i, z, i * z);
        }
    }
    public static void main(String[] args){
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10); //(콘솔출력)짝수입니다.
        mm.checkOddEven(11); //(콘솔출력)홀수입니다.
        mm.checkOddEven(100); //(콘솔출력)짝수입니다.
        mm.checkOddEven(13); //(콘솔출력)홀수입니다.
        System.out.println("-----------------");

        int r = mm.abs(10);
        System.out.println(r); // 10

        r = mm.abs(-8);
        System.out.println(r); //8
        System.out.println("-----------------");

        int randomValue = mm.getRandomValue(10); // 0~9 사이의 랜덤값 리턴
        System.out.println(randomValue);
        System.out.println("-----------------");
        randomValue = mm.getRandomValue(100); // 0~99 사이의 랜덤값 리턴
        System.out.println(randomValue);
        System.out.println("-----------------");

        Gugudan(3);
        System.out.println("-----------------");
        mm.printGugudan(3);
        /*
        3 x 1 = 3
        3 x 2 = 6
        ...
        3 x 9 = 27
        */
        System.out.println("-----------------");
        mm.printGugudan(5);
        /*
        5 x 1 = 5
        5 x 2 = 10
        ...
        5 x 9 = 45
         */

        System.out.println("-----------------");
        int randomValue2 = mm.getRandomValue(10, 20); //10~19
        System.out.println(randomValue2);
        randomValue2 = mm.getRandomValue(5, 31); //5~30
        System.out.println(randomValue2);
        System.out.println("-----------------");

        
    }
}

//위치파악 > 리턴, void > 메소드명 > 파라미터
class MyMethod {


    int getRandomValue(int i,int z){
        return (int)(Math.random() * (z - i)) + i;
    }

    void printGugudan(int dan){
        for(int z = 1; z < 10; z++){
            System.out.printf("%d x %d = %d\n", dan, z, dan * z);
        }
    }

    void checkOddEven(int n) {
        System.out.printf("%s수입니다.\n", n % 2 == 0 ? "짝" : "홀");
    }

    int getRandomValue(int n){
        return ((int)(Math.random() * n));
    }

    int abs(int n){
        return n < 0 ? -n : n;
    }

//    int abs(int n2){
//        if(n2 > 0){
//            return n2;
//        } else {
//            return -n2;
//        }
//    }
}