public class Increment2 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call x is " + x);
        x = increment(x);
        System.out.println("after the call x is " + x);
    }
    static int increment( int n) {
        n ++;
        System.out.println("\tn inside the function is " + n);
        return n;
    }
}
