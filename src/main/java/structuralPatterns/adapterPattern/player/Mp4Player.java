package structuralPatterns.adapterPattern.player;

import structuralPatterns.adapterPattern.impl.AdvancedMediaPlayer;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:33
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
