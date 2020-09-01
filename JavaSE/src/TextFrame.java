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
}
