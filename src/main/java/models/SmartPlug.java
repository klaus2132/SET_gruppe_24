package models;

public class SmartPlug extends Unit{
    private boolean power;
    private int wattage;

    //kontruktør
    public SmartPlug(String name, int wattage){
        super(name);
        this.power = false;
        this.wattage = wattage;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("SmartPlug - ID: " + getId() + ", Name: " + getName() + ", Power: " + (power ? "On" : "Off") + ", Wattage: " + wattage);
    }

    //gettere og settere
    public int getWattage() {
        return wattage;
    }
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean getPower() {
        return power;
    }
}
