package classes;

import java.time.LocalDate;

public abstract class Mamifero {
    private int bpm;
    private boolean isBreastFeeding;
    private LocalDate lastTimeAte;

    abstract void eat();
    abstract void breath();
    abstract void drink();

    public Mamifero(int bpm, boolean isBreastFeeding, LocalDate lastTimeAte) {
        this.bpm = bpm;
        this.isBreastFeeding = isBreastFeeding;
        this.lastTimeAte = lastTimeAte;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public boolean isBreastFeeding() {
        return isBreastFeeding;
    }

    public void setBreastFeeding(boolean breastFeeding) {
        isBreastFeeding = breastFeeding;
    }

    public LocalDate getLastTimeAte() {
        return lastTimeAte;
    }

    public void setLastTimeAte(LocalDate lastTimeAte) {
        this.lastTimeAte = lastTimeAte;
    }
}
