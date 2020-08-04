import javax.swing.*;
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
}
