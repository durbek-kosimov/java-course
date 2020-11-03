import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IOData {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> data = new HashMap<String, Double>();
        final String FIELD_SEP = "\t";
        File pr = new File("/home/dmint/Desktop/pr_02_1.in");
        BufferedReader in = new BufferedReader(new FileReader(pr));
        String line = in.readLine();
        while (line != null) {

            String[] columns = line.split(FIELD_SEP);
//            String description = columns[0];
//            Double[] waarde[0] = Double.parseDouble(columns[1]);
            data.put(columns[0], Double.parseDouble(columns[1]));
//            System.out.println(line);
            line = in.readLine();
        }
        in.close();
        for (Map.Entry dat : data.entrySet())
            System.out.println(dat.getKey() + "\t" + dat.getValue());
    }
}

class InputData {

}
