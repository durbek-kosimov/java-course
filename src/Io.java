import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Io {
    public static void main(String[] args) throws IOException {
        File pr = new File("/home/dmint/Desktop/pr_02_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        String line = in.readLine();
        System.out.println(line);
        in.close();
    }
}
