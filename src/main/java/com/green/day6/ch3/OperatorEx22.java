package com.green.day6.ch3;
//p.110
public class OperatorEx22 {
    public static void main(String[] args){
        float f = 0.1f; //0.10000000014901161 - 망가짐
        double d = 0.1; //0.10000000000000001 - 그나마 정상
        // 망가진게 정상되기 쉽지않음, 그나마 정상은 망가지기 쉬움.
        // double을 float으로 바꾸는게 쉬움.
        double d2 = f;


        System.out.printf("%f == %f %b\n", 10.0, 10.0f, 10.0 == 10.0f); //정수쪽 비교는 true가 뜸.
        System.out.printf("%f == %f %b\n", f, d, f == d);
        //실수가 들어가면 false가 나온다. 실수형은 정답에 가까운거지 정답은 아님.
        System.out.printf("%f == %f %b\n", f, d, (double) f == d);
        System.out.printf("%f == %f %b\n", f, d, f == (float) d);
    }
}
