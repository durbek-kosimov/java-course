import java.util.Locale;
import java.util.Scanner;

public class InvoiceApp {
    public static Invoice invoice = new Invoice();

    public static void main(String[] args) {
        System.out.println("Welcome to the invoice application.\n");
        getLineItems();
        displayInvoice();
    }
    public static void getLineItems() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String productCode = Validator.getString(sc, "Enter product code: ");
            int quantity = Validator.getInt(sc,"Enter quantity:   ", 0, 1000);
            Product product = ProductDB.getProduct(productCode);
            invoice.addItem(new LineItem(product, quantity));
            choice = Validator.getString(sc, "Another line item? (y/n)): ");
            System.out.println();
        }
    }
    public static void displayInvoice() {
        System.out.println("Code\tDescription\t\t\tPrice\tQty\tTotal");
        System.out.println("----\t-----------\t\t\t-----\t---\t-----");
        for (LineItem lineItem : invoice.getLineItems()) {
            Product product = lineItem.getProduct();
            String s = product.getCode() + "\t" + product.getDescription() + "\t" + product.getFormattedPrice()
                                         + "\t" + lineItem.getQuantity() + "\t" + lineItem.getFormattedTotal();
            System.out.println(s);
        }
        System.out.println("\n\t\t\t\t\tInvoice total:\t" + invoice.getFormattedTotal() + "\n");
    }
}
