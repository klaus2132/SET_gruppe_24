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
        try {
            String name = nameField.getText();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Navn kan ikke være tomt.");
            }
            unitToEdit.setName(name);
            unitToEdit.setStatus(status.isSelected());
            String selectedType = (String) typeComboBox.getSelectedItem();

            if (selectedType.equals("Lys") && unitToEdit instanceof Light) {
                String brightnessText = attribute1.getText();
                String color = attribute2.getText();

                if (brightnessText.isEmpty() || color.isEmpty()) {
                    throw new IllegalArgumentException("Alle felter må fylles ut for Lys.");
                }

                int brightness = Integer.parseInt(brightnessText);
                ((Light) unitToEdit).setBrightness(brightness);
                ((Light) unitToEdit).setColor(color);
            } else if (selectedType.equals("Støvsuger") && unitToEdit instanceof Vacuum) {
                String batteryText = attribute1.getText();

                if (batteryText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felter må fylles ut for Støvsuger.");
                }

                int battery = Integer.parseInt(batteryText);
                ((Vacuum) unitToEdit).setBattery(battery);
            } else if (selectedType.equals("SmartPlug") && unitToEdit instanceof SmartPlug) {
                String wattageText = attribute1.getText();

                if (wattageText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felter må fylles ut for SmartPlug.");
                }

                int wattage = Integer.parseInt(wattageText);
                ((SmartPlug) unitToEdit).setWattage(wattage);
            } else if (selectedType.equals("Høytaler") && unitToEdit instanceof Speaker) {
                String volumeText = attribute1.getText();

                if (volumeText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felter må fylles ut for Høytaler.");
                }

                int volume = Integer.parseInt(volumeText);
                ((Speaker) unitToEdit).setVolume(volume);
            } else if (selectedType.equals("Thermostat") && unitToEdit instanceof Thermostat) {
                String temperatureText = attribute1.getText();

                if (temperatureText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felter må fylles ut for Thermostat.");
                }

                int temperature = Integer.parseInt(temperatureText);
                ((Thermostat) unitToEdit).setTemperature(temperature);
            } else if (selectedType.equals("Sikkerhets kamera") && unitToEdit instanceof SecurityCamera) {

            } else {
                throw new IllegalArgumentException("Ugyldig enhetstype eller enhetstype samsvarer ikke med valgt enhet.");
            }

            JOptionPane.showMessageDialog(this, "Enhet oppdatert:)");

            unitPage.populateTable();
            if (SwingUtilities.getWindowAncestor(this) instanceof mainFrame) {
                ((mainFrame) SwingUtilities.getWindowAncestor(this)).goBack();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Skriv inn gyldige tall i feltene der det kreves.", "Feil", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Feil", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "En uventet feil oppstod: " + e.getMessage(), "Feil", JOptionPane.ERROR_MESSAGE);
        }
    }



}
