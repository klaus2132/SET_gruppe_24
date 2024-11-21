package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userMainPage extends JPanel{
    private JPanel userPanel;
    private JLabel userHeading;
    private JButton enheterButton;
    private JButton snarveiButton;

    public userMainPage(JFrame parent) {
        setLayout(new BorderLayout());
        add(userPanel);

        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });

        //åpner unit page
        enheterButton.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("User Unit Page");
            }
        });

        //åpner shortcut siden
        snarveiButton.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Shortcut Page");
            }
        });
    }
}

