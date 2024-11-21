package pages;
import models.Unit;
import models.UnitManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class userUnitPage extends JPanel{
    private JTable unitTable;
    private JPanel userUnitPanel;

    public userUnitPage(JFrame parent){
        setLayout(new BorderLayout());
        userUnitPanel = new JPanel();
        userUnitPanel.setLayout(new BorderLayout());

        unitTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(unitTable);
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        tablePanel.add(scrollPane);

        userUnitPanel.add(tablePanel, BorderLayout.CENTER);
        add(userUnitPanel, BorderLayout.CENTER);


        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });
    }
    public void populateTable() {
        ArrayList<Unit> units = UnitManager.getInstance().getUnits();

        String[][] data = new String[units.size()][4];
        String[] columnNames = {"Id","Type","Enhet navn","Status"};

        for (int i = 0; i < units.size(); i++) {
            data[i][0] = String.valueOf(units.get(i).getId());
            data[i][1] = units.get(i).getType();
            data[i][2] = units.get(i).getName();
            data[i][3] = units.get(i).getStatus() ? "På" : "Av";
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);
        unitTable.revalidate();
        unitTable.repaint();
    }
}


