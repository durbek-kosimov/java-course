import java.util.Scanner;

public class HaarSlaag {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Do you know what is hearbeat? (Yes/No)");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        int count = 15;
        if (ch == 'Y' || ch == 'y') {
            System.out.println("Start");
            System.out.print(count + " ");
            for (int i = 0; i < 14; i ++) {
                Thread.sleep(1000);
                count --;
                System.out.print(" -" + count);
                if (count == 1)
                    System.out.println(" Stop");
            }
            
        }
        else
            System.out.println(ch);
    }
}
