package structuralPatterns.adapterPattern.player;

import structuralPatterns.adapterPattern.impl.AdvancedMediaPlayer;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:32
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
