public class Drink {

    private String size;
    private String beverage;
    private double price;

    public Drink(String size, String beverage, double price) {
        this.size = size;
        this.beverage = beverage;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
