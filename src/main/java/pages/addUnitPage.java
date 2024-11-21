package pages;

import models.*;

import javax.swing.*;
import java.awt.*;

public class addUnitPage extends JPanel {
    private JLabel heading;
    private JTextField nameField;
    private JComboBox unitType;
    private JButton createButton;
    private JPanel createPanel;
    private JTextField attributeTextfield1;
    private JLabel attribute1;
    private JTextField attributeTextfield2;
    private JLabel attribute2;
    private JLabel comboBoxLabel;

    public addUnitPage(JFrame parent){
        setLayout(new BorderLayout());
        add(createPanel);

        JButton btnBack = new JButton("Tilbake");
        add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            if (parent instanceof mainFrame) {
                ((mainFrame) parent).goBack();
            }
        });

        createButton.addActionListener(e -> {createUnit();});

        //velger hva som vises basert på type unit
        unitType.addActionListener(e -> {
            String selectedType = (String) unitType.getSelectedItem();
            if (selectedType.equals("Lys")) {
                attribute1.setText("Lysstyrke:");
                attribute2.setText("Farge:");
                attribute1.setVisible(true);
                attribute2.setVisible(true);
                attributeTextfield2.setVisible(true);
                attributeTextfield1.setVisible(true);
            } else if (selectedType.equals("Støvsuger")) {
                attribute1.setText("Batteri:");
                attribute1.setVisible(true);
                attributeTextfield1.setVisible(true);
                attribute2.setVisible(false);
                attributeTextfield2.setVisible(false);
            } else if (selectedType.equals("Sikkerhets kamera")) {
                attribute1.setVisible(false);
                attribute2.setVisible(false);
                attributeTextfield2.setVisible(false);
                attributeTextfield1.setVisible(false);
            } else if (selectedType.equals("SmartPlug")){
                attribute1.setText("Wattage: ");
                attribute1.setVisible(true);
                attributeTextfield1.setVisible(true);
                attribute2.setVisible(false);
                attributeTextfield2.setVisible(false);
            }else if (selectedType.equals("Høytaler")){
                attribute1.setText("Lydstyrke: ");
                attribute1.setVisible(true);
                attributeTextfield1.setVisible(true);
                attribute2.setVisible(false);
                attributeTextfield2.setVisible(false);
            }else if (selectedType.equals("Thermostat")){
                attribute1.setText("Temperatur: ");
                attribute1.setVisible(true);
                attributeTextfield1.setVisible(true);
                attribute2.setVisible(false);
                attributeTextfield2.setVisible(false);
            }
        });
    }
    private void createUnit() {
        try {
            String selectedType = (String) unitType.getSelectedItem();
            String name = nameField.getText();

            if (name.isEmpty()) {
                throw new IllegalArgumentException("Navn kan ikke være tomt.");
            }

            if (selectedType.equals("Lys")) {
                String brightnessText = attributeTextfield1.getText();
                String color = attributeTextfield2.getText();

                if (brightnessText.isEmpty() || color.isEmpty()) {
                    throw new IllegalArgumentException("Alle felt må fylles ut for Lys.");
                }

                int brightness = Integer.parseInt(brightnessText);
                Light light = new Light(name, brightness, color);
            } else if (selectedType.equals("Støvsuger")) {
                String batteryText = attributeTextfield1.getText();

                if (batteryText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felt må fylles ut for Støvsuger.");
                }

                int battery = Integer.parseInt(batteryText);
                Vacuum vacuum = new Vacuum(name, battery);
            } else if (selectedType.equals("Sikkerhets kamera")) {
                SecurityCamera securityCamera = new SecurityCamera(name);
            } else if (selectedType.equals("SmartPlug")) {
                String wattageText = attributeTextfield1.getText();

                if (wattageText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felt må fylles ut for SmartPlug.");
                }

                int wattage = Integer.parseInt(wattageText);
                SmartPlug smartPlug = new SmartPlug(name, wattage);
            } else if (selectedType.equals("Høytaler")) {
                String volumeText = attributeTextfield1.getText();

                if (volumeText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felt må fylles ut for Høytaler.");
                }

                int volume = Integer.parseInt(volumeText);
                Speaker speaker = new Speaker(name, volume);
            } else if (selectedType.equals("Thermostat")) {
                String temperatureText = attributeTextfield1.getText();

                if (temperatureText.isEmpty()) {
                    throw new IllegalArgumentException("Alle felt må fylles ut for Thermostat.");
                }

                int temperature = Integer.parseInt(temperatureText);
                Thermostat thermostat = new Thermostat(name, temperature);
            } else {
                throw new IllegalArgumentException("Ugyldig enhetstype valgt.");
            }

            JOptionPane.showMessageDialog(this, "Enhet er lagd og lagt til");

            //nullstiller skjemaet
            nameField.setText("");
            attributeTextfield1.setText("");
            attributeTextfield2.setText("");
            unitType.setSelectedIndex(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Skriv inn gyldige tall i feltene der det kreves.", "Feil", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Feil", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "En uventet feil oppstod: " + e.getMessage(), "Feil", JOptionPane.ERROR_MESSAGE);
        }
    }


}

