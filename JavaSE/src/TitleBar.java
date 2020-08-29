import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleBar extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;

    public TitleBar() {
        super("Title Bar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
        b1 = new JButton("Rosencrantz");
        b2 = new JButton("Guildenstern");
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == b1)
            setTitle("Rosencrantz");
        else if (source == b2)
            setTitle("Gruildenstern");
        repaint();
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        TitleBar frame = new TitleBar();
    }
}
