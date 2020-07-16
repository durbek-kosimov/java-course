import javax.swing.*;
import java.util.Random;

public class Demo {
    static Random random = new Random();

    public static void main(String[] args) {
        int x = random.nextInt(1000);
        int geluksGetal;
        double y = random.nextDouble() + 1;

        geluksGetal = randomInRange(16, 59);

        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("random is " + geluksGetal);
    }

    private static int randomInRange(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
