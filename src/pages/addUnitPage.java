package pages;

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

        // Handle dropdown change to update attribute labels dynamically
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
}
