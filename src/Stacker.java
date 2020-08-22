import javax.swing.*;

public class Stacker extends JFrame {
    public Stacker() {
        super("Stacker");
        setSize(430, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
//        create top panel
        JPanel commandPane = new JPanel();
        BoxLayout horizontal = new BoxLayout(commandPane, BoxLayout.X_AXIS);
        commandPane.setLayout(horizontal);
        JButton subscribe = new JButton("Subscribe");
        JButton unsubscribe = new JButton("Unsubscribe");
        JButton refresh = new JButton("Refresh");
        JButton save = new JButton("Save");

    }
}
