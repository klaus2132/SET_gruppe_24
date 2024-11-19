package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminMainPage extends JPanel{
    private JPanel adminPanel;
    private JLabel adminHeading;
    private JButton btnShortcuts;
    private JButton btnUnits;
    private JButton addUnitButton;

    public adminMainPage(JFrame parent){
        setLayout(new BorderLayout());
        add(adminPanel);


        btnUnits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Enheter");
                parent.getContentPane().removeAll();
                parent.getContentPane().add(new unitPage(parent));
                parent.revalidate();
                parent.repaint();
            }
        });

        btnShortcuts.addActionListener(new ActionListener() {
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

