package classes;

import interfaces.Flyable;

import java.time.LocalDate;

public class Bat extends Mamifero implements Flyable {

    private double wingsSize;

    public Bat(int bpm, boolean isBreastFeeding, LocalDate lastTimeAte, double wingsSize) {
        super(bpm, isBreastFeeding, lastTimeAte);
        this.wingsSize = wingsSize;
    }

    public double getWingsSize() {
        return wingsSize;
    }

    public void setWingsSize(double wingsSize) {
        this.wingsSize = wingsSize;
    }

    @Override
    void eat() {

    }

    @Override
    void breath() {

    }

    @Override
    void drink() {

    }

    @Override
    public void goUp() {

    }

    @Override
    public void goDown() {

    }
}
