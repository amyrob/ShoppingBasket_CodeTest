import Interfaces.IDiscount;
import Items.Item;
import java.util.ArrayList;

public class ShoppingBasket implements IDiscount {
    private ArrayList<Item> basket;

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

    public double getTotal() {
        double total = 0;
        for (Item item : basket) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public double bOgOF() {
        int items = getNumberOfItems();
        if (items % 2 != 0) {
            return ((items - 1) / 2) * (getTotal()/ items) + (getTotal()/items);
        } else {
            return getTotal() * 0.5;
        }
    }
}

