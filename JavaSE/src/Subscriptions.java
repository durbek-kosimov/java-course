import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"Burningbird", "Freedom Goodness", "Ideoplex", "Inessential", "Intertwingly",
                     "Now This", "Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench"};
    JList<String> subList = new JList<>(subs);

    public Subscriptions() {
        super("Subscriptions");
        setSize(180, 335);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscription");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}
