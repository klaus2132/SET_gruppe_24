package pages;

import javax.swing.*;
import java.awt.*;

public class adminMainPage extends JDialog{
    private JPanel adminPanel;
    private JLabel adminHeading;

    public adminMainPage(JFrame parent){
        super(parent);
        setTitle("Admin Home");
        setContentPane(adminPanel);
        setMinimumSize(new Dimension(800, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.printf("Hello world");

        adminMainPage frame = new adminMainPage(null);
    }
}
