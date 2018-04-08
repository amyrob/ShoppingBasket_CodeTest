import Items.Item;
import Items.Vinyl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;
    Item item, item2;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item = new Vinyl("LP", "0001", "Alt-J", "An Awesome Wave", 15.99);
        item2 = new Vinyl("LP", "0002", "Bastille", "Bad Blood", 15.99);
    }

    @Test
    public void canAddItemToShoppingBasket() {
        shoppingBasket.add(item);
        assertEquals(1, shoppingBasket.getNumberOfItems());
    }

    @Test
    public void canRemoveItemFromShoppingBasket() {
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        shoppingBasket.remove(item);
        assertEquals(1, shoppingBasket.getNumberOfItems());
    }

    @Test
    public void canEmptyBasket() {
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        shoppingBasket.empty();
        assertEquals(0, shoppingBasket.getNumberOfItems());
    }

    @Test
    public void canGetBasketTotal() {
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        assertEquals(31.98, shoppingBasket.getTotal(),0.5);
    }

    @Test
    public void canBoGoF_NoOfItemsInBasketIsEven() {
    shoppingBasket.add(item);
    shoppingBasket.add(item2);
    assertEquals(15.99, shoppingBasket.bOgOF(), 0.5);
    }

    @Test
    public void canBoGoF_NoOfItemsInBasketIsOdd() {
        shoppingBasket.add(item);
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        assertEquals(31.98, shoppingBasket.bOgOF(), 0.5);
    }

}
