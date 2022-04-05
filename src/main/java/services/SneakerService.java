package services;


import models.Sneaker;
import utils.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)

    public static List<Sneaker> inventory = new ArrayList<>();

    public SneakerService() throws IOException {
    }

    public static Sneaker create(String name, String brand,
                                 String sport, int size,
                                 int qty, float price) throws IOException {
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
    public static void saveData() throws IOException {
        String csvFile = "/Users/mike/Desktop/Sneaker.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        Utils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Sneaker s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(s.getId()));
            list.add(s.getName());
            list.add(s.getBrand());
            list.add(s.getSport());
            list.add(String.valueOf(s.getQty()));
            list.add(String.valueOf(s.getPrice()));

            Utils.writeLine(writer, list);  // (4)
        }

// (5)
        writer.flush();
        writer.close();
    }

    public static void loadData(){
        // (1)
        String csvFile = "/Users/mike/Desktop/Sneaker.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(beer[0]);
                String name = beer[1];
                String brand = beer[2];
                String sport = beer[3];
                int qty = Integer.parseInt(beer[4]);
                float price = Float.parseFloat(beer[5]);

                // (5)
                inventory.add(new Sneaker(id, name, brand, sport, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
