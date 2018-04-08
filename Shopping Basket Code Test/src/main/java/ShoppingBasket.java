import Items.Item;
import java.util.ArrayList;
import java.util.Collections;

public class ShoppingBasket {
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
        for(Item item : basket) {
            total += item.getPrice();
        }
        return total;
    }
    
}

