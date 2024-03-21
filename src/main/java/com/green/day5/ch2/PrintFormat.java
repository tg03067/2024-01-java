package com.green.day5.ch2;

//%d > 정수값 : byte, short, int, long
//%s > 문자열 : String, "직접 작성한 값 "
//%f > 실수값 : float, double
//%c > 문자 : char값,
//%b > 불린 : boolean

public class PrintFormat {
    public static void main(String[] args){
        char c = 'A';
        int finger = 10;
        //리터럴 정수는 int타입
        //long타입 리터럴로 변경하려면 끝에 l,L 붙이면 된다.
        long big = 100_000_000_000L; // _ 없는 거랑 상관없음, 맞게 리터럴값을 부여했는지 확인할 수 있음.

        System.out.printf("c=%c, %d\n", c, (int)c);
        //%c = char값 출력할때, %d = 정수값만 출력할때
        System.out.printf("finger=[%5d]\n", finger);
        //%와 d사이의 숫자는 []공간차지 갯수, []그냥 잘 보여줄려고 입력한것.
        System.out.printf("finger=[%-5d]\n", finger);
        // - 는 왼쪽정렬
        System.out.printf("finger=[%05d]\n", finger);
        // []사이에 (문자)(숫자)는 (문자)로 (숫자)만큼 채우겠다는 뜻.
        System.out.printf("big=%d\n", big);


        //개행은 \n과 %n은 동일
        // " \ " 가 보기좋음.


        //yyyy-mm-dd
        int year = 2024;
        int mon = 12;
        int day = 20;
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);


        String url = "www.green.com";
        float f1 = .10f; // = 0.10f 와 동일,
        // 리터럴 실수는 double타입,
        // 끝에 f or F를 붙히면 float타입의 리터럴이 됨.

        double d = 1.23456789;

        System.out.printf("url=%s\n", url);
        //문자열을 넣고 싶을때는 %s
        System.out.printf("f1=%f\n", f1);
        //실수값을 넣고 싶을때는 %f
        System.out.printf("d=%f\n", d);
        System.out.printf("d=[%.2f]\n", d); //.() 안에 숫자자리만큼만 표기, 반올림 처리됨. 소수점 자르기.
        System.out.printf("d=[%10.2f]\n", d); // 반올림 처리 됨.
        System.out.printf("d=[%010.2f]\n", d); // 반올림 처리 됨.

        System.out.printf("[%s}\n", url);
        System.out.printf("[%20s}\n", url);
        System.out.printf("[%-20s}\n", url);
        System.out.printf("[%.8s}\n", url);


    }
}
