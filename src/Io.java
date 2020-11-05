import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Io {
    public static void main(String[] args) throws IOException {
        File pr = new File("/home/dmint/csi/pr3/pr_03_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        Double deltaT, density, temperature;
        Integer stepAvg, stepEquil, stepInitlzTemp, stepLimit;

        String line;
        String value = null;
        String description = null;
        String x = null, y = null, z = null;
        int indexOfSpace;
        int count = 0;
        int countLine = 0;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            StringTokenizer stLine = new StringTokenizer(line, " ");
            countLine = stLine.countTokens();
            indexOfSpace = line.indexOf(" ");
            String[] str = line.split(" +");
            description = line.substring(0, indexOfSpace);
            value = line.substring(indexOfSpace + 1);
            if ((countLine == 1 || countLine > 2) && !description.equals("initUcell")) {
                System.out.println("Incompatible data!!!");
                break;
            }
            StringTokenizer st = new StringTokenizer(value, " ");
            count = st.countTokens();
            if (description.equals("initUcell") && count > 1) {
                if (count == 2) {
                    while (st.hasMoreTokens()) {
                        x = st.nextToken();
                        y = st.nextToken();
                    }
                    System.out.print("initUcell = " + x + " " + y);
                    System.out.println("\tEvery thing is OK! Token = 2");
//                    continue;
                }
                else if (count == 3) {
                    while (st.hasMoreTokens()) {
                        x = st.nextToken();
                        y = st.nextToken();
                        z = st.nextToken();
                    }
                    System.out.print("initUcell = " + x + " " + y + " " + z);
                    System.out.println("\tEvery thing is OK! Token = 3");
//                    continue;
                }
                else
                    System.out.println("Too many data!");
            } else
                System.out.println(description + " " + value);
        }
        in.close();
    }
}