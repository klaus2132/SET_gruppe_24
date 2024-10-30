package models;

public class Speaker extends Unit{
    private int volume;

    // Konstruktør
    public Speaker(int id, String name, int volume) {
        super(id, name);
        this.volume = volume;
    }

    // Getter og setter
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
