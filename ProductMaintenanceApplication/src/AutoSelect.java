import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AutoSelect extends FocusAdapter {
    @Override
    public void focusGained(FocusEvent e) {
        if (e.getComponent() instanceof JTextField) {
            JTextField t = (JTextField) e.getComponent();
        }
    }
}
