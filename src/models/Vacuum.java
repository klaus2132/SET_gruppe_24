package models;

public class Vacuum extends Unit {

    private int battery;

    public Vacuum(int id, String name, int battery) {
        super(id, name);
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

