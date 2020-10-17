import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        boolean isValid = false;
        while (isValid == false) {
            double subtotal = 0.0;
            try {
                System.out.println("Enter subtotal: ");
                subtotal = sc.nextDouble();
                isValid = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Error! Invalid number. Try again.\n");
                continue;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
