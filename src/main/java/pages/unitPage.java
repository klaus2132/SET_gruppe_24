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

        String[][] data = new String[units.size()][2];
        String[] columnNames = {"Type","Enhet navn"};

        for (int i = 0; i < units.size(); i++) {
            data[i][0] = units.get(i).getType();
            data[i][1] = units.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);

        unitTable.revalidate();   // Revalidate to ensure the table layout is updated
        unitTable.repaint();
    }
}
