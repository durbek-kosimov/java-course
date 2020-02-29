import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private ArrayList<LineItem> lineItems;
    private Date invoiceDate;

    public Invoice() {
        lineItems = new ArrayList<LineItem>();
        invoiceDate = DateUtils.get
    }
    public void addItem(LineItem lineItem) {
        this.lineItems.add(lineItem);
    }
    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }
    public double getInvoiceTotal() {
        double invoiceTotal = 0;
        for (LineItem lineItem : this.lineItems)
            invoiceTotal += lineItem.getTotal();
        return invoiceTotal;
    }
    public String getFormattedTotal() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getInvoiceTotal());
    }
}
