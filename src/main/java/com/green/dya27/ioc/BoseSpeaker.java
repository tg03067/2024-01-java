package com.green.dya27.ioc;

import com.green.dya27.Speaker;
import com.green.dya27.Woofer;

public class BoseSpeaker implements Speaker {
    public Woofer woofer;

    public BoseSpeaker(Woofer woofer){
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("Bose Speaker: 소리가 짱짱하다.");
        woofer.soundBase();
    }
}
