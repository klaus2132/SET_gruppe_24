package models;

import java.util.ArrayList;

public abstract class Unit {

    private int id;
    private String name;
    private boolean status;
    private static ArrayList<Unit> units = new ArrayList<>();

    public Unit(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = false;
    }

    // Gettere og settere
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Legg til en ny enhet
    public static void addUnit(int id, String name) {
        Unit newUnit = new Unit(id, name) {};
        units.add(newUnit);
        System.out.println("Enhet lagt til: ID = " + id + ", Navn = " + name);
    }

    // Fjern en enhet etter ID
    public static void removeUnitById(int id) {
        units.removeIf(unit -> unit.getId() == id);
        System.out.println("Enhet med ID = " + id + " fjernet.");
    }

    // Vis alle enheter
    public static void displayUnits() {
        if (units.isEmpty()) {
            System.out.println("Ingen enheter tilgjengelig.");
        } else {
            System.out.println("Enheter:");
            for (Unit unit : units) {
                System.out.println("ID = " + unit.getId() + ", Navn = " + unit.getName());
            }
        }
    }
}
