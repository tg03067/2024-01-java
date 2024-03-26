package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args){
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;

        System.out.println(n1);
        n1 = 11;
        System.out.println(n1);
        //reference 타입은  '=' 이후에 있는 것들은 값 1개에만 접근할 수 있다

        //primitive 타입의 숫자가 들어가는 타입들은 최초에 배열을 설정하면 최초의 값은 0이 들어있음. 다른언어들은 0이 들어있지않는 경우가있음
        // int, long, float, double
        //boolean 타입은 false가 들어가 있음.
        //reference 타입은 최초에 null이 들어있음.
        //배열 = 해당 타입의 저장할 공간, 주소값 저장
        //배열은 첫번째자리 수는 0번자리부터 시작임.
        boolean[] boolnum = new boolean[10];
        System.out.println("boolean[9]: " + boolnum[9]);

        int[] numArr = new int[10]; //10칸짜리 배열의 주소값, 칸만 만들었지 초기화는 X
        //numArr[10] = 10; //없는 방 사용하면 예외 발생.
        //System.out.println("numArr[10]: " + numArr[10]); ////없는 방 사용하면 예외 발생.
        // -> ArrayIndexOutOfBoundsException
        System.out.println("numArr[9]: " + numArr[9]);
        System.out.println("numArr[0]: " + numArr[0]);
        numArr[0] = 11;
        System.out.println("numArr[0]: " + numArr[0]);



        int[] numArr2 = { 10, 20, 30, 40, 50}; //5칸, 칸도 만들었고 초기화를 했다.
        System.out.println("numArr2[1]: " + numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1]: " + numArr2[1]);

        int[] numArr3 = new int[] {10, 20, 30}; //3칸,  칸도 만들었고 초기화를 했다.


        String[] strArr = new String[5];
        System.out.println("strArr2[0]: " + strArr[0]);
        System.out.println("strArr2[1]: " + strArr[1]);


        //int[] numArr4 = new String[5]; = X
        //타입이 다르면 저장을 할 수 없음.

        /*
        배열을 사용하는 이유? 같은 타입의 여러값을 편하게 쓰기/읽기 하기 위해서
        배열의 특징? 크기는 고정(생성 후 크기 변경 X)
                    index로 사용한다.
                    index는 0번부터 시작된다.
                    마지막 index값은 배열 크기 -1 값이다.
                    for문이랑 궁합이 굉장하다.

         */

    }
}
