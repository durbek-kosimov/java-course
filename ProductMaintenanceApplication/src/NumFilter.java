import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NumFilter extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8'
            && c != '9' && c != '.' && c != '+' && c != '-')
            e.consume();
    }
}
