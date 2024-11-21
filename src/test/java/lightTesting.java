import models.Light;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class lightTesting {
    private Light light;
    @BeforeEach
    public void setUp() {
        light = new Light("Test lys", 75, "Rød");
    }

    @Test
    @DisplayName("Light konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(light, "Lyset burde være lagd");
        Assertions.assertEquals("Test lys", light.getName(), "Navnet skal matche");
        Assertions.assertEquals(75, light.getBrightness(), "Brightness skal matche");
        Assertions.assertEquals("Rød", light.getColor(), "Farge skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        light.setBrightness(100);
        light.setColor("Gul");

        Assertions.assertEquals(100, light.getBrightness(), "Brightness skal være oppdatert");
        Assertions.assertEquals("Gul", light.getColor(), "Farge skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("Lys", light.getType(), "Type skal være lys");
    }
}
