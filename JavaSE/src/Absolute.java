import javax.swing.*;
import java.awt.Rectangle;

public class Absolute extends JFrame {
    public Absolute() {
        super("Example");
        setSize(300, 300);
        setLayout(null);
        JButton myButton = new JButton("Click me");
        myButton.setBounds(new Rectangle(10, 10, 120, 30));
        add(myButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        Absolute ex = new Absolute();
    }
}
