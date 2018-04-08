package Items;

import Interfaces.IDiscount;

public abstract class Item implements IDiscount{
    private String productCode;
    private String artist;
    private String title;
    private double price;

    public Item(String productCode, String artist, String title, double price) {
        this.productCode = productCode;
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }


}
