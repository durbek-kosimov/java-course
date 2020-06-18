import javax.swing.*;
import java.awt.event.ActionListener;

public class AskFrasier extends JFrame implements ActionListener {
    private JTextField questionField, replyField;
    private JLabel psychiatristLabel, questionLabel;
    private Psychiatrist frasier;

    public static void main(String[] args) {
        AskFrasier frame = new AskFrasier();
        frame.setSize(400, 150);
        frame.createGUI();
        frame.setVisible(true);
    }


}
