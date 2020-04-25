import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class PaymentPanel extends JPanel implements ActionListener {
    private JRadioButton creditCardRadioButton, billCustomerRadioButton;
    private JList cardTypeList;
    private JTextField cardNumberTextField;
    private JComboBox monthComboBox, yearComboBox;
    private JCheckBox verifiedCheckBox;
    private JButton acceptButton, exitButton;
    private JLabel cardTypeLabel, cardNumberLabel, expirationDateLabel;

    public PaymentPanel() {
        setLayout(new GridBagLayout());
        Border lowerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        JPanel radioPanel = new JPanel();
        ButtonGroup billingGroup = new ButtonGroup();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioPanel.setBorder(BorderFactory.createTitledBorder(lowerBorder, "Billing:"));

        creditCardRadioButton = new JRadioButton("Credit card", true);
        creditCardRadioButton.addActionListener(this);
        billingGroup.add(creditCardRadioButton);
        radioPanel.add(billCustomerRadioButton);

        add(radioPanel, getConstraints(0, 0, 3, 1, GridBagConstraints.WEST));

        cardTypeLabel = new JLabel("Card type:");
        add(cardTypeLabel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));

        String[] cardNames = {"Visa", "Master Card", "American Express", "Other"};
        cardTypeList = new JList(cardNames);
        cardTypeList.setFixedCellWidth(170);
        cardTypeList.set
    }

}
