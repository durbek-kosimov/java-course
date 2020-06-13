import java.util.Random;

public class Psychiatrist {
    private String question;
    private String reply;
    private Random randomValue = new Random();

    public void putQuestion(String q) {
        question = "  " + q + " ";
    }

    public String getReply() {
        int variation = randomValue.nextInt(3);
        switch (variation) {
            case 0:
                reply = transformQuestion();
                break;

            case 1:
                reply = "Why do you feel that?";
                break;
        }
    }
}
