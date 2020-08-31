import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator3 extends JFrame implements ActionListener {
    JTextField one = new JTextField("0", 5);
    JButton plusOrMinus = new JButton("+");
    JTextField two = new JTextField("0", 5);
    JButton equals = new JButton("=");
    JLabel result = new JLabel("");

    public Calculator3() {
        super("Add or Subtract Two Numbers");
        setSize(400, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        plusOrMinus.addActionListener(this);
        equals.addActionListener(this);
        add(one);
        add(plusOrMinus);
        add(two);
        add(equals);
        add(result);
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
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == equals) {
            try {
                int value1 = Integer.parseInt(one.getText());
                int value2 = Integer.parseInt(two.getText());
                if (plusOrMinus.getText().equals("+"))
                    result.setText("" + (value1 + value2));
                else
                    result.setText("" + (value1 - value2));
            } catch (NumberFormatException e) {
                one.setText("0");
                two.setText("0");
                result.setText("0");
            }
        }
        if (event.getSource() == plusOrMinus) {
            if (plusOrMinus.getText().equals("+"))
                plusOrMinus.setText("-");
            else
                plusOrMinus.setText("+");
        }
    }

    public static void main(String[] args) {
        Calculator3.setLookAndFeel();
        Calculator3 frame = new Calculator3();
    }
}
