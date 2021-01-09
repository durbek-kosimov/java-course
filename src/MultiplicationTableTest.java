import java.util.Scanner;

public class MultiplicationTableTest {
    public static void main(String[] args) {
        int num1, num2;
        int res;
        int ans;
        int numOfCorrectAnss = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Test of knowledge of Multiplication Table");
        System.out.println("After example enter your answer and press <Enter>");
        for (int i = 1; i <= 10; i ++) {
            num1 = (int) (Math.random() * 10 + 1);
            num2 = (int) (Math.random() * 10 + 1);
            res = num1 * num2;
            System.out.printf("%d x %d = ", num1, num2);
            ans = sc.nextInt();
            if (ans == res)
                numOfCorrectAnss++;
            else
                System.out.printf("Wrong! %d x %d = %d\n Let's continue...\n", num1, num2, res);
        }
        System.out.printf("\nCorrect answers: %d\n", numOfCorrectAnss);
        System.out.print("Your score: ");
        switch (numOfCorrectAnss) {
            case 10:
                System.out.println("5");
                break;
            case 9: case 8:
                System.out.println("4");
                break;
            case 7:
                System.out.println("3");
                break;
            default:
                System.out.println("2");
                break;
        }
    }
}
