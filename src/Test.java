public class Test {
    public static void main(String[] args) {
        Test test = new Test();
//
        test.greeting();
        String s = fine();
        System.out.println(s);
        bye();
    }

    private void greeting() {
        System.out.println("Hello, World!");
    }

    private static void bye() {
        System.out.println("Good bye!");
    }

    private static String fine() {
        return "I'm fine!";
    }
}
