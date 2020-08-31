import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PositiveFrame extends JFrame implements FocusListener {
    JTextField[] value = new JTextField[3];

    public PositiveFrame() {
        super("Enter Numbers");
        setSize(300, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        for (int i = 0; i < 3; i ++) {
            value[i] = new JTextField("0", 5);
            value[i].addFocusListener(this);
            add(value[i]);
        }
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        PositiveFrame.setLookAndFeel();
        JFrame frame = new PositiveFrame();
    }

    public void focusGained(FocusEvent event) {
        checkValue(event.getSource());
    }

    public void focusLost(FocusEvent event) {
        checkValue(event.getSource());
    }

    void checkValue(Object source) {
        JTextField field = (JTextField) source;
        try {
            int val = Integer.parseInt(field.getText());
            if (val < 0) {
                val = val * -1;
                field.setText("" + val);
            }
        } catch (NumberFormatException e) {
            field.setText("0");
        }
    }
}
