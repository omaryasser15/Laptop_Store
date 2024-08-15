import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Invoice extends Price {

    static String cust_name;
    static int cust_phone;
    static List<Price> items;
    static double total_all_price;
    static String cashierName;
    static String cashierID;
    static int qty;
    static double price;

    public Invoice(String cust_name, int cust_phone, String cashierName, String cashierID) {
        this.cust_name = cust_name;
        this.cust_phone = cust_phone;
        this.items = new ArrayList<>();
        this.cashierName = cashierName;
        this.cashierID = cashierID;

    }

    public Invoice(int qty, double price) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal_price() {
        return qty * price;
    }

    public void addItems(String discription, int qty, double price) {
        Price item = new Price(discription, price);
        item.setQty(qty);
        items.add(item);
        total_all_price += item.getTotal_price();
    }

    public static void printInvoice() {
        System.out.println("=================================================");
        System.out.println("                    Laptop Store                           ");
        System.out.println("=================================================");
        System.out.println("=================================================");
        System.out.println("                      INVOICE                           ");
        System.out.println("=================================================");
        System.out.printf(" %-50s %n", "Customer Name: " + cust_name);
        System.out.printf(" %-50s %n", "Customer Phone Number: " + cust_phone);
        System.out.printf(" %-70s %n", "Cashier Name: " + cashierName);
        System.out.printf(" %-70s %n", "Cashier ID: " + cashierID);
        System.out.println("=================================================");
        System.out.printf(" %-20s  %-8s  %-10s  %-10s %n", "Description", "Qty", "Price", "Total");
        System.out.println("=================================================");
        for (Price item : items) {
            System.out.printf(" %-20s  %-8d  %-10.2f  %-10.2f %n", item.getDiscription(), item.getQty(),
                    item.getPrice(), item.getTotal_price());
        }
        System.out.println("=================================================");
        System.out.printf(" %-40s  %-10s  %-10.2f %n", "", "Total:", total_all_price);
        System.out.println("=================================================");
        Date date = new Date();
        System.out.println("Date and Time: " + date);
        System.out.println("-----------------------------------------");
        System.out.println("=> It can be returned or exchanged within 1 month only against manufacturing defects....");
        System.out.println("=================================================");

    }

    public static void exitFromApp() {
        System.exit(0);
    }
}
