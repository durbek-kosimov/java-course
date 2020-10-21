public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call x is " + x);
        increment(x);
        System.out.println("after the call x is " + x);
    }
    static void increment( int n) {
        n ++;
        System.out.println("\tn inside the function is " + n);
    }
}
