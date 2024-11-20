package models;

import java.util.ArrayList;

public class UnitManager {
    private static UnitManager instance = null;
    private ArrayList<Unit> units = new ArrayList<>();

    //konstruktør
    private UnitManager() {}

    //sørger for at det bare kan være en unitmanager
    public static UnitManager getInstance() {
        if (instance == null) {
            instance = new UnitManager();
        }
        return instance;
    }

    //legge til unit i listen
    public void addUnit(Unit unit) {
        units.add(unit);
        System.out.println("Added Unit: " + unit.getName());
    }

    //fjern enhet
    public void removeUnit(int id) {
        units.removeIf(unit -> unit.getId() == id);
        System.out.println("Removed Unit : " + id);
    }

    //hvis enheter
    public void displayUnits() {
        if (units.isEmpty()) {
            System.out.println("No units available.");
        } else {
            System.out.println("Units:");
            for (Unit unit : units) {
                unit.displayDetails();
            }
        }
    }

    //get enheter
    public ArrayList<Unit> getUnits() {
        return units;
    }
}

