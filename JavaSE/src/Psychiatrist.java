import java.util.Random;

public class Psychiatrist {
    private String question;
    private String reply;
    private Random randomValue = new Random();

    public void putQuestion(String q) {
        question = "  " + q + " ";
    }
}
