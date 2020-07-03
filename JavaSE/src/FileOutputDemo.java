import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class FileOutputDemo extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton saveButton;
    private JTextField nameField;
    private JLabel nameLabel;
    private PrintWriter outFiles;
}