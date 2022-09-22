package classes;

import interfaces.Playable;

import java.time.LocalDate;
import java.util.List;

public class AndroidPlayer implements Playable {


    private String currentSong;
    private List<String> songQueue;
    private int volume;

    private boolean isPlaying;

    public AndroidPlayer(String currentSong, List<String> songQueue, int volume) {
        this.currentSong = currentSong;
        this.songQueue = songQueue;
        this.volume = volume;
    }

    public void addNewSong(String song) {
        songQueue.add(song);
    }

    public String showArtwork() {
        return "Artwork not available";
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(String currentSong) {
        this.currentSong = currentSong;
    }

    public List<String> getSongQueue() {
        return songQueue;
    }

    public void setSongQueue(List<String> songQueue) {
        this.songQueue = songQueue;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play() {
        this.currentSong = songQueue.get(0);

    }

    public int subirVolumen(int volumen) {
        this.volume += volumen;
        return this.volume;
    }

    public int bajarVolumen(int volumen) {
        this.volume -= volumen;
        return this.volume;
    }

    public void pause() {
        this.isPlaying = false;

    }

    @Override
    public void addSongToQueue(String song) {

    }
}
