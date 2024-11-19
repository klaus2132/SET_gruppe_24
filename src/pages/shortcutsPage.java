package pages;

import javax.swing.*;
import java.awt.*;

public class shortcutsPage extends JDialog {
    private JPanel shortcutspanel;
    private JButton btnShortcut1;
    private JButton btnShortcut2;
    private JButton btnShortcut3;

    public shortcutsPage (JFrame parent) {
        super(parent);
        setTitle("Snarveier");
        setContentPane(shortcutspanel);
        setMinimumSize(new Dimension(800, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hællæ snarvei");

        shortcutsPage frame = new shortcutsPage(null);
    }


}
