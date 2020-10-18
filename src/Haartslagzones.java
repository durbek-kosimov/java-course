import java.util.Scanner;

public class Haartslagzones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ken je HHR? (Ja/Nee) ");
        String aantwoord = sc.next();
        char k = aantwoord.charAt(0);
        int count = 15;

        if (k == 'N' || k == 'n') {
            System.out.println("Ga even zitten en adem 10 keer diep in en uit.");
            System.out.println("Indien je klaar bent typ je OK: ");
            String ok = sc.next();
            System.out.println("Start");
            System.out.print(count + " ");
            for (int i = 0; i < 14; i ++) {
                try {
                    Thread.sleep(1000);
                    count --;
                    System.out.print(" -" + count);
                    if (count == 1)
                        System.out.println(" Stop");
                } catch (InterruptedException e) {
                    System.out.println("Voer het nog een keer");
                }
            }
            int ingevoerdeHartSlag = sc.nextInt();
            int rusthaartslag = ingevoerdeHartSlag * 4;
            System.out.println("Rusthaartslag = " + rusthaartslag);
        }
    }

}
