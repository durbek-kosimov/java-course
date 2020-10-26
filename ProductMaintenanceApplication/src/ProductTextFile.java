import java.io.File;
import java.io.IOException;

public class ProductTextFile implements ProductDAO {
    private File productsFile = null;
    private final String FIELD_SEP = "\t";

    public ProductTextFile() {
        productsFile = new File("products.txt");
    }

    private void checkFile() throws IOException {
        if (!productsFile.exists())
            productsFile.createNewFile();
    }
}
