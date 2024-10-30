package models;

public class Light extends Unit {
    private int brightness;
    private String color;

    //konstruktør
    public Light(int id, String name, int brightness, String color) {
        super(id, name);
        this.brightness = brightness;
        this.color = color;
    }

    // Gettere og settere
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
