package models;

public class SecurityCamera  extends Unit{
    private boolean recording;
    public SecurityCamera(int id, String name) {
        super(id, name);
        this.recording = false;
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
