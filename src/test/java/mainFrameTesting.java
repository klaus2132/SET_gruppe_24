import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.*;

public class mainFrameTesting {
        private mainFrame frame;
        @BeforeEach
        public void setUp() {
            //i vår main frame vises login først, derfor vil størrelsen på listen være en mer nedover testene
            frame = new mainFrame();
        }

        @Test
        public void testShowPageAddsToHistory() {
            frame.showPage("Test Page");
            Stack<String> history = getHistory(frame);

            assertEquals(2, history.size());
            assertEquals("Test Page", history.peek());
        }

        @Test
        public void testShowPageDoesNotDuplicateHistory() {
            frame.showPage("Test Page");
            frame.showPage("Test Page");

            Stack<String> history = getHistory(frame);
            assertEquals(2, history.size());
            assertEquals("Test Page", history.peek());
        }

        @Test
        public void testShowPageNavigatesCorrectly() {
            frame.showPage("Test Page");
            frame.showPage("Test Page 2");

            Stack<String> history = getHistory(frame);
            assertEquals(3, history.size());
            assertEquals("Test Page 2", history.peek());
        }

        @Test
        public void testGoBackReducesHistory() {
            frame.showPage("Test Page");
            frame.showPage("Test Page 2");

            frame.goBack();
            Stack<String> history = getHistory(frame);

            assertEquals(2, history.size());
            assertEquals("Test Page", history.peek());
        }

        @Test
        public void testGoBackToEmptyHistory() {
            frame.showPage("Test Page");
            frame.goBack();
            frame.goBack();
            frame.goBack();

            Stack<String> history = getHistory(frame);
            assertTrue(history.isEmpty());
        }

        @Test
        public void testGoBackDoesNothingWhenHistoryEmpty() {
            frame.goBack();
            Stack<String> history = getHistory(frame);

            assertTrue(history.isEmpty());
        }

        //metode for å hente side historikken
        private Stack<String> getHistory(mainFrame frame) {
            try {
                java.lang.reflect.Field historyField = mainFrame.class.getDeclaredField("pageHistory");
                historyField.setAccessible(true);
                return (Stack<String>) historyField.get(frame);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException("Unable to access pageHistory", e);
            }
        }
    }



