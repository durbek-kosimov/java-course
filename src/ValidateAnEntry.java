import java.util.Scanner;

public class ValidateAnEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subtotal1 = getDouble(scanner, "Enter subtotal: ");
        double subtotal2 = getDoubleWithinRange(scanner, "Enter subtotal: ", 0, 10000);
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            }
            else
                System.out.println("Error! Invalid number. Try again.");
            sc.nextLine();
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false) {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println("Error! Number must be smaller than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            }
            else
                System.out.println("Error! Invalid number. Try again.");
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInteger(sc, prompt);
            if (i <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println("Error! Number must be smaller than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }

}
