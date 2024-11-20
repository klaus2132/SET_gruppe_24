package models;

public abstract class Unit {
    private int id;
    private String name;
    private boolean status;

    //konstruktør
    public Unit(int id, String name) {
        this.id = id;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //abstrakte klasser
    public abstract void displayDetails();
}

