import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PageData extends JFrame implements ActionListener, Runnable {
    Thread runner;
    String[] headers = {"Content-Length", "Content-Type", "Date", "Public", "Expires", "Last-Modified", "Server"};
    URL page;
    JTextField url;
    JLabel[] headerLabel = new JLabel[7];
    JTextField[] header = new JTextField[7];
    JButton readPage, clearPage, quitLoading;
    JLabel status;

    public PageData() {
        super("Page Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
        setLayout(new GridLayout(10, 1));


    }
}
