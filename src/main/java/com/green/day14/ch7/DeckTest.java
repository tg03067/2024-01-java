package com.green.day14.ch7;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args){
        Deck deck = new Deck();
        //deck.printAllCard();
        Card c = deck.pick();
        System.out.println(c);
        Card c2 = deck.pick(5);
        System.out.println(c2);

        deck.shuffle();
        deck.printAllCard();
    }
}

class Deck{
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];
    void shuffle(){
        for(int i = 0 ; i < cardArr.length; i++){
            int rIdx = (int)(Math.random() * cardArr.length); //0 ~ 51 랜덤값 뽑는다.
            if(i == rIdx){ continue; }
            Card temp =  cardArr[rIdx];
            cardArr[i] = temp;
            cardArr[rIdx] = cardArr[i];
        }
    }

    Deck(){
        String[] KINDS = { "스페이드", "하트", "다이아몬드", "클로버" };
        String[] CARD_NAMES = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//        cardArr = new Card[CARD_NUM];
//        String[] str = { "스페이드", "하트", "다이아몬드", "클로버" };
        int idx = 0;
        for(int i = 0; i < KINDS.length; i++){
            for(int z = 0; z < CARD_NAMES.length; z++){
//                for(int z = 1; z <= 13; z++) {
//                    String number = switch (z) {
//                        case 1 -> "A";
//                        case 11 -> "J";
//                        case 12 -> "Q";
//                        case 13 -> "K";
//                        default -> String.valueOf(z);
//                    };
//                }
                this.cardArr[idx++] = new Card(KINDS[i], CARD_NAMES[z]);
            }
        }
    }

    Card pick(int i){
        return cardArr[i];
    }

    Card pick(){
        int rIdx = (int)(Math.random() * cardArr.length); //0 ~ 51 랜덤값 뽑는다.
        Card c = cardArr[rIdx];
        return c;
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

    Card(String kind, String number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("%s(%s)", kind, number);
    }
}