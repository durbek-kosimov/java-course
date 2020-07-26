import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UseBalloon2 extends JFrame implements ActionListener {
    private JButton growButton, moveRightButton, moveLeftButton, moveUpButton, moveDownButton;
    private JPanel panel;

    private Balloon2 balloon;

    public static void main(String[] args) {
        UseBalloon2 demo = new UseBalloon2();
        demo.setSize(250,350);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.white);
        window.add(panel);

        moveRightButton = new JButton("move right");
        window.add(moveRightButton);
        moveRightButton.addActionListener(this);

        moveLeftButton = new JButton("move left");
        window.add(moveLeftButton);
        moveLeftButton.addActionListener(this);

        moveUpButton = new JButton("move up");
        window.add(moveUpButton);
        moveUpButton.addActionListener(this);

        moveDownButton = new JButton("move down");
        window.add(moveDownButton);
        moveDownButton.addActionListener(this);

        growButton = new JButton("grow");
        window.add(growButton);
        growButton.addActionListener(this);

        balloon = new Balloon2(50,50,20,"Balloon2");
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        if (event.getSource() == moveRightButton)
            balloon.moveRight(20);
        else if (event.getSource() == moveLeftButton)
            balloon.moveLeft(20);
        else if (event.getSource() == moveUpButton)
            balloon.moveUp(20);
        else if (event.getSource() == moveDownButton)
            balloon.moveDown(20);
        else
            balloon.changeSize(20);
        paper.setColor(Color.white);
        paper.fillRect(0,0,150,150);
        balloon.display(paper);
    }
}

class Balloon2 {
    private int x;
    private int y;
    private int diameter;
    private String name;

    public Balloon2(int x, int y, int diameter, String name) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.name = name;
    }


    public void moveRight(int xStep) {
        x += xStep;
    }

    public void moveLeft(int xStep) {
        x -= xStep;
    }

    public void moveUp(int yStep) {
        y -= yStep;
    }

    public void moveDown(int yStep) {
        y += yStep;
    }

    public void changeSize(int change) {
        diameter += change;
    }

    public void display(Graphics paper) {
        paper.setColor(Color.red);
        paper.drawOval(x,y,diameter,diameter);
    }
}
