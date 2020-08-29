import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Calculator2 extends JFrame implements FocusListener {
    JTextField value1, value2, sum;
    JLabel plus, equals;

    public Calculator2() {
        super("Add Two Numbers");
        setSize(350, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);
//        create components
        value1 = new JTextField("0", 5);
        plus = new JLabel("+");
        value2 = new JTextField("0", 5);
        equals = new JLabel("=");
        sum = new JTextField("0", 5);
//        add listeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
//        set up sum
        sum.setEditable(false);
//        add components
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        setVisible(true);
    }

    public void focusGained(FocusEvent event) {
        try {
            float total = Float.parseFloat(value1.getText()) + Float.parseFloat(value2.getText());
            sum.setText("" + total);
        } catch (NumberFormatException nfe) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }

    public void focusLost(FocusEvent event) {
        focusGained(event);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        Calculator2 frame = new Calculator2();
    }
}
