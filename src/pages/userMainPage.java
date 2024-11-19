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

        enheterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Enheter");
                parent.getContentPane().removeAll();
                parent.getContentPane().add(new unitPage(parent));
                parent.revalidate();
                parent.repaint();
            }
        });
        snarveiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Snarveier");
                parent.getContentPane().removeAll();
                parent.getContentPane().add(new shortcutsPage(parent));
                parent.revalidate();
                parent.repaint();
            }
        });
    }
}

