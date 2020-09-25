import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ProductSelectorPanel extends JPanel implements ActionListener {
    public JComboBox productComboBox;
    private JLabel productLabel;
    boolean filling  = false;

    public ProductSelectorPanel() {
//        set panel layout
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


}
