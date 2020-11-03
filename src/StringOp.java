public class StringOp {
    public static void main(String[] args) {
        Double deltaT, density, temperature;
        Integer stepAvg, stepEquil, stepInitlzTemp, stepLimit;
        Integer[] initUcell = null;

        String line0 = "deltaT\t0.005";
        String line1 = "density\t0.8";
        String line2 = "initUcell   5 5 5";
        String line3 = "stepAvg 2000";
        String line4 = "stepEquil   0";
        String line5 = "stepInitlzTemp  999999";
        String line6 = "stepLimit   10000";
        String line7 = "temperature 1.";

        line0 = line0.trim();
        String[] line = line0.split("\t");
        String description = line[0];
        String value = line[1];
//
        System.out.println(description + " " + value);
    }

    static String getValue(String[] userInfo, int index) {
        String data = userInfo[index];
        return data; // или data[data.length - 1]
    }
}
