package pages;

import javax.swing.*;
import java.awt.*;

public class userMainPage extends JDialog{
    private JPanel userPanel;
    private JLabel userHeading;

    public userMainPage(JFrame parent) {
        super(parent);
        setTitle("User Home");
        setContentPane(userPanel);
        setMinimumSize(new Dimension(800, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.printf("Hello world");

        userMainPage frame = new userMainPage(null);
    }

}

