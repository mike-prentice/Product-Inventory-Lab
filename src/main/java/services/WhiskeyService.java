package services;

import models.Sneaker;
import models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {
    private static int nextId = 1;  // (1)

    public static List<Whiskey> inventory = new ArrayList<>();

    public static Whiskey create(int id, String name, String type,
                                 int size, float price,
                                 int rating, int qty) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, type, size, price, rating, qty);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public static Whiskey findWhiskey(int id) {
        return inventory.get(id);
    }

    public static List<Whiskey> findAll() {
        for (Whiskey w : inventory
        ) {
            System.out.println("Sneaker model: " + w.getName() + ", " + "Brand: " + w.getType() + ", " + "Available pairs: " + w.getQty() + " \n");
        }
        return inventory;
    }

    public static void deleteWhiskey(int id) {
        inventory.remove(0);
    }

    public static void setQty(String whiskey, int newQty) {
        for (Whiskey w : inventory) {
            if (w.getName().equals(whiskey)) {
                w.setQty(newQty);
            }
        }
    }
}
