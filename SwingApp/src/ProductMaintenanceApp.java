import javax.swing.*;

public class ProductMaintenanceApp {
    public static void main(String[] args) {
        JFrame frame = new ProductMaintenanceFrame();
        frame.setVisible(true);
    }
}

class ProductMaintenanceFrame extends JFrame {
    public ProductMaintenanceFrame() {
        setTitle("Product Display");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new ProductMaintenancePanel());
        this.pack();
        centerWindow(this);
    }
}


