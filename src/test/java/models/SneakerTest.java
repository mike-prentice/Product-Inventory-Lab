package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SneakerTest {
    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 11;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }

    @Test
    void getId() {
        Sneaker sneaker = new Sneaker();
        int expected = 11526;
        sneaker.setId(11526);
        int actual =  sneaker.getId();
        assertEquals(actual, expected);
    }

    @Test
    void setId() {
        Sneaker sneaker = new Sneaker();
        int expected = 11325;
        sneaker.setId(11325);
        int actual =  sneaker.getId();
        assertEquals(actual, expected);
    }

    @Test
    void getName() {
        Sneaker sneak = new Sneaker();
        String expected = "ABCD";
        sneak.setName("ABCD");
        assertEquals(expected, sneak.getName());
    }

    @Test
    void setName() {
        Sneaker sneaker = new Sneaker();
        sneaker.setName("Vapor Fly");
        String expected = "Vapor Fly";
        assertEquals(expected, sneaker.getName());
    }

    @Test
    void getBrand() {
        Sneaker sneaker = new Sneaker();
        sneaker.setBrand("Nike");
        String expected  = "Nike";
        assertEquals(expected, sneaker.getBrand());
    }

    @Test
    void setBrand() {
        Sneaker sneaker = new Sneaker();
        sneaker.setBrand("Nike");
        String expected = "Nike";
      assertEquals(sneaker.getBrand(), expected);


    }

    @Test
    void getSport() {
        Sneaker sneaker = new Sneaker();
        sneaker.setSport("Running");
        String expected  = "Running";
        assertEquals(expected, sneaker.getSport());
    }

    @Test
    void setSport() {
        Sneaker sneaker = new Sneaker();
        sneaker.setSport("Running");
        String expected = "Running";
        assertEquals(sneaker.getSport(), expected);
    }

    @Test
    void getSize() {
        Sneaker sneaker = new Sneaker();
        int expected = 11;
        sneaker.setSize(11);
        int actual =  sneaker.getSize();
        assertEquals(actual, expected);
    }

    @Test
    void setSize() {
        Sneaker sneaker = new Sneaker();
        sneaker.setSize(10);
        int expected = 10;
        assertEquals(sneaker.getSize(), expected);

    }

    @Test
    void getQty() {
        Sneaker sneaker = new Sneaker();
        int expected = 8;
        sneaker.setQty(8);
        int actual =  sneaker.getQty();
        assertEquals(expected, actual);
    }

    @Test
    void setQty() {
        Sneaker sneaker = new Sneaker();
        sneaker.setQty(10);
        int expected = 10;
        assertEquals(sneaker.getQty(), expected);
    }

    @Test
    void getPrice() {
        Sneaker sneaker = new Sneaker();
        int expected = 8;
        sneaker.setPrice(8);
        float actual =  sneaker.getPrice();
        assertEquals(expected, actual);
    }
}
