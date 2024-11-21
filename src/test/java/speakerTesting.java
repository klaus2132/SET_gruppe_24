import models.Speaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class speakerTesting {
    private Speaker speaker;
    @BeforeEach
    public void setUp() {
        speaker = new Speaker("Test speaker", 75);
    }

    @Test
    @DisplayName("Høytaler konstruktør test")
    public void testConstructor() {
        Assertions.assertNotNull(speaker, "Høytaleren burde være lagd");
        Assertions.assertEquals("Test speaker", speaker.getName(), "Navnet skal matche");
        Assertions.assertEquals(75, speaker.getVolume(), "Volume skal matche");
    }

    @Test
    @DisplayName("getter og setter test")
    public void getterAndSetters(){
        speaker.setVolume(100);

        Assertions.assertEquals(100, speaker.getVolume(), "Volume skal være oppdatert");
    }

    @Test
    @DisplayName("Type test")
    public void testGetType() {
        Assertions.assertEquals("Speaker", speaker.getType(), "Type skal være Speaker");
    }
}
