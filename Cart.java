import java.util.ArrayList;

public class Cart {

    private ArrayList<Object> cart = new ArrayList<>();

    public Cart() {

    }

    public ArrayList<Object> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Object> cart) {
        this.cart = cart;
    }

    public void addPizza(Pizza pizza) {
        cart.add(pizza);
    }

    public void addDrink(Drink drink) {
        cart.add(drink);
    }

}
