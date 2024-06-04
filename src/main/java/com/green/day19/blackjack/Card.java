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
