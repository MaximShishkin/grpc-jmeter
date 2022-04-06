package ru.shishkin.multithreading;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class NewThread extends Thread {
    public NewThread(String name) {
        setName(name);
        start();
    }

    public void run() {
        while (go()) ;
    }

    private boolean go() {
        try {
            InputStream music = getClass().getClassLoader().getResourceAsStream("music.mp3");
            Player player = new Player(music);
            player.play();
            player.close();
            music.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
