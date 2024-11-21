import org.junit.jupiter.api.BeforeEach;
import models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class unitTesting {

    private UnitManager unitManager;
    @BeforeEach
    public void setUp(){
        unitManager = UnitManager.getInstance();
        unitManager.getUnits().clear();
    }

    @Test
    public void testSingletonInstance() {
        UnitManager firstInstance = UnitManager.getInstance();
        UnitManager secondInstance = UnitManager.getInstance();

        assertSame(firstInstance, secondInstance, "UnitManager skal være en singleton");
    }

    //add tester
    @Test
    @DisplayName("Lys er lagt til")
    public void addLight() {
        Light light = new Light("Lys", 10, "Farge 1");

        assertTrue(unitManager.getUnits().contains(light), "Units arrayen burde inneholde light uniten");
    }

    @Test
    @DisplayName("Sikkerhets kamera er lagt til")
    public void addSecurityCamera() {
        SecurityCamera securityCamera = new SecurityCamera("Sikkerhets kamera");

        assertTrue(unitManager.getUnits().contains(securityCamera), "Units arrayen burde inneholde sikkerhets kamera uniten");
    }

    @Test
    @DisplayName("SmartPlug er lagt til")
    public void addSmartPlug() {
        SmartPlug smartPlug = new SmartPlug("SmartPlug", 50);

        assertTrue(unitManager.getUnits().contains(smartPlug), "Units arrayen burde inneholde smartPlug uniten");
    }

    @Test
    @DisplayName("Høytaler er lagt til")
    public void addSpeaker() {
        Speaker speaker = new Speaker("Høytaler", 50);

        assertTrue(unitManager.getUnits().contains(speaker), "Units arrayen burde inneholde høytaler uniten");
    }

    @Test
    @DisplayName("Thermostat er lagt til")
    public void addThermostat() {
        Thermostat thermostat = new Thermostat("Thermostat", 20);

        assertTrue(unitManager.getUnits().contains(thermostat), "Units arrayen burde inneholde thermostat uniten");
    }

    @Test
    @DisplayName("Støvsuger er lagt til")
    public void addStøvsuger() {
        Vacuum vacuum = new Vacuum("Støvsuger", 20);

        assertTrue(unitManager.getUnits().contains(vacuum), "Units arrayen burde inneholde støvsuger uniten");
    }

    //remove tester
    @Test
    @DisplayName("Lys er fjernet")
    public void removedLight() {
        Light light = new Light("Lys", 10, "Farge 1");

        unitManager.removeUnit(light);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(light.getId()), "Sikkerhets kamera burde være null");
    }

    @Test
    @DisplayName("Sikkerhets kamera er fjernet")
    public void removedSecurityCamera() {
        SecurityCamera securityCamera = new SecurityCamera("Sikkerhets kamera");

        unitManager.removeUnit(securityCamera);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(securityCamera.getId()), "Sikkerhets kamera burde være null");
    }

    @Test
    @DisplayName("SmartPlug er fjernet")
    public void removedSmartPlug() {
        SmartPlug smartPlug = new SmartPlug("SmartPlug", 50);

        unitManager.removeUnit(smartPlug);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(smartPlug.getId()), "SmartPlugen burde være null");
    }

    @Test
    @DisplayName("Høytaler er fjernet")
    public void removedSpeaker() {
        Speaker speaker = new Speaker("Høytaler", 50);

        unitManager.removeUnit(speaker);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(speaker.getId()), "Høytaleren burde være null");
    }

    @Test
    @DisplayName("Thermostat er fjernet")
    public void removedThermostat() {
        Thermostat thermostat = new Thermostat("Thermostat", 20);

        unitManager.removeUnit(thermostat);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(thermostat.getId()), "Thermostat burde være null");
    }
    @Test
    @DisplayName("Støvsuger er fjernet")
    public void removedVacuum() {
        Vacuum vacuum = new Vacuum("Støvsuger", 20);

        unitManager.removeUnit(vacuum);

        assertEquals(0, unitManager.getUnits().size(), "UnitManager burde være tom nå");
        assertNull(unitManager.getUnitById(vacuum.getId()), "Støvsuger burde være null");
    }
}
