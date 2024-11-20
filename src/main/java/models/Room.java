package models;
import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Unit> units;

    //konstruktør
    public Room(String name){
        this.name = name;
        this.units = new ArrayList<>();
    }

    //Gettere og settere
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }
}
