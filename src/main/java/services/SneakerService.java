package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)

    public static List<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand,
                                 String sport, int size,
                                 int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public static Sneaker findSneaker(int id) {
        return inventory.get(id);
    }

    public static List<Sneaker> findAll() {
        for (Sneaker s : inventory
        ) {
            System.out.println("Sneaker model: " + s.getName() + ", " + "Brand: " + s.getBrand() + ", " + "Available pairs: " + s.getQty() + " \n");
        }
        return inventory;
    }

    public static void deleteSneaker(int id) {
        inventory.remove(0);
    }

    public static void setQty(String sneaker, int newQty) {
        for (Sneaker s : inventory) {
            if (s.getName().equals(sneaker)) {
                s.setQty(newQty);
            }
        }
    }
}
