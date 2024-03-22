package com.green.day6.ch3;
//p.93 ~
public class OperatorEx1 {
    public static void main(String[] args){
        int n1 = 3, n2 = 5;
        //int r1 = -n1 - n2;
        int r1 = (-n1) - n2; //가독성 좋게 변환

        System.out.println("r1: " + r1);

        int r2 = n1 + n2 * n1 / n2;
        System.out.println("r2: " + r2);
        //int r2 = n1 + ( n2 * n1 ) / n2;
        //int r2 = n1 + ( A / n2 );
        //int r2 = n1 + B;

        int r3 = n1 + ((n2 * n1) / n2);
        System.out.println("r3: " + r3);
        //가독성 좋게 변환.
        System.out.println("---------");

        //증감 연산자
        int i = 5, z = 0;
        i++; //쓰기만하는중
        System.out.println("i: " + i);

        i = 5;
        ++i; //쓰기만하는중
        System.out.println("i: " + i);

        i = 5;
        z = i++; //읽고, 쓰기를 해야됨. ++이 뒤에있으면 읽기(복사)먼저함
                 //i값을 z에 주고 i증감
        System.out.printf("i: %d, z: %d\n", i, z);

        i = 5;
        z = 0;
        z = ++i; //읽고, 쓰기를 해야됨. ++이 앞에있으면 쓰기먼저함
                 //i를 먼저증감해서 6을 만들고, z에 i를 넣음
        System.out.printf("i: %d, z: %d\n", i, z);
        System.out.println("-----------");

        int k = 10;
        System.out.println(k++); //10
        System.out.println(++k); //12
        System.out.println(++k); //13
        System.out.println(k++); //13
        System.out.println(k);   //14

    }
}
