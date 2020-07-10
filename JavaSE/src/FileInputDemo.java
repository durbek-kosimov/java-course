import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

public class FileInputDemo extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton openButton;
    private BufferedReader inFile;
    private JTextField nameField;
    private JLabel nameLabel;

    public static void main(String[] args) {
        FileInputDemo frame = new FileInputDemo();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
}
