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

    //velg en enhet
    public Unit getUnitById(int id){
        for (Unit unit : units) {
            if (unit.getId() == id) {
                return unit;
            }
        }
        return null;
    }

    //legge til unit i listen
    public void addUnit(Unit unit) {
        units.add(unit);
        System.out.println("La til enhet: " + unit.getName());
    }

    //fjern enhet
    public void removeUnit(int id) {
        units.removeIf(unit -> unit.getId() == id);
        System.out.println("Slettet enhet: " + id);
    }

    //hvis enheter
    public void displayUnits() {
        if (units.isEmpty()) {
            System.out.println("Ingen enheter tilgjengelig");
        } else {
            System.out.println("Enheter:");
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

