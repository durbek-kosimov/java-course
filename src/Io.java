import java.io.File;
import java.io.IOException;

public class Io {
    public static void main(String[] args) throws IOException {
        String dirName = "/home/dmint/Desktop/io";
        String fileName = "products.txt";
        File dir = new File(dirName);
        File productsFile = new File(dirName + fileName);
        if (!dir.exists()) {
            dir.mkdir();
        }

//        System.out.println(dirName + fileName);
        if (!productsFile.exists())
            productsFile.createNewFile();
    }
}
