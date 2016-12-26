package com.iotek.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by taft on 2016/10/22.
 */
@Component
public class Capricornus implements CompactDisc {
    public Capricornus(){

    }
    private String title = "µ¾Ïã";
    private String artist = "ÖÜ½ÜÂ×";
    @Override
    public void play() {
        System.out.println("playing:"+title+" by "+artist);
    }
}
