import javax.swing.*;
import java.awt.*;
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

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        nameLabel = new JLabel("File name: ");
        window.add(nameLabel);

        nameField = new JTextField(20);
        window.add(nameField);
        nameField.addActionListener(this);

        textArea = new JTextArea("", 10,30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane);

        openButton = new JButton("open");
        window.add(openButton);
        openButton.addActionListener(this);
    }
}
