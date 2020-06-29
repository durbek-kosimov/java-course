import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExceptionDemo1 extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;
    private JLabel resultLabel, inputLabel;
    private JButton doubleButton;

    public static void main(String[] args) {
        ExceptionDemo1 frame = new ExceptionDemo1();
        frame.setSize(300, 150);
        frame.creationGUI();
        frame.setVisible(true);
    }

    private void creationGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        inputLabel = new JLabel("Integer: ");
        window.add(inputLabel);

        inputField = new JTextField(10);
        window.add(inputField);
    }
}
