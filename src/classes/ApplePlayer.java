package classes;

import interfaces.Playable;

public class ApplePlayer implements Playable {

    String[] songQueue;
    String songTitle;
    String artist;
    double songDuration;
    double volume;

    public ApplePlayer(String[] songQueue, String songTitle, String artist, double songDuration, double volume) {
        this.songQueue = songQueue;
        this.songTitle = songTitle;
        this.artist = artist;
        this.songDuration = songDuration;
        this.volume = volume;
    }

    public void play() {
        this.songTitle = songQueue[songQueue.length - 1];

    }

    public int subirVolumen(int volumen) {
        this.volume += volumen;
        return (int) this.volume;
    }

    public int bajarVolumen(int volumen) {
        return 0;
    }

    public void pause() {

    }

    public void addSongToQueue(String song) {

    }
}
