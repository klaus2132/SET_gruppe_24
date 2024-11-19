package pages;

import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {

    public mainFrame() {
        setTitle("Alian Maid");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new CardLayout()); // Use CardLayout for page switching

        // Create pages
        JPanel login = new login(this);
        JPanel adminMainPage = new adminMainPage(this);
        JPanel userMainPage = new userMainPage(this);
        JPanel unitPage = new unitPage(this);
        JPanel shortcutsPage = new shortcutsPage(this);


        // Add pages to the frame with unique names
        add(login, "Login");
        add(adminMainPage, "Admin Page");
        add(userMainPage, "User Page");
        add(unitPage, "Units");
        add(shortcutsPage, "Shortcuts");

        // Start by showing the main page
        showPage("Login");
    }

    public void showPage(String pageName) {
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), pageName);
    }

}
