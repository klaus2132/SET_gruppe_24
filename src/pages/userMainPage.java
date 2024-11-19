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

        //åpner unit page
        enheterButton.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Unit Page");
            }
            System.out.println("Unit siden åpnet");
        });

        //åpner shortcut siden
        snarveiButton.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Shortcut Page");
            }
            System.out.println("Shortcut siden åpnet");
        });
    }
}

