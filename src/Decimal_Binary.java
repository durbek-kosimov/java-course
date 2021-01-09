import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        int dec;
        int upCharge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Converting of Decimal number into Binary numbers");
        System.out.println("Enter integer number from 0 to 255 and press <Enter>: ");
        dec = sc.nextInt();
        System.out.printf("Decimal number %d corresponds to a binary ", dec);
        upCharge = 128;
        for (int i = 1; i <=8; i ++) {
            if (dec >= upCharge) {
                System.out.print("1");
                dec -= upCharge;
            } else
                System.out.print("0");
            upCharge /= 2;
        }
        System.out.println();
    }
}
