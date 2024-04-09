package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = { "Spade", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    private List<Card> Cards;

    public CardDeck(){
        Cards = new ArrayList<>();
        for(int i = 0; i < PATTERNS.length; i++){
            for(int z = 1; z <= CARD_COUNT; z++){
                String pattern = PATTERNS[i];
                String denomination = getDenomination(z);
                Card c = new Card(pattern, denomination);
                Cards.add(c);
            }
        }
    }
    private String getDenomination(int num){
        return switch (num){
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(num);
        };
    }
    public void showCards(){
//        for(Card card : list){
//            System.out.println(card);
//        }
        for(int i = 0; i < Cards.size(); i++){
            Card card = Cards.get(i);
            System.out.println(card);
        }
        //System.out.println(list);
    }
    public Card draw(){
        int rVal = (int)(Math.random() * Cards.size());
        return this.Cards.remove(rVal); //remove는 지우면서 지운값을 리턴해준다.
    }
}

class CardDeckTest {
    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        // 기본생성자에서 PATTERNS, CARD_COUNT를 활용하여
        // 52장의 카드 객체를 생성하여 list에 추가해주세요.
        // cd.showCards(); // 모든 카드의 pattern과 denomination 출력

        Card c = cd.draw(); // 랜덤한 카드 객체 주소값 리턴
        System.out.println("C: " + c);
        System.out.println("C: " + cd.draw());
        cd.showCards();
    }
}
