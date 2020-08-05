import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FileChooserDemo extends JFrame implements ActionListener {
    private JButton openButton, saveButton;
    private JFileChooser fileChooser;
    private JTextField nameField;

    public static void main(String[] args) {
        FileChooserDemo frame = new FileChooserDemo();
        frame.setSize(300, 150);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        openButton = new JButton("open");
        window.add(openButton);
        openButton.addActionListener(this);

        saveButton = new JButton("save");
        window.add(saveButton);
        saveButton.addActionListener(this);
    }
}
