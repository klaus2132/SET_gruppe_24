package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JDialog{

    private JButton btnUser;
    private JPanel loginpanel;
    private JButton btnAdmin;

    public login(JFrame parent){
        super(parent);
        setTitle("Login");
        setContentPane(loginpanel);
        setMinimumSize(new Dimension(800,500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        //hva som skjer når vi trykker på knapper, hvor de sender oss feks.
        btnUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Velkommen til user siden\n");
                new userMainPage(parent);
            }
        });

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Velkommen til admin side\n");
                new adminMainPage(parent);
            }
        });
        setVisible(true);
    }
}
