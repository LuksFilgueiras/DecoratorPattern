package decorator;

import org.example.decorator.Essence;
import org.example.decorator.Glycerin;
import org.example.decorator.HandmadeSoap;
import org.example.decorator.Soap;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandmadeSoapTest {

    /*
     *
     * PRICE TESTS
     *
     */

    @Test
    public void shouldReturnBaseHandmadeSoapPrice() {
        Soap soap = new HandmadeSoap(5.00);

        assertEquals(5, soap.getPrice(), 0);
    }

    @Test
    public void shouldReturnHandmadeSoapPriceWithEssenceAmount() {
        Soap soap = new Essence(new HandmadeSoap(5.00), 10, "Chocolate", 4);

        assertEquals(9, soap.getPrice(), 0);
    }

    @Test
    public void shouldReturnHandmadeSoapPriceWithGlycerinAmount() {
        Soap soap = new Glycerin(new HandmadeSoap(5.00), 50, 10);

        assertEquals(7.5, soap.getPrice(), 0);
    }

    @Test
    public void shouldReturnHandmadeSoapPriceWithGlycerinAmountAndWithEssenceAmount() {
        Soap soap = new Essence(new Glycerin(new HandmadeSoap(5.00), 50, 10), 10, "Chocolate", 4);

        assertEquals(13.5, soap.getPrice(), 0.01);
    }

    /*
     *
     * STRUCTURE TESTS
     *
     */

    @Test
    public void shouldReturnBaseHandmadeSoapStructure() {
        Soap soap = new HandmadeSoap(5.00);

        assertEquals("Handmade_Soap", soap.getStructure());
    }

    @Test
    public void shouldReturnHandmadeSoapStructureWithEssenceAmount() {
        Soap soap = new Essence(new HandmadeSoap(5.00), 10, "Chocolate", 4);

        assertEquals("Handmade_Soap/10ml-Chocolate Essence", soap.getStructure());
    }

    @Test
    public void shouldReturnHandmadeSoapStructureWithGlycerinAmount() {
        Soap soap = new Glycerin(new HandmadeSoap(5.00), 50, 5);

        assertEquals("Handmade_Soap/50g-Glycerin", soap.getStructure());
    }

    @Test
    public void shouldReturnHandmadeSoapStructureWithGlycerinAmountAndWithEssenceAmount() {
        Soap soap = new Essence(new Glycerin(new HandmadeSoap(5.00), 50, 5), 10, "Chocolate", 4);

        assertEquals("Handmade_Soap/50g-Glycerin/10ml-Chocolate Essence", soap.getStructure());
    }

}
