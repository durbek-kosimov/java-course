import javax.swing.*;

public class IconFrame extends JFrame {
    JButton load, save, subscribe, unsubscribe;

    public IconFrame() {
        super("Icon Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
//        create icons
        ImageIcon loadIcon = new ImageIcon("/home/dmint/Java21days/chapter9/load.gif");
        ImageIcon saveIcon = new ImageIcon("/home/dmint/Java21days/chapter9/save.gif");
        ImageIcon subscribeIcon = new ImageIcon("/home/dmint/Java21days/chapter9/subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("/home/dmint/Java21days/chapter9/unsubscribe.gif");
//        create buttons
        load = new JButton("Load", loadIcon);
        save = new JButton("Save", saveIcon);
        subscribe = new JButton("Subscribe", subscribeIcon);
        unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
//        add buttons to panel
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);
//        add the panel to a frame
        add(panel);
        pack();
        setVisible(true);
    }
}
