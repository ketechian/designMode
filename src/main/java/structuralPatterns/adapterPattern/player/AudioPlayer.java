package structuralPatterns.adapterPattern.player;

import structuralPatterns.adapterPattern.impl.MediaPlayer;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:42
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //对MP3格式的内置支持
        if("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //对其他文件格式的支持
        else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
