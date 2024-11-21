package models;

public class SmartPlug extends Unit{
    private boolean power;
    private int wattage;

    //kontruktør
    public SmartPlug(String name, int wattage){
        super(name);
        this.wattage = wattage;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("SmartPlug - ID: " + getId() + ", Name: " + getName() + ", Wattage: " + getWattage());
    }

    @Override
    public String getType() {
        return "SmartPlug";
    }

    //gettere og settere
    public int getWattage() {
        return wattage;
    }
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
