import java.text.NumberFormat;
import java.util.Scanner;

public class Cast {
    public static void main(String[] args) {
        char letterChar = 65;
        int letterInt = 'A';
        Scanner sc = new Scanner(System.in);
        int x = ValidateAnEntry.getInteger(sc, "Enter integer: ");
        System.out.println(letterChar);
        System.out.println((char) 65);
        System.out.println(letterInt);
        System.out.println((int) 'A');

        double price = 150.50;
        double tax = .1;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(currency.format(price));
        System.out.println(percent.format(tax));

//        a for loop that stores the numbers 0 through 4 in a string
        String numbers = "";
        for (int i = 0; i < 5; i ++)
            numbers += i + " ";
        System.out.println(numbers);
    }
}
