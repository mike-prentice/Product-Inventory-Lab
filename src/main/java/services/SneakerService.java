package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private static List<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand,
                                 String sport, int size,
                                 int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);
        System.out.println(inventory);
        return createdSneaker;
    }

    public static Sneaker findSneaker(int id){
        return inventory.get(id);
    }

public static String findAll(){
        return inventory.toString();
}

    public static void deleteSneaker(int id) {
        inventory.remove(0);
    }
}
