package models;

public abstract class Unit {

    private int id;
    private String name;
    private boolean status;

    public Unit(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = false;
    }

    //Gettere og settere
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

}
