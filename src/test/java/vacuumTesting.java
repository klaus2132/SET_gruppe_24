import models.Vacuum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class vacuumTesting {

    private Vacuum vacuum;
    @BeforeEach
    public void setUp() {
        vacuum = new Vacuum("Test Vacuum", 75);
    }

    @Test
    @DisplayName("Vacuum konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(vacuum, "Vacuum burde være lagd");
        Assertions.assertEquals("Test Vacuum", vacuum.getName(), "Navnet skal matche");
        Assertions.assertEquals(75, vacuum.getBattery(), "Battery skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        vacuum.setBattery(100);

        Assertions.assertEquals(100, vacuum.getBattery(), "Battery skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("Støvsuger", vacuum.getType(), "Type skal være Støvsuger");
    }
}

