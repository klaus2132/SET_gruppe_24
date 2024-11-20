package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JPanel {
    private JButton btnUser;
    private JButton btnAdmin;
    private JPanel loginpanel;

    public login(JFrame parent) {
        setLayout(new BorderLayout());
        add(loginpanel);


        btnUser.addActionListener(e -> {
            if(parent instanceof mainFrame){
                ((mainFrame) parent).showPage("User Page");
            }
            System.out.println("User siden åpnet");
        });


        btnAdmin.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).showPage("Admin Page");
            }
            System.out.println("Admin siden åpnet");
        });
    }
}

