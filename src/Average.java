import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        double avr = (i1 + i2 + i3) / 3.;
        System.out.println("The average is: " + avr);
    }
}
