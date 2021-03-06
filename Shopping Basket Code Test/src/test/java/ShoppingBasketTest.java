import Items.Item;
import Items.Vinyl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;
    Item item, item2;
    Customer customer;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item = new Vinyl("LP", "0001", "Alt-J", "An Awesome Wave", 15.99);
        item2 = new Vinyl("LP", "0002", "Bastille", "Bad Blood", 15.99);
        customer = new Customer(true);
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
    public void canGetBasketSubTotal() {
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        assertEquals(31.98, shoppingBasket.getSubTotal(),0.5);
    }

    @Test
    public void canGetBasketTotal() {
        shoppingBasket.setCustomer(customer);
        assertEquals(customer, shoppingBasket.getCustomer());
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

    @Test
   public void canApplyDiscount_totalOverTwenty() {
        shoppingBasket.add(item);
        shoppingBasket.add(item2);
        assertEquals(25.58, shoppingBasket.discountOffTwentyPoundSpend(),0.5);
    }

    @Test
    public void canApplyDiscount_totalBelowTwenty() {
        shoppingBasket.add(item);
        assertEquals(15.99, shoppingBasket.discountOffTwentyPoundSpend(), 0.5);
    }

    @Test
    public void canApplyCustomerLoyalty() {
        shoppingBasket.setCustomer(customer);
        shoppingBasket.add(item);
        assertEquals(15.67, shoppingBasket.customerLoyaltyCardDiscount(),0.05);
    }

}
