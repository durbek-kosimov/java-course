import java.util.Date;
import java.util.Scanner;

public class Now {
    public static void main(String[] args) {
        Date nu = new Date();
        System.out.println(nu);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int count = sc.nextInt();
        double subtotal = sc.nextDouble();
        String cityName = sc.nextLine();

        System.out.println(name);
        System.out.println(count);
        System.out.println(subtotal);
        System.out.println(cityName);
    }
}
