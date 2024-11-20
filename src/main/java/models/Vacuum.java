package models;

public class Vacuum extends Unit {

    private int battery;

    public Vacuum(String name, int battery) {
        super(name);
        this.battery = battery;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("Vacuum - ID: " + getId() + ", Name: " + getName() +
                ", Battery: " + battery + "%");
    }

    //gettere and settere
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}

