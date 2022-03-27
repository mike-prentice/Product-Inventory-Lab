package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhiskeyTest {
    @Test // (1)
    public void constructorTest(){

        // (2)
        String expectedName = "Jack Daniels";
        String expectedType = "Tennessee";
        int expectedSize = 750;
        int expectedRating = 10;
        float expectedPrice = 35.00f;
        int expectedQty = 10;

        // (3)
        Whiskey testWhiskey = new Whiskey(expectedName, expectedType,
                expectedSize,expectedRating, expectedPrice, expectedQty);

        // (4)
        Assertions.assertEquals(expectedName, testWhiskey.getName());
        Assertions.assertEquals(expectedType, testWhiskey.getType());
        Assertions.assertEquals(expectedSize, testWhiskey.getSize());
        Assertions.assertEquals(expectedRating, testWhiskey.getRating());
        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());
        Assertions.assertEquals(expectedQty, testWhiskey.getQty());
    }

    @Test
    void getNameTest() {
        Whiskey jack = new Whiskey();
        String expected = "Jack Daniels";
        jack.setName("Jack Daniels");
        assertEquals(expected, jack.getName());
    }

    @Test
    void setNameTest() {
        Whiskey jack = new Whiskey();
        jack.setName("Jack Daniels");
        String expected = "Jack Daniels";
        assertEquals(expected, jack.getName());
    }

    @Test
    void getTypeTest() {
        Whiskey jack = new Whiskey();
        jack.setType("Tennessee");
        String expected  = "Tennessee";
        assertEquals(expected, jack.getType());
    }

    @Test
    void setTypeTest() {
        Whiskey jack = new Whiskey();
        jack.setType("Tennessee");
        String expected = "Tennessee";
        assertEquals(jack.getType(), expected);
    }

    @Test
    void getSizeTest() {
        Whiskey jack = new Whiskey();
        int expected = 750;
        jack.setSize(750);
        int actual =  jack.getSize();
        assertEquals(actual, expected);
    }

    @Test
    void setSizeTest() {
        Whiskey jack = new Whiskey();
        jack.setSize(100);
        int expected = 100;
        assertEquals(jack.getSize(), expected);
    }

    @Test
    void getPriceTest() {
        Whiskey jack = new Whiskey();
        int expected = 35;
        jack.setPrice(35);
        float actual =  jack.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void setPriceTest() {
        Whiskey jack = new Whiskey();
        jack.setPrice(28);
        float expected = 28;
        assertEquals(jack.getPrice(), expected);
    }

    @Test
    void getRatingTest() {
        Whiskey jack = new Whiskey();
        int expected = 10;
        jack.setRating(10);
        int actual =  jack.getRating();
        assertEquals(actual, expected);
    }

    @Test
    void setRatingTest() {
        Whiskey jack = new Whiskey();
        jack.setRating(10);
        int expected = 10;
        assertEquals(jack.getRating(), expected);
    }
}
