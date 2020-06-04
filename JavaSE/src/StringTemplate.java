import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StringTemplate extends JFrame implements ActionListener {
    private JTextField string1Field, getString2Field, resultField;
    private JLabel string1Label, string2Label, resultLabel;
    private JButton goButton;

    public static void main(String[] args) {
        StringTemplate frame = new StringTemplate();
        frame.setSize(250, 250);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        string1Label = new JLabel("Type string1: ");
        window.add(string1Label);

        string1Field = new JTextField(20);
        window.add(string1Field);

        string2Label = new JLabel("Type string2: ");
        window.add(string2Label);
    }
}
