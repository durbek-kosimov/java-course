import javax.swing.*;
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

    }
}
