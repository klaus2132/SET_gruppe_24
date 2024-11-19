package pages;
import models.*;

import javax.swing.*;

public class UnitsMainPage extends JFrame{

    // Foreløpig kommentert ut for å teste om liste er bedre enn buttons
    private JButton addUnitButton;
    private JButton removeUnitButton;

    public UnitsMainPage() {
        // sidens tittel og layout
        setTitle("Units Main Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        //her burde vi connecte til UnitManager sin array som heter units

        //denne skal sende oss til legge til enhet siden
        addUnitButton.addActionListener(e -> {
            //skriv kode her
        });

        //fjerne enhet (ved ID)
        removeUnitButton.addActionListener(e -> {
            //her sjekker fjerner vi enhet ved hjelp av id, func i UnitManager
        });
    }
}
