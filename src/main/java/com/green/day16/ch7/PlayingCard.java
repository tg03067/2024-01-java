package com.green.day16.ch7;

public interface PlayingCard {
    //public static final (자동으로 붙음.)
    int CLOVER = 1;
    //public abstract (자동으로 붙음.)
    String getCardNumber();
}

class PlayCardSecond implements PlayingCard{
    public String getCardNumber(){
        return null;
    }
}

interface DeepPlayingCard extends PlayingCard{
    String getCardKind();
}

//같은 타입은 extends로만 받음.타입이 다르면 implements 써야 상속됨.
class PlayCard implements DeepPlayingCard {
    @Override  // 구현키워드로 상속.
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
        PlayingCard pc = new PlayCard(); //나를 포함해서 나를 상속받은 자식객체의 주소값도 받을 수 있다.
                                         // implements(interface)한 객체 주소값도 담을 수 있다.
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        dpc.getCardNumber();
        System.out.println("-----------------");
    }
}