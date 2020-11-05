import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Io2 {
    public static void main(String[] args) throws IOException {
        File pr = new File("/home/dmint/csi/pr3/pr_03_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        Double deltaT, density, temperature;
        Integer stepAvg, stepEquil, stepInitlzTemp, stepLimit;
        String line;
        String value = null;
        String description = null;
        String x = null, y = null, z = null;
        int countLine = 1;
        int countToken = 0;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            StringTokenizer stLine = new StringTokenizer(line, " ");
            countToken = stLine.countTokens();
            switch (countToken) {
                case 1:
                    throw new InputMismatchException("Incopatible data!!! In line " + countLine);
                case 2:
                    description = stLine.nextToken();
                    if (description.equals("initUcell"))
                        throw new InputMismatchException("Few data! In line " + countLine);
                    while (stLine.hasMoreTokens()) {
                        value = stLine.nextToken();
                    }
                    break;
                case 3:
                    description = stLine.nextToken();
                    if (description.equals("initUcell")) {
                        while (stLine.hasMoreTokens()) {
                            x = stLine.nextToken();
                            y = stLine.nextToken();
                        }
                    }
                    else
                        throw new InputMismatchException("Too many data! In line " + countLine);
                    break;
                case 4:
                    description = stLine.nextToken();
                    if (description.equals("initUcell")) {
                        while (stLine.hasMoreTokens()) {
                            x = stLine.nextToken();
                            y = stLine.nextToken();
                            z = stLine.nextToken();
                        }
                    }
                    else
                        throw new InputMismatchException("Too many data! In line " + countLine);
                    break;
                case 5:
                    throw new InputMismatchException("Too many data! In line " + countLine);
            }
            if (countToken == 2)
                System.out.println(description + " " + value);
            else if (countToken == 3)
                System.out.println(description + " " + x + " " + y);
            else if (countToken == 4)
                System.out.println(description + " " + x + " " + y + " " + z);
            countLine ++;
        }
        in.close();
    }
}