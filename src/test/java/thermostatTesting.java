import models.Thermostat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class thermostatTesting {
    private Thermostat thermostat;
    @BeforeEach
    public void setUp() {
        thermostat = new Thermostat("Test Thermostat", 20);
    }

    @Test
    @DisplayName("Thermostat konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(thermostat, "Thermostatet burde være lagd");
        Assertions.assertEquals("Test Thermostat", thermostat.getName(), "Navnet skal matche");
        Assertions.assertEquals(20, thermostat.getTemperature(), "Tempraturen skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        thermostat.setTemperature(10);

        Assertions.assertEquals(10, thermostat.getTemperature(), "Tempratur skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("Thermostat", thermostat.getType(), "Type skal være Thermostat");
    }

}
