package pages;

import javax.swing.*;
import java.awt.*;


public class shortcutsPage extends JPanel {
    private JPanel shortcutspanel;
    private JButton btnShortcut1;
    private JButton btnShortcut2;
    private JButton btnShortcut3;

    public shortcutsPage (JFrame parent) {
        setLayout(new BorderLayout());
        add(shortcutspanel);

        JButton btnBack = new JButton("Back");
        add(btnBack, BorderLayout.SOUTH);

        // When "Back" is clicked, navigate back to the previous page
        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack(); // Use CardLayout.previous() to go back
            }
        });
    }


}
