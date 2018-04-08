import Items.Vinyl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VinylTest {
    Vinyl vinyl;

    @Before
    public void before() {
        vinyl = new Vinyl("LP", "0001", "Alt-J", "An Awesome Wave", 15.99);
    }

    @Test
    public void canGetType() {
        assertEquals("LP", vinyl.getType());
    }

    @Test
    public void canGetProductCode() {
        assertEquals("0001", vinyl.getProductCode());
    }

    @Test
    public void canGetArtist() {
        assertEquals("Alt-J", vinyl.getArtist());
    }

    @Test
    public void canGetTitle() {
        assertEquals("An Awesome Wave", vinyl.getTitle());
    }
    @Test
    public void canGetPrice() {
        assertEquals("15.99", vinyl.getPrice());
    }

}

