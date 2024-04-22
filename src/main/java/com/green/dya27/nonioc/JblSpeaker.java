package com.green.dya27.nonioc;

import com.green.dya27.MartenWoofer;
import com.green.dya27.Speaker;
import com.green.dya27.Woofer;

public class JblSpeaker implements Speaker {

    private Woofer woofer;

    public JblSpeaker(){
        this.woofer = new MartenWoofer();
    }

    @Override
    public void sound() {
        System.out.println("Jbl Speaker: 소리가 깔끔하다.");
        woofer.soundBase();
    }
}
