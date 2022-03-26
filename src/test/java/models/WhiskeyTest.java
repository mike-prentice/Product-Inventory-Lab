package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhiskeyTest {


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
        int expected = 28;
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
