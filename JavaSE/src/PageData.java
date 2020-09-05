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

        JPanel first = new JPanel();
        first.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel urlLabel = new JLabel("URL:");
        url = new JTextField(22);
        urlLabel.setLabelFor(url);
        first.add(urlLabel);
        first.add(url);
        add(first);

        JPanel second = new JPanel();
        second.setLayout(new FlowLayout());
        readPage = new JButton("Read Page");
        clearPage = new JButton("Clear Fields");
        quitLoading = new JButton("Quit Loading");
        readPage.setMnemonic('r');
        clearPage.setMnemonic('c');
        quitLoading.setMnemonic('q');
        readPage.setToolTipText("Begin Loading the Web Page");
        clearPage.setToolTipText("Clear All Header Fields Below");
        quitLoading.setToolTipText("Quit Loading the Web Page");
        readPage.setEnabled(true);
        clearPage.setEnabled(false);
        quitLoading.setEnabled(false);
        readPage.addActionListener(this);
        clearPage.addActionListener(this);
        quitLoading.addActionListener(this);
        second.add(readPage);
        second.add(clearPage);
        second.add(quitLoading);
        add(second);
    }


}
