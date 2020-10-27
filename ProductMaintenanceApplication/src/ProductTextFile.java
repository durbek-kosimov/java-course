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

//    private boolean saveProducts(ArrayList<Product> products) {
//        ProductWriter out = null;
//        try {
//            this.checkFile();
//            out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
//            for (Product p : products) {
//                out.print(p.getCode() + FIELD_SEP);
//                out.print(p.getDescription() + FIELD_SEP);
//                out.print(p.getPrice());
//            }
//        }
//        catch (IOException ioe) {
//            ioe.printStackTrace();
//            return false;
//        }
//        finally {
//            this.close(out);
//        }
//        return true;
//    }

    public ArrayList<Product> getProducts() {
        BufferedReader in = null;
        try {
            this.checkFile();
            in = new BufferedReader(new FileReader(productsFile));
            ArrayList<Product> products = new ArrayList<Product>();
            String line  = in.readLine();
            while (line != null) {
                String[] columns = line.split(FIELD_SEP);
                String code = columns[0];
                String description = columns[1];
                String price = columns[2];

                Product p = new Product(code, description, Double.parseDouble(price));
                products.add(p);
                line = in.readLine();
            }
            return products;
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
        finally {
            this.close(in);
        }
    }

    private void close(Closeable stream) {
        try {
            if (stream != null)
                stream.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public Product getProduct(String code) {
        ArrayList<Product> products = this.getProducts();
        for (Product p : products) {
            if (p.getCode().equals(code))
                return p;
        }
        return null;
    }
}
