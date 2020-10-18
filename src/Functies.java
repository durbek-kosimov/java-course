public class Functies {
    public static void main(String[] args) {
        Functies f = new Functies();
        String s = f.world();
        f.hello();
        System.out.println(s);
    }

    public void hello() {
        System.out.print("Hello, ");
    }

    public String world() {
        return "World!";
    }
}
