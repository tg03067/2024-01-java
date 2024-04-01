package com.green.day13.ch6;
//p.264
public class PrimitiveRefEx {
    public static void main(String[] args){
        int num = 10;
        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num);
        System.out.println("num: " + num); //10

        changeNum(nb);
        System.out.println("nb.num: " + nb.num);//100
    }

    public static void changeNum(Numbox n){
        //n = new Numbox(); //- 다른 존재이기에 이런식으로 실행하면 윗값은 100이 아니라 10이 나옴.
        n.num = 100;
    }


    public static void changeNum(int n){
        n = 100;
        //System.out.println(n);
    }
    //void, 같은 클래스 안에 존재, static, 메소드명 : changNum, 파라미터 정수값 1개
    //객체화 안했음.
}


class Numbox{
    int num;
}