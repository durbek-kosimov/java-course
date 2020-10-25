import javax.swing.*;
import java.awt.*;

public class ProductMaintenanceFrame extends JFrame {
    public ProductMaintenanceFrame() {
        setTitle("Product Display");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new ProductMaintenanceFrame());
        this.pack();
        centerWindow(this);
    }
    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth()) / 2, (d.height-w.getHeight()) / 2);
    }
}

