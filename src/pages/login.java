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

        btnUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Velkommen til user siden\n");
                parent.getContentPane().removeAll();
                parent.getContentPane().add(new userMainPage(parent));
                parent.revalidate();
                parent.repaint();
            }
        });

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Velkommen til admin siden\n");
                parent.getContentPane().removeAll();
                parent.getContentPane().add(new adminMainPage(parent));
                parent.revalidate();
                parent.repaint();
            }
        });
    }
}

