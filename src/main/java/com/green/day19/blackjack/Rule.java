package com.green.day19.blackjack;

import java.util.List;

public class Rule {
    private static final int BLACKJACK_NUMBER = 21;
    private static final String win = "이겼습니다";
    private static final String drow = "비겼습니다";

    void whoIsWinner(Gamer gamer, Dealer dealer){
        int gamerScore = getTotalPoint(gamer.cards);
        int dealerScore = getTotalPoint(dealer.cards);

        System.out.println();
        System.out.println("gamer: " + gamer.openCards() + " gamerScore: " + gamerScore);
        System.out.println("dealer: " + dealer.openCards()+ " dealerScore: " + dealerScore);
        blackjackScore(gamerScore, dealerScore);
        bustScore(gamerScore, dealerScore);

        if (dealerScore == gamerScore) { System.out.println(drow);}
        else if (dealerScore <= BLACKJACK_NUMBER && dealerScore > gamerScore) {System.out.println("딜러가 " + win);}
        else if (gamerScore <= BLACKJACK_NUMBER && dealerScore < gamerScore) {System.out.println("게이머가 " + win); }
    }

    private int getTotalPoint(List<Card> cards){
        int score = 0;
        for(int i = 0; i < cards.size(); i++){
            Card card = cards.get(i);
            score += card.getPoint();
        }
        return score;
    }
    private boolean isBust(int score){
        return score > BLACKJACK_NUMBER;
    }
    private void bustScore(int gamerScore, int dealerScore){
        if (isBust(dealerScore) && isBust(gamerScore)) {System.out.println("딜러와 게이머가 Bust되었습니다."); }
        else if (isBust(dealerScore)) {System.out.println("딜러의 Bust로 게이머가 " + win); }
        else if (isBust(gamerScore)) {System.out.println("게이머의 Bust로 딜러가 " + win); }
    }
    private void blackjackScore(int gamerScore, int dealerScore){
        if(gamerScore == BLACKJACK_NUMBER) System.out.println("게이머가 BlackJack을 달성했습니다.");
        if(dealerScore == BLACKJACK_NUMBER) System.out.println("딜러가 BlackJack을 달성했습니다.");
    }
}
