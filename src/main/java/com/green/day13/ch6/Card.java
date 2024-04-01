package com.green.day13.ch6;

public class Card {
    String shape;
    String number;
}

class CardTest {
    public static void main(String[] args){
        String[] shapes = {"하트", "다이아몬드", "클로버", "스페이드"};
        Card[] cards = new Card[52]; // 0~51

        int idx = 0;
        for(int i = 0; i < shapes.length; i++){
            for(int z = 1; z <= 13; z++){
                Card c = new Card();
                c.shape = shapes[i];
//                c.number = "" + z;
                c.number = switch(z){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                cards[idx++] = c;
            }
        }
        System.out.println("--------------");
        for(Card c : cards){
            System.out.printf("%s(%s)\n", c.shape, c.number);
        }

        System.out.println("--------------");
        /*
        카드 객체 52개 만들기
        모양 : 클로버, 하트, 다이아몬드, 스페이드
        숫자 : A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
         */
    }
}