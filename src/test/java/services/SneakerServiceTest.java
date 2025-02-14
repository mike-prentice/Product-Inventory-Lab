package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {

    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = SneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest(){
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = SneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        Assertions.assertEquals(testSneaker, sneakerService.findSneaker(0));
        // should take an int and return an object with that id, if exists
    }
    @Test
    public  Sneaker[] findAll() {
        return null;
        // should return a basic array copy of the ArrayList
    }

    @Test
    void deleteSneaker() {
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = SneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        System.out.println(testSneaker);

        SneakerService.deleteSneaker(0);
        System.out.println(testSneaker);
        Assertions.assertTrue(false);
    }
}
