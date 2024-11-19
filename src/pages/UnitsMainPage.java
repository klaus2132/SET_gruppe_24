package pages;
import models.Unit;
import models.UnitListModel;
import javax.swing.*;

public class UnitsMainPage extends JFrame{

    // Foreløpig kommentert ut for å teste om liste er bedre enn buttons
    private JButton unit1Button;
    private JButton unit2Button;
    private JButton unit4Button;
    private JButton unit3Button;
    private JButton addUnitButton;
    private JPanel rootPanel;
    private JList<Unit> unitListView; // JList som skal vise enhetene
    private JButton addButton;
    private JButton removeButton;

    public UnitsMainPage() {
        // sidens tittel og layout
        setTitle("Units Main Page");
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Koble ArrayList med en UnitListModel
        UnitListModel unitListModel = new UnitListModel(Unit.units);
        unitListView.setModel(unitListModel);

        // Eksempel på knappefunksjonalitet for å legge til enhet
        addButton.addActionListener(e -> {
            // Eksempel på hvordan du kan legge til en enhet
            Unit.addUnit(1, "Enhet 1");
            unitListModel.updateList(Unit.units);  // Oppdaterer JList med nye enheter
        });

        // Eksempel på knappefunksjonalitet for å fjerne enhet (ved ID)
        removeButton.addActionListener(e -> {
            // Her kan du implementere fjerningslogikk for å fjerne en enhet
            if (!unitListView.isSelectionEmpty()) {
                Unit selectedUnit = unitListView.getSelectedValue();
                Unit.removeUnitById(selectedUnit.getId());
                unitListModel.updateList(Unit.units);  // Oppdaterer JList etter fjerning
            } else {
                JOptionPane.showMessageDialog(this, "Ingen enhet valgt for å fjerne.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnitsMainPage().setVisible(true);
        });
    }
}
