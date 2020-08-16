import javax.swing.*;

public class Authenticator extends JFrame {
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator() {
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
