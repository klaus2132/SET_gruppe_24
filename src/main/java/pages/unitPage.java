package pages;
import models.Unit;
import models.UnitManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class unitPage extends JPanel{
    private JTable unitTable;
    private JPanel unitPanel;

    public unitPage(JFrame parent){
        setLayout(new BorderLayout());
        add(unitPanel);


        unitTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(unitTable);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(scrollPane);


        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });

        add(panel);
    }
    public void populateTable() {

        ArrayList<Unit> units = UnitManager.getInstance().getUnits();
        System.out.println("UnitManager instance: " + UnitManager.getInstance());  // Check if UnitManager is initialized
        if (units != null) {
            System.out.println("Units in UnitManager: " + units.size()); // Check if units are in the list
        } else {
            System.out.println("Units list is null");
        }

        String[][] data = new String[units.size()][1];
        String[] columnNames = {"Enhet navn"};

        for (int i = 0; i < units.size(); i++) {
            data[i][0] = units.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);

        unitTable.revalidate();   // Revalidate to ensure the table layout is updated
        unitTable.repaint();
    }
}
