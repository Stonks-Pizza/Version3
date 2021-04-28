public class Pizza {

    private String toppings;
    private String size;
    private String crust;
    private double price;

    public Pizza(String toppings, String size, String crust, double price) {
        this.toppings =toppings;
        this.size = size;
        this.crust = crust;
        this.price = price;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
