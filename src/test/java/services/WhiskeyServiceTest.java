package services;


import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {

    @Test
    public void createTest(){

        // (1)
        String expectedName = "Jack Daniels";
        String expectedType = "Tennessee";
        int expectedSize = 750;
        float expectedPrice = 10;
        int expectedRating = 10;
        int expectedQty = 5;

        // (2)
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.createWhiskey(expectedName, expectedType,
                expectedSize, expectedPrice, expectedRating, expectedQty);

        // (3)
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualType = testWhiskey.getType();
        int actualRating = testWhiskey.getRating();
        int actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedRating, actualRating);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findWhiskeyTest(){
        int expectedId = 1;
        String expectedName = "Jack Daniels";
        String expectedType = "Tennessee";
        int expectedSize = 750;
        float expectedPrice = 10;
        int expectedRating = 10;
        int expectedQty = 5;

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.createWhiskey(expectedName, expectedType,
                expectedSize, expectedPrice, expectedRating, expectedQty);

        Assertions.assertEquals(testWhiskey, whiskeyService.findWhiskey(0));
        // should take an int and return an object with that id, if exists
    }
    @Test
    public  Whiskey[] findAll() {
        return null;
        // should return a basic array copy of the ArrayList
    }

    @Test
    void deleteWhiskey() {
        int expectedId = 1;
        String expectedName = "Jack Daniels";
        String expectedType = "Tennessee";
        int expectedSize = 750;
        float expectedPrice = 10;
        int expectedRating = 10;
        int expectedQty = 5;
        WhiskeyService.inventory.clear();

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.createWhiskey(expectedName, expectedType,
                expectedSize, expectedPrice, expectedRating, expectedQty);
        System.out.println(testWhiskey);

        WhiskeyService.deleteWhiskey(0);
        System.out.println(testWhiskey);
        Assertions.assertTrue(WhiskeyService.inventory.size() == 0);
    }
}
