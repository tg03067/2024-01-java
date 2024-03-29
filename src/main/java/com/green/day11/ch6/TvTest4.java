package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args){
        //Q1. Tv 객체의 주소값을 3개 저장할 수 있는 배열을 만들어주세요.
        Tv[] tvArr = new Tv[3];
        //Tv객체의 주소값만 담을 수 있는 배열을 만든 것.


        //Q2. 각 방에 tv객체의 주소값을 넣어준다. 모두 동일하지 않다.
        //Tv tv = new Tv();
        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv();
        }
//        for(Tv tv : tvArr){
//            System.out.println(tv);
//        }



        //Q3. 0번방 Tv는 채널 11, 1번방 Tv는 채널 12, 2번방 Tv는 채널 13
        int channel = 11;
//        Tv tv = tvArr[0];
//        Tv tv = tvArr[1];
//        Tv tv = tvArr[2];
        for(Tv tv : tvArr){
            //주소값을 얻어오고 있음.
            tv.channel = channel++;
        }
        for(Tv tv : tvArr){
            System.out.println("tv.channel: " + tv.channel);
        }

//        for(int i = 0; i < tvArr.length; i++){
//            tvArr[i].channel = i + 11;
//        }

//        tvArr[0].channel = 11;
//        tvArr[1].channel = 12;
//        tvArr[2].channel = 13;
//        tvArr[3].channel = 1; // 규칙이 없을 때는 그냥 따로 변수선언(초기화) 실시함.


//        for(int i = 0; i < tvArr.length; i++){
//            tvArr[i].channel = i + 10;
//            tvArr[i].channulUp();
//        }


//        for(int i = 0; i < tvArr.length; i++){
//            System.out.printf("Tv[%s] channel: %s\n", i, tvArr[i].channel);
//        }
    }
}