import java.text.NumberFormat;

public class Cast {
    public static void main(String[] args) {
        char letterChar = 65;
        int letterInt = 'A';
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
    }
}
