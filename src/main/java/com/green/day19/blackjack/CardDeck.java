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

