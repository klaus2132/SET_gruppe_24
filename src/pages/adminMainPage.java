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

        JButton btnBack = new JButton("Back");
        add(btnBack, BorderLayout.SOUTH);

        // When "Back" is clicked, navigate back to the previous page
        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack(); // Use CardLayout.previous() to go back
            }
        });

        //åpner unit page
        btnUnits.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Unit Page");
            }
            System.out.println("Unit siden åpnet");
        });

        //åpner shortcut siden
        btnShortcuts.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Shortcut Page");
            }
            System.out.println("Shortcut siden åpnet");
        });
    }
}

