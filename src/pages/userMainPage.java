package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userMainPage extends JDialog{
    private JPanel userPanel;
    private JLabel userHeading;
    private JButton enheterButton;
    private JButton snarveiButton;

    public userMainPage(JFrame parent) {
        super(parent);
        setTitle("User Home");
        setContentPane(userPanel);
        setMinimumSize(new Dimension(800, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        enheterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Enheter");
            }
        });
        snarveiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Snarveier");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.printf("Hello world");

        userMainPage frame = new userMainPage(null);
    }


}

