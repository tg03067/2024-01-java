package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args){
        MyMath myMath = new MyMath();
        myMath.add(10,20);
        myMath.add(100,200);

        myMath.minus(100, 50); //100 - 50 = 50
        myMath.minus(200, 50); //100 - 50 = 150

        System.out.println(myMath.returnAdd(500, 600));

        int result = myMath.returnAdd(500, 600);
        //return은 단독으로 사용되지는 않음. = 연산자가 있음.
        //아니면 출력하는 코드도 있어야됨.
        //void 메소드는 =연산자를 쓸 수 가 없음.

        myMath.returnAdd(500, 600);
    }
}

class MyMath{
    //리턴 메소드(void를 쓰지않은 메소드), void 메소드
    //return을 만나야 호출한 곳으로 돌아가면서 끝남.
    //void 메소드는 자동으로 return을 생성해줌.

    //리턴타입 메소드명 파라미터(매개변수) > 메소드 선언부
    // { } 부분은 > 메소드 구현부

    void method1(){

    }

    int method2(){
        return 10;
    }

    void add(int n1, int n2){
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    //결과를 리턴받고 싶은 타입을 적어줌.
    //   가공의 결과(메소드의 결과, 연산의 결과)
    //return은 필수로 있어야됨. 리턴타입에 구현부애서 같은 타입을 받아야됨.
    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }

    //scope가 달라서 사용가능.
    void minus(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
}