package models;

public abstract class Unit {
    private static int nextId = 1;
    private int id;
    private String name;
    private boolean status;

    //konstruktør
    public Unit(String name) {
        this.id = nextId++;
        this.name = name;
        this.status = false;
    }

    //gettere og settere
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //abstrakte klasser
    public abstract void displayDetails();
    public abstract String getType();
}

