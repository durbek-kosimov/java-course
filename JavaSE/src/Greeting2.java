import javax.swing.*;
import java.awt.*;

public class Greeting2 extends JFrame {
    private JTextField textField;

    public static void main(String[] args) {
        Greeting2 frame = new Greeting2();
        frame.setSize(300, 200);
//        frame.show();
    }

    public Greeting2() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        textField = new JTextField("Hello");
        window.add(textField);
        setVisible(true);
    }
}
