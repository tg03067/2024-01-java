package com.green.day5.ch2;

public class StringEx {
    public static void main(String[] args){
        String name = "Ja" + "va";
        //String name = "Java";
        System.out.println(name);
        String str = name + 8.0;
        //String str = "Java" + 8.0;  // + 와 문자열이 만나면 모두 문자열로 바뀐다 위치는 상관없음.
        //String str = "Java" + "8.0";
        //String str = "Java8.0";
        System.out.println(str); //Java8.0

        System.out.println(7 + "" + 7); //77
//        System.out.println("7" + "" + 7);
//        System.out.println("7" + 7);
//        System.out.println("7" + "7");
//        System.out.println("77");
        System.out.println(7 + 7 + "" + 7); //147
//        System.out.println(14 + "" + 7);
//        System.out.println("14" + 7);
//        System.out.println("14" + "7");
//        System.out.println("147");

        System.out.println(7 + "" + 7 + 7); //777
//        System.out.println("7" + 7 + 7);
//        System.out.println("77" + 7);
//        System.out.println("777");
        System.out.println(7 + "" + (7 + 7)); //714
    }
}
