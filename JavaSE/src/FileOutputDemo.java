import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class FileOutputDemo extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton saveButton;
    private JTextField nameField;
    private JLabel nameLabel;
    private PrintWriter outFiles;

    public static void main(String[] args) {
        FileOutputDemo frame = new FileOutputDemo();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        nameLabel = new JLabel("File name: ");
        window.add(nameLabel);

        nameField = new JTextField(20);
        window.add(nameField);

        textArea = new JTextArea(10,10);
        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane);
    }
}