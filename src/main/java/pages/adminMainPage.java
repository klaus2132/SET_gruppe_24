package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminMainPage extends JPanel{
    private JPanel adminPanel;
    private JLabel adminHeading;
    private JButton btnShortcuts;
    private JButton btnUnits;
    private JButton addUnitButton;

    public adminMainPage(JFrame parent){
        setLayout(new BorderLayout());
        add(adminPanel);

        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });

        //åpner unit page
        btnUnits.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Unit Page");
            }
        });

        addUnitButton.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Add Unit Page");
            }
        });

        //åpner shortcut siden
        btnShortcuts.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Shortcut Page");
            }
        });
    }
}

