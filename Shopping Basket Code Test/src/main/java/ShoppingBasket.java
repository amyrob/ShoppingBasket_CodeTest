import Interfaces.IDiscount;
import Items.Item;
import java.util.ArrayList;

public class ShoppingBasket implements IDiscount {
    private ArrayList<Item> basket;
    Customer customer;

    public ShoppingBasket() {
        this.basket = new ArrayList<>();
    }

    public void add(Item item) {
        this.basket.add(item);
    }

    public int getNumberOfItems() {
        return this.basket.size();
    }

    public void remove(Item item) {
        this.basket.remove(item);
    }

    public void empty() {
        this.basket.clear();
    }

    public double getSubTotal() {
        double subTotal = 0;
        for (Item item : basket) {
            subTotal += item.getPrice();
        }
        return subTotal;
    }

    @Override
    public double bOgOF() {
        int items = getNumberOfItems();
        if (items % 2 != 0) {
            return ((items - 1) / 2) * (getSubTotal() / items) + (getSubTotal() / items);
        } else {
            return getSubTotal() * 0.5;
        }
    }

    @Override
    public double discountOffTwentyPoundSpend() {
        double total;
        if (getSubTotal() > 20.00) {
            total = getSubTotal() * 0.8;
            return total;
        } else {
            return getSubTotal();
        }

    }

    @Override
    public double customerLoyaltyCardDiscount() {
        double total;
        if (customer.getLoyaltyCard()) {
            total = discountOffTwentyPoundSpend() * 0.02;
            return total;
        } else {
            return getSubTotal();
        }
    }
}


