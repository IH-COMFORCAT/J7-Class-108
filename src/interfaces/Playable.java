package interfaces;

public interface Playable {

    void play();
    int subirVolumen(int volumen);
    int bajarVolumen(int volumen);
    void pause();
    void addSongToQueue(String song);


}
