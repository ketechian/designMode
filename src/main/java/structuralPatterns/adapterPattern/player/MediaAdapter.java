package structuralPatterns.adapterPattern.player;

import structuralPatterns.adapterPattern.impl.AdvancedMediaPlayer;
import structuralPatterns.adapterPattern.impl.MediaPlayer;

/**
 * @Description 实现了 MediaPlayer 接口的适配器类
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:35
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
