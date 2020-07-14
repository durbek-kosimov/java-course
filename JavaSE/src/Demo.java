import javax.swing.*;
import java.util.Random;

public class Demo {
    private static Random random = new Random();
    private static int x = random.nextInt(1000);
    private static int y = random.nextInt(100);

    public static void main(String[] args) {
        System.out.println("x is " + x);
        System.out.println("y is " + y);
//        System.out.println("random is " + random);
    }
}
