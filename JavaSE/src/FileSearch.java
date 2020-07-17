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
    }
}
