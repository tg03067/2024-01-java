package com.green.dya27.ioc;

import com.green.dya27.Speaker;
import com.green.dya27.Woofer;

public class GenelecSpeaker implements Speaker {
    public Woofer woofer;

    public GenelecSpeaker(Woofer woofer){
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("Genelec Speaker: 소리가 엄청나다.");
        woofer.soundBase();
    }
}
