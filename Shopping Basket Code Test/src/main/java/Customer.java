public class Customer {
    private Boolean loyaltyCard;
    private ShoppingBasket basket;

    public Customer(Boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
        this.basket = new ShoppingBasket();
    }

    public Boolean getLoyaltyCard() {
        return this.loyaltyCard;
    }

    public void setBasket(ShoppingBasket basket) {
        this.basket = basket;
    }

    public double getBasketTotal() {
        return basket.getSubTotal();
    }
}
