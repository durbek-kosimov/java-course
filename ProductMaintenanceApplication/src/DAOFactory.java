public class DAOFactory {
    public static ProductDAO getProductDAO() {
        ProductDAO pDAO = new ProductTextFile();
        return pDAO;
    }
}
