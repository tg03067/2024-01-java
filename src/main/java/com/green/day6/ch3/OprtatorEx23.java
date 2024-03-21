package com.green.day6.ch3;
//p.113
public class OprtatorEx23 {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");
        //다른 객체를 가리키고 있는 것임. new는 새로만드는 거임.(주소값이 다름.)

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equlas(str2)" + (str1.equals(str2)));

        //동등성 > 지위, 권리, 권한 //같은거인지( ex)물건이 같은지 물어보는것.). equals
        //동일성 > 같은 인물, 같다. //객체[(주소값(ex)물건이 같은 위치에 있는지 물어보는것.))( == )]가 같은지 물어보는거임
    }
}
