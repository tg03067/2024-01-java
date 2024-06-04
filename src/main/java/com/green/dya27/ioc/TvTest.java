package com.green.dya27.ioc;

import com.green.dya27.Tv;

public class TvTest {
    public static void main(String[] args){
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = "lg";
        String speakerName = "bose";
        String wooferName = "marten";
        Tv tv = tvFactory.factory(tvName,speakerName,wooferName);
        tv.sound();

        System.out.println("-----");
        String tvName2 = "apple";
        String speakerName2 = "genelec";
        String wooferName2 = "hanil";
        Tv tv2 = tvFactory.factory(tvName2,speakerName2,wooferName2);
        tv2.sound();
    }
}
