package com.green.day14.ch7;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.printAllCard();
    }
}

class Deck{
    static final String[] kinds = { "스페이드", "하트", "다이아몬드", "클로버" };
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck(){
//        cardArr = new Card[CARD_NUM];
//        String[] str = { "스페이드", "하트", "다이아몬드", "클로버" };
        int idx = 0;
        for(int i = 0; i < kinds.length; i++){
            for(int z = 1; z <= 13; z++){
                Card c = new Card();
                c.kind = kinds[i];
                c.number = switch (z){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                this.cardArr[idx++] = c;
            }
        }
    }

    void printAllCard(){
        for(Card c : cardArr){
            System.out.println(c);
        }
    }
}



class Card{
    String kind; //무늬
    String number; // 번호(A, 2~10, J, Q, K)

    @Override
    public String toString(){
        return String.format("%s(%s)", kind, number);
    }
}