import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        boolean isValid = false;
        while (isValid == false) {
            double subtotal = 0.0;
            System.out.println("Enter subtotal: ");
            if (sc.hasNextDouble()) {
                subtotal = sc.nextDouble();
                isValid = true;
            }
            else
                System.out.println("Error! Invalid number. Try again.\n");
            sc.nextLine();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
