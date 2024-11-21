package pages;
import models.Unit;
import models.UnitManager;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
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
            data[i][3] = String.valueOf(units.get(i).getStatus());
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        unitTable.setModel(model);
        // Set the "Status" column to use checkboxes
        unitTable.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox checkBox = new JCheckBox();
                checkBox.setSelected(value != null && Boolean.parseBoolean(value.toString()));
                return checkBox;
            }
        });

        unitTable.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JCheckBox()));

        unitTable.revalidate();
        unitTable.repaint();
    }
}


