import javax.swing.*;

public class ButtonFrame extends JFrame {
    JButton load = new JButton("Load");
    JButton save = new JButton("Save");
    JButton unsubscribe = new JButton("Unsubscibe");

    public ButtonFrame() {
        super("Button Frame");
        setSize(340, 170);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(load);
        pane.add(save);
        pane.add(unsubscribe);
        add(pane);
        setVisible(true);
    }

    public static void main(String[] args) {
        ButtonFrame bf = new ButtonFrame();
    }
}
