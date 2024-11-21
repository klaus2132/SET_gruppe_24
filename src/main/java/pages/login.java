package pages;
import javax.swing.*;
import java.awt.*;

public class login extends JPanel {
    private JButton btnUser;
    private JButton btnAdmin;
    private JPanel loginpanel;

    public login(JFrame parent) {
        setLayout(new BorderLayout());
        add(loginpanel);

        //admin siden
        btnUser.addActionListener(e -> {navigateToUserPage(parent);});

        //user siden
        btnAdmin.addActionListener(e -> {navigateToAdminPage(parent);});
    }


    public void navigateToAdminPage(JFrame parent){
        if(parent instanceof mainFrame){
            ((mainFrame) parent).showPage("Admin Page");
        }
    }
    public void navigateToUserPage(JFrame parent){
        if(parent instanceof mainFrame){
            ((mainFrame) parent).showPage("User Page");
        }
    }
}

