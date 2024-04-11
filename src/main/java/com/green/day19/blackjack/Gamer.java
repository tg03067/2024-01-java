package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer  {
    protected List<Card> cards;
    public Gamer(){
        cards = new ArrayList<>();
    }
    public void receiveCard(Card card){
        this.cards.add(card);
    }
    public List<Card> openCards(){
        return this.cards;
    }
}
