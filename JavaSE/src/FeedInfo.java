import javax.swing.*;

public class FeedInfo extends JFrame {
    private JLabel nameLabel = new JLabel("Name: ", SwingConstants.RIGHT);
    private JTextField name;
    private JLabel urlLabel = new JLabel("URL: ", SwingConstants.RIGHT);
    private JTextField url;
    private JLabel typeLabel = new JLabel("Type: ", SwingConstants.RIGHT);
    private JTextField type;

    public FeedInfo() {
        super("Feed Information");
        setSize(400, 145);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
//        Site name
        String responsel = JOptionPane.showInputDialog(null, "Enter the site name:");
        name = new JTextField(responsel, 20);
//        Site address
        String response2 = JOptionPane.showInputDialog(null, "Enter the site address:");
        url = new JTextField(response2, 20);

//      Site type
        String[] choices = {"Personal", "Commercial", "Unknown"};
        int response3 = JOptionPane.showOptionDialog(null, "What type of site is it?",
                "Site Type", 0, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        type = new JTextField(choices[response3], 20);


    }
}
