package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> listOfMusic() {
        List<Music> listOfMusic = new ArrayList<>();

        listOfMusic.add(classicalMusic());
        listOfMusic.add(rockMusic());
        listOfMusic.add(jazzMusic());

        return listOfMusic;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listOfMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
