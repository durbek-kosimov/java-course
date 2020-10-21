
import java.util.Scanner;

public class Functies {
    public static void main(String[] args) {
        Functies f = new Functies();
        String s = world();
        hello();
        System.out.println(s);
        f.print();
               
    }

    public static void hello() {
        System.out.print("Hello, ");
    }

    public static String world() {
        return "World!";
    }

    public void print() {
        System.out.println(this);
    }
}
