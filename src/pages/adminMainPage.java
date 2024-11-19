package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminMainPage extends JDialog{
    private JPanel adminPanel;
    private JLabel adminHeading;
    private JButton btnShortcuts;
    private JButton btnUnits;
    private JButton addUnitButton;

    public adminMainPage(JFrame parent){
        super(parent);
        setTitle("Admin Home");
        setContentPane(adminPanel);
        setMinimumSize(new Dimension(800, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnUnits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Enheter");

            }
        });

        btnShortcuts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Åpner Snarveier");
                new shortcutsPage(parent);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.printf("Hello world");

        adminMainPage frame = new adminMainPage(null);
    }

}

