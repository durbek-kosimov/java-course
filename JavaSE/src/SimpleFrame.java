import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        super("Frame Title");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFrame sf = new SimpleFrame();
    }
}
