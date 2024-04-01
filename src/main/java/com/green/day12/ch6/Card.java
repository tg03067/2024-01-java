package com.green.day12.ch6;
//p.247
//private 클래스 내에서만 사용할 때 사용.
//default 아무것도 안붙었을 때 사용가능. 같은 패키지내에서는 사용가능 상위, 하위 패키지에서는 사용 불가능.
//protected 위 두개를 포함. 상속관계일때는 사용가능
//public

//파일명이랑 클래스 뒤 이름이랑 같아야 붙일 수 있음.
public class Card {
    String kind; // 무늬
    int number; // 숫자

    static int width = 100; //가로
    static int height = 250; //세로

    //static은 class이름을 붙히고 static을 불러올 수 있다.
}

