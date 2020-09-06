import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FutureValueApp {
    public static void main(String[] args) {
        FutureValueFrame frame = new FutureValueFrame();
        frame.setVisible(true);
    }
}

class FutureValueFrame extends JFrame {
    public FutureValueFrame() {
        setTitle("Future Value Calculator");
        setSize(267, 200);
        centerWindow(this);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new FutureValuePanel();
        this.add(panel);
    }
}

class FutureValuePanel extends JPanel implements ActionListener {
    private JButton calculateButton;
    private JButton exitButton;

    public FutureValuePanel() {
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        this.add(calculateButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        this.add(exitButton);
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == exitButton)
            System.exit(0);
        else if (source == calculateButton)
            calculateButton.setText("Clicked");
    }


}


