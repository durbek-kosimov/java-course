public class Args {
    public static void main(String[] args) {
        String buff = "";
        buff = args[0];
        buff = buff.concat(".in");
        System.out.println(buff);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i ++)
                System.out.print(args[i] + " ");
            System.out.println();
        }
        else
            System.out.println("The was no argument list.");
    }
}
