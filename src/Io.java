import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Io {

    public static void main(String[] args) throws IOException {
        File pr = new File("/home/dmint/csi/pr3/pr_03_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        String line;
        String value = null;
        String description = null;
        String x = null, y = null, z = null;
        int indexOfSpace;
        int count = 0;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            indexOfSpace = line.indexOf(" ");
            String[] str = line.split(" +");
            description = line.substring(0, indexOfSpace);
            value = line.substring(indexOfSpace + 1);
            if (description.equals("initUcell")) {
                StringTokenizer st = new StringTokenizer(value, " ");
                while (st.hasMoreTokens()) {
                    x = st.nextToken();
                    y = st.nextToken();
                    z = st.nextToken();
                }
                System.out.print("initUcell = " + x + " " + y + " " + " " + z);
                System.out.println(" Every thing is OK!");
            } else
                System.out.println(description + " " + value);
        }
        in.close();
    }
}

