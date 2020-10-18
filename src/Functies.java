public class Functies {
    public static void main(String[] args) {
        String s = world();
        hello();
        System.out.println(s);
    }

    public static void hello() {
        System.out.print("Hello, ");
    }

    public static String world() {
        return "World!";
    }
}
