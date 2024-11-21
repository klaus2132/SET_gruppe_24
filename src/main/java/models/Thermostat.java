package models;

public class Thermostat extends Unit{
    private int temperature;

    //konstruktør
    public Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("Light - ID: " + getId() + ", Name: " + getName() + ", Temperature: " + temperature);
    }

    @Override
    public String getType() {
        return "Thermostat";
    }

    //gettere og settere
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
