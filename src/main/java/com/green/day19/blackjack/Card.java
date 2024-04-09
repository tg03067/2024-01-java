package com.green.day19.blackjack;

public class Card {
    private String pattern; // 무늬 Spade.
    private String denomination; // A , 2 ~ 10 , J, Q, K

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern(){ return pattern; }
    public String getDenomination(){ return denomination; }
    @Override
    public String toString(){
        return String.format("%s(%s)", this.pattern ,this.denomination);
    }
    public int getPoint(){
        return switch (denomination){
            case "A" -> 1;
            case "10", "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}

class CardTest {
    public static void main(String[] args){
        // 2~10 점수 그대로, A > 1, J,Q,K = 10
        Card c = new Card("Spade", "A");
        //기본 생성자는 없어야 함.
        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c); //Spade(A)

        int score = c.getPoint(); //1
        System.out.println(score);
    }
}