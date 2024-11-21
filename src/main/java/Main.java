import pages.*;
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world");

        Light livingRoomLight = new Light("Living Room Light", 75, "Warm White");
        Vacuum kitchenVacuum = new Vacuum("Kitchen Vacuum", 50);
        SecurityCamera backyardCamera = new SecurityCamera("Backyard camera");
        SmartPlug carCharger = new SmartPlug("Car charger", 80);
        Speaker kitchenSpeaker = new Speaker("Kitchen speakers", 80);
        Thermostat bedroomThermostat = new Thermostat("Bedroom thermostat", 20);

        mainFrame frame = new mainFrame();
        frame.setVisible(true);
    }
}