import javax.swing.*;
import java.awt.event.ActionListener;

public class StringTemplate extends JFrame implements ActionListener {
    private JTextField string1Field, getString2Field, resultField;
    private JLabel string1Label, getString2Label, resultLabel;
    private JButton goButton;

    public static void main(String[] args) {
        StringTemplate frame = new StringTemplate();
        frame.setSize(250, 250);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {}
}
