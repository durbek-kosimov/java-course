import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
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
        GradientPaint gp = new GradientPaint(0F, 0F, Color.green, 350F, 350F, Color.orange, true);
        comp2d.setPaint(gp);
        GeneralPath fl = new GeneralPath();
        fl.moveTo(10F, 12F);
        fl.moveTo(234F, 15F);
        fl.moveTo(253F, 25F);
        fl.moveTo(261F, 71F);
        fl.moveTo(344F, 209F);
        fl.moveTo(336F, 278F);
        fl.moveTo(295F, 310F);
        fl.moveTo(259F, 274F);
        fl.moveTo(205F, 188F);
        fl.moveTo(211F, 171F);
        fl.moveTo(195F, 174F);
        fl.moveTo(191F, 118F);
        fl.moveTo(120F, 56F);
        fl.moveTo(94F, 68F);
        fl.moveTo(81F, 49F);
        fl.moveTo(12F, 37F);
        fl.closePath();
//        Draw ovals
        comp2d.setColor(Color.black);
        BasicStroke pen2 = new BasicStroke();
        comp2d.setStroke(pen2);
        Ellipse2D.Float e1 = new Ellipse2D.Float(235, 140, 15, 15);
        Ellipse2D.Float e2 = new Ellipse2D.Float(225, 130, 15, 15);
        Ellipse2D.Float e3 = new Ellipse2D.Float(245, 140, 15, 15);
        comp2d.fill(e1);
        comp2d.fill(e2);
        comp2d.fill(e3);
    }

}
