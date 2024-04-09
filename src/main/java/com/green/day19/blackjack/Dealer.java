package com.green.day19.blackjack;

import java.util.List;

public class Dealer extends Gamer{
    private static final int CAN_RECEIVE_POINT = 16; // 16이하면 카드한장 더 가져올거야

    public boolean isMoreReceiveCard(){
        int score = 0;
        for(int i = 0; i < cards.size(); i++){
            Card card = cards.get(i);
            score += card.getPoint();
        }
        return score <= CAN_RECEIVE_POINT;
    }
}

class DealerTest {
    public static void main(String[] args){
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Heart", "A"));
        dealer.receiveCard(new Card("Spade", "K"));
        boolean answer = dealer.isMoreReceiveCard();
        List<Card> list = dealer.openCards();
        System.out.println("list: " + list);
        System.out.println("answer: " + answer);
    }
}