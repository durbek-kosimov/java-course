public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.greeting();
        bye();
    }
    private void greeting() {
        System.out.println("Hello, World!");
    }

    private static void bye() {
        System.out.println("Good bye!");
    }
}
