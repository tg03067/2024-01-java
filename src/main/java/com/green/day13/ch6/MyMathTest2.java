package com.green.day13.ch6;
//p.279
public class MyMathTest2 {
    public static void main(String[] args){
        long r = MyMath2.add(10,20);
        //메소드이름 : add, 클래스이름 : MyNath2, 리턴타입: long, 파라미터 2개(int, int), 스태틱 메소드.
        //class.메소드는 static 만 사용가능.
        System.out.println("r: " + r);

        MyMath2 myMath2 = new MyMath2();
        long r2 = myMath2.add();
        System.out.println("r2: " + r2);
    }
}

//static 변수는 인스턴스 변수를 땡겨서 쓸 수 없음.
class MyMath2 {
    long n1, n2;

    long add(){
        System.out.println("call add()");
        add(10, 20);
        return n1 + n2;
    }

    //파라미터에서 들어오는 값만 사용하면 static을 붙히면 된다.
    static long add (long n1, long n2){
        System.out.println("call add(n1, n2)");
        return n1 + n2;
    }
}