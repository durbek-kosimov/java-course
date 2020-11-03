public class Args {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i ++)
                System.out.print(args[i] + " ");
            System.out.println();
        }
        else
            System.out.println("The was no argument list.");
    }
}
