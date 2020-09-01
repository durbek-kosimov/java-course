import javax.swing.*;

public class TextFrame extends JFrame {
    public TextFrame(String text, String fontName) {
        super("Show Font");
        setSize(425, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TextFramePanel sf = new TextFramePanel(text, fontName);
        add(sf);
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java TextFrame msg font");
            System.exit(-1);
        }
        TextFrame tf = new TextFrame(args[0], args[1]);
    }
}

class TextFramePanel extends JPanel {
    String text;
    String fontName;

    public TextFramePanel(String text, String fontName) {
        super();
        this.text = text;
        this.fontName = fontName;
    }


}
