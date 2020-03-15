import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class FutureValuePanel extends JPanel implements ActionListener {
    private JTextField paymentTextField,
            rateTextField,
            yearsTextField,
            futureValueTextField;
    private JLabel paymentLabel,
                   rateLabel,
                   yearsLabel,
                   futureValueLabel;
    private JButton calculateButton,
                    exitButton;

    public FutureValuePanel() {
//        displayPanel
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

//        payment label
        JLabel paymentLabel = new JLabel("Monthly Payment:");
        displayPanel.add(paymentLabel);

//        payment label
        JTextField paymentTextField = new JTextField(10);
        displayPanel.add(paymentTextField);

//        rate label
        JLabel rateLabel = new JLabel("Yearly Interest Rate:");
        displayPanel.add(rateLabel);

//        rate text field
        JTextField rateTextField = new JTextField(10);
        displayPanel.add(rateTextField);

//        years label
        JLabel yearsLabel = new JLabel("Number of Years:");
        displayPanel.add(yearsLabel);

//        years text field
        JTextField yearsTextField = new JTextField(10);
        displayPanel.add(yearsTextField);

//        future value label
        JLabel futureValueLabel = new JLabel("Future Value");
        displayPanel.add(futureValueLabel);

//        future value text field
        JTextField futureValueTextField = new JTextField(10);
        futureValueTextField.setEditable(false);
        futureValueTextField.setFocusable(false);
        displayPanel.add(futureValueTextField);

//        button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

//        calculate buttons
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        buttonPanel.add(calculateButton);

//        exit button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

//        add panels to main panel
        this.setLayout(new BorderLayout());
        this.add(displayPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton)
            System.exit(0);
        else if (source == calculateButton) {
            double payment = Double.parseDouble(paymentTextField.getText());
            double rate = Double.parseDouble(rateTextField.getText());
            int years = Integer.parseInt(yearsTextField.getText());
            double futureValue = FinancialCalculations.calculateFutureValue(payment, rate, years);
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            futureValueTextField.setText(currency.format(futureValue));
        }
    }
}