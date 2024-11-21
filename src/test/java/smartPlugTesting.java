import models.SmartPlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class smartPlugTesting {
    private SmartPlug smartPlug;
    @BeforeEach
    public void setUp() {
        smartPlug = new SmartPlug("Test SmartPlug", 75);
    }

    @Test
    @DisplayName("SmartPlug konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(smartPlug, "SmartPluggen burde være lagd");
        Assertions.assertEquals("Test SmartPlug", smartPlug.getName(), "Navnet skal matche");
        Assertions.assertEquals(75, smartPlug.getWattage(), "Wattage skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        smartPlug.setWattage(100);

        Assertions.assertEquals(100, smartPlug.getWattage(), "Wattage skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("SmartPlug", smartPlug.getType(), "Type skal være SmartPlug");
    }

}
