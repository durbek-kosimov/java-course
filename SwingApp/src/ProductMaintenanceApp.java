import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
    }
}

class ProductMaintenancePanel extends JPanel {
    ProductDAO productDAO;
    ArrayList<Product> products;
    Product newProduct = null;

    ProductSelectorPanel selectorPanel;
    ProductDisplayPanel productPanel;
    ProductButtonPanel buttonPanel;

    public ProductMaintenancePanel() {
//        fill the products ArrayList
        productDAO = DAOFactory.getProductDAO();
        products = productDAO.getProducts();
//        add the panels
        setLayout(new GridBagLayout());
        selectorPanel = new ProductSelectorPanel();
        add(selectorPanel, getConstraints(0, 0, 1, 1, GridBagConstraints.EAST));
        productPanel = new ProductDisplayPanel();
        add(productPanel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));
        buttonPanel = new ProductButtonPanel();
        add(buttonPanel, getConstraints(0, 2, 1, 1, GridBagConstraints.EAST));
//        set the initial product to be displayed
        productPanel.showProduct(products.get(0));
        selectorPanel.selectProduct(products.get(0));
    }

//    a method for setting grid bag constraints
    private GridBagConstraints getConstraints(int gridx, int gridy, int gridthwidth, int gridheight, int anchor) {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridthwidth;
        c.gridheight = gridheight;
        c.anchor = anchor;
        return c;
    }
}

class ProductSelectorPanel extends JPanel implements ActionListener {
    public JComboBox productComboBox;
    private JLabel productLabel;
    boolean filling = false;

    public ProductMaintenancePanel() {
//        ser panel layout
        setLayout(new FlowLayout(FlowLayout.LEFT));

//        product label
        productLabel = new JLabel("Select Product:");
        add(productLabel);

//        product combo box
        productComboBox = new JComboBox();
        fillComboBox(products);
        productComboBox.addActionListener(this);
        add(productComboBox);
    }

    public void actionPerformed(ActionEvent event) {
        if(!filling) {
            Product p = (Product) productComboBox.getSelectedItem();
            productPanel.showProduct(p);
        }
    }

    public void fillComboBox(ArrayList<Product> a) {
        filling = true;
        productComboBox.removeAllItems();
        for (Product p : a)
            productComboBox.addItem(p);
        filling = false;
    }

    public void selectProduct(Product p) {
        productComboBox.setSelectedItem(p);
    }

}



