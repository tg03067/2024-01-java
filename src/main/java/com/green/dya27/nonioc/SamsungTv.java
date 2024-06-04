package com.green.dya27.nonioc;

import com.green.dya27.Speaker;
import com.green.dya27.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv(){
        this.speaker = new HarmanSpeaker();
        //this.speaker = new JblSpeaker();
    }

    @Override
    public void sound(){
        System.out.println("SamsungTv: 소리가 난다.");
        speaker.sound();
    }
}
