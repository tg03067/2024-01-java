package com.green.dya27.ioc;

import com.green.dya27.Speaker;
import com.green.dya27.Tv;

public class AppleTv implements Tv {
    public Speaker speaker;

    public AppleTv(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Apple Tv: 소리가 난다.");
        speaker.sound();
    }
}
