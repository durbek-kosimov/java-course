import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class ProductMaintenancePanel extends JPanel {
    ProductDAO productDAO;
    ArrayList<Product> products;
    Product newProduct = null;

    ProductSelectorPanel selectorPanel;
    ProductDisplayPanel productPanel;
    ProductButtonPanel buttonPanel;

    public ProductMaintenancePanel() {
//fill the products
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
    private GridBagConstraints getConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor) {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridwidth;
        c.gridheight = gridheight;
        c.anchor = anchor;
        return c;
    }

    class ProductSelectorPanel extends JPanel implements ActionListener {
        public JComboBox productComboBox;
        private JLabel productLabel;
        boolean filling = false; //used to indicate the combo box is being filled
        public ProductSelectorPanel() {
//            set panel layout
            setLayout(new FlowLayout(FlowLayout.LEFT));
//            product label
            productLabel = new JLabel("Select Product:");
            add(productLabel);
//            product combo box
            productComboBox = new JComboBox();
            fillComboBox(products);
            productComboBox.addActionListener(this);
            add(productComboBox);
        }
    }

}
