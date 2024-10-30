package models;

public class Thermostat extends Unit{
    private int temperature;

    // Konstruktør
    public Thermostat(int id, String name, int temperature) {
        super(id, name);
        this.temperature = temperature;
    }

    // Getter og setter
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
