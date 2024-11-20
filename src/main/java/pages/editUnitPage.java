package pages;

import models.*;

import javax.swing.*;
import java.awt.*;

public class editUnitPage extends JPanel{
    private unitPage unitPage;
    private JLabel heading;
    private JTextField nameField;
    private JTextField attribute2;
    private JTextField attribute1;
    private JCheckBox status;
    private JPanel editPanel;
    private JButton saveButton;
    private JComboBox typeComboBox;
    private Unit unitToEdit;

    public editUnitPage(JFrame parent, Unit unit, unitPage unitPage){
        this.unitToEdit = unit;
        this.unitPage = unitPage;
        setLayout(new BorderLayout());
        add(editPanel);

        preFillFields();

        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });
        //her legges til save knappen
        saveButton.addActionListener(e -> {saveUnitChanges();});

    }

    private void preFillFields() {
        nameField.setText(unitToEdit.getName());
        status.setSelected(unitToEdit.getStatus());

        if (unitToEdit instanceof Light) {
            typeComboBox.setSelectedItem("Lys");
            typeComboBox.setVisible(false);
            attribute1.setText(String.valueOf(((Light) unitToEdit).getBrightness()));
            attribute2.setText(((Light) unitToEdit).getColor());
        } else if (unitToEdit instanceof Vacuum) {
            typeComboBox.setSelectedItem("Støvsuger");
            typeComboBox.setVisible(false);
            attribute1.setText(String.valueOf(((Vacuum) unitToEdit).getBattery()));
            attribute2.setVisible(false);
        } else if (unitToEdit instanceof SecurityCamera) {
            typeComboBox.setSelectedItem("Sikkerhets kamera");
            typeComboBox.setVisible(false);
            attribute1.setVisible(false);
            attribute2.setVisible(false);
        } else if (unitToEdit instanceof SmartPlug) {
            typeComboBox.setSelectedItem("SmartPlug");
            typeComboBox.setVisible(false);
            attribute1.setText(String.valueOf(((SmartPlug) unitToEdit).getWattage()));
            attribute2.setVisible(false);
        } else if (unitToEdit instanceof Speaker) {
            typeComboBox.setSelectedItem("Høytaler");
            typeComboBox.setVisible(false);
            attribute1.setText(String.valueOf(((Speaker) unitToEdit).getVolume()));
            attribute2.setVisible(false);
        } else if (unitToEdit instanceof Thermostat) {
            typeComboBox.setSelectedItem("Thermostat");
            typeComboBox.setVisible(false);
            attribute1.setText(String.valueOf(((Thermostat) unitToEdit).getTemperature()));
            attribute2.setVisible(false);
        }
    }

    private void saveUnitChanges() {
        unitToEdit.setName(nameField.getText());
        unitToEdit.setStatus(status.isSelected());

        String selectedType = (String) typeComboBox.getSelectedItem();
        if (selectedType.equals("Lys") && unitToEdit instanceof Light) {
            ((Light) unitToEdit).setBrightness(Integer.parseInt(attribute1.getText()));
            ((Light) unitToEdit).setColor(attribute2.getText());
        } else if (selectedType.equals("Støvsuger") && unitToEdit instanceof Vacuum) {
            ((Vacuum) unitToEdit).setBattery(Integer.parseInt(attribute1.getText()));
        } else if (selectedType.equals("SmartPlug") && unitToEdit instanceof SmartPlug) {
            ((SmartPlug) unitToEdit).setWattage(Integer.parseInt(attribute1.getText()));
        } else if (selectedType.equals("Høytaler") && unitToEdit instanceof Speaker) {
            ((Speaker) unitToEdit).setVolume(Integer.parseInt(attribute1.getText()));
        } else if (selectedType.equals("Thermostat") && unitToEdit instanceof Thermostat) {
            ((Thermostat) unitToEdit).setTemperature(Integer.parseInt(attribute1.getText()));
        }

        JOptionPane.showMessageDialog(this, "Enhet oppdatert:)");
        unitPage.populateTable();
        if (SwingUtilities.getWindowAncestor(this) instanceof mainFrame) {
            ((mainFrame) SwingUtilities.getWindowAncestor(this)).goBack();
        }
    }


}
