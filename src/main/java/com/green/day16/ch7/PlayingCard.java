package com.green.day16.ch7;

public interface PlayingCard {
    //public static final (자동으로 붙음.)
    int CLOVER = 1;
    //public abstract (자동으로 붙음.)
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard{
    String getCardKind();
}

//extends는 클래스만 받음.인터페이스는 implements 써야 상속됨.
class PlayCard implements DeepPlayingCard {
    @Override
    public String getCardNumber() {
        return null;
    }
    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[] args){
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        System.out.println("-----------------");
    }
}