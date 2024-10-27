package models;
import java.util.ArrayList;


public class Home {
    private ArrayList<Room> rooms;
    private ArrayList<Unit> units;

    //konstruktør
    public Home() {
        this.rooms = new ArrayList<>();
        this.units = new ArrayList<>();
    }

    //gettere og settere
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

}
