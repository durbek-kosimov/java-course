import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

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

class MApPane extends JPanel {
    public void paintComponent(Graphics comp) {
        Graphics2D comp2d = (Graphics2D) comp;
        comp2d.setColor(Color.blue);
        comp2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Rectangle2D.Float background = new Rectangle2D.Float(0F, 0F, getSize().width, getSize().height);
        comp2d.fill(background);
//        Draw waves
        comp2d.setColor(Color.white);
        BasicStroke pen = new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        comp2d.setStroke(pen);
        for (int ax = 0; ax < 340; ax += 10) {
            for (int ay = 0; ay < 340; ay += 10) {
                Arc2D.Float wave = new Arc2D.Float(ax, ay, 10, 10, 0, -180, Arc2D.OPEN);
                comp2d.draw(wave);
            }
        }
//        Draw Florida

    }

}
