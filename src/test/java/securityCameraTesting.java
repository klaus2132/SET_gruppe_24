import models.Light;
import models.SecurityCamera;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class securityCameraTesting {

    private SecurityCamera securityCamera;
    @BeforeEach
    public void setUp() {
        securityCamera = new SecurityCamera("Test Sikkerhets kamera");
    }

    @Test
    @DisplayName("Light konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(securityCamera, "Sikkerhets kamera burde være lagd");
        Assertions.assertEquals("Test Sikkerhets kamera", securityCamera.getName(), "Navnet skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        securityCamera.setRecording(true);

        Assertions.assertEquals(true, securityCamera.getRecording(), "Recording skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("Sikkerhets kamera", securityCamera.getType(), "Type skal være Sikkerhets kamera");
    }

}
