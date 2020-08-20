

import javax.swing.*;
import java.awt.*;

public class Feedbar extends JFrame {
    public Feedbar() {
        super("FeedBar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
//        create icons
        ImageIcon loadIcon = new ImageIcon("/home/dmint/Java21days/chapter9/load.gif");
        ImageIcon saveIcon = new ImageIcon("/home/dmint/Java21days/chapter9/save.gif");
        ImageIcon subIcon = new ImageIcon("/home/dmint/Java21days/chapter9/subscribe.gif");
        ImageIcon unsubIcon = new ImageIcon("/home/dmint/Java21days/chapter9/unsubscribe.gif");
//        create buttons
        JButton load = new JButton("Load", loadIcon);
        JButton save = new JButton("Save", saveIcon);
        JButton sub = new JButton("Subscribe", subIcon);
        JButton unsub = new JButton("Unsubscribe", unsubIcon);
//        add buttons to toolbar
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(sub);
        bar.add(unsub);
//        create user interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("South", bar);
        add("Center", scroll);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Feedbar frame = new Feedbar();
    }
}
