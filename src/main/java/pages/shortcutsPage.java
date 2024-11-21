package pages;

import javax.swing.*;
import java.awt.*;


public class shortcutsPage extends JPanel {
    private JPanel shortcutspanel;
    private JButton btnShortcut1;
    private JButton btnShortcut2;
    private JButton btnShortcut3;
    private JButton ecoModeButton;
    private JButton createSnarvei;

    public shortcutsPage (JFrame parent) {
        setLayout(new BorderLayout());
        add(shortcutspanel);

        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });
    }


}
