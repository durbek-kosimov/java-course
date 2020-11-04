import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String str = "20 20 20";
        str = str.trim();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println("Spacies are: " + st.countTokens());
    }
}
