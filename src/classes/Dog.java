package classes;

import java.time.LocalDate;

public class Dog extends Mamifero{

    private String name;
    private int barkingLoudness;

    public Dog(int bpm, boolean isBreastFeeding, LocalDate lastTimeAte, String name, int barkingLoudness) {
        super(bpm, isBreastFeeding, lastTimeAte);
        this.name = name;
        this.barkingLoudness = barkingLoudness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarkingLoudness() {
        return barkingLoudness;
    }

    public void setBarkingLoudness(int barkingLoudness) {
        this.barkingLoudness = barkingLoudness;
    }

    @Override
    void eat() {
        System.out.println("Goes to the kitchen");
    }

    @Override
    void breath() {
        System.out.println("Breaths in and breaths out");


    }

    @Override
    void drink() {
        System.out.println("Goes to the kitchen");

    }
}
