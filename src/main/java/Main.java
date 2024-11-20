import pages.*;
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world");

        //her er en liten simulation av hvordan det fungerer
        UnitManager unitManager = UnitManager.getInstance();

        Light livingRoomLight = new Light(1, "Living Room Light", 75, "Warm White");
        Vacuum kitchenVacuum = new Vacuum(2, "Kitchen Vacuum", 50);
        SecurityCamera backyardCamera = new SecurityCamera(3, "Backyard camera");
        SmartPlug carCharger = new SmartPlug(4, "Car charger");
        Speaker kitchenSpeaker = new Speaker(5, "Kitchen speakers", 80);
        Thermostat bedroomThermostat = new Thermostat(6, "Bedroom thermostat", 20);

        mainFrame frame = new mainFrame();
        frame.setVisible(true);
    }
}