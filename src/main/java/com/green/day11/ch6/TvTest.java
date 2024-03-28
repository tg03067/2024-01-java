package com.green.day11.ch6;

public class TvTest {
    public static void main(String[] args){
        Tv tv = new Tv();
        tv.color = "red";
        tv.channel = 10;
        tv.power = true;
        // . = 닷 연산자, 도트 연산자.
        // 객체에게 일을 시키거나 접근할 때쓰는거랑 같음.

        System.out.printf("tv color: %s, channel: %d, power: %b\n", tv.color, tv.channel, tv.power);


        Tv tv2 = new Tv();
        tv2.channulUp();
        tv2.channulUp();
        System.out.println("tv == tv2: " + (tv == tv2));
        System.out.printf("tv2 color: %s, channel: %d, power: %b\n", tv2.color, tv2.channel, tv2.power);
    }
}
