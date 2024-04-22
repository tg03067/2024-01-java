package com.green.dya27.ioc;

import com.green.dya27.Speaker;
import com.green.dya27.Tv;

public class LgTv implements Tv {
    public Speaker speaker;

    public LgTv(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Lg Tv: 소리가 난다.");
        speaker.sound();
    }
}
