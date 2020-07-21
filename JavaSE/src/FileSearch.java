import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

public class FileSearch extends JFrame implements ActionListener {
    private BufferedReader inFile;
    private Button searchButton;
    private JTextField result1Field;
    private JTextField result2Field;
    private JTextField personField;
    private JTextField fileNameField;
    private String fileName;
    private JLabel result1Label, result2Label;
    private JLabel personNameLabel;
    private JLabel fileLabel;

    public static void main(String[] args) {
        FileSearch frame = new FileSearch();
        frame.setSize(400, 150);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        fileLabel = new JLabel("File name");
        window.add(fileLabel);

        fileNameField = new JTextField(25);
        fileNameField.setText("");
        window.add(fileNameField);

        personNameLabel = new JLabel("Type Name:");
        window.add(personNameLabel);

        personField = new JTextField(15);
        personField.setText("");
        window.add(personField);

        searchButton = new Button("Search for name");
        window.add(searchButton);
        searchButton.addActionListener(this);

        result1Label = new JLabel("Result1:");
        window.add(result1Label);
    }
}
