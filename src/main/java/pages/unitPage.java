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
    private JButton deleteButton;
    private JButton editButton;
    private JButton addButton;

    public unitPage(JFrame parent){
        setLayout(new BorderLayout());
        unitPanel = new JPanel();
        unitPanel.setLayout(new BorderLayout());

        unitTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(unitTable);
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        tablePanel.add(scrollPane);

        deleteButton = new JButton("Slett enhet");
        editButton = new JButton("Rediger enhet");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);

        unitPanel.add(tablePanel, BorderLayout.CENTER);
        unitPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(unitPanel, BorderLayout.CENTER);


        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });

        //slette knapp
        deleteButton.addActionListener(e -> {deleteSelected();});

        //edit knapp
        editButton.addActionListener(e -> editSelectedUnit());
    }
    public void populateTable() {
        ArrayList<Unit> units = UnitManager.getInstance().getUnits();

        String[][] data = new String[units.size()][4];
        String[] columnNames = {"Id","Type","Enhet navn","Status"};

        for (int i = 0; i < units.size(); i++) {
            data[i][0] = String.valueOf(units.get(i).getId());
            data[i][1] = units.get(i).getType();
            data[i][2] = units.get(i).getName();
            data[i][3] = String.valueOf(units.get(i).getStatus());
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);
        unitTable.revalidate();
        unitTable.repaint();
    }

    private void deleteSelected(){
        int selectedRow = unitTable.getSelectedRow();

        if(selectedRow != -1){
            int unitId = Integer.parseInt((String) unitTable.getValueAt(selectedRow, 0));
            UnitManager.getInstance().removeUnit(unitId);
            populateTable();
        }else {
            JOptionPane.showMessageDialog(this, "Venligst velg en enhet du vil slette");
        }
    }

    private void editSelectedUnit() {
        int selectedRow = unitTable.getSelectedRow();

        if (selectedRow != -1) {
            int unitId = Integer.parseInt((String) unitTable.getValueAt(selectedRow, 0));
            Unit unitToEdit = UnitManager.getInstance().getUnitById(unitId);

            if (unitToEdit != null) {
                JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (parentFrame instanceof mainFrame) {
                    ((mainFrame) parentFrame).showEditUnitPage(unitToEdit);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Venligst velg en enhet du vil redigere");
        }
    }
}
