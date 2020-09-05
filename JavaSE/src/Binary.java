public class Binary {
    public static void main(String[] args) {
        int a = 32;
        String result = "";
        while (a > 0) {
            result = a % 2 + result;
            a /= 2;
        }
        System.out.println(result);
    }

}
