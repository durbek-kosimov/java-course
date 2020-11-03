import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Io {

    public static void main(String[] args) throws IOException {
        File pr = new File("/home/dmint/Desktop/pr_02_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        String line;
        int indexOfSpace;
        while ((line = in.readLine()) != null) {
//            for (int i = 0; i < line.length(); i ++) {
//                if (line.charAt(i) == "\\s")
//                    String[] s = line.split("\t");
            line = line.trim();
            indexOfSpace = line.indexOf(" ");
//            String[] str = line.split(" ");
            String description = line.substring(0, indexOfSpace);
            String value = line.substring(indexOfSpace + 1);
            value = value.trim();
//
//            }

            System.out.println(description + " " + value);



        }

        in.close();
    }
}
