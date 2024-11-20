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

        createButton.addActionListener(e -> {
            createUnit();
        });

        //velger hva som hvises basert på type unit
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
        String selectedType = (String) unitType.getSelectedItem();
        String name = nameField.getText(); // Name is common to all

        if (selectedType.equals("Lys")) {
            int brightness = Integer.parseInt(attributeTextfield1.getText()); // Convert to int
            String color = attributeTextfield2.getText();
            Light light = new Light(name, brightness, color);
        } else if (selectedType.equals("Støvsuger")) {
            int battery = Integer.parseInt(attributeTextfield1.getText());
            Vacuum vacuum = new Vacuum(name, battery);
        } else if (selectedType.equals("Sikkerhets kamera")) {
            SecurityCamera securityCamera = new SecurityCamera(name);
        } else if (selectedType.equals("SmartPlug")) {
            int wattage = Integer.parseInt(attributeTextfield1.getText());
            SmartPlug smartPlug = new SmartPlug(name, wattage);
        } else if (selectedType.equals("Høytaler")) {
            int volume =  Integer.parseInt(attributeTextfield1.getText());
            Speaker speaker = new Speaker(name, volume);
        } else if (selectedType.equals("Thermostat")) {
            int temperature = Integer.parseInt(attributeTextfield1.getText());
            Thermostat thermostat = new Thermostat(name, temperature);
        } else {
            System.out.println("Her har det skjedd noe galt");
        }


        JOptionPane.showMessageDialog(this, "Enhet er lagd og lagt til");

        //nullstiller skjemaet
        nameField.setText("");
        attributeTextfield1.setText("");
        attributeTextfield2.setText("");
        unitType.setSelectedIndex(0);

    }

}

