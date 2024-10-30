package models;

public class SmartPlug extends Unit{

    private boolean power;
    private int wattage;
    public SmartPlug(int id, String name){
        super(id, name);
        this.power = false;
        this.wattage = wattage;
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
