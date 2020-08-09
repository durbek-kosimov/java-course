import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Finder {
    private String line1, line2, line3;
    private BufferedReader keyboard;
    private BufferedReader inStream;

    public static void main(String[] args) {
        Finder aFind = new Finder();
        aFind.doSearch();
    }

    private void doSearch() {
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        String fileName = prompt("Type file to search: ");
        String wanted = prompt("Type string to find: ");
        line1 = "";
        line2 = "";
    }
}
