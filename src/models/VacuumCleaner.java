package models;

public class VacuumCleaner extends Unit{
    int speed;
    int battery;

    // Konstruktør
    public VacuumCleaner(int id, String name, int speed, int battery) {
        super(id, name);
        this.speed = speed;
        this.battery = battery;
    }

    // Gettere og settere

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
