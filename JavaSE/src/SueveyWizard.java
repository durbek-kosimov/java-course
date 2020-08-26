import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyWizard extends JPanel implements ActionListener {
    int currentCard = 0;
    CardLayout cards = new CardLayout();
    SurveyPanel[] ask = SurveyPanel[3];

    public SurveyWizard() {
        super();
        setSize(240, 140);
        setLayout(cards);
//        set up servey
        String question1 = "What is your gender?";
        String[] resp1 = {"female", "male", "not telling"};
        ask[0] = new SurveyPanel(question1, resp1, 2);
        String question2 = "What is your age?";
        String[] resp2 = {"Under 25", "25 - 34", "35 - 54", "Over 54"};
        ask[1] = new SurveyPanel(question2, resp2, 1);
        String question3 = "How often do you exercise each week?";
        String[] resp3 = {"Never", "1 - 3 times", "More than 3"};
        ask[2] = new SurveyPanel(question3, resp3, 1);
        ask[2].setFinalQuestion(true);
        addListeners();
    }

    private void addListeners() {
        for (int i = 0; i < ask.length; i ++) {
            ask[i].nextButton.addActionListener(this);
            ask[i].finalButton.addActionListener(this);
            add(ask[i], "Card " + i);
        }
    }

    public void actionPerformed(ActionEvent e) {
        currentCard ++;
        if (currentCard >= ask.length) {
            System.exit(0);
        }
        cards.show(this, "Card " + currentCard);
    }
}

class SurveyPanel extends JPanel {
    JLabel question;
    JRadioButton[] response;
    JButton nextButton = new JButton("Next");
    JButton finalButton = new JButton("Final");


    SurveyPanel(String ques, String[] resp, int def) {
        super();
        setSize(160, 110);
        question = new JLabel(ques);
        response = new JRadioButton[resp.length];
        JPanel sub1 = new JPanel();
        ButtonGroup group = new ButtonGroup();
        JLabel questLabel = new JLabel(ques);
        sub1.add(questLabel);
        JPanel sub2 = new JPanel();

    }
}