import javax.swing.*;

public class Map extends JFrame {
    public Map() {
        super("Map");
        setSize(360, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MapPane map = new MapPane();
        add(map);
        setVisible(true);
    }

    public static void main(String[] args) {
        Map frame = new Map();
    }
}


