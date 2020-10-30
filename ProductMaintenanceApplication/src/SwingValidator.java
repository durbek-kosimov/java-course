import javax.swing.text.JTextComponent;

public class SwingValidator {
    public static boolean isPresent(JTextComponent c, String title) {
        if (c.getText().length() == 0) {
            showMessage(c, title + " is a required field.\n" + "Please re-enter.");
            c.requestFocusInWindow();
            return false;
        }
        return true;
    }
}
