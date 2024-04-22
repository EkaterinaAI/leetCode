package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic() {
        Random random = new Random();
        int randomSong = random.nextInt(music.size());
        return "Playing: " + music.get(randomSong).getSong();
    }
}
