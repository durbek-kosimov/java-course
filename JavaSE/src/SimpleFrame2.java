import javax.swing.*;

public class SimpleFrame2 extends JFrame {
    public SimpleFrame2() {
        super("Frame Title");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        SimpleFrame2 sf = new SimpleFrame2();
    }
}
