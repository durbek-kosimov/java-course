import java.io.*;
import java.util.ArrayList;

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

    private boolean saveProducts(ArrayList<Product> products) {
        ProductWriter out = null;
        try {
            this.checkFile();
            out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
            for (Product p : products) {
                out.print(p.getCode() + FIELD_SEP);
                out.print(p.getDescription() + FIELD_SEP);
                out.print(p.getPrice());
            }
        }
    }
}
