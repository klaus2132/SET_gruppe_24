package models;

public class Light extends Unit {

    private int brightness;
    private String color;

    public Light(String name, int brightness, String color) {
        super(name);
        this.brightness = brightness;
        this.color = color;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("Light - ID: " + getId() + ", Name: " + getName() +
                ", Brightness: " + brightness + ", Color: " + color);
    }

    //gettere og settere
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

