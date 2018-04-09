import Items.Item;
import Items.Vinyl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer, customer1;
    ShoppingBasket shoppingBasket;
    Item item;

    @Before
    public void before () {
        customer = new Customer(true);
        customer1 = new Customer(false);
        shoppingBasket = new ShoppingBasket();
        item = new Vinyl("EP", "003", "Ellie Goulding", "Lights", 10.99);

    }

    @Test
    public void customerHasLoyaltyCard() {
        assertEquals(true, customer.getLoyaltyCard());
    }

    @Test
    public void noLoyaltyCard() {
        assertEquals(false, customer1.getLoyaltyCard());
    }

    @Test
    public void canApplyLoyaltyCardDiscount() {

    }
}
