
public class Price {

    private String discription;
    private int qty;
    private double price;

    public Price() {
    }

    public Price(String discription, double price) {
        this.discription = discription;
        this.price = price;
    }

    public double getTotal_price() {
        return qty * price;
    }

    public String getDiscription() {
        return discription;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

}
