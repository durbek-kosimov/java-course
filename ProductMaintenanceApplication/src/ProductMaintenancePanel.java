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

        public void ActionPerformed(ActionEvent e) {
            if (!filling) {
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

        public Product getCurrentProduct() {
            return (Product) productComboBox.getSelectedItem();
        }
    }

    class ProductDisplayPanel extends JPanel {
        public JTextField codeTextField, descriptionTextFiled, priceTextField;
        private JLabel codeLabel, descriptionLabel, priceLabel;

        public ProductDisplayPanel() {
//            set panel layout
            setLayout(new GridBagLayout());
//            code label
            codeLabel = new JLabel("Product Code:");
            add(codeLabel, getConstraints(0, 0, 1, 1, GridBagConstraints.EAST));
//            code text field
            codeTextField = new JTextField(10);
            codeTextField.setEditable(false);
            codeTextField.addFocusListener(new AutoSelect());
            add(codeTextField, getConstraints(1, 0, 1, 1, GridBagConstraints.WEST));
//            description label
            descriptionLabel = new JLabel("Description:");
            add(descriptionLabel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));
//            description text field
            descriptionTextFiled = new JTextField(30);
            descriptionTextFiled.setEditable(false);
            descriptionTextFiled.setFocusable(false);
            descriptionTextFiled.addFocusListener(new AutoSelect());
            add(descriptionTextFiled, getConstraints(1, 1, 1, 1, GridBagConstraints.WEST));
//            price label
            priceLabel = new JLabel("Unit Price:");
            add(priceLabel, getConstraints(0, 2, 1, 1, GridBagConstraints.EAST));
//            price text field
            priceTextField = new JTextField(10);
            priceTextField.setEditable(false);
            priceTextField.setFocusable(false);
            priceTextField.addFocusListener(new AutoSelect());
            priceTextField.addKeyListener(new NumFilter());
            add(priceTextField, getConstraints(1, 2, 1, 1, GridBagConstraints.WEST));
        }

        public void showProduct(Product p) {
            codeTextField.setText(p.getCode());
            descriptionTextFiled.setText(p.getDescription());
            priceTextField.setText(p.getFormattedPrice());
        }

        public void clearFields() {
            codeTextField.setText("");
            descriptionTextFiled.setText("");
            priceTextField.setText("");
        }
//        return a Product object with the data in the text fields
        public Product getProduct() {
            Product p = new Product();
            p.setCode(codeTextField.getText());
            p.setDescription(descriptionTextFiled.getText());
            p.setPrice(Double.parseDouble(priceTextField.getText()));
            return p;
        }

        public void setAddMode() {
            codeTextField.setEditable(true);
            codeTextField.setFocusable(true);
            codeTextField.requestFocusInWindow();
            descriptionTextFiled.setEditable(true);
            descriptionTextFiled.setFocusable(true);
            priceTextField.setEditable(true);
            priceTextField.setFocusable(true);
        }

        public void setEditMode() {
            descriptionTextFiled.setEditable(true);
            descriptionTextFiled.setFocusable(true);
            descriptionTextFiled.requestFocusInWindow();
            priceTextField.setEditable(true);
            priceTextField.setFocusable(true);
        }

        public void setDisplayMode() {
            codeTextField.setEditable(false);
            codeTextField.setFocusable(false);
            descriptionTextFiled.setEditable(false);
            descriptionTextFiled.setFocusable(false);
            priceTextField.setEditable(false);
            priceTextField.setFocusable(false);
        }
    }

    class ProductButtonPanel extends JLabel {
        public JButton addButton, editButton, deleteButton, acceptButton, cancelButton, exitButton;

        public ProductButtonPanel() {
//            create maintenance button panel
            JPanel maintPanel = new JPanel();
            maintPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//            add button
            addButton = new JButton("Add");
            addButton.addActionListener(new AddListener());
            maintPanel.add(addButton);
//            edit button
            editButton = new JButton("Edit");
            editButton.addActionListener(new EditListener());
            maintPanel.add(editButton);
//            delete button
            deleteButton = new JButton("Delete");
            deleteButton.addActionListener(new DeleteListener());
            maintPanel.add(deleteButton);
//            accept button
            acceptButton = new JButton("Accept");
            acceptButton.setEnabled(false);
            acceptButton.addActionListener(new AcceptListener());
            maintPanel.add(acceptButton);
//            cancel button
            cancelButton = new JButton("Cancel");
            cancelButton.setEnabled(false);
            cancelButton.addActionListener(new CancelListener());
            maintPanel.add(cancelButton);
//            create exit button panel
            JPanel exitPanel = new JPanel();
            exitPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
//            exit button
            exitButton = new JButton("Exit");
            exitButton.addActionListener(new ExitListener());
            maintPanel.add(exitButton);
//            add panels to the ProductButtonPanel
            setLayout(new BorderLayout());
            add(maintPanel, BorderLayout.CENTER);
            add(exitPanel, BorderLayout.SOUTH);
        }

        public void setAddEditMode(boolean e) {
            addButton.setEnabled(!e);
            editButton.setEnabled(!e);
            deleteButton.setEnabled(!e);
            acceptButton.setEnabled(!e);
            cancelButton.setEnabled(!e);
        }
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            newProduct = new Product();
            productPanel.clearFields();
            buttonPanel.setAddEditMode(true);
            productPanel.setAddMode();
        }
    }


}
