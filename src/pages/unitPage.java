package pages;
import models.Unit;
import models.UnitManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class unitPage extends JFrame{
    private JTable unitTable;

    public unitPage(){
        setTitle("Enheter");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        unitTable = new JTable();

        JScrollPane scrollPane = new JScrollPane(unitTable);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(scrollPane);


        add(panel);

        populateTable();
    }
    private void populateTable() {

        ArrayList<Unit> units = UnitManager.getInstance().getUnits();

        String[][] data = new String[units.size()][1];
        String[] columnNames = {"Enhet navn"};

        for (int i = 0; i < units.size(); i++) {
            data[i][0] = units.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);
    }

    public static void main(String[] args) {
        // Adding sample units for testing
        new models.Light(1, "Living Room Light", 75, "Warm White");
        new models.Vacuum(2, "Kitchen Vacuum", 50);

        // Directly create and display the unit page
        unitPage page = new unitPage();
        page.setVisible(true);  // Show the window
    }

}
