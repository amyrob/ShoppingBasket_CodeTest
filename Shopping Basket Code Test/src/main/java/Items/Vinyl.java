package Items;

public class Vinyl extends Item {
    private String type;

    public Vinyl(String type, String productCode, String artist, String title, double price) {
        super(productCode, artist, title, price);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}
