package models;

public class Speaker extends Unit{
    private int volume;

    //konstruktør
    public Speaker(String name, int volume) {
        super(name);
        this.volume = volume;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("Speaker - ID: " + getId() + ", Name: " + getName() +
                ", Volume: " + volume);
    }
    @Override
    public String getType() {
        return "Speaker";
    }

    //getter og settere
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
