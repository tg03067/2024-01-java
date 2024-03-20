package com.green.day4;

public class MissionABS {
    public static void main(String[] args){
        int val = (int)(Math.random() * 21) - 10; // 0 ~ 20 > -10 ~ 10
        System.out.println("원본: " + val);


        //방법3
        System.out.println("결과값: " + (val < 0 ? -val : val));
        // val = -10일때
        //        System.out.println("결과값: " + (-(-10)));
        //        System.out.println("결과값: " + 10);
        //        System.out.println("결과값: " + "10");
        //        System.out.println("결과값: 10");

//        //val = -4라면
//        System.out.println("결과값: " + -(-4));
//        System.out.println("결과값: " + 4);
//        System.out.println("결과값: " + "4");
//        System.out.println("결과값: 4");


//        //val = 9라면
//        System.out.println("결과값: " + 9);
//        System.out.println("결과값: " + "9");
//        System.out.println("결과값: 9");





//        //방법2
        // val = -10
//        System.out.print("결과값: ");
//        if(val < 0) {
//            System.out.println(-val);
//            System.out.println(-(-10));
//            System.out.println((-10) * -1);
//        } else {
//            System.out.println(val);
//        }


        //방법1 : val값을 수정한다.
//        if(val < 0){
//            val = -val;
//            //  = val * -1
//        }
//        System.out.println("결과값: " + val);

//        int num = -10;
//        System.out.println(-num);
//        System.out.println(num * -1);
    }
}
