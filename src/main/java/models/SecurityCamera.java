package models;

public class SecurityCamera  extends Unit{
    private boolean recording;

    //konstruktør
    public SecurityCamera(String name) {
        super(name);
        this.recording = false;

        UnitManager.getInstance().addUnit(this);
    }

    @Override
    public void displayDetails() {
        System.out.println("Security Camera - ID: " + getId() + ", Name: " + getName() + " Recording - " + (recording ? "On" : "Off"));
    }

    //gettere og settere
    public boolean getRecording() {
        return recording;
    }
    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    //metoder for start og stop av filming
    public void startRecording(){
        this.recording = true;
    }
    public void stopRecording(){
        this.recording = false;
    }
}
